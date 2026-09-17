// port-lint: source Psp.rs
package io.github.kotlinmania.libc.psp

import io.github.kotlinmania.libc.*

public actual fun sceAudioChReserve(channel: Int, sampleCount: Int, format: AudioFormat): Int =
    throw UnsupportedOperationException("sceAudioChReserve not available on JVM — no C library access")

public actual fun sceAudioChRelease(channel: Int): Int =
    throw UnsupportedOperationException("sceAudioChRelease not available on JVM — no C library access")

public actual fun sceAudioOutput(channel: Int, vol: Int, buf: COpaquePointer?): Int =
    throw UnsupportedOperationException("sceAudioOutput not available on JVM — no C library access")

public actual fun sceAudioOutputBlocking(channel: Int, vol: Int, buf: COpaquePointer?): Int =
    throw UnsupportedOperationException("sceAudioOutputBlocking not available on JVM — no C library access")

public actual fun sceAudioOutputPanned(channel: Int, leftVol: Int, rightVol: Int, buf: COpaquePointer?): Int =
    throw UnsupportedOperationException("sceAudioOutputPanned not available on JVM — no C library access")

public actual fun sceAudioOutputPannedBlocking(channel: Int, leftVol: Int, rightVol: Int, buf: COpaquePointer?): Int =
    throw UnsupportedOperationException("sceAudioOutputPannedBlocking not available on JVM — no C library access")

public actual fun sceAudioGetChannelRestLen(channel: Int): Int =
    throw UnsupportedOperationException("sceAudioGetChannelRestLen not available on JVM — no C library access")

public actual fun sceAudioGetChannelRestLength(channel: Int): Int =
    throw UnsupportedOperationException("sceAudioGetChannelRestLength not available on JVM — no C library access")

public actual fun sceAudioSetChannelDataLen(channel: Int, sampleCount: Int): Int =
    throw UnsupportedOperationException("sceAudioSetChannelDataLen not available on JVM — no C library access")

public actual fun sceAudioChangeChannelConfig(channel: Int, format: AudioFormat): Int =
    throw UnsupportedOperationException("sceAudioChangeChannelConfig not available on JVM — no C library access")

public actual fun sceAudioChangeChannelVolume(channel: Int, leftVol: Int, rightVol: Int): Int =
    throw UnsupportedOperationException("sceAudioChangeChannelVolume not available on JVM — no C library access")

public actual fun sceAudioOutput2Reserve(sampleCount: Int): Int =
    throw UnsupportedOperationException("sceAudioOutput2Reserve not available on JVM — no C library access")

public actual fun sceAudioOutput2Release(): Int =
    throw UnsupportedOperationException("sceAudioOutput2Release not available on JVM — no C library access")

public actual fun sceAudioOutput2ChangeLength(sampleCount: Int): Int =
    throw UnsupportedOperationException("sceAudioOutput2ChangeLength not available on JVM — no C library access")

public actual fun sceAudioOutput2OutputBlocking(vol: Int, buf: COpaquePointer?): Int =
    throw UnsupportedOperationException("sceAudioOutput2OutputBlocking not available on JVM — no C library access")

public actual fun sceAudioOutput2GetRestSample(): Int =
    throw UnsupportedOperationException("sceAudioOutput2GetRestSample not available on JVM — no C library access")

public actual fun sceAudioSRCChReserve(sampleCount: Int, freq: AudioOutputFrequency, channels: Int): Int =
    throw UnsupportedOperationException("sceAudioSRCChReserve not available on JVM — no C library access")

public actual fun sceAudioSRCChRelease(): Int =
    throw UnsupportedOperationException("sceAudioSRCChRelease not available on JVM — no C library access")

public actual fun sceAudioSRCOutputBlocking(vol: Int, buf: COpaquePointer?): Int =
    throw UnsupportedOperationException("sceAudioSRCOutputBlocking not available on JVM — no C library access")

public actual fun sceAudioInputInit(unknown1: Int, gain: Int, unknown2: Int): Int =
    throw UnsupportedOperationException("sceAudioInputInit not available on JVM — no C library access")

public actual fun sceAudioInputInitEx(params: AudioInputParams?): Int =
    throw UnsupportedOperationException("sceAudioInputInitEx not available on JVM — no C library access")

public actual fun sceAudioInputBlocking(sampleCount: Int, freq: AudioInputFrequency, buf: COpaquePointer?) {
    throw UnsupportedOperationException("sceAudioInputBlocking not available on JVM — no C library access")
}

public actual fun sceAudioInput(sampleCount: Int, freq: AudioInputFrequency, buf: COpaquePointer?) {
    throw UnsupportedOperationException("sceAudioInput not available on JVM — no C library access")
}

public actual fun sceAudioGetInputLength(): Int =
    throw UnsupportedOperationException("sceAudioGetInputLength not available on JVM — no C library access")

public actual fun sceAudioWaitInputEnd(): Int =
    throw UnsupportedOperationException("sceAudioWaitInputEnd not available on JVM — no C library access")

public actual fun sceAudioPollInputEnd(): Int =
    throw UnsupportedOperationException("sceAudioPollInputEnd not available on JVM — no C library access")

public actual fun sceAtracGetAtracID(uiCodecType: UInt): Int =
    throw UnsupportedOperationException("sceAtracGetAtracID not available on JVM — no C library access")

public actual fun sceAtracSetDataAndGetID(buf: COpaquePointer?, bufsize: ULong): Int =
    throw UnsupportedOperationException("sceAtracSetDataAndGetID not available on JVM — no C library access")

public actual fun sceAtracDecodeData(atracId: Int, outSamples: UShort?, outN: Int?, outEnd: Int?, outRemainFrame: Int?): Int =
    throw UnsupportedOperationException("sceAtracDecodeData not available on JVM — no C library access")

public actual fun sceAtracGetRemainFrame(atracId: Int, outRemainFrame: Int?): Int =
    throw UnsupportedOperationException("sceAtracGetRemainFrame not available on JVM — no C library access")

public actual fun sceAtracGetStreamDataInfo(atracId: Int, writePointer: COpaquePointer?, availableBytes: UInt?, readOffset: UInt?): Int =
    throw UnsupportedOperationException("sceAtracGetStreamDataInfo not available on JVM — no C library access")

public actual fun sceAtracAddStreamData(atracId: Int, bytesToAdd: UInt): Int =
    throw UnsupportedOperationException("sceAtracAddStreamData not available on JVM — no C library access")

public actual fun sceAtracGetBitrate(atracId: Int, outBitrate: Int?): Int =
    throw UnsupportedOperationException("sceAtracGetBitrate not available on JVM — no C library access")

public actual fun sceAtracSetLoopNum(atracId: Int, nloops: Int): Int =
    throw UnsupportedOperationException("sceAtracSetLoopNum not available on JVM — no C library access")

public actual fun sceAtracReleaseAtracID(atracId: Int): Int =
    throw UnsupportedOperationException("sceAtracReleaseAtracID not available on JVM — no C library access")

public actual fun sceAtracGetNextSample(atracId: Int, outN: Int?): Int =
    throw UnsupportedOperationException("sceAtracGetNextSample not available on JVM — no C library access")

public actual fun sceAtracGetMaxSample(atracId: Int, outMax: Int?): Int =
    throw UnsupportedOperationException("sceAtracGetMaxSample not available on JVM — no C library access")

public actual fun sceAtracGetBufferInfoForReseting(atracId: Int, uiSample: UInt, pbufferInfo: Atrac3BufferInfo?): Int =
    throw UnsupportedOperationException("sceAtracGetBufferInfoForReseting not available on JVM — no C library access")

public actual fun sceAtracGetChannel(atracId: Int, puiChannel: UInt?): Int =
    throw UnsupportedOperationException("sceAtracGetChannel not available on JVM — no C library access")

public actual fun sceAtracGetInternalErrorInfo(atracId: Int, piResult: Int?): Int =
    throw UnsupportedOperationException("sceAtracGetInternalErrorInfo not available on JVM — no C library access")

public actual fun sceAtracGetLoopStatus(atracId: Int, piLoopNum: Int?, puiLoopStatus: UInt?): Int =
    throw UnsupportedOperationException("sceAtracGetLoopStatus not available on JVM — no C library access")

public actual fun sceAtracGetNextDecodePosition(atracId: Int, puiSamplePosition: UInt?): Int =
    throw UnsupportedOperationException("sceAtracGetNextDecodePosition not available on JVM — no C library access")

public actual fun sceAtracGetSecondBufferInfo(atracId: Int, puiPosition: UInt?, puiDataByte: UInt?): Int =
    throw UnsupportedOperationException("sceAtracGetSecondBufferInfo not available on JVM — no C library access")

public actual fun sceAtracGetSoundSample(atracId: Int, piEndSample: Int?, piLoopStartSample: Int?, piLoopEndSample: Int?): Int =
    throw UnsupportedOperationException("sceAtracGetSoundSample not available on JVM — no C library access")

public actual fun sceAtracResetPlayPosition(atracId: Int, uiSample: UInt, uiWriteByteFirstBuf: UInt, uiWriteByteSecondBuf: UInt): Int =
    throw UnsupportedOperationException("sceAtracResetPlayPosition not available on JVM — no C library access")

public actual fun sceAtracSetData(atracId: Int, pucBufferAddr: COpaquePointer?, uiBufferByte: UInt): Int =
    throw UnsupportedOperationException("sceAtracSetData not available on JVM — no C library access")

public actual fun sceAtracSetHalfwayBuffer(atracId: Int, pucBufferAddr: COpaquePointer?, uiReadByte: UInt, uiBufferByte: UInt): Int =
    throw UnsupportedOperationException("sceAtracSetHalfwayBuffer not available on JVM — no C library access")

public actual fun sceAtracSetHalfwayBufferAndGetID(pucBufferAddr: COpaquePointer?, uiReadByte: UInt, uiBufferByte: UInt): Int =
    throw UnsupportedOperationException("sceAtracSetHalfwayBufferAndGetID not available on JVM — no C library access")

public actual fun sceAtracSetSecondBuffer(atracId: Int, pucSecondBufferAddr: COpaquePointer?, uiSecondBufferByte: UInt): Int =
    throw UnsupportedOperationException("sceAtracSetSecondBuffer not available on JVM — no C library access")

public actual fun sceCtrlSetSamplingCycle(cycle: Int): Int =
    throw UnsupportedOperationException("sceCtrlSetSamplingCycle not available on JVM — no C library access")

public actual fun sceCtrlGetSamplingCycle(pcycle: Int?): Int =
    throw UnsupportedOperationException("sceCtrlGetSamplingCycle not available on JVM — no C library access")

public actual fun sceCtrlSetSamplingMode(mode: CtrlMode): Int =
    throw UnsupportedOperationException("sceCtrlSetSamplingMode not available on JVM — no C library access")

public actual fun sceCtrlGetSamplingMode(pmode: Int?): Int =
    throw UnsupportedOperationException("sceCtrlGetSamplingMode not available on JVM — no C library access")

public actual fun sceCtrlPeekBufferPositive(padData: SceCtrlData?, count: Int): Int =
    throw UnsupportedOperationException("sceCtrlPeekBufferPositive not available on JVM — no C library access")

public actual fun sceCtrlPeekBufferNegative(padData: SceCtrlData?, count: Int): Int =
    throw UnsupportedOperationException("sceCtrlPeekBufferNegative not available on JVM — no C library access")

public actual fun sceCtrlReadBufferPositive(padData: SceCtrlData?, count: Int): Int =
    throw UnsupportedOperationException("sceCtrlReadBufferPositive not available on JVM — no C library access")

public actual fun sceCtrlReadBufferNegative(padData: SceCtrlData?, count: Int): Int =
    throw UnsupportedOperationException("sceCtrlReadBufferNegative not available on JVM — no C library access")

public actual fun sceCtrlPeekLatch(latchData: SceCtrlLatch?): Int =
    throw UnsupportedOperationException("sceCtrlPeekLatch not available on JVM — no C library access")

public actual fun sceCtrlReadLatch(latchData: SceCtrlLatch?): Int =
    throw UnsupportedOperationException("sceCtrlReadLatch not available on JVM — no C library access")

public actual fun sceCtrlSetIdleCancelThreshold(idlereset: Int, idleback: Int): Int =
    throw UnsupportedOperationException("sceCtrlSetIdleCancelThreshold not available on JVM — no C library access")

public actual fun sceCtrlGetIdleCancelThreshold(idlereset: Int?, idleback: Int?): Int =
    throw UnsupportedOperationException("sceCtrlGetIdleCancelThreshold not available on JVM — no C library access")

public actual fun sceDisplayGetMode(pmode: Int?, pwidth: Int?, pheight: Int?): Int =
    throw UnsupportedOperationException("sceDisplayGetMode not available on JVM — no C library access")

public actual fun sceDisplayGetFrameBuf(topAddr: COpaquePointer?, bufferWidth: ULong?, pixelFormat: DisplayPixelFormat?, sync: DisplaySetBufSync): Int =
    throw UnsupportedOperationException("sceDisplayGetFrameBuf not available on JVM — no C library access")

public actual fun sceDisplayWaitVblank(): Int =
    throw UnsupportedOperationException("sceDisplayWaitVblank not available on JVM — no C library access")

public actual fun sceDisplayWaitVblankCB(): Int =
    throw UnsupportedOperationException("sceDisplayWaitVblankCB not available on JVM — no C library access")

public actual fun sceDisplayWaitVblankStart(): Int =
    throw UnsupportedOperationException("sceDisplayWaitVblankStart not available on JVM — no C library access")

public actual fun sceDisplayWaitVblankStartCB(): Int =
    throw UnsupportedOperationException("sceDisplayWaitVblankStartCB not available on JVM — no C library access")

public actual fun sceDisplayGetAccumulatedHcount(): Int =
    throw UnsupportedOperationException("sceDisplayGetAccumulatedHcount not available on JVM — no C library access")

public actual fun sceDisplayGetCurrentHcount(): Int =
    throw UnsupportedOperationException("sceDisplayGetCurrentHcount not available on JVM — no C library access")

public actual fun sceDisplayIsForeground(): Int =
    throw UnsupportedOperationException("sceDisplayIsForeground not available on JVM — no C library access")

public actual fun sceDisplayIsVblank(): Int =
    throw UnsupportedOperationException("sceDisplayIsVblank not available on JVM — no C library access")

public actual fun sceGeEdramGetAddr(): COpaquePointer? =
    throw UnsupportedOperationException("sceGeEdramGetAddr not available on JVM — no C library access")

public actual fun sceGeEdramSetAddrTranslation(width: Int): Int =
    throw UnsupportedOperationException("sceGeEdramSetAddrTranslation not available on JVM — no C library access")

public actual fun sceGeGetMtx(type: GeMatrixType, matrix: COpaquePointer?): Int =
    throw UnsupportedOperationException("sceGeGetMtx not available on JVM — no C library access")

public actual fun sceGeGetStack(stackId: Int, stack: GeStack?): Int =
    throw UnsupportedOperationException("sceGeGetStack not available on JVM — no C library access")

public actual fun sceGeSaveContext(context: GeContext?): Int =
    throw UnsupportedOperationException("sceGeSaveContext not available on JVM — no C library access")

public actual fun sceGeRestoreContext(context: GeContext?): Int =
    throw UnsupportedOperationException("sceGeRestoreContext not available on JVM — no C library access")

public actual fun sceGeListEnQueue(list: COpaquePointer?, stall: COpaquePointer?, cbid: Int, arg: GeListArgs?): Int =
    throw UnsupportedOperationException("sceGeListEnQueue not available on JVM — no C library access")

public actual fun sceGeListEnQueueHead(list: COpaquePointer?, stall: COpaquePointer?, cbid: Int, arg: GeListArgs?): Int =
    throw UnsupportedOperationException("sceGeListEnQueueHead not available on JVM — no C library access")

public actual fun sceGeListDeQueue(qid: Int): Int =
    throw UnsupportedOperationException("sceGeListDeQueue not available on JVM — no C library access")

public actual fun sceGeListUpdateStallAddr(qid: Int, stall: COpaquePointer?): Int =
    throw UnsupportedOperationException("sceGeListUpdateStallAddr not available on JVM — no C library access")

public actual fun sceGeBreak(mode: Int, pParam: GeBreakParam?): Int =
    throw UnsupportedOperationException("sceGeBreak not available on JVM — no C library access")

public actual fun sceGeContinue(): Int =
    throw UnsupportedOperationException("sceGeContinue not available on JVM — no C library access")

public actual fun sceGeSetCallback(cb: GeCallbackData?): Int =
    throw UnsupportedOperationException("sceGeSetCallback not available on JVM — no C library access")

public actual fun sceGeUnsetCallback(cbid: Int): Int =
    throw UnsupportedOperationException("sceGeUnsetCallback not available on JVM — no C library access")

public actual fun sceKernelExitGame() {
    throw UnsupportedOperationException("sceKernelExitGame not available on JVM — no C library access")
}

public actual fun sceKernelRegisterExitCallback(id: SceUid): Int =
    throw UnsupportedOperationException("sceKernelRegisterExitCallback not available on JVM — no C library access")

public actual fun sceKernelLoadExec(file: COpaquePointer?, param: SceKernelLoadExecParam?): Int =
    throw UnsupportedOperationException("sceKernelLoadExec not available on JVM — no C library access")

public actual fun sceKernelGetBlockHeadAddr(blockid: SceUid): COpaquePointer? =
    throw UnsupportedOperationException("sceKernelGetBlockHeadAddr not available on JVM — no C library access")

public actual fun sceKernelFreePartitionMemory(blockid: SceUid): Int =
    throw UnsupportedOperationException("sceKernelFreePartitionMemory not available on JVM — no C library access")

public actual fun sceKernelTotalFreeMemSize(): ULong =
    throw UnsupportedOperationException("sceKernelTotalFreeMemSize not available on JVM — no C library access")

public actual fun sceKernelMaxFreeMemSize(): ULong =
    throw UnsupportedOperationException("sceKernelMaxFreeMemSize not available on JVM — no C library access")

public actual fun sceKernelSetCompiledSdkVersion(version: UInt): Int =
    throw UnsupportedOperationException("sceKernelSetCompiledSdkVersion not available on JVM — no C library access")

public actual fun sceKernelLibcTime(t: Int?): Int =
    throw UnsupportedOperationException("sceKernelLibcTime not available on JVM — no C library access")

public actual fun sceKernelLibcGettimeofday(tp: Timeval?, tzp: Timezone?): Int =
    throw UnsupportedOperationException("sceKernelLibcGettimeofday not available on JVM — no C library access")

public actual fun sceKernelDcacheWritebackAll() {
    throw UnsupportedOperationException("sceKernelDcacheWritebackAll not available on JVM — no C library access")
}

public actual fun sceKernelDcacheWritebackInvalidateAll() {
    throw UnsupportedOperationException("sceKernelDcacheWritebackInvalidateAll not available on JVM — no C library access")
}

public actual fun sceKernelDcacheWritebackRange(p: COpaquePointer?, size: UInt) {
    throw UnsupportedOperationException("sceKernelDcacheWritebackRange not available on JVM — no C library access")
}

public actual fun sceKernelDcacheWritebackInvalidateRange(p: COpaquePointer?, size: UInt) {
    throw UnsupportedOperationException("sceKernelDcacheWritebackInvalidateRange not available on JVM — no C library access")
}

public actual fun sceKernelDcacheInvalidateRange(p: COpaquePointer?, size: UInt) {
    throw UnsupportedOperationException("sceKernelDcacheInvalidateRange not available on JVM — no C library access")
}

public actual fun sceKernelIcacheInvalidateAll() {
    throw UnsupportedOperationException("sceKernelIcacheInvalidateAll not available on JVM — no C library access")
}

public actual fun sceKernelIcacheInvalidateRange(p: COpaquePointer?, size: UInt) {
    throw UnsupportedOperationException("sceKernelIcacheInvalidateRange not available on JVM — no C library access")
}

public actual fun sceKernelUtilsMt19937Init(ctx: SceKernelUtilsMt19937Context?, seed: UInt): Int =
    throw UnsupportedOperationException("sceKernelUtilsMt19937Init not available on JVM — no C library access")

public actual fun sceKernelUtilsMd5Digest(data: COpaquePointer?, size: UInt, digest: COpaquePointer?): Int =
    throw UnsupportedOperationException("sceKernelUtilsMd5Digest not available on JVM — no C library access")

public actual fun sceKernelUtilsMd5BlockInit(ctx: SceKernelUtilsMd5Context?): Int =
    throw UnsupportedOperationException("sceKernelUtilsMd5BlockInit not available on JVM — no C library access")

public actual fun sceKernelUtilsMd5BlockUpdate(ctx: SceKernelUtilsMd5Context?, data: COpaquePointer?, size: UInt): Int =
    throw UnsupportedOperationException("sceKernelUtilsMd5BlockUpdate not available on JVM — no C library access")

public actual fun sceKernelUtilsMd5BlockResult(ctx: SceKernelUtilsMd5Context?, digest: COpaquePointer?): Int =
    throw UnsupportedOperationException("sceKernelUtilsMd5BlockResult not available on JVM — no C library access")

public actual fun sceKernelUtilsSha1Digest(data: COpaquePointer?, size: UInt, digest: COpaquePointer?): Int =
    throw UnsupportedOperationException("sceKernelUtilsSha1Digest not available on JVM — no C library access")

public actual fun sceKernelUtilsSha1BlockInit(ctx: SceKernelUtilsSha1Context?): Int =
    throw UnsupportedOperationException("sceKernelUtilsSha1BlockInit not available on JVM — no C library access")

public actual fun sceKernelUtilsSha1BlockUpdate(ctx: SceKernelUtilsSha1Context?, data: COpaquePointer?, size: UInt): Int =
    throw UnsupportedOperationException("sceKernelUtilsSha1BlockUpdate not available on JVM — no C library access")

public actual fun sceKernelUtilsSha1BlockResult(ctx: SceKernelUtilsSha1Context?, digest: COpaquePointer?): Int =
    throw UnsupportedOperationException("sceKernelUtilsSha1BlockResult not available on JVM — no C library access")

public actual fun sceKernelRegisterSubIntrHandler(intNo: Int, no: Int, handler: COpaquePointer?, arg: COpaquePointer?): Int =
    throw UnsupportedOperationException("sceKernelRegisterSubIntrHandler not available on JVM — no C library access")

public actual fun sceKernelReleaseSubIntrHandler(intNo: Int, no: Int): Int =
    throw UnsupportedOperationException("sceKernelReleaseSubIntrHandler not available on JVM — no C library access")

public actual fun sceKernelEnableSubIntr(intNo: Int, no: Int): Int =
    throw UnsupportedOperationException("sceKernelEnableSubIntr not available on JVM — no C library access")

public actual fun sceKernelDisableSubIntr(intNo: Int, no: Int): Int =
    throw UnsupportedOperationException("sceKernelDisableSubIntr not available on JVM — no C library access")

public actual fun queryIntrHandlerInfo(intrCode: SceUid, subIntrCode: SceUid, data: IntrHandlerOptionParam?): Int =
    throw UnsupportedOperationException("queryIntrHandlerInfo not available on JVM — no C library access")

public actual fun sceKernelCpuResumeIntr(flags: UInt) {
    throw UnsupportedOperationException("sceKernelCpuResumeIntr not available on JVM — no C library access")
}

public actual fun sceKernelCpuResumeIntrWithSync(flags: UInt) {
    throw UnsupportedOperationException("sceKernelCpuResumeIntrWithSync not available on JVM — no C library access")
}

public actual fun sceKernelIsCpuIntrSuspended(flags: UInt): Int =
    throw UnsupportedOperationException("sceKernelIsCpuIntrSuspended not available on JVM — no C library access")

public actual fun sceKernelIsCpuIntrEnable(): Int =
    throw UnsupportedOperationException("sceKernelIsCpuIntrEnable not available on JVM — no C library access")

public actual fun sceKernelStartModule(modId: SceUid, argSize: ULong, argp: COpaquePointer?, status: Int?, option: SceKernelSMOption?): Int =
    throw UnsupportedOperationException("sceKernelStartModule not available on JVM — no C library access")

public actual fun sceKernelStopModule(modId: SceUid, argSize: ULong, argp: COpaquePointer?, status: Int?, option: SceKernelSMOption?): Int =
    throw UnsupportedOperationException("sceKernelStopModule not available on JVM — no C library access")

public actual fun sceKernelUnloadModule(modId: SceUid): Int =
    throw UnsupportedOperationException("sceKernelUnloadModule not available on JVM — no C library access")

public actual fun sceKernelSelfStopUnloadModule(unknown: Int, argSize: ULong, argp: COpaquePointer?): Int =
    throw UnsupportedOperationException("sceKernelSelfStopUnloadModule not available on JVM — no C library access")

public actual fun sceKernelStopUnloadSelfModule(argSize: ULong, argp: COpaquePointer?, status: Int?, option: SceKernelSMOption?): Int =
    throw UnsupportedOperationException("sceKernelStopUnloadSelfModule not available on JVM — no C library access")

public actual fun sceKernelQueryModuleInfo(modId: SceUid, info: SceKernelModuleInfo?): Int =
    throw UnsupportedOperationException("sceKernelQueryModuleInfo not available on JVM — no C library access")

public actual fun sceKernelGetModuleIdList(readBuf: SceUid?, readBufSize: Int, idCount: Int?): Int =
    throw UnsupportedOperationException("sceKernelGetModuleIdList not available on JVM — no C library access")

public actual fun sceKernelVolatileMemLock(unk: Int, ptr: COpaquePointer?, size: Int?): Int =
    throw UnsupportedOperationException("sceKernelVolatileMemLock not available on JVM — no C library access")

public actual fun sceKernelVolatileMemTryLock(unk: Int, ptr: COpaquePointer?, size: Int?): Int =
    throw UnsupportedOperationException("sceKernelVolatileMemTryLock not available on JVM — no C library access")

public actual fun sceKernelVolatileMemUnlock(unk: Int): Int =
    throw UnsupportedOperationException("sceKernelVolatileMemUnlock not available on JVM — no C library access")

public actual fun sceKernelDeleteThread(thid: SceUid): Int =
    throw UnsupportedOperationException("sceKernelDeleteThread not available on JVM — no C library access")

public actual fun sceKernelStartThread(id: SceUid, argLen: ULong, argP: COpaquePointer?): Int =
    throw UnsupportedOperationException("sceKernelStartThread not available on JVM — no C library access")

public actual fun sceKernelExitThread(status: Int): Int =
    throw UnsupportedOperationException("sceKernelExitThread not available on JVM — no C library access")

public actual fun sceKernelExitDeleteThread(status: Int): Int =
    throw UnsupportedOperationException("sceKernelExitDeleteThread not available on JVM — no C library access")

public actual fun sceKernelTerminateThread(thid: SceUid): Int =
    throw UnsupportedOperationException("sceKernelTerminateThread not available on JVM — no C library access")

public actual fun sceKernelTerminateDeleteThread(thid: SceUid): Int =
    throw UnsupportedOperationException("sceKernelTerminateDeleteThread not available on JVM — no C library access")

public actual fun sceKernelSuspendDispatchThread(): Int =
    throw UnsupportedOperationException("sceKernelSuspendDispatchThread not available on JVM — no C library access")

public actual fun sceKernelResumeDispatchThread(state: Int): Int =
    throw UnsupportedOperationException("sceKernelResumeDispatchThread not available on JVM — no C library access")

public actual fun sceKernelSleepThread(): Int =
    throw UnsupportedOperationException("sceKernelSleepThread not available on JVM — no C library access")

public actual fun sceKernelSleepThreadCB(): Int =
    throw UnsupportedOperationException("sceKernelSleepThreadCB not available on JVM — no C library access")

public actual fun sceKernelWakeupThread(thid: SceUid): Int =
    throw UnsupportedOperationException("sceKernelWakeupThread not available on JVM — no C library access")

public actual fun sceKernelCancelWakeupThread(thid: SceUid): Int =
    throw UnsupportedOperationException("sceKernelCancelWakeupThread not available on JVM — no C library access")

public actual fun sceKernelSuspendThread(thid: SceUid): Int =
    throw UnsupportedOperationException("sceKernelSuspendThread not available on JVM — no C library access")

public actual fun sceKernelResumeThread(thid: SceUid): Int =
    throw UnsupportedOperationException("sceKernelResumeThread not available on JVM — no C library access")

public actual fun sceKernelWaitThreadEnd(thid: SceUid, timeout: UInt?): Int =
    throw UnsupportedOperationException("sceKernelWaitThreadEnd not available on JVM — no C library access")

public actual fun sceKernelWaitThreadEndCB(thid: SceUid, timeout: UInt?): Int =
    throw UnsupportedOperationException("sceKernelWaitThreadEndCB not available on JVM — no C library access")

public actual fun sceKernelDelayThread(delay: UInt): Int =
    throw UnsupportedOperationException("sceKernelDelayThread not available on JVM — no C library access")

public actual fun sceKernelDelayThreadCB(delay: UInt): Int =
    throw UnsupportedOperationException("sceKernelDelayThreadCB not available on JVM — no C library access")

public actual fun sceKernelDelaySysClockThread(delay: SceKernelSysClock?): Int =
    throw UnsupportedOperationException("sceKernelDelaySysClockThread not available on JVM — no C library access")

public actual fun sceKernelDelaySysClockThreadCB(delay: SceKernelSysClock?): Int =
    throw UnsupportedOperationException("sceKernelDelaySysClockThreadCB not available on JVM — no C library access")

public actual fun sceKernelChangeCurrentThreadAttr(unknown: Int, attr: Int): Int =
    throw UnsupportedOperationException("sceKernelChangeCurrentThreadAttr not available on JVM — no C library access")

public actual fun sceKernelChangeThreadPriority(thid: SceUid, priority: Int): Int =
    throw UnsupportedOperationException("sceKernelChangeThreadPriority not available on JVM — no C library access")

public actual fun sceKernelRotateThreadReadyQueue(priority: Int): Int =
    throw UnsupportedOperationException("sceKernelRotateThreadReadyQueue not available on JVM — no C library access")

public actual fun sceKernelReleaseWaitThread(thid: SceUid): Int =
    throw UnsupportedOperationException("sceKernelReleaseWaitThread not available on JVM — no C library access")

public actual fun sceKernelGetThreadId(): Int =
    throw UnsupportedOperationException("sceKernelGetThreadId not available on JVM — no C library access")

public actual fun sceKernelGetThreadCurrentPriority(): Int =
    throw UnsupportedOperationException("sceKernelGetThreadCurrentPriority not available on JVM — no C library access")

public actual fun sceKernelGetThreadExitStatus(thid: SceUid): Int =
    throw UnsupportedOperationException("sceKernelGetThreadExitStatus not available on JVM — no C library access")

public actual fun sceKernelCheckThreadStack(): Int =
    throw UnsupportedOperationException("sceKernelCheckThreadStack not available on JVM — no C library access")

public actual fun sceKernelGetThreadStackFreeSize(thid: SceUid): Int =
    throw UnsupportedOperationException("sceKernelGetThreadStackFreeSize not available on JVM — no C library access")

public actual fun sceKernelReferThreadStatus(thid: SceUid, info: SceKernelThreadInfo?): Int =
    throw UnsupportedOperationException("sceKernelReferThreadStatus not available on JVM — no C library access")

public actual fun sceKernelReferThreadRunStatus(thid: SceUid, status: SceKernelThreadRunStatus?): Int =
    throw UnsupportedOperationException("sceKernelReferThreadRunStatus not available on JVM — no C library access")

public actual fun sceKernelDeleteSema(semaId: SceUid): Int =
    throw UnsupportedOperationException("sceKernelDeleteSema not available on JVM — no C library access")

public actual fun sceKernelSignalSema(semaId: SceUid, signal: Int): Int =
    throw UnsupportedOperationException("sceKernelSignalSema not available on JVM — no C library access")

public actual fun sceKernelWaitSema(semaId: SceUid, signal: Int, timeout: UInt?): Int =
    throw UnsupportedOperationException("sceKernelWaitSema not available on JVM — no C library access")

public actual fun sceKernelWaitSemaCB(semaId: SceUid, signal: Int, timeout: UInt?): Int =
    throw UnsupportedOperationException("sceKernelWaitSemaCB not available on JVM — no C library access")

public actual fun sceKernelPollSema(semaId: SceUid, signal: Int): Int =
    throw UnsupportedOperationException("sceKernelPollSema not available on JVM — no C library access")

public actual fun sceKernelReferSemaStatus(semaId: SceUid, info: SceKernelSemaInfo?): Int =
    throw UnsupportedOperationException("sceKernelReferSemaStatus not available on JVM — no C library access")

public actual fun sceKernelSetEventFlag(evId: SceUid, bits: UInt): Int =
    throw UnsupportedOperationException("sceKernelSetEventFlag not available on JVM — no C library access")

public actual fun sceKernelClearEventFlag(evId: SceUid, bits: UInt): Int =
    throw UnsupportedOperationException("sceKernelClearEventFlag not available on JVM — no C library access")

public actual fun sceKernelPollEventFlag(evId: SceUid, bits: UInt, wait: Int, outBits: UInt?): Int =
    throw UnsupportedOperationException("sceKernelPollEventFlag not available on JVM — no C library access")

public actual fun sceKernelWaitEventFlag(evId: SceUid, bits: UInt, wait: Int, outBits: UInt?, timeout: UInt?): Int =
    throw UnsupportedOperationException("sceKernelWaitEventFlag not available on JVM — no C library access")

public actual fun sceKernelWaitEventFlagCB(evId: SceUid, bits: UInt, wait: Int, outBits: UInt?, timeout: UInt?): Int =
    throw UnsupportedOperationException("sceKernelWaitEventFlagCB not available on JVM — no C library access")

public actual fun sceKernelDeleteEventFlag(evId: SceUid): Int =
    throw UnsupportedOperationException("sceKernelDeleteEventFlag not available on JVM — no C library access")

public actual fun sceKernelReferEventFlagStatus(event: SceUid, status: SceKernelEventFlagInfo?): Int =
    throw UnsupportedOperationException("sceKernelReferEventFlagStatus not available on JVM — no C library access")

public actual fun sceKernelDeleteMbx(mbxId: SceUid): Int =
    throw UnsupportedOperationException("sceKernelDeleteMbx not available on JVM — no C library access")

public actual fun sceKernelSendMbx(mbxId: SceUid, message: COpaquePointer?): Int =
    throw UnsupportedOperationException("sceKernelSendMbx not available on JVM — no C library access")

public actual fun sceKernelReceiveMbx(mbxId: SceUid, message: COpaquePointer?, timeout: UInt?): Int =
    throw UnsupportedOperationException("sceKernelReceiveMbx not available on JVM — no C library access")

public actual fun sceKernelReceiveMbxCB(mbxId: SceUid, message: COpaquePointer?, timeout: UInt?): Int =
    throw UnsupportedOperationException("sceKernelReceiveMbxCB not available on JVM — no C library access")

public actual fun sceKernelPollMbx(mbxId: SceUid, pmessage: COpaquePointer?): Int =
    throw UnsupportedOperationException("sceKernelPollMbx not available on JVM — no C library access")

public actual fun sceKernelCancelReceiveMbx(mbxId: SceUid, num: Int?): Int =
    throw UnsupportedOperationException("sceKernelCancelReceiveMbx not available on JVM — no C library access")

public actual fun sceKernelReferMbxStatus(mbxId: SceUid, info: SceKernelMbxInfo?): Int =
    throw UnsupportedOperationException("sceKernelReferMbxStatus not available on JVM — no C library access")

public actual fun sceKernelCancelAlarm(alarmId: SceUid): Int =
    throw UnsupportedOperationException("sceKernelCancelAlarm not available on JVM — no C library access")

public actual fun sceKernelReferAlarmStatus(alarmId: SceUid, info: SceKernelAlarmInfo?): Int =
    throw UnsupportedOperationException("sceKernelReferAlarmStatus not available on JVM — no C library access")

public actual fun sceKernelReferCallbackStatus(cb: SceUid, status: SceKernelCallbackInfo?): Int =
    throw UnsupportedOperationException("sceKernelReferCallbackStatus not available on JVM — no C library access")

public actual fun sceKernelDeleteCallback(cb: SceUid): Int =
    throw UnsupportedOperationException("sceKernelDeleteCallback not available on JVM — no C library access")

public actual fun sceKernelNotifyCallback(cb: SceUid, arg2: Int): Int =
    throw UnsupportedOperationException("sceKernelNotifyCallback not available on JVM — no C library access")

public actual fun sceKernelCancelCallback(cb: SceUid): Int =
    throw UnsupportedOperationException("sceKernelCancelCallback not available on JVM — no C library access")

public actual fun sceKernelGetCallbackCount(cb: SceUid): Int =
    throw UnsupportedOperationException("sceKernelGetCallbackCount not available on JVM — no C library access")

public actual fun sceKernelCheckCallback(): Int =
    throw UnsupportedOperationException("sceKernelCheckCallback not available on JVM — no C library access")

public actual fun sceKernelGetThreadmanIdList(type: SceKernelIdListType, readBuf: SceUid?, readBufSize: Int, idCount: Int?): Int =
    throw UnsupportedOperationException("sceKernelGetThreadmanIdList not available on JVM — no C library access")

public actual fun sceKernelReferSystemStatus(status: SceKernelSystemStatus?): Int =
    throw UnsupportedOperationException("sceKernelReferSystemStatus not available on JVM — no C library access")

public actual fun sceKernelDeleteMsgPipe(uid: SceUid): Int =
    throw UnsupportedOperationException("sceKernelDeleteMsgPipe not available on JVM — no C library access")

public actual fun sceKernelSendMsgPipe(uid: SceUid, message: COpaquePointer?, size: UInt, unk1: Int, unk2: COpaquePointer?, timeout: UInt?): Int =
    throw UnsupportedOperationException("sceKernelSendMsgPipe not available on JVM — no C library access")

public actual fun sceKernelSendMsgPipeCB(uid: SceUid, message: COpaquePointer?, size: UInt, unk1: Int, unk2: COpaquePointer?, timeout: UInt?): Int =
    throw UnsupportedOperationException("sceKernelSendMsgPipeCB not available on JVM — no C library access")

public actual fun sceKernelTrySendMsgPipe(uid: SceUid, message: COpaquePointer?, size: UInt, unk1: Int, unk2: COpaquePointer?): Int =
    throw UnsupportedOperationException("sceKernelTrySendMsgPipe not available on JVM — no C library access")

public actual fun sceKernelReceiveMsgPipe(uid: SceUid, message: COpaquePointer?, size: UInt, unk1: Int, unk2: COpaquePointer?, timeout: UInt?): Int =
    throw UnsupportedOperationException("sceKernelReceiveMsgPipe not available on JVM — no C library access")

public actual fun sceKernelReceiveMsgPipeCB(uid: SceUid, message: COpaquePointer?, size: UInt, unk1: Int, unk2: COpaquePointer?, timeout: UInt?): Int =
    throw UnsupportedOperationException("sceKernelReceiveMsgPipeCB not available on JVM — no C library access")

public actual fun sceKernelTryReceiveMsgPipe(uid: SceUid, message: COpaquePointer?, size: UInt, unk1: Int, unk2: COpaquePointer?): Int =
    throw UnsupportedOperationException("sceKernelTryReceiveMsgPipe not available on JVM — no C library access")

public actual fun sceKernelCancelMsgPipe(uid: SceUid, send: Int?, recv: Int?): Int =
    throw UnsupportedOperationException("sceKernelCancelMsgPipe not available on JVM — no C library access")

public actual fun sceKernelReferMsgPipeStatus(uid: SceUid, info: SceKernelMppInfo?): Int =
    throw UnsupportedOperationException("sceKernelReferMsgPipeStatus not available on JVM — no C library access")

public actual fun sceKernelDeleteVpl(uid: SceUid): Int =
    throw UnsupportedOperationException("sceKernelDeleteVpl not available on JVM — no C library access")

public actual fun sceKernelAllocateVpl(uid: SceUid, size: UInt, data: COpaquePointer?, timeout: UInt?): Int =
    throw UnsupportedOperationException("sceKernelAllocateVpl not available on JVM — no C library access")

public actual fun sceKernelAllocateVplCB(uid: SceUid, size: UInt, data: COpaquePointer?, timeout: UInt?): Int =
    throw UnsupportedOperationException("sceKernelAllocateVplCB not available on JVM — no C library access")

public actual fun sceKernelTryAllocateVpl(uid: SceUid, size: UInt, data: COpaquePointer?): Int =
    throw UnsupportedOperationException("sceKernelTryAllocateVpl not available on JVM — no C library access")

public actual fun sceKernelFreeVpl(uid: SceUid, data: COpaquePointer?): Int =
    throw UnsupportedOperationException("sceKernelFreeVpl not available on JVM — no C library access")

public actual fun sceKernelCancelVpl(uid: SceUid, num: Int?): Int =
    throw UnsupportedOperationException("sceKernelCancelVpl not available on JVM — no C library access")

public actual fun sceKernelReferVplStatus(uid: SceUid, info: SceKernelVplInfo?): Int =
    throw UnsupportedOperationException("sceKernelReferVplStatus not available on JVM — no C library access")

public actual fun sceKernelCreateFpl(name: COpaquePointer?, part: Int, attr: Int, size: UInt, blocks: UInt, opt: SceKernelFplOptParam?): Int =
    throw UnsupportedOperationException("sceKernelCreateFpl not available on JVM — no C library access")

public actual fun sceKernelDeleteFpl(uid: SceUid): Int =
    throw UnsupportedOperationException("sceKernelDeleteFpl not available on JVM — no C library access")

public actual fun sceKernelAllocateFpl(uid: SceUid, data: COpaquePointer?, timeout: UInt?): Int =
    throw UnsupportedOperationException("sceKernelAllocateFpl not available on JVM — no C library access")

public actual fun sceKernelAllocateFplCB(uid: SceUid, data: COpaquePointer?, timeout: UInt?): Int =
    throw UnsupportedOperationException("sceKernelAllocateFplCB not available on JVM — no C library access")

public actual fun sceKernelTryAllocateFpl(uid: SceUid, data: COpaquePointer?): Int =
    throw UnsupportedOperationException("sceKernelTryAllocateFpl not available on JVM — no C library access")

public actual fun sceKernelFreeFpl(uid: SceUid, data: COpaquePointer?): Int =
    throw UnsupportedOperationException("sceKernelFreeFpl not available on JVM — no C library access")

public actual fun sceKernelCancelFpl(uid: SceUid, pnum: Int?): Int =
    throw UnsupportedOperationException("sceKernelCancelFpl not available on JVM — no C library access")

public actual fun sceKernelReferFplStatus(uid: SceUid, info: SceKernelFplInfo?): Int =
    throw UnsupportedOperationException("sceKernelReferFplStatus not available on JVM — no C library access")

public actual fun sceKernelUSec2SysClock(usec: UInt, clock: SceKernelSysClock?): Int =
    throw UnsupportedOperationException("sceKernelUSec2SysClock not available on JVM — no C library access")

public actual fun sceKernelUSec2SysClockWide(usec: UInt): Long =
    throw UnsupportedOperationException("sceKernelUSec2SysClockWide not available on JVM — no C library access")

public actual fun sceKernelSysClock2USec(clock: SceKernelSysClock?, low: UInt?, high: UInt?): Int =
    throw UnsupportedOperationException("sceKernelSysClock2USec not available on JVM — no C library access")

public actual fun sceKernelSysClock2USecWide(clock: Long, low: UInt?, high: UInt?): Int =
    throw UnsupportedOperationException("sceKernelSysClock2USecWide not available on JVM — no C library access")

public actual fun sceKernelGetSystemTime(time: SceKernelSysClock?): Int =
    throw UnsupportedOperationException("sceKernelGetSystemTime not available on JVM — no C library access")

public actual fun sceKernelGetSystemTimeWide(): Long =
    throw UnsupportedOperationException("sceKernelGetSystemTimeWide not available on JVM — no C library access")

public actual fun sceKernelDeleteVTimer(uid: SceUid): Int =
    throw UnsupportedOperationException("sceKernelDeleteVTimer not available on JVM — no C library access")

public actual fun sceKernelGetVTimerBase(uid: SceUid, base: SceKernelSysClock?): Int =
    throw UnsupportedOperationException("sceKernelGetVTimerBase not available on JVM — no C library access")

public actual fun sceKernelGetVTimerBaseWide(uid: SceUid): Long =
    throw UnsupportedOperationException("sceKernelGetVTimerBaseWide not available on JVM — no C library access")

public actual fun sceKernelGetVTimerTime(uid: SceUid, time: SceKernelSysClock?): Int =
    throw UnsupportedOperationException("sceKernelGetVTimerTime not available on JVM — no C library access")

public actual fun sceKernelGetVTimerTimeWide(uid: SceUid): Long =
    throw UnsupportedOperationException("sceKernelGetVTimerTimeWide not available on JVM — no C library access")

public actual fun sceKernelSetVTimerTime(uid: SceUid, time: SceKernelSysClock?): Int =
    throw UnsupportedOperationException("sceKernelSetVTimerTime not available on JVM — no C library access")

public actual fun sceKernelSetVTimerTimeWide(uid: SceUid, time: Long): Long =
    throw UnsupportedOperationException("sceKernelSetVTimerTimeWide not available on JVM — no C library access")

public actual fun sceKernelStartVTimer(uid: SceUid): Int =
    throw UnsupportedOperationException("sceKernelStartVTimer not available on JVM — no C library access")

public actual fun sceKernelStopVTimer(uid: SceUid): Int =
    throw UnsupportedOperationException("sceKernelStopVTimer not available on JVM — no C library access")

public actual fun sceKernelSetVTimerHandler(uid: SceUid, time: SceKernelSysClock?, handler: SceKernelVTimerHandler, common: COpaquePointer?): Int =
    throw UnsupportedOperationException("sceKernelSetVTimerHandler not available on JVM — no C library access")

public actual fun sceKernelSetVTimerHandlerWide(uid: SceUid, time: Long, handler: SceKernelVTimerHandlerWide, common: COpaquePointer?): Int =
    throw UnsupportedOperationException("sceKernelSetVTimerHandlerWide not available on JVM — no C library access")

public actual fun sceKernelCancelVTimerHandler(uid: SceUid): Int =
    throw UnsupportedOperationException("sceKernelCancelVTimerHandler not available on JVM — no C library access")

public actual fun sceKernelReferVTimerStatus(uid: SceUid, info: SceKernelVTimerInfo?): Int =
    throw UnsupportedOperationException("sceKernelReferVTimerStatus not available on JVM — no C library access")

public actual fun sceKernelReleaseThreadEventHandler(uid: SceUid): Int =
    throw UnsupportedOperationException("sceKernelReleaseThreadEventHandler not available on JVM — no C library access")

public actual fun sceKernelReferThreadEventHandlerStatus(uid: SceUid, info: SceKernelThreadEventHandlerInfo?): Int =
    throw UnsupportedOperationException("sceKernelReferThreadEventHandlerStatus not available on JVM — no C library access")

public actual fun sceKernelReferThreadProfiler(): DebugProfilerRegs? =
    throw UnsupportedOperationException("sceKernelReferThreadProfiler not available on JVM — no C library access")

public actual fun sceKernelReferGlobalProfiler(): DebugProfilerRegs? =
    throw UnsupportedOperationException("sceKernelReferGlobalProfiler not available on JVM — no C library access")

public actual fun sceUsbStart(driverName: COpaquePointer?, size: Int, args: COpaquePointer?): Int =
    throw UnsupportedOperationException("sceUsbStart not available on JVM — no C library access")

public actual fun sceUsbStop(driverName: COpaquePointer?, size: Int, args: COpaquePointer?): Int =
    throw UnsupportedOperationException("sceUsbStop not available on JVM — no C library access")

public actual fun sceUsbActivate(pid: UInt): Int =
    throw UnsupportedOperationException("sceUsbActivate not available on JVM — no C library access")

public actual fun sceUsbDeactivate(pid: UInt): Int =
    throw UnsupportedOperationException("sceUsbDeactivate not available on JVM — no C library access")

public actual fun sceUsbGetState(): Int =
    throw UnsupportedOperationException("sceUsbGetState not available on JVM — no C library access")

public actual fun sceUsbGetDrvState(driverName: COpaquePointer?): Int =
    throw UnsupportedOperationException("sceUsbGetDrvState not available on JVM — no C library access")

public actual fun sceUsbCamSetupStill(param: UsbCamSetupStillParam?): Int =
    throw UnsupportedOperationException("sceUsbCamSetupStill not available on JVM — no C library access")

public actual fun sceUsbCamSetupStillEx(param: UsbCamSetupStillExParam?): Int =
    throw UnsupportedOperationException("sceUsbCamSetupStillEx not available on JVM — no C library access")

public actual fun sceUsbCamStillInputBlocking(buf: COpaquePointer?, size: ULong): Int =
    throw UnsupportedOperationException("sceUsbCamStillInputBlocking not available on JVM — no C library access")

public actual fun sceUsbCamStillInput(buf: COpaquePointer?, size: ULong): Int =
    throw UnsupportedOperationException("sceUsbCamStillInput not available on JVM — no C library access")

public actual fun sceUsbCamStillWaitInputEnd(): Int =
    throw UnsupportedOperationException("sceUsbCamStillWaitInputEnd not available on JVM — no C library access")

public actual fun sceUsbCamStillPollInputEnd(): Int =
    throw UnsupportedOperationException("sceUsbCamStillPollInputEnd not available on JVM — no C library access")

public actual fun sceUsbCamStillCancelInput(): Int =
    throw UnsupportedOperationException("sceUsbCamStillCancelInput not available on JVM — no C library access")

public actual fun sceUsbCamStillGetInputLength(): Int =
    throw UnsupportedOperationException("sceUsbCamStillGetInputLength not available on JVM — no C library access")

public actual fun sceUsbCamSetupVideo(param: UsbCamSetupVideoParam?, workArea: COpaquePointer?, workAreaSize: Int): Int =
    throw UnsupportedOperationException("sceUsbCamSetupVideo not available on JVM — no C library access")

public actual fun sceUsbCamSetupVideoEx(param: UsbCamSetupVideoExParam?, workArea: COpaquePointer?, workAreaSize: Int): Int =
    throw UnsupportedOperationException("sceUsbCamSetupVideoEx not available on JVM — no C library access")

public actual fun sceUsbCamStartVideo(): Int =
    throw UnsupportedOperationException("sceUsbCamStartVideo not available on JVM — no C library access")

public actual fun sceUsbCamStopVideo(): Int =
    throw UnsupportedOperationException("sceUsbCamStopVideo not available on JVM — no C library access")

public actual fun sceUsbCamReadVideoFrameBlocking(buf: COpaquePointer?, size: ULong): Int =
    throw UnsupportedOperationException("sceUsbCamReadVideoFrameBlocking not available on JVM — no C library access")

public actual fun sceUsbCamReadVideoFrame(buf: COpaquePointer?, size: ULong): Int =
    throw UnsupportedOperationException("sceUsbCamReadVideoFrame not available on JVM — no C library access")

public actual fun sceUsbCamWaitReadVideoFrameEnd(): Int =
    throw UnsupportedOperationException("sceUsbCamWaitReadVideoFrameEnd not available on JVM — no C library access")

public actual fun sceUsbCamPollReadVideoFrameEnd(): Int =
    throw UnsupportedOperationException("sceUsbCamPollReadVideoFrameEnd not available on JVM — no C library access")

public actual fun sceUsbCamGetReadVideoFrameSize(): Int =
    throw UnsupportedOperationException("sceUsbCamGetReadVideoFrameSize not available on JVM — no C library access")

public actual fun sceUsbCamSetSaturation(saturation: Int): Int =
    throw UnsupportedOperationException("sceUsbCamSetSaturation not available on JVM — no C library access")

public actual fun sceUsbCamSetBrightness(brightness: Int): Int =
    throw UnsupportedOperationException("sceUsbCamSetBrightness not available on JVM — no C library access")

public actual fun sceUsbCamSetContrast(contrast: Int): Int =
    throw UnsupportedOperationException("sceUsbCamSetContrast not available on JVM — no C library access")

public actual fun sceUsbCamSetSharpness(sharpness: Int): Int =
    throw UnsupportedOperationException("sceUsbCamSetSharpness not available on JVM — no C library access")

public actual fun sceUsbCamSetImageEffectMode(effectMode: UsbCamEffectMode): Int =
    throw UnsupportedOperationException("sceUsbCamSetImageEffectMode not available on JVM — no C library access")

public actual fun sceUsbCamSetEvLevel(exposureLevel: UsbCamEvLevel): Int =
    throw UnsupportedOperationException("sceUsbCamSetEvLevel not available on JVM — no C library access")

public actual fun sceUsbCamSetReverseMode(reverseFlags: Int): Int =
    throw UnsupportedOperationException("sceUsbCamSetReverseMode not available on JVM — no C library access")

public actual fun sceUsbCamSetZoom(zoom: Int): Int =
    throw UnsupportedOperationException("sceUsbCamSetZoom not available on JVM — no C library access")

public actual fun sceUsbCamGetSaturation(saturation: Int?): Int =
    throw UnsupportedOperationException("sceUsbCamGetSaturation not available on JVM — no C library access")

public actual fun sceUsbCamGetBrightness(brightness: Int?): Int =
    throw UnsupportedOperationException("sceUsbCamGetBrightness not available on JVM — no C library access")

public actual fun sceUsbCamGetContrast(contrast: Int?): Int =
    throw UnsupportedOperationException("sceUsbCamGetContrast not available on JVM — no C library access")

public actual fun sceUsbCamGetSharpness(sharpness: Int?): Int =
    throw UnsupportedOperationException("sceUsbCamGetSharpness not available on JVM — no C library access")

public actual fun sceUsbCamGetImageEffectMode(effectMode: UsbCamEffectMode?): Int =
    throw UnsupportedOperationException("sceUsbCamGetImageEffectMode not available on JVM — no C library access")

public actual fun sceUsbCamGetEvLevel(exposureLevel: UsbCamEvLevel?): Int =
    throw UnsupportedOperationException("sceUsbCamGetEvLevel not available on JVM — no C library access")

public actual fun sceUsbCamGetReverseMode(reverseFlags: Int?): Int =
    throw UnsupportedOperationException("sceUsbCamGetReverseMode not available on JVM — no C library access")

public actual fun sceUsbCamGetZoom(zoom: Int?): Int =
    throw UnsupportedOperationException("sceUsbCamGetZoom not available on JVM — no C library access")

public actual fun sceUsbCamAutoImageReverseSW(on: Int): Int =
    throw UnsupportedOperationException("sceUsbCamAutoImageReverseSW not available on JVM — no C library access")

public actual fun sceUsbCamGetAutoImageReverseState(): Int =
    throw UnsupportedOperationException("sceUsbCamGetAutoImageReverseState not available on JVM — no C library access")

public actual fun sceUsbCamGetLensDirection(): Int =
    throw UnsupportedOperationException("sceUsbCamGetLensDirection not available on JVM — no C library access")

public actual fun sceUsbstorBootRegisterNotify(eventFlag: SceUid): Int =
    throw UnsupportedOperationException("sceUsbstorBootRegisterNotify not available on JVM — no C library access")

public actual fun sceUsbstorBootUnregisterNotify(eventFlag: UInt): Int =
    throw UnsupportedOperationException("sceUsbstorBootUnregisterNotify not available on JVM — no C library access")

public actual fun sceUsbstorBootSetCapacity(size: UInt): Int =
    throw UnsupportedOperationException("sceUsbstorBootSetCapacity not available on JVM — no C library access")

public actual fun scePowerRegisterCallback(slot: Int, cbid: SceUid): Int =
    throw UnsupportedOperationException("scePowerRegisterCallback not available on JVM — no C library access")

public actual fun scePowerUnregisterCallback(slot: Int): Int =
    throw UnsupportedOperationException("scePowerUnregisterCallback not available on JVM — no C library access")

public actual fun scePowerIsPowerOnline(): Int =
    throw UnsupportedOperationException("scePowerIsPowerOnline not available on JVM — no C library access")

public actual fun scePowerIsBatteryExist(): Int =
    throw UnsupportedOperationException("scePowerIsBatteryExist not available on JVM — no C library access")

public actual fun scePowerIsBatteryCharging(): Int =
    throw UnsupportedOperationException("scePowerIsBatteryCharging not available on JVM — no C library access")

public actual fun scePowerGetBatteryChargingStatus(): Int =
    throw UnsupportedOperationException("scePowerGetBatteryChargingStatus not available on JVM — no C library access")

public actual fun scePowerIsLowBattery(): Int =
    throw UnsupportedOperationException("scePowerIsLowBattery not available on JVM — no C library access")

public actual fun scePowerGetBatteryLifePercent(): Int =
    throw UnsupportedOperationException("scePowerGetBatteryLifePercent not available on JVM — no C library access")

public actual fun scePowerGetBatteryLifeTime(): Int =
    throw UnsupportedOperationException("scePowerGetBatteryLifeTime not available on JVM — no C library access")

public actual fun scePowerGetBatteryTemp(): Int =
    throw UnsupportedOperationException("scePowerGetBatteryTemp not available on JVM — no C library access")

public actual fun scePowerGetBatteryElec(): Int =
    throw UnsupportedOperationException("scePowerGetBatteryElec not available on JVM — no C library access")

public actual fun scePowerGetBatteryVolt(): Int =
    throw UnsupportedOperationException("scePowerGetBatteryVolt not available on JVM — no C library access")

public actual fun scePowerSetCpuClockFrequency(cpufreq: Int): Int =
    throw UnsupportedOperationException("scePowerSetCpuClockFrequency not available on JVM — no C library access")

public actual fun scePowerSetBusClockFrequency(busfreq: Int): Int =
    throw UnsupportedOperationException("scePowerSetBusClockFrequency not available on JVM — no C library access")

public actual fun scePowerGetCpuClockFrequency(): Int =
    throw UnsupportedOperationException("scePowerGetCpuClockFrequency not available on JVM — no C library access")

public actual fun scePowerGetCpuClockFrequencyInt(): Int =
    throw UnsupportedOperationException("scePowerGetCpuClockFrequencyInt not available on JVM — no C library access")

public actual fun scePowerGetBusClockFrequency(): Int =
    throw UnsupportedOperationException("scePowerGetBusClockFrequency not available on JVM — no C library access")

public actual fun scePowerGetBusClockFrequencyInt(): Int =
    throw UnsupportedOperationException("scePowerGetBusClockFrequencyInt not available on JVM — no C library access")

public actual fun scePowerSetClockFrequency(pllfreq: Int, cpufreq: Int, busfreq: Int): Int =
    throw UnsupportedOperationException("scePowerSetClockFrequency not available on JVM — no C library access")

public actual fun scePowerLock(unknown: Int): Int =
    throw UnsupportedOperationException("scePowerLock not available on JVM — no C library access")

public actual fun scePowerUnlock(unknown: Int): Int =
    throw UnsupportedOperationException("scePowerUnlock not available on JVM — no C library access")

public actual fun scePowerTick(t: PowerTick): Int =
    throw UnsupportedOperationException("scePowerTick not available on JVM — no C library access")

public actual fun scePowerGetIdleTimer(): Int =
    throw UnsupportedOperationException("scePowerGetIdleTimer not available on JVM — no C library access")

public actual fun scePowerIdleTimerEnable(unknown: Int): Int =
    throw UnsupportedOperationException("scePowerIdleTimerEnable not available on JVM — no C library access")

public actual fun scePowerIdleTimerDisable(unknown: Int): Int =
    throw UnsupportedOperationException("scePowerIdleTimerDisable not available on JVM — no C library access")

public actual fun scePowerRequestStandby(): Int =
    throw UnsupportedOperationException("scePowerRequestStandby not available on JVM — no C library access")

public actual fun scePowerRequestSuspend(): Int =
    throw UnsupportedOperationException("scePowerRequestSuspend not available on JVM — no C library access")

public actual fun sceWlanDevIsPowerOn(): Int =
    throw UnsupportedOperationException("sceWlanDevIsPowerOn not available on JVM — no C library access")

public actual fun sceWlanGetSwitchState(): Int =
    throw UnsupportedOperationException("sceWlanGetSwitchState not available on JVM — no C library access")

public actual fun sceWlanGetEtherAddr(etherAddr: COpaquePointer?): Int =
    throw UnsupportedOperationException("sceWlanGetEtherAddr not available on JVM — no C library access")

public actual fun sceWlanDevAttach(): Int =
    throw UnsupportedOperationException("sceWlanDevAttach not available on JVM — no C library access")

public actual fun sceWlanDevDetach(): Int =
    throw UnsupportedOperationException("sceWlanDevDetach not available on JVM — no C library access")

public actual fun sceRtcGetCurrentTick(tick: ULong?): Int =
    throw UnsupportedOperationException("sceRtcGetCurrentTick not available on JVM — no C library access")

public actual fun sceRtcGetCurrentClock(tm: ScePspDateTime?, tz: Int): Int =
    throw UnsupportedOperationException("sceRtcGetCurrentClock not available on JVM — no C library access")

public actual fun sceRtcGetCurrentClockLocalTime(tm: ScePspDateTime?): Int =
    throw UnsupportedOperationException("sceRtcGetCurrentClockLocalTime not available on JVM — no C library access")

public actual fun sceRtcConvertUtcToLocalTime(tickUtc: ULong?, tickLocal: ULong?): Int =
    throw UnsupportedOperationException("sceRtcConvertUtcToLocalTime not available on JVM — no C library access")

public actual fun sceRtcConvertLocalTimeToUTC(tickLocal: ULong?, tickUtc: ULong?): Int =
    throw UnsupportedOperationException("sceRtcConvertLocalTimeToUTC not available on JVM — no C library access")

public actual fun sceRtcIsLeapYear(year: Int): Int =
    throw UnsupportedOperationException("sceRtcIsLeapYear not available on JVM — no C library access")

public actual fun sceRtcGetDaysInMonth(year: Int, month: Int): Int =
    throw UnsupportedOperationException("sceRtcGetDaysInMonth not available on JVM — no C library access")

public actual fun sceRtcGetDayOfWeek(year: Int, month: Int, day: Int): Int =
    throw UnsupportedOperationException("sceRtcGetDayOfWeek not available on JVM — no C library access")

public actual fun sceRtcCheckValid(date: ScePspDateTime?): Int =
    throw UnsupportedOperationException("sceRtcCheckValid not available on JVM — no C library access")

public actual fun sceRtcSetTick(date: ScePspDateTime?, tick: ULong?): Int =
    throw UnsupportedOperationException("sceRtcSetTick not available on JVM — no C library access")

public actual fun sceRtcGetTick(date: ScePspDateTime?, tick: ULong?): Int =
    throw UnsupportedOperationException("sceRtcGetTick not available on JVM — no C library access")

public actual fun sceRtcCompareTick(tick1: ULong?, tick2: ULong?): Int =
    throw UnsupportedOperationException("sceRtcCompareTick not available on JVM — no C library access")

public actual fun sceRtcTickAddTicks(destTick: ULong?, srcTick: ULong?, numTicks: ULong): Int =
    throw UnsupportedOperationException("sceRtcTickAddTicks not available on JVM — no C library access")

public actual fun sceRtcTickAddMicroseconds(destTick: ULong?, srcTick: ULong?, numMs: ULong): Int =
    throw UnsupportedOperationException("sceRtcTickAddMicroseconds not available on JVM — no C library access")

public actual fun sceRtcTickAddSeconds(destTick: ULong?, srcTick: ULong?, numSeconds: ULong): Int =
    throw UnsupportedOperationException("sceRtcTickAddSeconds not available on JVM — no C library access")

public actual fun sceRtcTickAddMinutes(destTick: ULong?, srcTick: ULong?, numMinutes: ULong): Int =
    throw UnsupportedOperationException("sceRtcTickAddMinutes not available on JVM — no C library access")

public actual fun sceRtcTickAddHours(destTick: ULong?, srcTick: ULong?, numHours: ULong): Int =
    throw UnsupportedOperationException("sceRtcTickAddHours not available on JVM — no C library access")

public actual fun sceRtcTickAddDays(destTick: ULong?, srcTick: ULong?, numDays: ULong): Int =
    throw UnsupportedOperationException("sceRtcTickAddDays not available on JVM — no C library access")

public actual fun sceRtcTickAddWeeks(destTick: ULong?, srcTick: ULong?, numWeeks: ULong): Int =
    throw UnsupportedOperationException("sceRtcTickAddWeeks not available on JVM — no C library access")

public actual fun sceRtcTickAddMonths(destTick: ULong?, srcTick: ULong?, numMonths: ULong): Int =
    throw UnsupportedOperationException("sceRtcTickAddMonths not available on JVM — no C library access")

public actual fun sceRtcTickAddYears(destTick: ULong?, srcTick: ULong?, numYears: ULong): Int =
    throw UnsupportedOperationException("sceRtcTickAddYears not available on JVM — no C library access")

public actual fun sceRtcSetTimeT(date: ScePspDateTime?, time: UInt): Int =
    throw UnsupportedOperationException("sceRtcSetTimeT not available on JVM — no C library access")

public actual fun sceRtcGetTimeT(date: ScePspDateTime?, time: UInt?): Int =
    throw UnsupportedOperationException("sceRtcGetTimeT not available on JVM — no C library access")

public actual fun sceRtcSetTime64T(date: ScePspDateTime?, time: ULong): Int =
    throw UnsupportedOperationException("sceRtcSetTime64T not available on JVM — no C library access")

public actual fun sceRtcGetTime64T(date: ScePspDateTime?, time: ULong?): Int =
    throw UnsupportedOperationException("sceRtcGetTime64T not available on JVM — no C library access")

public actual fun sceRtcSetDosTime(date: ScePspDateTime?, dosTime: UInt): Int =
    throw UnsupportedOperationException("sceRtcSetDosTime not available on JVM — no C library access")

public actual fun sceRtcGetDosTime(date: ScePspDateTime?, dosTime: UInt): Int =
    throw UnsupportedOperationException("sceRtcGetDosTime not available on JVM — no C library access")

public actual fun sceRtcSetWin32FileTime(date: ScePspDateTime?, time: ULong?): Int =
    throw UnsupportedOperationException("sceRtcSetWin32FileTime not available on JVM — no C library access")

public actual fun sceRtcGetWin32FileTime(date: ScePspDateTime?, time: ULong?): Int =
    throw UnsupportedOperationException("sceRtcGetWin32FileTime not available on JVM — no C library access")

public actual fun sceRtcParseDateTime(destTick: ULong?, dateString: COpaquePointer?): Int =
    throw UnsupportedOperationException("sceRtcParseDateTime not available on JVM — no C library access")

public actual fun sceRtcFormatRFC3339(pszDateTime: String?, pUtc: ULong?, timeZoneMinutes: Int): Int =
    throw UnsupportedOperationException("sceRtcFormatRFC3339 not available on JVM — no C library access")

public actual fun sceRtcFormatRFC3339LocalTime(pszDateTime: String?, pUtc: ULong?): Int =
    throw UnsupportedOperationException("sceRtcFormatRFC3339LocalTime not available on JVM — no C library access")

public actual fun sceRtcParseRFC3339(pUtc: ULong?, pszDateTime: COpaquePointer?): Int =
    throw UnsupportedOperationException("sceRtcParseRFC3339 not available on JVM — no C library access")

public actual fun sceRtcFormatRFC2822(pszDateTime: String?, pUtc: ULong?, timeZoneMinutes: Int): Int =
    throw UnsupportedOperationException("sceRtcFormatRFC2822 not available on JVM — no C library access")

public actual fun sceRtcFormatRFC2822LocalTime(pszDateTime: String?, pUtc: ULong?): Int =
    throw UnsupportedOperationException("sceRtcFormatRFC2822LocalTime not available on JVM — no C library access")

public actual fun sceIoClose(fd: SceUid): Int =
    throw UnsupportedOperationException("sceIoClose not available on JVM — no C library access")

public actual fun sceIoCloseAsync(fd: SceUid): Int =
    throw UnsupportedOperationException("sceIoCloseAsync not available on JVM — no C library access")

public actual fun sceIoRead(fd: SceUid, data: COpaquePointer?, size: UInt): Int =
    throw UnsupportedOperationException("sceIoRead not available on JVM — no C library access")

public actual fun sceIoReadAsync(fd: SceUid, data: COpaquePointer?, size: UInt): Int =
    throw UnsupportedOperationException("sceIoReadAsync not available on JVM — no C library access")

public actual fun sceIoWrite(fd: SceUid, data: COpaquePointer?, size: ULong): Int =
    throw UnsupportedOperationException("sceIoWrite not available on JVM — no C library access")

public actual fun sceIoWriteAsync(fd: SceUid, data: COpaquePointer?, size: UInt): Int =
    throw UnsupportedOperationException("sceIoWriteAsync not available on JVM — no C library access")

public actual fun sceIoLseek(fd: SceUid, offset: Long, whence: IoWhence): Long =
    throw UnsupportedOperationException("sceIoLseek not available on JVM — no C library access")

public actual fun sceIoLseekAsync(fd: SceUid, offset: Long, whence: IoWhence): Int =
    throw UnsupportedOperationException("sceIoLseekAsync not available on JVM — no C library access")

public actual fun sceIoLseek32(fd: SceUid, offset: Int, whence: IoWhence): Int =
    throw UnsupportedOperationException("sceIoLseek32 not available on JVM — no C library access")

public actual fun sceIoLseek32Async(fd: SceUid, offset: Int, whence: IoWhence): Int =
    throw UnsupportedOperationException("sceIoLseek32Async not available on JVM — no C library access")

public actual fun sceIoRemove(file: COpaquePointer?): Int =
    throw UnsupportedOperationException("sceIoRemove not available on JVM — no C library access")

public actual fun sceIoMkdir(dir: COpaquePointer?, mode: IoPermissions): Int =
    throw UnsupportedOperationException("sceIoMkdir not available on JVM — no C library access")

public actual fun sceIoRmdir(path: COpaquePointer?): Int =
    throw UnsupportedOperationException("sceIoRmdir not available on JVM — no C library access")

public actual fun sceIoChdir(path: COpaquePointer?): Int =
    throw UnsupportedOperationException("sceIoChdir not available on JVM — no C library access")

public actual fun sceIoRename(oldname: COpaquePointer?, newname: COpaquePointer?): Int =
    throw UnsupportedOperationException("sceIoRename not available on JVM — no C library access")

public actual fun sceIoDread(fd: SceUid, dir: SceIoDirent?): Int =
    throw UnsupportedOperationException("sceIoDread not available on JVM — no C library access")

public actual fun sceIoDclose(fd: SceUid): Int =
    throw UnsupportedOperationException("sceIoDclose not available on JVM — no C library access")

public actual fun sceIoDevctl(dev: COpaquePointer?, cmd: UInt, indata: COpaquePointer?, inlen: Int, outdata: COpaquePointer?, outlen: Int): Int =
    throw UnsupportedOperationException("sceIoDevctl not available on JVM — no C library access")

public actual fun sceIoAssign(dev1: COpaquePointer?, dev2: COpaquePointer?, dev3: COpaquePointer?, mode: IoAssignPerms, unk1: COpaquePointer?, unk2: Int): Int =
    throw UnsupportedOperationException("sceIoAssign not available on JVM — no C library access")

public actual fun sceIoUnassign(dev: COpaquePointer?): Int =
    throw UnsupportedOperationException("sceIoUnassign not available on JVM — no C library access")

public actual fun sceIoGetstat(file: COpaquePointer?, stat: SceIoStat?): Int =
    throw UnsupportedOperationException("sceIoGetstat not available on JVM — no C library access")

public actual fun sceIoChstat(file: COpaquePointer?, stat: SceIoStat?, bits: Int): Int =
    throw UnsupportedOperationException("sceIoChstat not available on JVM — no C library access")

public actual fun sceIoIoctl(fd: SceUid, cmd: UInt, indata: COpaquePointer?, inlen: Int, outdata: COpaquePointer?, outlen: Int): Int =
    throw UnsupportedOperationException("sceIoIoctl not available on JVM — no C library access")

public actual fun sceIoIoctlAsync(fd: SceUid, cmd: UInt, indata: COpaquePointer?, inlen: Int, outdata: COpaquePointer?, outlen: Int): Int =
    throw UnsupportedOperationException("sceIoIoctlAsync not available on JVM — no C library access")

public actual fun sceIoSync(device: COpaquePointer?, unk: UInt): Int =
    throw UnsupportedOperationException("sceIoSync not available on JVM — no C library access")

public actual fun sceIoWaitAsync(fd: SceUid, res: Long?): Int =
    throw UnsupportedOperationException("sceIoWaitAsync not available on JVM — no C library access")

public actual fun sceIoWaitAsyncCB(fd: SceUid, res: Long?): Int =
    throw UnsupportedOperationException("sceIoWaitAsyncCB not available on JVM — no C library access")

public actual fun sceIoPollAsync(fd: SceUid, res: Long?): Int =
    throw UnsupportedOperationException("sceIoPollAsync not available on JVM — no C library access")

public actual fun sceIoGetAsyncStat(fd: SceUid, poll: Int, res: Long?): Int =
    throw UnsupportedOperationException("sceIoGetAsyncStat not available on JVM — no C library access")

public actual fun sceIoCancel(fd: SceUid): Int =
    throw UnsupportedOperationException("sceIoCancel not available on JVM — no C library access")

public actual fun sceIoGetDevType(fd: SceUid): Int =
    throw UnsupportedOperationException("sceIoGetDevType not available on JVM — no C library access")

public actual fun sceIoChangeAsyncPriority(fd: SceUid, pri: Int): Int =
    throw UnsupportedOperationException("sceIoChangeAsyncPriority not available on JVM — no C library access")

public actual fun sceIoSetAsyncCallback(fd: SceUid, cb: SceUid, argp: COpaquePointer?): Int =
    throw UnsupportedOperationException("sceIoSetAsyncCallback not available on JVM — no C library access")

public actual fun sceJpegInitMJpeg(): Int =
    throw UnsupportedOperationException("sceJpegInitMJpeg not available on JVM — no C library access")

public actual fun sceJpegFinishMJpeg(): Int =
    throw UnsupportedOperationException("sceJpegFinishMJpeg not available on JVM — no C library access")

public actual fun sceJpegCreateMJpeg(width: Int, height: Int): Int =
    throw UnsupportedOperationException("sceJpegCreateMJpeg not available on JVM — no C library access")

public actual fun sceJpegDeleteMJpeg(): Int =
    throw UnsupportedOperationException("sceJpegDeleteMJpeg not available on JVM — no C library access")

public actual fun sceJpegDecodeMJpeg(jpegBuf: COpaquePointer?, size: ULong, rgba: COpaquePointer?, unk: UInt): Int =
    throw UnsupportedOperationException("sceJpegDecodeMJpeg not available on JVM — no C library access")

public actual fun sceUmdCheckMedium(): Int =
    throw UnsupportedOperationException("sceUmdCheckMedium not available on JVM — no C library access")

public actual fun sceUmdGetDiscInfo(info: UmdInfo?): Int =
    throw UnsupportedOperationException("sceUmdGetDiscInfo not available on JVM — no C library access")

public actual fun sceUmdActivate(unit: Int, drive: COpaquePointer?): Int =
    throw UnsupportedOperationException("sceUmdActivate not available on JVM — no C library access")

public actual fun sceUmdDeactivate(unit: Int, drive: COpaquePointer?): Int =
    throw UnsupportedOperationException("sceUmdDeactivate not available on JVM — no C library access")

public actual fun sceUmdWaitDriveStat(state: Int): Int =
    throw UnsupportedOperationException("sceUmdWaitDriveStat not available on JVM — no C library access")

public actual fun sceUmdWaitDriveStatWithTimer(state: Int, timeout: UInt): Int =
    throw UnsupportedOperationException("sceUmdWaitDriveStatWithTimer not available on JVM — no C library access")

public actual fun sceUmdWaitDriveStatCB(state: Int, timeout: UInt): Int =
    throw UnsupportedOperationException("sceUmdWaitDriveStatCB not available on JVM — no C library access")

public actual fun sceUmdCancelWaitDriveStat(): Int =
    throw UnsupportedOperationException("sceUmdCancelWaitDriveStat not available on JVM — no C library access")

public actual fun sceUmdGetDriveStat(): Int =
    throw UnsupportedOperationException("sceUmdGetDriveStat not available on JVM — no C library access")

public actual fun sceUmdGetErrorStat(): Int =
    throw UnsupportedOperationException("sceUmdGetErrorStat not available on JVM — no C library access")

public actual fun sceUmdRegisterUMDCallBack(cbid: Int): Int =
    throw UnsupportedOperationException("sceUmdRegisterUMDCallBack not available on JVM — no C library access")

public actual fun sceUmdUnRegisterUMDCallBack(cbid: Int): Int =
    throw UnsupportedOperationException("sceUmdUnRegisterUMDCallBack not available on JVM — no C library access")

public actual fun sceUmdReplacePermit(): Int =
    throw UnsupportedOperationException("sceUmdReplacePermit not available on JVM — no C library access")

public actual fun sceUmdReplaceProhibit(): Int =
    throw UnsupportedOperationException("sceUmdReplaceProhibit not available on JVM — no C library access")

public actual fun sceMpegInit(): Int =
    throw UnsupportedOperationException("sceMpegInit not available on JVM — no C library access")

public actual fun sceMpegFinish() {
    throw UnsupportedOperationException("sceMpegFinish not available on JVM — no C library access")
}

public actual fun sceMpegRingbufferQueryMemSize(packets: Int): Int =
    throw UnsupportedOperationException("sceMpegRingbufferQueryMemSize not available on JVM — no C library access")

public actual fun sceMpegRingbufferConstruct(ringbuffer: SceMpegRingbuffer?, packets: Int, data: COpaquePointer?, size: Int, callback: SceMpegRingbufferCb, cbParam: COpaquePointer?): Int =
    throw UnsupportedOperationException("sceMpegRingbufferConstruct not available on JVM — no C library access")

public actual fun sceMpegRingbufferDestruct(ringbuffer: SceMpegRingbuffer?) {
    throw UnsupportedOperationException("sceMpegRingbufferDestruct not available on JVM — no C library access")
}

public actual fun sceMpegRingbufferAvailableSize(ringbuffer: SceMpegRingbuffer?): Int =
    throw UnsupportedOperationException("sceMpegRingbufferAvailableSize not available on JVM — no C library access")

public actual fun sceMpegRingbufferPut(ringbuffer: SceMpegRingbuffer?, numPackets: Int, available: Int): Int =
    throw UnsupportedOperationException("sceMpegRingbufferPut not available on JVM — no C library access")

public actual fun sceMpegQueryMemSize(unk: Int): Int =
    throw UnsupportedOperationException("sceMpegQueryMemSize not available on JVM — no C library access")

public actual fun sceMpegCreate(handle: SceMpeg, data: COpaquePointer?, size: Int, ringbuffer: SceMpegRingbuffer?, frameWidth: Int, unk1: Int, unk2: Int): Int =
    throw UnsupportedOperationException("sceMpegCreate not available on JVM — no C library access")

public actual fun sceMpegDelete(handle: SceMpeg) {
    throw UnsupportedOperationException("sceMpegDelete not available on JVM — no C library access")
}

public actual fun sceMpegQueryStreamOffset(handle: SceMpeg, buffer: COpaquePointer?, offset: Int?): Int =
    throw UnsupportedOperationException("sceMpegQueryStreamOffset not available on JVM — no C library access")

public actual fun sceMpegQueryStreamSize(buffer: COpaquePointer?, size: Int?): Int =
    throw UnsupportedOperationException("sceMpegQueryStreamSize not available on JVM — no C library access")

public actual fun sceMpegUnRegistStream(handle: SceMpeg, stream: SceMpegStream) {
    throw UnsupportedOperationException("sceMpegUnRegistStream not available on JVM — no C library access")
}

public actual fun sceMpegFlushAllStream(handle: SceMpeg): Int =
    throw UnsupportedOperationException("sceMpegFlushAllStream not available on JVM — no C library access")

public actual fun sceMpegMallocAvcEsBuf(handle: SceMpeg): COpaquePointer? =
    throw UnsupportedOperationException("sceMpegMallocAvcEsBuf not available on JVM — no C library access")

public actual fun sceMpegFreeAvcEsBuf(handle: SceMpeg, buf: COpaquePointer?) {
    throw UnsupportedOperationException("sceMpegFreeAvcEsBuf not available on JVM — no C library access")
}

public actual fun sceMpegQueryAtracEsSize(handle: SceMpeg, esSize: Int?, outSize: Int?): Int =
    throw UnsupportedOperationException("sceMpegQueryAtracEsSize not available on JVM — no C library access")

public actual fun sceMpegInitAu(handle: SceMpeg, esBuffer: COpaquePointer?, au: SceMpegAu?): Int =
    throw UnsupportedOperationException("sceMpegInitAu not available on JVM — no C library access")

public actual fun sceMpegGetAvcAu(handle: SceMpeg, stream: SceMpegStream, au: SceMpegAu?, unk: Int?): Int =
    throw UnsupportedOperationException("sceMpegGetAvcAu not available on JVM — no C library access")

public actual fun sceMpegAvcDecodeMode(handle: SceMpeg, mode: SceMpegAvcMode?): Int =
    throw UnsupportedOperationException("sceMpegAvcDecodeMode not available on JVM — no C library access")

public actual fun sceMpegAvcDecode(handle: SceMpeg, au: SceMpegAu?, iframeWidth: Int, buffer: COpaquePointer?, init: Int?): Int =
    throw UnsupportedOperationException("sceMpegAvcDecode not available on JVM — no C library access")

public actual fun sceMpegAvcDecodeStop(handle: SceMpeg, frameWidth: Int, buffer: COpaquePointer?, status: Int?): Int =
    throw UnsupportedOperationException("sceMpegAvcDecodeStop not available on JVM — no C library access")

public actual fun sceMpegGetAtracAu(handle: SceMpeg, stream: SceMpegStream, au: SceMpegAu?, unk: COpaquePointer?): Int =
    throw UnsupportedOperationException("sceMpegGetAtracAu not available on JVM — no C library access")

public actual fun sceMpegAtracDecode(handle: SceMpeg, au: SceMpegAu?, buffer: COpaquePointer?, init: Int): Int =
    throw UnsupportedOperationException("sceMpegAtracDecode not available on JVM — no C library access")

public actual fun sceMpegBaseYCrCbCopyVme(yuvBuffer: COpaquePointer?, buffer: Int?, type: Int): Int =
    throw UnsupportedOperationException("sceMpegBaseYCrCbCopyVme not available on JVM — no C library access")

public actual fun sceMpegBaseCscInit(width: Int): Int =
    throw UnsupportedOperationException("sceMpegBaseCscInit not available on JVM — no C library access")

public actual fun sceMpegBaseCscVme(rgbBuffer: COpaquePointer?, rgbBuffer2: COpaquePointer?, width: Int, yCrCbBuffer: SceMpegYCrCbBuffer?): Int =
    throw UnsupportedOperationException("sceMpegBaseCscVme not available on JVM — no C library access")

public actual fun sceMpegbaseBEA18F91(lli: SceMpegLLI?): Int =
    throw UnsupportedOperationException("sceMpegbaseBEA18F91 not available on JVM — no C library access")

public actual fun sceHprmPeekCurrentKey(key: Int?): Int =
    throw UnsupportedOperationException("sceHprmPeekCurrentKey not available on JVM — no C library access")

public actual fun sceHprmPeekLatch(latch: UIntArray?): Int =
    throw UnsupportedOperationException("sceHprmPeekLatch not available on JVM — no C library access")

public actual fun sceHprmReadLatch(latch: UIntArray?): Int =
    throw UnsupportedOperationException("sceHprmReadLatch not available on JVM — no C library access")

public actual fun sceHprmIsHeadphoneExist(): Int =
    throw UnsupportedOperationException("sceHprmIsHeadphoneExist not available on JVM — no C library access")

public actual fun sceHprmIsRemoteExist(): Int =
    throw UnsupportedOperationException("sceHprmIsRemoteExist not available on JVM — no C library access")

public actual fun sceHprmIsMicrophoneExist(): Int =
    throw UnsupportedOperationException("sceHprmIsMicrophoneExist not available on JVM — no C library access")

public actual fun sceGuDepthBuffer(zbp: COpaquePointer?, zbw: Int) {
    throw UnsupportedOperationException("sceGuDepthBuffer not available on JVM — no C library access")
}

public actual fun sceGuDispBuffer(width: Int, height: Int, dispbp: COpaquePointer?, dispbw: Int) {
    throw UnsupportedOperationException("sceGuDispBuffer not available on JVM — no C library access")
}

public actual fun sceGuDrawBuffer(psm: DisplayPixelFormat, fbp: COpaquePointer?, fbw: Int) {
    throw UnsupportedOperationException("sceGuDrawBuffer not available on JVM — no C library access")
}

public actual fun sceGuDrawBufferList(psm: DisplayPixelFormat, fbp: COpaquePointer?, fbw: Int) {
    throw UnsupportedOperationException("sceGuDrawBufferList not available on JVM — no C library access")
}

public actual fun sceGuDisplay(state: Boolean): Boolean =
    throw UnsupportedOperationException("sceGuDisplay not available on JVM — no C library access")

public actual fun sceGuDepthFunc(function: DepthFunc) {
    throw UnsupportedOperationException("sceGuDepthFunc not available on JVM — no C library access")
}

public actual fun sceGuDepthMask(mask: Int) {
    throw UnsupportedOperationException("sceGuDepthMask not available on JVM — no C library access")
}

public actual fun sceGuDepthOffset(offset: Int) {
    throw UnsupportedOperationException("sceGuDepthOffset not available on JVM — no C library access")
}

public actual fun sceGuDepthRange(near: Int, far: Int) {
    throw UnsupportedOperationException("sceGuDepthRange not available on JVM — no C library access")
}

public actual fun sceGuFog(near: Float, far: Float, color: UInt) {
    throw UnsupportedOperationException("sceGuFog not available on JVM — no C library access")
}

public actual fun sceGuInit() {
    throw UnsupportedOperationException("sceGuInit not available on JVM — no C library access")
}

public actual fun sceGuTerm() {
    throw UnsupportedOperationException("sceGuTerm not available on JVM — no C library access")
}

public actual fun sceGuBreak(mode: Int) {
    throw UnsupportedOperationException("sceGuBreak not available on JVM — no C library access")
}

public actual fun sceGuContinue() {
    throw UnsupportedOperationException("sceGuContinue not available on JVM — no C library access")
}

public actual fun sceGuSignal(behavior: SignalBehavior, signal: Int) {
    throw UnsupportedOperationException("sceGuSignal not available on JVM — no C library access")
}

public actual fun sceGuSendCommandf(cmd: GeCommand, argument: Float) {
    throw UnsupportedOperationException("sceGuSendCommandf not available on JVM — no C library access")
}

public actual fun sceGuSendCommandi(cmd: GeCommand, argument: Int) {
    throw UnsupportedOperationException("sceGuSendCommandi not available on JVM — no C library access")
}

public actual fun sceGuGetMemory(size: Int): COpaquePointer? =
    throw UnsupportedOperationException("sceGuGetMemory not available on JVM — no C library access")

public actual fun sceGuStart(contextType: GuContextType, list: COpaquePointer?) {
    throw UnsupportedOperationException("sceGuStart not available on JVM — no C library access")
}

public actual fun sceGuFinish(): Int =
    throw UnsupportedOperationException("sceGuFinish not available on JVM — no C library access")

public actual fun sceGuFinishId(id: UInt): Int =
    throw UnsupportedOperationException("sceGuFinishId not available on JVM — no C library access")

public actual fun sceGuCallList(list: COpaquePointer?) {
    throw UnsupportedOperationException("sceGuCallList not available on JVM — no C library access")
}

public actual fun sceGuCallMode(mode: Int) {
    throw UnsupportedOperationException("sceGuCallMode not available on JVM — no C library access")
}

public actual fun sceGuCheckList(): Int =
    throw UnsupportedOperationException("sceGuCheckList not available on JVM — no C library access")

public actual fun sceGuSendList(mode: GuQueueMode, list: COpaquePointer?, context: GeContext?) {
    throw UnsupportedOperationException("sceGuSendList not available on JVM — no C library access")
}

public actual fun sceGuSwapBuffers(): COpaquePointer? =
    throw UnsupportedOperationException("sceGuSwapBuffers not available on JVM — no C library access")

public actual fun sceGuDrawArray(prim: GuPrimitive, vtype: Int, count: Int, indices: COpaquePointer?, vertices: COpaquePointer?) {
    throw UnsupportedOperationException("sceGuDrawArray not available on JVM — no C library access")
}

public actual fun sceGuBeginObject(vtype: Int, count: Int, indices: COpaquePointer?, vertices: COpaquePointer?) {
    throw UnsupportedOperationException("sceGuBeginObject not available on JVM — no C library access")
}

public actual fun sceGuEndObject() {
    throw UnsupportedOperationException("sceGuEndObject not available on JVM — no C library access")
}

public actual fun sceGuSetStatus(state: GuState, status: Int) {
    throw UnsupportedOperationException("sceGuSetStatus not available on JVM — no C library access")
}

public actual fun sceGuGetStatus(state: GuState): Boolean =
    throw UnsupportedOperationException("sceGuGetStatus not available on JVM — no C library access")

public actual fun sceGuSetAllStatus(status: Int) {
    throw UnsupportedOperationException("sceGuSetAllStatus not available on JVM — no C library access")
}

public actual fun sceGuGetAllStatus(): Int =
    throw UnsupportedOperationException("sceGuGetAllStatus not available on JVM — no C library access")

public actual fun sceGuEnable(state: GuState) {
    throw UnsupportedOperationException("sceGuEnable not available on JVM — no C library access")
}

public actual fun sceGuDisable(state: GuState) {
    throw UnsupportedOperationException("sceGuDisable not available on JVM — no C library access")
}

public actual fun sceGuLight(light: Int, type: LightType, components: Int, position: ScePspFVector3?) {
    throw UnsupportedOperationException("sceGuLight not available on JVM — no C library access")
}

public actual fun sceGuLightAtt(light: Int, atten0: Float, atten1: Float, atten2: Float) {
    throw UnsupportedOperationException("sceGuLightAtt not available on JVM — no C library access")
}

public actual fun sceGuLightColor(light: Int, component: Int, color: UInt) {
    throw UnsupportedOperationException("sceGuLightColor not available on JVM — no C library access")
}

public actual fun sceGuLightMode(mode: LightMode) {
    throw UnsupportedOperationException("sceGuLightMode not available on JVM — no C library access")
}

public actual fun sceGuLightSpot(light: Int, direction: ScePspFVector3?, exponent: Float, cutoff: Float) {
    throw UnsupportedOperationException("sceGuLightSpot not available on JVM — no C library access")
}

public actual fun sceGuClear(flags: Int) {
    throw UnsupportedOperationException("sceGuClear not available on JVM — no C library access")
}

public actual fun sceGuClearColor(color: UInt) {
    throw UnsupportedOperationException("sceGuClearColor not available on JVM — no C library access")
}

public actual fun sceGuClearDepth(depth: UInt) {
    throw UnsupportedOperationException("sceGuClearDepth not available on JVM — no C library access")
}

public actual fun sceGuClearStencil(stencil: UInt) {
    throw UnsupportedOperationException("sceGuClearStencil not available on JVM — no C library access")
}

public actual fun sceGuPixelMask(mask: UInt) {
    throw UnsupportedOperationException("sceGuPixelMask not available on JVM — no C library access")
}

public actual fun sceGuColor(color: UInt) {
    throw UnsupportedOperationException("sceGuColor not available on JVM — no C library access")
}

public actual fun sceGuColorFunc(func: ColorFunc, color: UInt, mask: UInt) {
    throw UnsupportedOperationException("sceGuColorFunc not available on JVM — no C library access")
}

public actual fun sceGuColorMaterial(components: Int) {
    throw UnsupportedOperationException("sceGuColorMaterial not available on JVM — no C library access")
}

public actual fun sceGuAlphaFunc(func: AlphaFunc, value: Int, mask: Int) {
    throw UnsupportedOperationException("sceGuAlphaFunc not available on JVM — no C library access")
}

public actual fun sceGuAmbient(color: UInt) {
    throw UnsupportedOperationException("sceGuAmbient not available on JVM — no C library access")
}

public actual fun sceGuAmbientColor(color: UInt) {
    throw UnsupportedOperationException("sceGuAmbientColor not available on JVM — no C library access")
}

public actual fun sceGuBlendFunc(op: BlendOp, src: BlendSrc, dest: BlendDst, srcFix: UInt, destFix: UInt) {
    throw UnsupportedOperationException("sceGuBlendFunc not available on JVM — no C library access")
}

public actual fun sceGuMaterial(components: Int, color: UInt) {
    throw UnsupportedOperationException("sceGuMaterial not available on JVM — no C library access")
}

public actual fun sceGuModelColor(emissive: UInt, ambient: UInt, diffuse: UInt, specular: UInt) {
    throw UnsupportedOperationException("sceGuModelColor not available on JVM — no C library access")
}

public actual fun sceGuStencilFunc(func: StencilFunc, ref: Int, mask: Int) {
    throw UnsupportedOperationException("sceGuStencilFunc not available on JVM — no C library access")
}

public actual fun sceGuStencilOp(fail: StencilOperation, zfail: StencilOperation, zpass: StencilOperation) {
    throw UnsupportedOperationException("sceGuStencilOp not available on JVM — no C library access")
}

public actual fun sceGuSpecular(power: Float) {
    throw UnsupportedOperationException("sceGuSpecular not available on JVM — no C library access")
}

public actual fun sceGuFrontFace(order: FrontFaceDirection) {
    throw UnsupportedOperationException("sceGuFrontFace not available on JVM — no C library access")
}

public actual fun sceGuLogicalOp(op: LogicalOperation) {
    throw UnsupportedOperationException("sceGuLogicalOp not available on JVM — no C library access")
}

public actual fun sceGuSetDither(matrix: ScePspIMatrix4?) {
    throw UnsupportedOperationException("sceGuSetDither not available on JVM — no C library access")
}

public actual fun sceGuShadeModel(mode: ShadingModel) {
    throw UnsupportedOperationException("sceGuShadeModel not available on JVM — no C library access")
}

public actual fun sceGuCopyImage(psm: DisplayPixelFormat, sx: Int, sy: Int, width: Int, height: Int, srcw: Int, src: COpaquePointer?, dx: Int, dy: Int, destw: Int, dest: COpaquePointer?) {
    throw UnsupportedOperationException("sceGuCopyImage not available on JVM — no C library access")
}

public actual fun sceGuTexEnvColor(color: UInt) {
    throw UnsupportedOperationException("sceGuTexEnvColor not available on JVM — no C library access")
}

public actual fun sceGuTexFilter(min: TextureFilter, mag: TextureFilter) {
    throw UnsupportedOperationException("sceGuTexFilter not available on JVM — no C library access")
}

public actual fun sceGuTexFlush() {
    throw UnsupportedOperationException("sceGuTexFlush not available on JVM — no C library access")
}

public actual fun sceGuTexFunc(tfx: TextureEffect, tcc: TextureColorComponent) {
    throw UnsupportedOperationException("sceGuTexFunc not available on JVM — no C library access")
}

public actual fun sceGuTexImage(mipmap: MipmapLevel, width: Int, height: Int, tbw: Int, tbp: COpaquePointer?) {
    throw UnsupportedOperationException("sceGuTexImage not available on JVM — no C library access")
}

public actual fun sceGuTexLevelMode(mode: TextureLevelMode, bias: Float) {
    throw UnsupportedOperationException("sceGuTexLevelMode not available on JVM — no C library access")
}

public actual fun sceGuTexMapMode(mode: TextureMapMode, a1: UInt, a2: UInt) {
    throw UnsupportedOperationException("sceGuTexMapMode not available on JVM — no C library access")
}

public actual fun sceGuTexMode(tpsm: TexturePixelFormat, maxmips: Int, a2: Int, swizzle: Int) {
    throw UnsupportedOperationException("sceGuTexMode not available on JVM — no C library access")
}

public actual fun sceGuTexOffset(u: Float, v: Float) {
    throw UnsupportedOperationException("sceGuTexOffset not available on JVM — no C library access")
}

public actual fun sceGuTexProjMapMode(mode: TextureProjectionMapMode) {
    throw UnsupportedOperationException("sceGuTexProjMapMode not available on JVM — no C library access")
}

public actual fun sceGuTexScale(u: Float, v: Float) {
    throw UnsupportedOperationException("sceGuTexScale not available on JVM — no C library access")
}

public actual fun sceGuTexSlope(slope: Float) {
    throw UnsupportedOperationException("sceGuTexSlope not available on JVM — no C library access")
}

public actual fun sceGuTexSync() {
    throw UnsupportedOperationException("sceGuTexSync not available on JVM — no C library access")
}

public actual fun sceGuTexWrap(u: GuTexWrapMode, v: GuTexWrapMode) {
    throw UnsupportedOperationException("sceGuTexWrap not available on JVM — no C library access")
}

public actual fun sceGuClutLoad(numBlocks: Int, cbp: COpaquePointer?) {
    throw UnsupportedOperationException("sceGuClutLoad not available on JVM — no C library access")
}

public actual fun sceGuClutMode(cpsm: ClutPixelFormat, shift: UInt, mask: UInt, a3: UInt) {
    throw UnsupportedOperationException("sceGuClutMode not available on JVM — no C library access")
}

public actual fun sceGuOffset(x: UInt, y: UInt) {
    throw UnsupportedOperationException("sceGuOffset not available on JVM — no C library access")
}

public actual fun sceGuScissor(x: Int, y: Int, w: Int, h: Int) {
    throw UnsupportedOperationException("sceGuScissor not available on JVM — no C library access")
}

public actual fun sceGuViewport(cx: Int, cy: Int, width: Int, height: Int) {
    throw UnsupportedOperationException("sceGuViewport not available on JVM — no C library access")
}

public actual fun sceGuDrawBezier(vType: Int, uCount: Int, vCount: Int, indices: COpaquePointer?, vertices: COpaquePointer?) {
    throw UnsupportedOperationException("sceGuDrawBezier not available on JVM — no C library access")
}

public actual fun sceGuPatchDivide(ulevel: UInt, vlevel: UInt) {
    throw UnsupportedOperationException("sceGuPatchDivide not available on JVM — no C library access")
}

public actual fun sceGuPatchFrontFace(a0: UInt) {
    throw UnsupportedOperationException("sceGuPatchFrontFace not available on JVM — no C library access")
}

public actual fun sceGuPatchPrim(prim: PatchPrimitive) {
    throw UnsupportedOperationException("sceGuPatchPrim not available on JVM — no C library access")
}

public actual fun sceGuDrawSpline(vType: Int, uCount: Int, vCount: Int, uEdge: Int, vEdge: Int, indices: COpaquePointer?, vertices: COpaquePointer?) {
    throw UnsupportedOperationException("sceGuDrawSpline not available on JVM — no C library access")
}

public actual fun sceGuSetMatrix(type: MatrixMode, matrix: ScePspFMatrix4?) {
    throw UnsupportedOperationException("sceGuSetMatrix not available on JVM — no C library access")
}

public actual fun sceGuBoneMatrix(index: UInt, matrix: ScePspFMatrix4?) {
    throw UnsupportedOperationException("sceGuBoneMatrix not available on JVM — no C library access")
}

public actual fun sceGuMorphWeight(index: Int, weight: Float) {
    throw UnsupportedOperationException("sceGuMorphWeight not available on JVM — no C library access")
}

public actual fun sceGuDrawArrayN(primitiveType: GuPrimitive, vType: Int, count: Int, a3: Int, indices: COpaquePointer?, vertices: COpaquePointer?) {
    throw UnsupportedOperationException("sceGuDrawArrayN not available on JVM — no C library access")
}

public actual fun sceGumDrawArray(prim: GuPrimitive, vType: Int, count: Int, indices: COpaquePointer?, vertices: COpaquePointer?) {
    throw UnsupportedOperationException("sceGumDrawArray not available on JVM — no C library access")
}

public actual fun sceGumDrawArrayN(prim: GuPrimitive, vType: Int, count: Int, a3: Int, indices: COpaquePointer?, vertices: COpaquePointer?) {
    throw UnsupportedOperationException("sceGumDrawArrayN not available on JVM — no C library access")
}

public actual fun sceGumDrawBezier(vType: Int, uCount: Int, vCount: Int, indices: COpaquePointer?, vertices: COpaquePointer?) {
    throw UnsupportedOperationException("sceGumDrawBezier not available on JVM — no C library access")
}

public actual fun sceGumDrawSpline(vType: Int, uCount: Int, vCount: Int, uEdge: Int, vEdge: Int, indices: COpaquePointer?, vertices: COpaquePointer?) {
    throw UnsupportedOperationException("sceGumDrawSpline not available on JVM — no C library access")
}

public actual fun sceGumFastInverse() {
    throw UnsupportedOperationException("sceGumFastInverse not available on JVM — no C library access")
}

public actual fun sceGumFullInverse() {
    throw UnsupportedOperationException("sceGumFullInverse not available on JVM — no C library access")
}

public actual fun sceGumLoadIdentity() {
    throw UnsupportedOperationException("sceGumLoadIdentity not available on JVM — no C library access")
}

public actual fun sceGumLoadMatrix(m: ScePspFMatrix4?) {
    throw UnsupportedOperationException("sceGumLoadMatrix not available on JVM — no C library access")
}

public actual fun sceGumLookAt(eye: ScePspFVector3?, center: ScePspFVector3?, up: ScePspFVector3?) {
    throw UnsupportedOperationException("sceGumLookAt not available on JVM — no C library access")
}

public actual fun sceGumMatrixMode(mode: MatrixMode) {
    throw UnsupportedOperationException("sceGumMatrixMode not available on JVM — no C library access")
}

public actual fun sceGumMultMatrix(m: ScePspFMatrix4?) {
    throw UnsupportedOperationException("sceGumMultMatrix not available on JVM — no C library access")
}

public actual fun sceGumOrtho(left: Float, right: Float, bottom: Float, top: Float, near: Float, far: Float) {
    throw UnsupportedOperationException("sceGumOrtho not available on JVM — no C library access")
}

public actual fun sceGumPerspective(fovy: Float, aspect: Float, near: Float, far: Float) {
    throw UnsupportedOperationException("sceGumPerspective not available on JVM — no C library access")
}

public actual fun sceGumPopMatrix() {
    throw UnsupportedOperationException("sceGumPopMatrix not available on JVM — no C library access")
}

public actual fun sceGumPushMatrix() {
    throw UnsupportedOperationException("sceGumPushMatrix not available on JVM — no C library access")
}

public actual fun sceGumRotateX(angle: Float) {
    throw UnsupportedOperationException("sceGumRotateX not available on JVM — no C library access")
}

public actual fun sceGumRotateY(angle: Float) {
    throw UnsupportedOperationException("sceGumRotateY not available on JVM — no C library access")
}

public actual fun sceGumRotateZ(angle: Float) {
    throw UnsupportedOperationException("sceGumRotateZ not available on JVM — no C library access")
}

public actual fun sceGumRotateXYZ(v: ScePspFVector3?) {
    throw UnsupportedOperationException("sceGumRotateXYZ not available on JVM — no C library access")
}

public actual fun sceGumRotateZYX(v: ScePspFVector3?) {
    throw UnsupportedOperationException("sceGumRotateZYX not available on JVM — no C library access")
}

public actual fun sceGumScale(v: ScePspFVector3?) {
    throw UnsupportedOperationException("sceGumScale not available on JVM — no C library access")
}

public actual fun sceGumStoreMatrix(m: ScePspFMatrix4?) {
    throw UnsupportedOperationException("sceGumStoreMatrix not available on JVM — no C library access")
}

public actual fun sceGumTranslate(v: ScePspFVector3?) {
    throw UnsupportedOperationException("sceGumTranslate not available on JVM — no C library access")
}

public actual fun sceGumUpdateMatrix() {
    throw UnsupportedOperationException("sceGumUpdateMatrix not available on JVM — no C library access")
}

public actual fun sceMp3ReserveMp3Handle(args: SceMp3InitArg?): Int =
    throw UnsupportedOperationException("sceMp3ReserveMp3Handle not available on JVM — no C library access")

public actual fun sceMp3ReleaseMp3Handle(handle: Mp3Handle): Int =
    throw UnsupportedOperationException("sceMp3ReleaseMp3Handle not available on JVM — no C library access")

public actual fun sceMp3InitResource(): Int =
    throw UnsupportedOperationException("sceMp3InitResource not available on JVM — no C library access")

public actual fun sceMp3TermResource(): Int =
    throw UnsupportedOperationException("sceMp3TermResource not available on JVM — no C library access")

public actual fun sceMp3Init(handle: Mp3Handle): Int =
    throw UnsupportedOperationException("sceMp3Init not available on JVM — no C library access")

public actual fun sceMp3Decode(handle: Mp3Handle, dst: COpaquePointer?): Int =
    throw UnsupportedOperationException("sceMp3Decode not available on JVM — no C library access")

public actual fun sceMp3GetInfoToAddStreamData(handle: Mp3Handle, dst: COpaquePointer?, toWrite: Int?, srcPos: Int?): Int =
    throw UnsupportedOperationException("sceMp3GetInfoToAddStreamData not available on JVM — no C library access")

public actual fun sceMp3NotifyAddStreamData(handle: Mp3Handle, size: Int): Int =
    throw UnsupportedOperationException("sceMp3NotifyAddStreamData not available on JVM — no C library access")

public actual fun sceMp3CheckStreamDataNeeded(handle: Mp3Handle): Int =
    throw UnsupportedOperationException("sceMp3CheckStreamDataNeeded not available on JVM — no C library access")

public actual fun sceMp3SetLoopNum(handle: Mp3Handle, loop: Int): Int =
    throw UnsupportedOperationException("sceMp3SetLoopNum not available on JVM — no C library access")

public actual fun sceMp3GetLoopNum(handle: Mp3Handle): Int =
    throw UnsupportedOperationException("sceMp3GetLoopNum not available on JVM — no C library access")

public actual fun sceMp3GetSumDecodedSample(handle: Mp3Handle): Int =
    throw UnsupportedOperationException("sceMp3GetSumDecodedSample not available on JVM — no C library access")

public actual fun sceMp3GetMaxOutputSample(handle: Mp3Handle): Int =
    throw UnsupportedOperationException("sceMp3GetMaxOutputSample not available on JVM — no C library access")

public actual fun sceMp3GetSamplingRate(handle: Mp3Handle): Int =
    throw UnsupportedOperationException("sceMp3GetSamplingRate not available on JVM — no C library access")

public actual fun sceMp3GetBitRate(handle: Mp3Handle): Int =
    throw UnsupportedOperationException("sceMp3GetBitRate not available on JVM — no C library access")

public actual fun sceMp3GetMp3ChannelNum(handle: Mp3Handle): Int =
    throw UnsupportedOperationException("sceMp3GetMp3ChannelNum not available on JVM — no C library access")

public actual fun sceMp3ResetPlayPosition(handle: Mp3Handle): Int =
    throw UnsupportedOperationException("sceMp3ResetPlayPosition not available on JVM — no C library access")

public actual fun sceRegOpenRegistry(reg: Key?, mode: Int, handle: RegHandle?): Int =
    throw UnsupportedOperationException("sceRegOpenRegistry not available on JVM — no C library access")

public actual fun sceRegFlushRegistry(handle: RegHandle): Int =
    throw UnsupportedOperationException("sceRegFlushRegistry not available on JVM — no C library access")

public actual fun sceRegCloseRegistry(handle: RegHandle): Int =
    throw UnsupportedOperationException("sceRegCloseRegistry not available on JVM — no C library access")

public actual fun sceRegOpenCategory(handle: RegHandle, name: COpaquePointer?, mode: Int, dirHandle: RegHandle?): Int =
    throw UnsupportedOperationException("sceRegOpenCategory not available on JVM — no C library access")

public actual fun sceRegRemoveCategory(handle: RegHandle, name: COpaquePointer?): Int =
    throw UnsupportedOperationException("sceRegRemoveCategory not available on JVM — no C library access")

public actual fun sceRegCloseCategory(dirHandle: RegHandle): Int =
    throw UnsupportedOperationException("sceRegCloseCategory not available on JVM — no C library access")

public actual fun sceRegFlushCategory(dirHandle: RegHandle): Int =
    throw UnsupportedOperationException("sceRegFlushCategory not available on JVM — no C library access")

public actual fun sceRegGetKeyInfo(dirHandle: RegHandle, name: COpaquePointer?, keyHandle: RegHandle?, type: KeyType?, size: ULong?): Int =
    throw UnsupportedOperationException("sceRegGetKeyInfo not available on JVM — no C library access")

public actual fun sceRegGetKeyInfoByName(dirHandle: RegHandle, name: COpaquePointer?, type: KeyType?, size: ULong?): Int =
    throw UnsupportedOperationException("sceRegGetKeyInfoByName not available on JVM — no C library access")

public actual fun sceRegGetKeyValue(dirHandle: RegHandle, keyHandle: RegHandle, buf: COpaquePointer?, size: ULong): Int =
    throw UnsupportedOperationException("sceRegGetKeyValue not available on JVM — no C library access")

public actual fun sceRegGetKeyValueByName(dirHandle: RegHandle, name: COpaquePointer?, buf: COpaquePointer?, size: ULong): Int =
    throw UnsupportedOperationException("sceRegGetKeyValueByName not available on JVM — no C library access")

public actual fun sceRegSetKeyValue(dirHandle: RegHandle, name: COpaquePointer?, buf: COpaquePointer?, size: ULong): Int =
    throw UnsupportedOperationException("sceRegSetKeyValue not available on JVM — no C library access")

public actual fun sceRegGetKeysNum(dirHandle: RegHandle, num: Int?): Int =
    throw UnsupportedOperationException("sceRegGetKeysNum not available on JVM — no C library access")

public actual fun sceRegGetKeys(dirHandle: RegHandle, buf: COpaquePointer?, num: Int): Int =
    throw UnsupportedOperationException("sceRegGetKeys not available on JVM — no C library access")

public actual fun sceRegCreateKey(dirHandle: RegHandle, name: COpaquePointer?, type: Int, size: ULong): Int =
    throw UnsupportedOperationException("sceRegCreateKey not available on JVM — no C library access")

public actual fun sceRegRemoveRegistry(key: Key?): Int =
    throw UnsupportedOperationException("sceRegRemoveRegistry not available on JVM — no C library access")

public actual fun sceOpenPSIDGetOpenPSID(openpsid: OpenPSID?): Int =
    throw UnsupportedOperationException("sceOpenPSIDGetOpenPSID not available on JVM — no C library access")

public actual fun sceUtilityMsgDialogInitStart(params: UtilityMsgDialogParams?): Int =
    throw UnsupportedOperationException("sceUtilityMsgDialogInitStart not available on JVM — no C library access")

public actual fun sceUtilityMsgDialogShutdownStart() {
    throw UnsupportedOperationException("sceUtilityMsgDialogShutdownStart not available on JVM — no C library access")
}

public actual fun sceUtilityMsgDialogGetStatus(): Int =
    throw UnsupportedOperationException("sceUtilityMsgDialogGetStatus not available on JVM — no C library access")

public actual fun sceUtilityMsgDialogUpdate(n: Int) {
    throw UnsupportedOperationException("sceUtilityMsgDialogUpdate not available on JVM — no C library access")
}

public actual fun sceUtilityMsgDialogAbort(): Int =
    throw UnsupportedOperationException("sceUtilityMsgDialogAbort not available on JVM — no C library access")

public actual fun sceUtilityNetconfInitStart(data: UtilityNetconfData?): Int =
    throw UnsupportedOperationException("sceUtilityNetconfInitStart not available on JVM — no C library access")

public actual fun sceUtilityNetconfShutdownStart(): Int =
    throw UnsupportedOperationException("sceUtilityNetconfShutdownStart not available on JVM — no C library access")

public actual fun sceUtilityNetconfUpdate(unknown: Int): Int =
    throw UnsupportedOperationException("sceUtilityNetconfUpdate not available on JVM — no C library access")

public actual fun sceUtilityNetconfGetStatus(): Int =
    throw UnsupportedOperationException("sceUtilityNetconfGetStatus not available on JVM — no C library access")

public actual fun sceUtilityCheckNetParam(id: Int): Int =
    throw UnsupportedOperationException("sceUtilityCheckNetParam not available on JVM — no C library access")

public actual fun sceUtilityGetNetParam(conf: Int, param: NetParam, data: UtilityNetData?): Int =
    throw UnsupportedOperationException("sceUtilityGetNetParam not available on JVM — no C library access")

public actual fun sceUtilitySavedataInitStart(params: SceUtilitySavedataParam?): Int =
    throw UnsupportedOperationException("sceUtilitySavedataInitStart not available on JVM — no C library access")

public actual fun sceUtilitySavedataGetStatus(): Int =
    throw UnsupportedOperationException("sceUtilitySavedataGetStatus not available on JVM — no C library access")

public actual fun sceUtilitySavedataShutdownStart(): Int =
    throw UnsupportedOperationException("sceUtilitySavedataShutdownStart not available on JVM — no C library access")

public actual fun sceUtilitySavedataUpdate(unknown: Int) {
    throw UnsupportedOperationException("sceUtilitySavedataUpdate not available on JVM — no C library access")
}

public actual fun sceUtilityGameSharingInitStart(params: UtilityGameSharingParams?): Int =
    throw UnsupportedOperationException("sceUtilityGameSharingInitStart not available on JVM — no C library access")

public actual fun sceUtilityGameSharingShutdownStart() {
    throw UnsupportedOperationException("sceUtilityGameSharingShutdownStart not available on JVM — no C library access")
}

public actual fun sceUtilityGameSharingGetStatus(): Int =
    throw UnsupportedOperationException("sceUtilityGameSharingGetStatus not available on JVM — no C library access")

public actual fun sceUtilityGameSharingUpdate(n: Int) {
    throw UnsupportedOperationException("sceUtilityGameSharingUpdate not available on JVM — no C library access")
}

public actual fun sceUtilityHtmlViewerInitStart(params: UtilityHtmlViewerParam?): Int =
    throw UnsupportedOperationException("sceUtilityHtmlViewerInitStart not available on JVM — no C library access")

public actual fun sceUtilityHtmlViewerShutdownStart(): Int =
    throw UnsupportedOperationException("sceUtilityHtmlViewerShutdownStart not available on JVM — no C library access")

public actual fun sceUtilityHtmlViewerUpdate(n: Int): Int =
    throw UnsupportedOperationException("sceUtilityHtmlViewerUpdate not available on JVM — no C library access")

public actual fun sceUtilityHtmlViewerGetStatus(): Int =
    throw UnsupportedOperationException("sceUtilityHtmlViewerGetStatus not available on JVM — no C library access")

public actual fun sceUtilitySetSystemParamInt(id: SystemParamId, value: Int): Int =
    throw UnsupportedOperationException("sceUtilitySetSystemParamInt not available on JVM — no C library access")

public actual fun sceUtilitySetSystemParamString(id: SystemParamId, str: COpaquePointer?): Int =
    throw UnsupportedOperationException("sceUtilitySetSystemParamString not available on JVM — no C library access")

public actual fun sceUtilityGetSystemParamInt(id: SystemParamId, value: Int?): Int =
    throw UnsupportedOperationException("sceUtilityGetSystemParamInt not available on JVM — no C library access")

public actual fun sceUtilityGetSystemParamString(id: SystemParamId, str: COpaquePointer?, len: Int): Int =
    throw UnsupportedOperationException("sceUtilityGetSystemParamString not available on JVM — no C library access")

public actual fun sceUtilityOskInitStart(params: SceUtilityOskParams?): Int =
    throw UnsupportedOperationException("sceUtilityOskInitStart not available on JVM — no C library access")

public actual fun sceUtilityOskShutdownStart(): Int =
    throw UnsupportedOperationException("sceUtilityOskShutdownStart not available on JVM — no C library access")

public actual fun sceUtilityOskUpdate(n: Int): Int =
    throw UnsupportedOperationException("sceUtilityOskUpdate not available on JVM — no C library access")

public actual fun sceUtilityOskGetStatus(): Int =
    throw UnsupportedOperationException("sceUtilityOskGetStatus not available on JVM — no C library access")

public actual fun sceUtilityLoadNetModule(module: NetModule): Int =
    throw UnsupportedOperationException("sceUtilityLoadNetModule not available on JVM — no C library access")

public actual fun sceUtilityUnloadNetModule(module: NetModule): Int =
    throw UnsupportedOperationException("sceUtilityUnloadNetModule not available on JVM — no C library access")

public actual fun sceUtilityLoadAvModule(module: AvModule): Int =
    throw UnsupportedOperationException("sceUtilityLoadAvModule not available on JVM — no C library access")

public actual fun sceUtilityUnloadAvModule(module: AvModule): Int =
    throw UnsupportedOperationException("sceUtilityUnloadAvModule not available on JVM — no C library access")

public actual fun sceUtilityLoadUsbModule(module: UsbModule): Int =
    throw UnsupportedOperationException("sceUtilityLoadUsbModule not available on JVM — no C library access")

public actual fun sceUtilityUnloadUsbModule(module: UsbModule): Int =
    throw UnsupportedOperationException("sceUtilityUnloadUsbModule not available on JVM — no C library access")

public actual fun sceUtilityLoadModule(module: Module): Int =
    throw UnsupportedOperationException("sceUtilityLoadModule not available on JVM — no C library access")

public actual fun sceUtilityUnloadModule(module: Module): Int =
    throw UnsupportedOperationException("sceUtilityUnloadModule not available on JVM — no C library access")

public actual fun sceUtilityCreateNetParam(conf: Int): Int =
    throw UnsupportedOperationException("sceUtilityCreateNetParam not available on JVM — no C library access")

public actual fun sceUtilitySetNetParam(param: NetParam, `val`: COpaquePointer?): Int =
    throw UnsupportedOperationException("sceUtilitySetNetParam not available on JVM — no C library access")

public actual fun sceUtilityCopyNetParam(src: Int, dest: Int): Int =
    throw UnsupportedOperationException("sceUtilityCopyNetParam not available on JVM — no C library access")

public actual fun sceUtilityDeleteNetParam(conf: Int): Int =
    throw UnsupportedOperationException("sceUtilityDeleteNetParam not available on JVM — no C library access")

public actual fun sceNetInit(poolsize: Int, calloutprio: Int, calloutstack: Int, netintrprio: Int, netintrstack: Int): Int =
    throw UnsupportedOperationException("sceNetInit not available on JVM — no C library access")

public actual fun sceNetTerm(): Int =
    throw UnsupportedOperationException("sceNetTerm not available on JVM — no C library access")

public actual fun sceNetFreeThreadinfo(thid: Int): Int =
    throw UnsupportedOperationException("sceNetFreeThreadinfo not available on JVM — no C library access")

public actual fun sceNetThreadAbort(thid: Int): Int =
    throw UnsupportedOperationException("sceNetThreadAbort not available on JVM — no C library access")

public actual fun sceNetEtherStrton(name: COpaquePointer?, mac: COpaquePointer?) {
    throw UnsupportedOperationException("sceNetEtherStrton not available on JVM — no C library access")
}

public actual fun sceNetEtherNtostr(mac: COpaquePointer?, name: COpaquePointer?) {
    throw UnsupportedOperationException("sceNetEtherNtostr not available on JVM — no C library access")
}

public actual fun sceNetGetLocalEtherAddr(mac: COpaquePointer?): Int =
    throw UnsupportedOperationException("sceNetGetLocalEtherAddr not available on JVM — no C library access")

public actual fun sceNetGetMallocStat(stat: SceNetMallocStat?): Int =
    throw UnsupportedOperationException("sceNetGetMallocStat not available on JVM — no C library access")

public actual fun sceNetAdhocctlInit(stacksize: Int, priority: Int, adhocId: SceNetAdhocctlAdhocId?): Int =
    throw UnsupportedOperationException("sceNetAdhocctlInit not available on JVM — no C library access")

public actual fun sceNetAdhocctlTerm(): Int =
    throw UnsupportedOperationException("sceNetAdhocctlTerm not available on JVM — no C library access")

public actual fun sceNetAdhocctlConnect(name: COpaquePointer?): Int =
    throw UnsupportedOperationException("sceNetAdhocctlConnect not available on JVM — no C library access")

public actual fun sceNetAdhocctlDisconnect(): Int =
    throw UnsupportedOperationException("sceNetAdhocctlDisconnect not available on JVM — no C library access")

public actual fun sceNetAdhocctlGetState(event: Int?): Int =
    throw UnsupportedOperationException("sceNetAdhocctlGetState not available on JVM — no C library access")

public actual fun sceNetAdhocctlCreate(name: COpaquePointer?): Int =
    throw UnsupportedOperationException("sceNetAdhocctlCreate not available on JVM — no C library access")

public actual fun sceNetAdhocctlJoin(scaninfo: SceNetAdhocctlScanInfo?): Int =
    throw UnsupportedOperationException("sceNetAdhocctlJoin not available on JVM — no C library access")

public actual fun sceNetAdhocctlGetAdhocId(id: SceNetAdhocctlAdhocId?): Int =
    throw UnsupportedOperationException("sceNetAdhocctlGetAdhocId not available on JVM — no C library access")

public actual fun sceNetAdhocctlCreateEnterGameMode(name: COpaquePointer?, unknown: Int, num: Int, macs: COpaquePointer?, timeout: UInt, unknown2: Int): Int =
    throw UnsupportedOperationException("sceNetAdhocctlCreateEnterGameMode not available on JVM — no C library access")

public actual fun sceNetAdhocctlJoinEnterGameMode(name: COpaquePointer?, hostmac: COpaquePointer?, timeout: UInt, unknown: Int): Int =
    throw UnsupportedOperationException("sceNetAdhocctlJoinEnterGameMode not available on JVM — no C library access")

public actual fun sceNetAdhocctlGetGameModeInfo(gamemodeinfo: SceNetAdhocctlGameModeInfo?): Int =
    throw UnsupportedOperationException("sceNetAdhocctlGetGameModeInfo not available on JVM — no C library access")

public actual fun sceNetAdhocctlExitGameMode(): Int =
    throw UnsupportedOperationException("sceNetAdhocctlExitGameMode not available on JVM — no C library access")

public actual fun sceNetAdhocctlGetPeerList(length: Int?, buf: COpaquePointer?): Int =
    throw UnsupportedOperationException("sceNetAdhocctlGetPeerList not available on JVM — no C library access")

public actual fun sceNetAdhocctlGetPeerInfo(mac: COpaquePointer?, size: Int, peerinfo: SceNetAdhocctlPeerInfo?): Int =
    throw UnsupportedOperationException("sceNetAdhocctlGetPeerInfo not available on JVM — no C library access")

public actual fun sceNetAdhocctlScan(): Int =
    throw UnsupportedOperationException("sceNetAdhocctlScan not available on JVM — no C library access")

public actual fun sceNetAdhocctlGetScanInfo(length: Int?, buf: COpaquePointer?): Int =
    throw UnsupportedOperationException("sceNetAdhocctlGetScanInfo not available on JVM — no C library access")

public actual fun sceNetAdhocctlAddHandler(handler: SceNetAdhocctlHandler, unknown: COpaquePointer?): Int =
    throw UnsupportedOperationException("sceNetAdhocctlAddHandler not available on JVM — no C library access")

public actual fun sceNetAdhocctlDelHandler(id: Int): Int =
    throw UnsupportedOperationException("sceNetAdhocctlDelHandler not available on JVM — no C library access")

public actual fun sceNetAdhocctlGetNameByAddr(mac: COpaquePointer?, nickname: COpaquePointer?): Int =
    throw UnsupportedOperationException("sceNetAdhocctlGetNameByAddr not available on JVM — no C library access")

public actual fun sceNetAdhocctlGetAddrByName(nickname: COpaquePointer?, length: Int?, buf: COpaquePointer?): Int =
    throw UnsupportedOperationException("sceNetAdhocctlGetAddrByName not available on JVM — no C library access")

public actual fun sceNetAdhocctlGetParameter(params: SceNetAdhocctlParams?): Int =
    throw UnsupportedOperationException("sceNetAdhocctlGetParameter not available on JVM — no C library access")

public actual fun sceNetAdhocInit(): Int =
    throw UnsupportedOperationException("sceNetAdhocInit not available on JVM — no C library access")

public actual fun sceNetAdhocTerm(): Int =
    throw UnsupportedOperationException("sceNetAdhocTerm not available on JVM — no C library access")

public actual fun sceNetAdhocPdpCreate(mac: COpaquePointer?, port: UShort, bufSize: UInt, unk1: Int): Int =
    throw UnsupportedOperationException("sceNetAdhocPdpCreate not available on JVM — no C library access")

public actual fun sceNetAdhocPdpDelete(id: Int, unk1: Int): Int =
    throw UnsupportedOperationException("sceNetAdhocPdpDelete not available on JVM — no C library access")

public actual fun sceNetAdhocPdpSend(id: Int, destMacAddr: COpaquePointer?, port: UShort, data: COpaquePointer?, len: UInt, timeout: UInt, nonblock: Int): Int =
    throw UnsupportedOperationException("sceNetAdhocPdpSend not available on JVM — no C library access")

public actual fun sceNetAdhocPdpRecv(id: Int, srcMacAddr: COpaquePointer?, port: UShort?, data: COpaquePointer?, dataLength: COpaquePointer?, timeout: UInt, nonblock: Int): Int =
    throw UnsupportedOperationException("sceNetAdhocPdpRecv not available on JVM — no C library access")

public actual fun sceNetAdhocGetPdpStat(size: Int?, stat: SceNetAdhocPdpStat?): Int =
    throw UnsupportedOperationException("sceNetAdhocGetPdpStat not available on JVM — no C library access")

public actual fun sceNetAdhocGameModeCreateMaster(data: COpaquePointer?, size: Int): Int =
    throw UnsupportedOperationException("sceNetAdhocGameModeCreateMaster not available on JVM — no C library access")

public actual fun sceNetAdhocGameModeCreateReplica(mac: COpaquePointer?, data: COpaquePointer?, size: Int): Int =
    throw UnsupportedOperationException("sceNetAdhocGameModeCreateReplica not available on JVM — no C library access")

public actual fun sceNetAdhocGameModeUpdateMaster(): Int =
    throw UnsupportedOperationException("sceNetAdhocGameModeUpdateMaster not available on JVM — no C library access")

public actual fun sceNetAdhocGameModeUpdateReplica(id: Int, unk1: Int): Int =
    throw UnsupportedOperationException("sceNetAdhocGameModeUpdateReplica not available on JVM — no C library access")

public actual fun sceNetAdhocGameModeDeleteMaster(): Int =
    throw UnsupportedOperationException("sceNetAdhocGameModeDeleteMaster not available on JVM — no C library access")

public actual fun sceNetAdhocGameModeDeleteReplica(id: Int): Int =
    throw UnsupportedOperationException("sceNetAdhocGameModeDeleteReplica not available on JVM — no C library access")

public actual fun sceNetAdhocPtpOpen(srcmac: COpaquePointer?, srcport: UShort, destmac: COpaquePointer?, destport: UShort, bufSize: UInt, delay: UInt, count: Int, unk1: Int): Int =
    throw UnsupportedOperationException("sceNetAdhocPtpOpen not available on JVM — no C library access")

public actual fun sceNetAdhocPtpConnect(id: Int, timeout: UInt, nonblock: Int): Int =
    throw UnsupportedOperationException("sceNetAdhocPtpConnect not available on JVM — no C library access")

public actual fun sceNetAdhocPtpListen(srcmac: COpaquePointer?, srcport: UShort, bufSize: UInt, delay: UInt, count: Int, queue: Int, unk1: Int): Int =
    throw UnsupportedOperationException("sceNetAdhocPtpListen not available on JVM — no C library access")

public actual fun sceNetAdhocPtpAccept(id: Int, mac: COpaquePointer?, port: UShort?, timeout: UInt, nonblock: Int): Int =
    throw UnsupportedOperationException("sceNetAdhocPtpAccept not available on JVM — no C library access")

public actual fun sceNetAdhocPtpSend(id: Int, data: COpaquePointer?, dataSize: Int?, timeout: UInt, nonblock: Int): Int =
    throw UnsupportedOperationException("sceNetAdhocPtpSend not available on JVM — no C library access")

public actual fun sceNetAdhocPtpRecv(id: Int, data: COpaquePointer?, dataSize: Int?, timeout: UInt, nonblock: Int): Int =
    throw UnsupportedOperationException("sceNetAdhocPtpRecv not available on JVM — no C library access")

public actual fun sceNetAdhocPtpFlush(id: Int, timeout: UInt, nonblock: Int): Int =
    throw UnsupportedOperationException("sceNetAdhocPtpFlush not available on JVM — no C library access")

public actual fun sceNetAdhocPtpClose(id: Int, unk1: Int): Int =
    throw UnsupportedOperationException("sceNetAdhocPtpClose not available on JVM — no C library access")

public actual fun sceNetAdhocGetPtpStat(size: Int?, stat: SceNetAdhocPtpStat?): Int =
    throw UnsupportedOperationException("sceNetAdhocGetPtpStat not available on JVM — no C library access")

public actual fun sceNetAdhocMatchingInit(memsize: Int): Int =
    throw UnsupportedOperationException("sceNetAdhocMatchingInit not available on JVM — no C library access")

public actual fun sceNetAdhocMatchingTerm(): Int =
    throw UnsupportedOperationException("sceNetAdhocMatchingTerm not available on JVM — no C library access")

public actual fun sceNetAdhocMatchingCreate(mode: AdhocMatchingMode, maxPeers: Int, port: UShort, bufSize: Int, helloDelay: UInt, pingDelay: UInt, initCount: Int, msgDelay: UInt, callback: AdhocMatchingCallback): Int =
    throw UnsupportedOperationException("sceNetAdhocMatchingCreate not available on JVM — no C library access")

public actual fun sceNetAdhocMatchingDelete(matchingId: Int): Int =
    throw UnsupportedOperationException("sceNetAdhocMatchingDelete not available on JVM — no C library access")

public actual fun sceNetAdhocMatchingStart(matchingId: Int, evthPri: Int, evthStack: Int, inthPri: Int, inthStack: Int, optLen: Int, optData: COpaquePointer?): Int =
    throw UnsupportedOperationException("sceNetAdhocMatchingStart not available on JVM — no C library access")

public actual fun sceNetAdhocMatchingStop(matchingId: Int): Int =
    throw UnsupportedOperationException("sceNetAdhocMatchingStop not available on JVM — no C library access")

public actual fun sceNetAdhocMatchingSelectTarget(matchingId: Int, mac: COpaquePointer?, optLen: Int, optData: COpaquePointer?): Int =
    throw UnsupportedOperationException("sceNetAdhocMatchingSelectTarget not available on JVM — no C library access")

public actual fun sceNetAdhocMatchingCancelTarget(matchingId: Int, mac: COpaquePointer?): Int =
    throw UnsupportedOperationException("sceNetAdhocMatchingCancelTarget not available on JVM — no C library access")

public actual fun sceNetAdhocMatchingCancelTargetWithOpt(matchingId: Int, mac: COpaquePointer?, optLen: Int, optData: COpaquePointer?): Int =
    throw UnsupportedOperationException("sceNetAdhocMatchingCancelTargetWithOpt not available on JVM — no C library access")

public actual fun sceNetAdhocMatchingSendData(matchingId: Int, mac: COpaquePointer?, dataLen: Int, data: COpaquePointer?): Int =
    throw UnsupportedOperationException("sceNetAdhocMatchingSendData not available on JVM — no C library access")

public actual fun sceNetAdhocMatchingAbortSendData(matchingId: Int, mac: COpaquePointer?): Int =
    throw UnsupportedOperationException("sceNetAdhocMatchingAbortSendData not available on JVM — no C library access")

public actual fun sceNetAdhocMatchingSetHelloOpt(matchingId: Int, optLen: Int, optData: COpaquePointer?): Int =
    throw UnsupportedOperationException("sceNetAdhocMatchingSetHelloOpt not available on JVM — no C library access")

public actual fun sceNetAdhocMatchingGetHelloOpt(matchingId: Int, optLen: Int?, optData: COpaquePointer?): Int =
    throw UnsupportedOperationException("sceNetAdhocMatchingGetHelloOpt not available on JVM — no C library access")

public actual fun sceNetAdhocMatchingGetMembers(matchingId: Int, length: Int?, buf: COpaquePointer?): Int =
    throw UnsupportedOperationException("sceNetAdhocMatchingGetMembers not available on JVM — no C library access")

public actual fun sceNetAdhocMatchingGetPoolMaxAlloc(): Int =
    throw UnsupportedOperationException("sceNetAdhocMatchingGetPoolMaxAlloc not available on JVM — no C library access")

public actual fun sceNetAdhocMatchingGetPoolStat(poolstat: AdhocPoolStat?): Int =
    throw UnsupportedOperationException("sceNetAdhocMatchingGetPoolStat not available on JVM — no C library access")

public actual fun sceNetApctlInit(stackSize: Int, initPriority: Int): Int =
    throw UnsupportedOperationException("sceNetApctlInit not available on JVM — no C library access")

public actual fun sceNetApctlTerm(): Int =
    throw UnsupportedOperationException("sceNetApctlTerm not available on JVM — no C library access")

public actual fun sceNetApctlGetInfo(code: ApctlInfo, pinfo: SceNetApctlInfo?): Int =
    throw UnsupportedOperationException("sceNetApctlGetInfo not available on JVM — no C library access")

public actual fun sceNetApctlAddHandler(handler: SceNetApctlHandler, parg: COpaquePointer?): Int =
    throw UnsupportedOperationException("sceNetApctlAddHandler not available on JVM — no C library access")

public actual fun sceNetApctlDelHandler(handlerId: Int): Int =
    throw UnsupportedOperationException("sceNetApctlDelHandler not available on JVM — no C library access")

public actual fun sceNetApctlConnect(connIndex: Int): Int =
    throw UnsupportedOperationException("sceNetApctlConnect not available on JVM — no C library access")

public actual fun sceNetApctlDisconnect(): Int =
    throw UnsupportedOperationException("sceNetApctlDisconnect not available on JVM — no C library access")

public actual fun sceNetApctlGetState(pstate: ApctlState?): Int =
    throw UnsupportedOperationException("sceNetApctlGetState not available on JVM — no C library access")

public actual fun sceNetInetInit(): Int =
    throw UnsupportedOperationException("sceNetInetInit not available on JVM — no C library access")

public actual fun sceNetInetTerm(): Int =
    throw UnsupportedOperationException("sceNetInetTerm not available on JVM — no C library access")

public actual fun sceNetInetAccept(s: Int, addr: Sockaddr?, addrLen: SocklenT?): Int =
    throw UnsupportedOperationException("sceNetInetAccept not available on JVM — no C library access")

public actual fun sceNetInetBind(s: Int, myAddr: Sockaddr?, addrLen: SocklenT): Int =
    throw UnsupportedOperationException("sceNetInetBind not available on JVM — no C library access")

public actual fun sceNetInetConnect(s: Int, servAddr: Sockaddr?, addrLen: SocklenT): Int =
    throw UnsupportedOperationException("sceNetInetConnect not available on JVM — no C library access")

public actual fun sceNetInetGetsockopt(s: Int, level: Int, optName: Int, optVal: COpaquePointer?, optlEn: SocklenT?): Int =
    throw UnsupportedOperationException("sceNetInetGetsockopt not available on JVM — no C library access")

public actual fun sceNetInetListen(s: Int, backlog: Int): Int =
    throw UnsupportedOperationException("sceNetInetListen not available on JVM — no C library access")

public actual fun sceNetInetRecv(s: Int, buf: COpaquePointer?, len: ULong, flags: Int): ULong =
    throw UnsupportedOperationException("sceNetInetRecv not available on JVM — no C library access")

public actual fun sceNetInetRecvfrom(s: Int, buf: COpaquePointer?, flags: ULong, arg1: Int, from: Sockaddr?, fromLen: SocklenT?): ULong =
    throw UnsupportedOperationException("sceNetInetRecvfrom not available on JVM — no C library access")

public actual fun sceNetInetSend(s: Int, buf: COpaquePointer?, len: ULong, flags: Int): ULong =
    throw UnsupportedOperationException("sceNetInetSend not available on JVM — no C library access")

public actual fun sceNetInetSendto(s: Int, buf: COpaquePointer?, len: ULong, flags: Int, to: Sockaddr?, toLen: SocklenT): ULong =
    throw UnsupportedOperationException("sceNetInetSendto not available on JVM — no C library access")

public actual fun sceNetInetSetsockopt(s: Int, level: Int, optName: Int, optVal: COpaquePointer?, optLen: SocklenT): Int =
    throw UnsupportedOperationException("sceNetInetSetsockopt not available on JVM — no C library access")

public actual fun sceNetInetShutdown(s: Int, how: Int): Int =
    throw UnsupportedOperationException("sceNetInetShutdown not available on JVM — no C library access")

public actual fun sceNetInetSocket(domain: Int, type: Int, protocol: Int): Int =
    throw UnsupportedOperationException("sceNetInetSocket not available on JVM — no C library access")

public actual fun sceNetInetClose(s: Int): Int =
    throw UnsupportedOperationException("sceNetInetClose not available on JVM — no C library access")

public actual fun sceNetInetGetErrno(): Int =
    throw UnsupportedOperationException("sceNetInetGetErrno not available on JVM — no C library access")

public actual fun sceSslInit(unknown1: Int): Int =
    throw UnsupportedOperationException("sceSslInit not available on JVM — no C library access")

public actual fun sceSslEnd(): Int =
    throw UnsupportedOperationException("sceSslEnd not available on JVM — no C library access")

public actual fun sceSslGetUsedMemoryMax(memory: UInt?): Int =
    throw UnsupportedOperationException("sceSslGetUsedMemoryMax not available on JVM — no C library access")

public actual fun sceSslGetUsedMemoryCurrent(memory: UInt?): Int =
    throw UnsupportedOperationException("sceSslGetUsedMemoryCurrent not available on JVM — no C library access")

public actual fun sceHttpInit(unknown1: UInt): Int =
    throw UnsupportedOperationException("sceHttpInit not available on JVM — no C library access")

public actual fun sceHttpEnd(): Int =
    throw UnsupportedOperationException("sceHttpEnd not available on JVM — no C library access")

public actual fun sceHttpCreateTemplate(agent: COpaquePointer?, unknown1: Int, unknown2: Int): Int =
    throw UnsupportedOperationException("sceHttpCreateTemplate not available on JVM — no C library access")

public actual fun sceHttpDeleteTemplate(templateid: Int): Int =
    throw UnsupportedOperationException("sceHttpDeleteTemplate not available on JVM — no C library access")

public actual fun sceHttpCreateConnection(templateid: Int, host: COpaquePointer?, unknown1: COpaquePointer?, port: UShort, unknown2: Int): Int =
    throw UnsupportedOperationException("sceHttpCreateConnection not available on JVM — no C library access")

public actual fun sceHttpCreateConnectionWithURL(templateid: Int, url: COpaquePointer?, unknown1: Int): Int =
    throw UnsupportedOperationException("sceHttpCreateConnectionWithURL not available on JVM — no C library access")

public actual fun sceHttpDeleteConnection(connectionId: Int): Int =
    throw UnsupportedOperationException("sceHttpDeleteConnection not available on JVM — no C library access")

public actual fun sceHttpCreateRequest(connectionId: Int, method: HttpMethod, path: COpaquePointer?, contentLength: ULong): Int =
    throw UnsupportedOperationException("sceHttpCreateRequest not available on JVM — no C library access")

public actual fun sceHttpCreateRequestWithURL(connectionId: Int, method: HttpMethod, url: COpaquePointer?, contentLength: ULong): Int =
    throw UnsupportedOperationException("sceHttpCreateRequestWithURL not available on JVM — no C library access")

public actual fun sceHttpDeleteRequest(requestId: Int): Int =
    throw UnsupportedOperationException("sceHttpDeleteRequest not available on JVM — no C library access")

public actual fun sceHttpSendRequest(requestId: Int, data: COpaquePointer?, dataSize: UInt): Int =
    throw UnsupportedOperationException("sceHttpSendRequest not available on JVM — no C library access")

public actual fun sceHttpAbortRequest(requestId: Int): Int =
    throw UnsupportedOperationException("sceHttpAbortRequest not available on JVM — no C library access")

public actual fun sceHttpReadData(requestId: Int, data: COpaquePointer?, dataSize: UInt): Int =
    throw UnsupportedOperationException("sceHttpReadData not available on JVM — no C library access")

public actual fun sceHttpGetContentLength(requestId: Int, contentLength: ULong?): Int =
    throw UnsupportedOperationException("sceHttpGetContentLength not available on JVM — no C library access")

public actual fun sceHttpGetStatusCode(requestId: Int, statusCode: Int?): Int =
    throw UnsupportedOperationException("sceHttpGetStatusCode not available on JVM — no C library access")

public actual fun sceHttpSetResolveTimeOut(id: Int, timeout: UInt): Int =
    throw UnsupportedOperationException("sceHttpSetResolveTimeOut not available on JVM — no C library access")

public actual fun sceHttpSetResolveRetry(id: Int, count: Int): Int =
    throw UnsupportedOperationException("sceHttpSetResolveRetry not available on JVM — no C library access")

public actual fun sceHttpSetConnectTimeOut(id: Int, timeout: UInt): Int =
    throw UnsupportedOperationException("sceHttpSetConnectTimeOut not available on JVM — no C library access")

public actual fun sceHttpSetSendTimeOut(id: Int, timeout: UInt): Int =
    throw UnsupportedOperationException("sceHttpSetSendTimeOut not available on JVM — no C library access")

public actual fun sceHttpSetRecvTimeOut(id: Int, timeout: UInt): Int =
    throw UnsupportedOperationException("sceHttpSetRecvTimeOut not available on JVM — no C library access")

public actual fun sceHttpEnableKeepAlive(id: Int): Int =
    throw UnsupportedOperationException("sceHttpEnableKeepAlive not available on JVM — no C library access")

public actual fun sceHttpDisableKeepAlive(id: Int): Int =
    throw UnsupportedOperationException("sceHttpDisableKeepAlive not available on JVM — no C library access")

public actual fun sceHttpEnableRedirect(id: Int): Int =
    throw UnsupportedOperationException("sceHttpEnableRedirect not available on JVM — no C library access")

public actual fun sceHttpDisableRedirect(id: Int): Int =
    throw UnsupportedOperationException("sceHttpDisableRedirect not available on JVM — no C library access")

public actual fun sceHttpEnableCookie(id: Int): Int =
    throw UnsupportedOperationException("sceHttpEnableCookie not available on JVM — no C library access")

public actual fun sceHttpDisableCookie(id: Int): Int =
    throw UnsupportedOperationException("sceHttpDisableCookie not available on JVM — no C library access")

public actual fun sceHttpSaveSystemCookie(): Int =
    throw UnsupportedOperationException("sceHttpSaveSystemCookie not available on JVM — no C library access")

public actual fun sceHttpLoadSystemCookie(): Int =
    throw UnsupportedOperationException("sceHttpLoadSystemCookie not available on JVM — no C library access")

public actual fun sceHttpAddExtraHeader(id: Int, name: COpaquePointer?, value: COpaquePointer?, unknown1: Int): Int =
    throw UnsupportedOperationException("sceHttpAddExtraHeader not available on JVM — no C library access")

public actual fun sceHttpDeleteHeader(id: Int, name: COpaquePointer?): Int =
    throw UnsupportedOperationException("sceHttpDeleteHeader not available on JVM — no C library access")

public actual fun sceHttpsInit(unknown1: Int, unknown2: Int, unknown3: Int, unknown4: Int): Int =
    throw UnsupportedOperationException("sceHttpsInit not available on JVM — no C library access")

public actual fun sceHttpsEnd(): Int =
    throw UnsupportedOperationException("sceHttpsEnd not available on JVM — no C library access")

public actual fun sceHttpsLoadDefaultCert(unknown1: Int, unknown2: Int): Int =
    throw UnsupportedOperationException("sceHttpsLoadDefaultCert not available on JVM — no C library access")

public actual fun sceHttpDisableAuth(id: Int): Int =
    throw UnsupportedOperationException("sceHttpDisableAuth not available on JVM — no C library access")

public actual fun sceHttpDisableCache(id: Int): Int =
    throw UnsupportedOperationException("sceHttpDisableCache not available on JVM — no C library access")

public actual fun sceHttpEnableAuth(id: Int): Int =
    throw UnsupportedOperationException("sceHttpEnableAuth not available on JVM — no C library access")

public actual fun sceHttpEnableCache(id: Int): Int =
    throw UnsupportedOperationException("sceHttpEnableCache not available on JVM — no C library access")

public actual fun sceHttpEndCache(): Int =
    throw UnsupportedOperationException("sceHttpEndCache not available on JVM — no C library access")

public actual fun sceHttpGetAllHeader(request: Int, header: COpaquePointer?, headerSize: UInt?): Int =
    throw UnsupportedOperationException("sceHttpGetAllHeader not available on JVM — no C library access")

public actual fun sceHttpGetNetworkErrno(request: Int, errNum: Int?): Int =
    throw UnsupportedOperationException("sceHttpGetNetworkErrno not available on JVM — no C library access")

public actual fun sceHttpGetProxy(id: Int, activateFlag: Int?, mode: Int?, proxyHost: COpaquePointer?, len: ULong, proxyPort: UShort?): Int =
    throw UnsupportedOperationException("sceHttpGetProxy not available on JVM — no C library access")

public actual fun sceHttpInitCache(maxSize: ULong): Int =
    throw UnsupportedOperationException("sceHttpInitCache not available on JVM — no C library access")

public actual fun sceHttpSetAuthInfoCB(id: Int, cbfunc: HttpPasswordCB): Int =
    throw UnsupportedOperationException("sceHttpSetAuthInfoCB not available on JVM — no C library access")

public actual fun sceHttpSetProxy(id: Int, activateFlag: Int, mode: Int, newProxyHost: COpaquePointer?, newProxyPort: UShort): Int =
    throw UnsupportedOperationException("sceHttpSetProxy not available on JVM — no C library access")

public actual fun sceHttpSetResHeaderMaxSize(id: Int, headerSize: UInt): Int =
    throw UnsupportedOperationException("sceHttpSetResHeaderMaxSize not available on JVM — no C library access")

public actual fun sceHttpSetMallocFunction(mallocFunc: HttpMallocFunction, freeFunc: HttpFreeFunction, reallocFunc: HttpReallocFunction): Int =
    throw UnsupportedOperationException("sceHttpSetMallocFunction not available on JVM — no C library access")

public actual fun sceNetResolverInit(): Int =
    throw UnsupportedOperationException("sceNetResolverInit not available on JVM — no C library access")

public actual fun sceNetResolverCreate(rid: Int?, buf: COpaquePointer?, bufLength: UInt): Int =
    throw UnsupportedOperationException("sceNetResolverCreate not available on JVM — no C library access")

public actual fun sceNetResolverDelete(rid: Int): Int =
    throw UnsupportedOperationException("sceNetResolverDelete not available on JVM — no C library access")

public actual fun sceNetResolverStartNtoA(rid: Int, hostname: COpaquePointer?, addr: InAddr?, timeout: UInt, retry: Int): Int =
    throw UnsupportedOperationException("sceNetResolverStartNtoA not available on JVM — no C library access")

public actual fun sceNetResolverStartAtoN(rid: Int, addr: InAddr?, hostname: COpaquePointer?, hostnameLen: UInt, timeout: UInt, retry: Int): Int =
    throw UnsupportedOperationException("sceNetResolverStartAtoN not available on JVM — no C library access")

public actual fun sceNetResolverStop(rid: Int): Int =
    throw UnsupportedOperationException("sceNetResolverStop not available on JVM — no C library access")

public actual fun sceNetResolverTerm(): Int =
    throw UnsupportedOperationException("sceNetResolverTerm not available on JVM — no C library access")

