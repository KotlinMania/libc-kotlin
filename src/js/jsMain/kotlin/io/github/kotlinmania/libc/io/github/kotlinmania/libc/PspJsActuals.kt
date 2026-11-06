package io.github.kotlinmania.libc

import io.github.kotlinmania.libc.COpaquePointer

public actual fun sceAudioChReserve(channel: Int, sampleCount: Int, format: AudioFormat): Int =
    js("require('@kotlinmania/libc-native-bindings').sceAudioChReserve(channel, sampleCount, format)") as Int

public actual fun sceAudioChRelease(channel: Int): Int =
    js("require('@kotlinmania/libc-native-bindings').sceAudioChRelease(channel)") as Int

public actual fun sceAudioOutput(channel: Int, vol: Int, buf: COpaquePointer?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceAudioOutput(channel, vol, buf?.value ?: 0L)") as Int

public actual fun sceAudioOutputBlocking(channel: Int, vol: Int, buf: COpaquePointer?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceAudioOutputBlocking(channel, vol, buf?.value ?: 0L)") as Int

public actual fun sceAudioOutputPanned(channel: Int, leftVol: Int, rightVol: Int, buf: COpaquePointer?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceAudioOutputPanned(channel, leftVol, rightVol, buf?.value ?: 0L)") as Int

public actual fun sceAudioOutputPannedBlocking(channel: Int, leftVol: Int, rightVol: Int, buf: COpaquePointer?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceAudioOutputPannedBlocking(channel, leftVol, rightVol, buf?.value ?: 0L)") as Int

public actual fun sceAudioGetChannelRestLen(channel: Int): Int =
    js("require('@kotlinmania/libc-native-bindings').sceAudioGetChannelRestLen(channel)") as Int

public actual fun sceAudioGetChannelRestLength(channel: Int): Int =
    js("require('@kotlinmania/libc-native-bindings').sceAudioGetChannelRestLength(channel)") as Int

public actual fun sceAudioSetChannelDataLen(channel: Int, sampleCount: Int): Int =
    js("require('@kotlinmania/libc-native-bindings').sceAudioSetChannelDataLen(channel, sampleCount)") as Int

public actual fun sceAudioChangeChannelConfig(channel: Int, format: AudioFormat): Int =
    js("require('@kotlinmania/libc-native-bindings').sceAudioChangeChannelConfig(channel, format)") as Int

public actual fun sceAudioChangeChannelVolume(channel: Int, leftVol: Int, rightVol: Int): Int =
    js("require('@kotlinmania/libc-native-bindings').sceAudioChangeChannelVolume(channel, leftVol, rightVol)") as Int

public actual fun sceAudioOutput2Reserve(sampleCount: Int): Int =
    js("require('@kotlinmania/libc-native-bindings').sceAudioOutput2Reserve(sampleCount)") as Int

public actual fun sceAudioOutput2Release(): Int =
    js("require('@kotlinmania/libc-native-bindings').sceAudioOutput2Release()") as Int

public actual fun sceAudioOutput2ChangeLength(sampleCount: Int): Int =
    js("require('@kotlinmania/libc-native-bindings').sceAudioOutput2ChangeLength(sampleCount)") as Int

public actual fun sceAudioOutput2OutputBlocking(vol: Int, buf: COpaquePointer?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceAudioOutput2OutputBlocking(vol, buf?.value ?: 0L)") as Int

public actual fun sceAudioOutput2GetRestSample(): Int =
    js("require('@kotlinmania/libc-native-bindings').sceAudioOutput2GetRestSample()") as Int

public actual fun sceAudioSRCChReserve(sampleCount: Int, freq: AudioOutputFrequency, channels: Int): Int =
    js("require('@kotlinmania/libc-native-bindings').sceAudioSRCChReserve(sampleCount, freq, channels)") as Int

public actual fun sceAudioSRCChRelease(): Int =
    js("require('@kotlinmania/libc-native-bindings').sceAudioSRCChRelease()") as Int

public actual fun sceAudioSRCOutputBlocking(vol: Int, buf: COpaquePointer?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceAudioSRCOutputBlocking(vol, buf?.value ?: 0L)") as Int

public actual fun sceAudioInputInit(unknown1: Int, gain: Int, unknown2: Int): Int =
    js("require('@kotlinmania/libc-native-bindings').sceAudioInputInit(unknown1, gain, unknown2)") as Int

public actual fun sceAudioInputInitEx(params: AudioInputParams?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceAudioInputInitEx(params?.toLong() ?: 0L)") as Int

public actual fun sceAudioInputBlocking(sampleCount: Int, freq: AudioInputFrequency, buf: COpaquePointer?) {
    js("require('@kotlinmania/libc-native-bindings').sceAudioInputBlocking(sampleCount, freq, buf?.value ?: 0L)")
}

public actual fun sceAudioInput(sampleCount: Int, freq: AudioInputFrequency, buf: COpaquePointer?) {
    js("require('@kotlinmania/libc-native-bindings').sceAudioInput(sampleCount, freq, buf?.value ?: 0L)")
}

public actual fun sceAudioGetInputLength(): Int =
    js("require('@kotlinmania/libc-native-bindings').sceAudioGetInputLength()") as Int

public actual fun sceAudioWaitInputEnd(): Int =
    js("require('@kotlinmania/libc-native-bindings').sceAudioWaitInputEnd()") as Int

public actual fun sceAudioPollInputEnd(): Int =
    js("require('@kotlinmania/libc-native-bindings').sceAudioPollInputEnd()") as Int

public actual fun sceAtracGetAtracID(uiCodecType: UInt): Int =
    js("require('@kotlinmania/libc-native-bindings').sceAtracGetAtracID(uiCodecType)") as Int

public actual fun sceAtracSetDataAndGetID(buf: COpaquePointer?, bufsize: ULong): Int =
    js("require('@kotlinmania/libc-native-bindings').sceAtracSetDataAndGetID(buf?.value ?: 0L, bufsize)") as Int

public actual fun sceAtracDecodeData(atracId: Int, outSamples: UShort?, outN: Int?, outEnd: Int?, outRemainFrame: Int?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceAtracDecodeData(atracId, outSamples?.toLong() ?: 0L, outN?.toLong() ?: 0L, outEnd?.toLong() ?: 0L, outRemainFrame?.toLong() ?: 0L)") as Int

public actual fun sceAtracGetRemainFrame(atracId: Int, outRemainFrame: Int?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceAtracGetRemainFrame(atracId, outRemainFrame?.toLong() ?: 0L)") as Int

public actual fun sceAtracGetStreamDataInfo(atracId: Int, writePointer: COpaquePointer?, availableBytes: UInt?, readOffset: UInt?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceAtracGetStreamDataInfo(atracId, writePointer?.value ?: 0L, availableBytes?.toLong() ?: 0L, readOffset?.toLong() ?: 0L)") as Int

public actual fun sceAtracAddStreamData(atracId: Int, bytesToAdd: UInt): Int =
    js("require('@kotlinmania/libc-native-bindings').sceAtracAddStreamData(atracId, bytesToAdd)") as Int

public actual fun sceAtracGetBitrate(atracId: Int, outBitrate: Int?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceAtracGetBitrate(atracId, outBitrate?.toLong() ?: 0L)") as Int

public actual fun sceAtracSetLoopNum(atracId: Int, nloops: Int): Int =
    js("require('@kotlinmania/libc-native-bindings').sceAtracSetLoopNum(atracId, nloops)") as Int

public actual fun sceAtracReleaseAtracID(atracId: Int): Int =
    js("require('@kotlinmania/libc-native-bindings').sceAtracReleaseAtracID(atracId)") as Int

public actual fun sceAtracGetNextSample(atracId: Int, outN: Int?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceAtracGetNextSample(atracId, outN?.toLong() ?: 0L)") as Int

public actual fun sceAtracGetMaxSample(atracId: Int, outMax: Int?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceAtracGetMaxSample(atracId, outMax?.toLong() ?: 0L)") as Int

public actual fun sceAtracGetBufferInfoForReseting(atracId: Int, uiSample: UInt, pbufferInfo: Atrac3BufferInfo?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceAtracGetBufferInfoForReseting(atracId, uiSample, pbufferInfo?.toLong() ?: 0L)") as Int

public actual fun sceAtracGetChannel(atracId: Int, puiChannel: UInt?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceAtracGetChannel(atracId, puiChannel?.toLong() ?: 0L)") as Int

public actual fun sceAtracGetInternalErrorInfo(atracId: Int, piResult: Int?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceAtracGetInternalErrorInfo(atracId, piResult?.toLong() ?: 0L)") as Int

public actual fun sceAtracGetLoopStatus(atracId: Int, piLoopNum: Int?, puiLoopStatus: UInt?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceAtracGetLoopStatus(atracId, piLoopNum?.toLong() ?: 0L, puiLoopStatus?.toLong() ?: 0L)") as Int

public actual fun sceAtracGetNextDecodePosition(atracId: Int, puiSamplePosition: UInt?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceAtracGetNextDecodePosition(atracId, puiSamplePosition?.toLong() ?: 0L)") as Int

public actual fun sceAtracGetSecondBufferInfo(atracId: Int, puiPosition: UInt?, puiDataByte: UInt?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceAtracGetSecondBufferInfo(atracId, puiPosition?.toLong() ?: 0L, puiDataByte?.toLong() ?: 0L)") as Int

public actual fun sceAtracGetSoundSample(atracId: Int, piEndSample: Int?, piLoopStartSample: Int?, piLoopEndSample: Int?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceAtracGetSoundSample(atracId, piEndSample?.toLong() ?: 0L, piLoopStartSample?.toLong() ?: 0L, piLoopEndSample?.toLong() ?: 0L)") as Int

public actual fun sceAtracResetPlayPosition(atracId: Int, uiSample: UInt, uiWriteByteFirstBuf: UInt, uiWriteByteSecondBuf: UInt): Int =
    js("require('@kotlinmania/libc-native-bindings').sceAtracResetPlayPosition(atracId, uiSample, uiWriteByteFirstBuf, uiWriteByteSecondBuf)") as Int

public actual fun sceAtracSetData(atracId: Int, pucBufferAddr: COpaquePointer?, uiBufferByte: UInt): Int =
    js("require('@kotlinmania/libc-native-bindings').sceAtracSetData(atracId, pucBufferAddr?.value ?: 0L, uiBufferByte)") as Int

public actual fun sceAtracSetHalfwayBuffer(atracId: Int, pucBufferAddr: COpaquePointer?, uiReadByte: UInt, uiBufferByte: UInt): Int =
    js("require('@kotlinmania/libc-native-bindings').sceAtracSetHalfwayBuffer(atracId, pucBufferAddr?.value ?: 0L, uiReadByte, uiBufferByte)") as Int

public actual fun sceAtracSetHalfwayBufferAndGetID(pucBufferAddr: COpaquePointer?, uiReadByte: UInt, uiBufferByte: UInt): Int =
    js("require('@kotlinmania/libc-native-bindings').sceAtracSetHalfwayBufferAndGetID(pucBufferAddr?.value ?: 0L, uiReadByte, uiBufferByte)") as Int

public actual fun sceAtracSetSecondBuffer(atracId: Int, pucSecondBufferAddr: COpaquePointer?, uiSecondBufferByte: UInt): Int =
    js("require('@kotlinmania/libc-native-bindings').sceAtracSetSecondBuffer(atracId, pucSecondBufferAddr?.value ?: 0L, uiSecondBufferByte)") as Int

public actual fun sceCtrlSetSamplingCycle(cycle: Int): Int =
    js("require('@kotlinmania/libc-native-bindings').sceCtrlSetSamplingCycle(cycle)") as Int

public actual fun sceCtrlGetSamplingCycle(pcycle: Int?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceCtrlGetSamplingCycle(pcycle?.toLong() ?: 0L)") as Int

public actual fun sceCtrlSetSamplingMode(mode: CtrlMode): Int =
    js("require('@kotlinmania/libc-native-bindings').sceCtrlSetSamplingMode(mode)") as Int

public actual fun sceCtrlGetSamplingMode(pmode: Int?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceCtrlGetSamplingMode(pmode?.toLong() ?: 0L)") as Int

public actual fun sceCtrlPeekBufferPositive(padData: SceCtrlData?, count: Int): Int =
    js("require('@kotlinmania/libc-native-bindings').sceCtrlPeekBufferPositive(padData?.toLong() ?: 0L, count)") as Int

public actual fun sceCtrlPeekBufferNegative(padData: SceCtrlData?, count: Int): Int =
    js("require('@kotlinmania/libc-native-bindings').sceCtrlPeekBufferNegative(padData?.toLong() ?: 0L, count)") as Int

public actual fun sceCtrlReadBufferPositive(padData: SceCtrlData?, count: Int): Int =
    js("require('@kotlinmania/libc-native-bindings').sceCtrlReadBufferPositive(padData?.toLong() ?: 0L, count)") as Int

public actual fun sceCtrlReadBufferNegative(padData: SceCtrlData?, count: Int): Int =
    js("require('@kotlinmania/libc-native-bindings').sceCtrlReadBufferNegative(padData?.toLong() ?: 0L, count)") as Int

public actual fun sceCtrlPeekLatch(latchData: SceCtrlLatch?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceCtrlPeekLatch(latchData?.toLong() ?: 0L)") as Int

public actual fun sceCtrlReadLatch(latchData: SceCtrlLatch?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceCtrlReadLatch(latchData?.toLong() ?: 0L)") as Int

public actual fun sceCtrlSetIdleCancelThreshold(idlereset: Int, idleback: Int): Int =
    js("require('@kotlinmania/libc-native-bindings').sceCtrlSetIdleCancelThreshold(idlereset, idleback)") as Int

public actual fun sceCtrlGetIdleCancelThreshold(idlereset: Int?, idleback: Int?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceCtrlGetIdleCancelThreshold(idlereset?.toLong() ?: 0L, idleback?.toLong() ?: 0L)") as Int

public actual fun sceDisplaySetMode(mode: DisplayMode, width: ULong, height: ULong): UInt =
    js("require('@kotlinmania/libc-native-bindings').sceDisplaySetMode(mode, width, height)") as UInt

public actual fun sceDisplayGetMode(pmode: Int?, pwidth: Int?, pheight: Int?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceDisplayGetMode(pmode?.toLong() ?: 0L, pwidth?.toLong() ?: 0L, pheight?.toLong() ?: 0L)") as Int

public actual fun sceDisplaySetFrameBuf(topAddr: COpaquePointer?, bufferWidth: ULong, pixelFormat: DisplayPixelFormat, sync: DisplaySetBufSync): UInt =
    js("require('@kotlinmania/libc-native-bindings').sceDisplaySetFrameBuf(topAddr?.value ?: 0L, bufferWidth, pixelFormat, sync)") as UInt

public actual fun sceDisplayGetFrameBuf(topAddr: COpaquePointer?, bufferWidth: ULong?, pixelFormat: DisplayPixelFormat?, sync: DisplaySetBufSync): Int =
    js("require('@kotlinmania/libc-native-bindings').sceDisplayGetFrameBuf(topAddr?.value ?: 0L, bufferWidth?.toLong() ?: 0L, pixelFormat?.toLong() ?: 0L, sync)") as Int

public actual fun sceDisplayGetVcount(): UInt =
    js("require('@kotlinmania/libc-native-bindings').sceDisplayGetVcount()") as UInt

public actual fun sceDisplayWaitVblank(): Int =
    js("require('@kotlinmania/libc-native-bindings').sceDisplayWaitVblank()") as Int

public actual fun sceDisplayWaitVblankCB(): Int =
    js("require('@kotlinmania/libc-native-bindings').sceDisplayWaitVblankCB()") as Int

public actual fun sceDisplayWaitVblankStart(): Int =
    js("require('@kotlinmania/libc-native-bindings').sceDisplayWaitVblankStart()") as Int

public actual fun sceDisplayWaitVblankStartCB(): Int =
    js("require('@kotlinmania/libc-native-bindings').sceDisplayWaitVblankStartCB()") as Int

public actual fun sceDisplayGetAccumulatedHcount(): Int =
    js("require('@kotlinmania/libc-native-bindings').sceDisplayGetAccumulatedHcount()") as Int

public actual fun sceDisplayGetCurrentHcount(): Int =
    js("require('@kotlinmania/libc-native-bindings').sceDisplayGetCurrentHcount()") as Int

public actual fun sceDisplayGetFramePerSec(): Float =
    js("require('@kotlinmania/libc-native-bindings').sceDisplayGetFramePerSec()") as Float

public actual fun sceDisplayIsForeground(): Int =
    js("require('@kotlinmania/libc-native-bindings').sceDisplayIsForeground()") as Int

public actual fun sceDisplayIsVblank(): Int =
    js("require('@kotlinmania/libc-native-bindings').sceDisplayIsVblank()") as Int

public actual fun sceGeEdramGetSize(): UInt =
    js("require('@kotlinmania/libc-native-bindings').sceGeEdramGetSize()") as UInt

public actual fun sceGeEdramGetAddr(): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').sceGeEdramGetAddr()") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun sceGeEdramSetAddrTranslation(width: Int): Int =
    js("require('@kotlinmania/libc-native-bindings').sceGeEdramSetAddrTranslation(width)") as Int

public actual fun sceGeGetCmd(cmd: Int): UInt =
    js("require('@kotlinmania/libc-native-bindings').sceGeGetCmd(cmd)") as UInt

public actual fun sceGeGetMtx(type: GeMatrixType, matrix: COpaquePointer?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceGeGetMtx(type, matrix?.value ?: 0L)") as Int

public actual fun sceGeGetStack(stackId: Int, stack: GeStack?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceGeGetStack(stackId, stack?.toLong() ?: 0L)") as Int

public actual fun sceGeSaveContext(context: GeContext?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceGeSaveContext(context?.toLong() ?: 0L)") as Int

public actual fun sceGeRestoreContext(context: GeContext?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceGeRestoreContext(context?.toLong() ?: 0L)") as Int

public actual fun sceGeListEnQueue(list: COpaquePointer?, stall: COpaquePointer?, cbid: Int, arg: GeListArgs?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceGeListEnQueue(list?.value ?: 0L, stall?.value ?: 0L, cbid, arg?.toLong() ?: 0L)") as Int

public actual fun sceGeListEnQueueHead(list: COpaquePointer?, stall: COpaquePointer?, cbid: Int, arg: GeListArgs?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceGeListEnQueueHead(list?.value ?: 0L, stall?.value ?: 0L, cbid, arg?.toLong() ?: 0L)") as Int

public actual fun sceGeListDeQueue(qid: Int): Int =
    js("require('@kotlinmania/libc-native-bindings').sceGeListDeQueue(qid)") as Int

public actual fun sceGeListUpdateStallAddr(qid: Int, stall: COpaquePointer?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceGeListUpdateStallAddr(qid, stall?.value ?: 0L)") as Int

public actual fun sceGeListSync(qid: Int, syncType: Int): GeListState =
    js("require('@kotlinmania/libc-native-bindings').sceGeListSync(qid, syncType)") as GeListState

public actual fun sceGeDrawSync(syncType: Int): GeListState =
    js("require('@kotlinmania/libc-native-bindings').sceGeDrawSync(syncType)") as GeListState

public actual fun sceGeBreak(mode: Int, pParam: GeBreakParam?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceGeBreak(mode, pParam?.toLong() ?: 0L)") as Int

public actual fun sceGeContinue(): Int =
    js("require('@kotlinmania/libc-native-bindings').sceGeContinue()") as Int

public actual fun sceGeSetCallback(cb: GeCallbackData?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceGeSetCallback(cb?.toLong() ?: 0L)") as Int

public actual fun sceGeUnsetCallback(cbid: Int): Int =
    js("require('@kotlinmania/libc-native-bindings').sceGeUnsetCallback(cbid)") as Int

public actual fun sceKernelExitGame() {
    js("require('@kotlinmania/libc-native-bindings').sceKernelExitGame()")
}

public actual fun sceKernelRegisterExitCallback(id: SceUid): Int =
    js("require('@kotlinmania/libc-native-bindings').sceKernelRegisterExitCallback(id)") as Int

public actual fun sceKernelLoadExec(file: COpaquePointer?, param: SceKernelLoadExecParam?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceKernelLoadExec(file?.value ?: 0L, param?.toLong() ?: 0L)") as Int

public actual fun sceKernelAllocPartitionMemory(partition: SceSysMemPartitionId, name: COpaquePointer?, type: SceSysMemBlockTypes, size: UInt, addr: COpaquePointer?): SceUid =
    js("require('@kotlinmania/libc-native-bindings').sceKernelAllocPartitionMemory(partition, name?.value ?: 0L, type, size, addr?.value ?: 0L)") as SceUid

public actual fun sceKernelGetBlockHeadAddr(blockid: SceUid): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').sceKernelGetBlockHeadAddr(blockid)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun sceKernelFreePartitionMemory(blockid: SceUid): Int =
    js("require('@kotlinmania/libc-native-bindings').sceKernelFreePartitionMemory(blockid)") as Int

public actual fun sceKernelTotalFreeMemSize(): ULong =
    js("require('@kotlinmania/libc-native-bindings').sceKernelTotalFreeMemSize()") as ULong

public actual fun sceKernelMaxFreeMemSize(): ULong =
    js("require('@kotlinmania/libc-native-bindings').sceKernelMaxFreeMemSize()") as ULong

public actual fun sceKernelDevkitVersion(): UInt =
    js("require('@kotlinmania/libc-native-bindings').sceKernelDevkitVersion()") as UInt

public actual fun sceKernelSetCompiledSdkVersion(version: UInt): Int =
    js("require('@kotlinmania/libc-native-bindings').sceKernelSetCompiledSdkVersion(version)") as Int

public actual fun sceKernelGetCompiledSdkVersion(): UInt =
    js("require('@kotlinmania/libc-native-bindings').sceKernelGetCompiledSdkVersion()") as UInt

public actual fun sceKernelLibcTime(t: Int?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceKernelLibcTime(t?.toLong() ?: 0L)") as Int

public actual fun sceKernelLibcClock(): UInt =
    js("require('@kotlinmania/libc-native-bindings').sceKernelLibcClock()") as UInt

public actual fun sceKernelLibcGettimeofday(tp: Timeval?, tzp: Timezone?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceKernelLibcGettimeofday(tp?.toLong() ?: 0L, tzp?.toLong() ?: 0L)") as Int

public actual fun sceKernelDcacheWritebackAll() {
    js("require('@kotlinmania/libc-native-bindings').sceKernelDcacheWritebackAll()")
}

public actual fun sceKernelDcacheWritebackInvalidateAll() {
    js("require('@kotlinmania/libc-native-bindings').sceKernelDcacheWritebackInvalidateAll()")
}

public actual fun sceKernelDcacheWritebackRange(p: COpaquePointer?, size: UInt) {
    js("require('@kotlinmania/libc-native-bindings').sceKernelDcacheWritebackRange(p?.value ?: 0L, size)")
}

public actual fun sceKernelDcacheWritebackInvalidateRange(p: COpaquePointer?, size: UInt) {
    js("require('@kotlinmania/libc-native-bindings').sceKernelDcacheWritebackInvalidateRange(p?.value ?: 0L, size)")
}

public actual fun sceKernelDcacheInvalidateRange(p: COpaquePointer?, size: UInt) {
    js("require('@kotlinmania/libc-native-bindings').sceKernelDcacheInvalidateRange(p?.value ?: 0L, size)")
}

public actual fun sceKernelIcacheInvalidateAll() {
    js("require('@kotlinmania/libc-native-bindings').sceKernelIcacheInvalidateAll()")
}

public actual fun sceKernelIcacheInvalidateRange(p: COpaquePointer?, size: UInt) {
    js("require('@kotlinmania/libc-native-bindings').sceKernelIcacheInvalidateRange(p?.value ?: 0L, size)")
}

public actual fun sceKernelUtilsMt19937Init(ctx: SceKernelUtilsMt19937Context?, seed: UInt): Int =
    js("require('@kotlinmania/libc-native-bindings').sceKernelUtilsMt19937Init(ctx?.toLong() ?: 0L, seed)") as Int

public actual fun sceKernelUtilsMt19937UInt(ctx: SceKernelUtilsMt19937Context?): UInt =
    js("require('@kotlinmania/libc-native-bindings').sceKernelUtilsMt19937UInt(ctx?.toLong() ?: 0L)") as UInt

public actual fun sceKernelUtilsMd5Digest(data: COpaquePointer?, size: UInt, digest: COpaquePointer?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceKernelUtilsMd5Digest(data?.value ?: 0L, size, digest?.value ?: 0L)") as Int

public actual fun sceKernelUtilsMd5BlockInit(ctx: SceKernelUtilsMd5Context?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceKernelUtilsMd5BlockInit(ctx?.toLong() ?: 0L)") as Int

public actual fun sceKernelUtilsMd5BlockUpdate(ctx: SceKernelUtilsMd5Context?, data: COpaquePointer?, size: UInt): Int =
    js("require('@kotlinmania/libc-native-bindings').sceKernelUtilsMd5BlockUpdate(ctx?.toLong() ?: 0L, data?.value ?: 0L, size)") as Int

public actual fun sceKernelUtilsMd5BlockResult(ctx: SceKernelUtilsMd5Context?, digest: COpaquePointer?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceKernelUtilsMd5BlockResult(ctx?.toLong() ?: 0L, digest?.value ?: 0L)") as Int

public actual fun sceKernelUtilsSha1Digest(data: COpaquePointer?, size: UInt, digest: COpaquePointer?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceKernelUtilsSha1Digest(data?.value ?: 0L, size, digest?.value ?: 0L)") as Int

public actual fun sceKernelUtilsSha1BlockInit(ctx: SceKernelUtilsSha1Context?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceKernelUtilsSha1BlockInit(ctx?.toLong() ?: 0L)") as Int

public actual fun sceKernelUtilsSha1BlockUpdate(ctx: SceKernelUtilsSha1Context?, data: COpaquePointer?, size: UInt): Int =
    js("require('@kotlinmania/libc-native-bindings').sceKernelUtilsSha1BlockUpdate(ctx?.toLong() ?: 0L, data?.value ?: 0L, size)") as Int

public actual fun sceKernelUtilsSha1BlockResult(ctx: SceKernelUtilsSha1Context?, digest: COpaquePointer?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceKernelUtilsSha1BlockResult(ctx?.toLong() ?: 0L, digest?.value ?: 0L)") as Int

public actual fun sceKernelRegisterSubIntrHandler(intNo: Int, no: Int, handler: COpaquePointer?, arg: COpaquePointer?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceKernelRegisterSubIntrHandler(intNo, no, handler?.value ?: 0L, arg?.value ?: 0L)") as Int

public actual fun sceKernelReleaseSubIntrHandler(intNo: Int, no: Int): Int =
    js("require('@kotlinmania/libc-native-bindings').sceKernelReleaseSubIntrHandler(intNo, no)") as Int

public actual fun sceKernelEnableSubIntr(intNo: Int, no: Int): Int =
    js("require('@kotlinmania/libc-native-bindings').sceKernelEnableSubIntr(intNo, no)") as Int

public actual fun sceKernelDisableSubIntr(intNo: Int, no: Int): Int =
    js("require('@kotlinmania/libc-native-bindings').sceKernelDisableSubIntr(intNo, no)") as Int

public actual fun queryIntrHandlerInfo(intrCode: SceUid, subIntrCode: SceUid, data: IntrHandlerOptionParam?): Int =
    js("require('@kotlinmania/libc-native-bindings').queryIntrHandlerInfo(intrCode, subIntrCode, data?.toLong() ?: 0L)") as Int

public actual fun sceKernelCpuSuspendIntr(): UInt =
    js("require('@kotlinmania/libc-native-bindings').sceKernelCpuSuspendIntr()") as UInt

public actual fun sceKernelCpuResumeIntr(flags: UInt) {
    js("require('@kotlinmania/libc-native-bindings').sceKernelCpuResumeIntr(flags)")
}

public actual fun sceKernelCpuResumeIntrWithSync(flags: UInt) {
    js("require('@kotlinmania/libc-native-bindings').sceKernelCpuResumeIntrWithSync(flags)")
}

public actual fun sceKernelIsCpuIntrSuspended(flags: UInt): Int =
    js("require('@kotlinmania/libc-native-bindings').sceKernelIsCpuIntrSuspended(flags)") as Int

public actual fun sceKernelIsCpuIntrEnable(): Int =
    js("require('@kotlinmania/libc-native-bindings').sceKernelIsCpuIntrEnable()") as Int

public actual fun sceKernelLoadModule(path: COpaquePointer?, flags: Int, option: SceKernelLMOption?): SceUid =
    js("require('@kotlinmania/libc-native-bindings').sceKernelLoadModule(path?.value ?: 0L, flags, option?.toLong() ?: 0L)") as SceUid

public actual fun sceKernelLoadModuleMs(path: COpaquePointer?, flags: Int, option: SceKernelLMOption?): SceUid =
    js("require('@kotlinmania/libc-native-bindings').sceKernelLoadModuleMs(path?.value ?: 0L, flags, option?.toLong() ?: 0L)") as SceUid

public actual fun sceKernelLoadModuleByID(fid: SceUid, flags: Int, option: SceKernelLMOption?): SceUid =
    js("require('@kotlinmania/libc-native-bindings').sceKernelLoadModuleByID(fid, flags, option?.toLong() ?: 0L)") as SceUid

public actual fun sceKernelLoadModuleBufferUsbWlan(bufSize: ULong, buf: COpaquePointer?, flags: Int, option: SceKernelLMOption?): SceUid =
    js("require('@kotlinmania/libc-native-bindings').sceKernelLoadModuleBufferUsbWlan(bufSize, buf?.value ?: 0L, flags, option?.toLong() ?: 0L)") as SceUid

public actual fun sceKernelStartModule(modId: SceUid, argSize: ULong, argp: COpaquePointer?, status: Int?, option: SceKernelSMOption?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceKernelStartModule(modId, argSize, argp?.value ?: 0L, status?.toLong() ?: 0L, option?.toLong() ?: 0L)") as Int

public actual fun sceKernelStopModule(modId: SceUid, argSize: ULong, argp: COpaquePointer?, status: Int?, option: SceKernelSMOption?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceKernelStopModule(modId, argSize, argp?.value ?: 0L, status?.toLong() ?: 0L, option?.toLong() ?: 0L)") as Int

public actual fun sceKernelUnloadModule(modId: SceUid): Int =
    js("require('@kotlinmania/libc-native-bindings').sceKernelUnloadModule(modId)") as Int

public actual fun sceKernelSelfStopUnloadModule(unknown: Int, argSize: ULong, argp: COpaquePointer?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceKernelSelfStopUnloadModule(unknown, argSize, argp?.value ?: 0L)") as Int

public actual fun sceKernelStopUnloadSelfModule(argSize: ULong, argp: COpaquePointer?, status: Int?, option: SceKernelSMOption?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceKernelStopUnloadSelfModule(argSize, argp?.value ?: 0L, status?.toLong() ?: 0L, option?.toLong() ?: 0L)") as Int

public actual fun sceKernelQueryModuleInfo(modId: SceUid, info: SceKernelModuleInfo?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceKernelQueryModuleInfo(modId, info?.toLong() ?: 0L)") as Int

public actual fun sceKernelGetModuleIdList(readBuf: SceUid?, readBufSize: Int, idCount: Int?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceKernelGetModuleIdList(readBuf?.toLong() ?: 0L, readBufSize, idCount?.toLong() ?: 0L)") as Int

public actual fun sceKernelVolatileMemLock(unk: Int, ptr: COpaquePointer?, size: Int?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceKernelVolatileMemLock(unk, ptr?.value ?: 0L, size?.toLong() ?: 0L)") as Int

public actual fun sceKernelVolatileMemTryLock(unk: Int, ptr: COpaquePointer?, size: Int?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceKernelVolatileMemTryLock(unk, ptr?.value ?: 0L, size?.toLong() ?: 0L)") as Int

public actual fun sceKernelVolatileMemUnlock(unk: Int): Int =
    js("require('@kotlinmania/libc-native-bindings').sceKernelVolatileMemUnlock(unk)") as Int

public actual fun sceKernelStdin(): SceUid =
    js("require('@kotlinmania/libc-native-bindings').sceKernelStdin()") as SceUid

public actual fun sceKernelStdout(): SceUid =
    js("require('@kotlinmania/libc-native-bindings').sceKernelStdout()") as SceUid

public actual fun sceKernelStderr(): SceUid =
    js("require('@kotlinmania/libc-native-bindings').sceKernelStderr()") as SceUid

public actual fun sceKernelGetThreadmanIdType(uid: SceUid): SceKernelIdListType =
    js("require('@kotlinmania/libc-native-bindings').sceKernelGetThreadmanIdType(uid)") as SceKernelIdListType

public actual fun sceKernelCreateThread(name: COpaquePointer?, entry: SceKernelThreadEntry, initPriority: Int, stackSize: Int, attr: Int, option: SceKernelThreadOptParam?): SceUid =
    js("require('@kotlinmania/libc-native-bindings').sceKernelCreateThread(name?.value ?: 0L, entry, initPriority, stackSize, attr, option?.toLong() ?: 0L)") as SceUid

public actual fun sceKernelDeleteThread(thid: SceUid): Int =
    js("require('@kotlinmania/libc-native-bindings').sceKernelDeleteThread(thid)") as Int

public actual fun sceKernelStartThread(id: SceUid, argLen: ULong, argP: COpaquePointer?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceKernelStartThread(id, argLen, argP?.value ?: 0L)") as Int

public actual fun sceKernelExitThread(status: Int): Int =
    js("require('@kotlinmania/libc-native-bindings').sceKernelExitThread(status)") as Int

public actual fun sceKernelExitDeleteThread(status: Int): Int =
    js("require('@kotlinmania/libc-native-bindings').sceKernelExitDeleteThread(status)") as Int

public actual fun sceKernelTerminateThread(thid: SceUid): Int =
    js("require('@kotlinmania/libc-native-bindings').sceKernelTerminateThread(thid)") as Int

public actual fun sceKernelTerminateDeleteThread(thid: SceUid): Int =
    js("require('@kotlinmania/libc-native-bindings').sceKernelTerminateDeleteThread(thid)") as Int

public actual fun sceKernelSuspendDispatchThread(): Int =
    js("require('@kotlinmania/libc-native-bindings').sceKernelSuspendDispatchThread()") as Int

public actual fun sceKernelResumeDispatchThread(state: Int): Int =
    js("require('@kotlinmania/libc-native-bindings').sceKernelResumeDispatchThread(state)") as Int

public actual fun sceKernelSleepThread(): Int =
    js("require('@kotlinmania/libc-native-bindings').sceKernelSleepThread()") as Int

public actual fun sceKernelSleepThreadCB(): Int =
    js("require('@kotlinmania/libc-native-bindings').sceKernelSleepThreadCB()") as Int

public actual fun sceKernelWakeupThread(thid: SceUid): Int =
    js("require('@kotlinmania/libc-native-bindings').sceKernelWakeupThread(thid)") as Int

public actual fun sceKernelCancelWakeupThread(thid: SceUid): Int =
    js("require('@kotlinmania/libc-native-bindings').sceKernelCancelWakeupThread(thid)") as Int

public actual fun sceKernelSuspendThread(thid: SceUid): Int =
    js("require('@kotlinmania/libc-native-bindings').sceKernelSuspendThread(thid)") as Int

public actual fun sceKernelResumeThread(thid: SceUid): Int =
    js("require('@kotlinmania/libc-native-bindings').sceKernelResumeThread(thid)") as Int

public actual fun sceKernelWaitThreadEnd(thid: SceUid, timeout: UInt?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceKernelWaitThreadEnd(thid, timeout?.toLong() ?: 0L)") as Int

public actual fun sceKernelWaitThreadEndCB(thid: SceUid, timeout: UInt?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceKernelWaitThreadEndCB(thid, timeout?.toLong() ?: 0L)") as Int

public actual fun sceKernelDelayThread(delay: UInt): Int =
    js("require('@kotlinmania/libc-native-bindings').sceKernelDelayThread(delay)") as Int

public actual fun sceKernelDelayThreadCB(delay: UInt): Int =
    js("require('@kotlinmania/libc-native-bindings').sceKernelDelayThreadCB(delay)") as Int

public actual fun sceKernelDelaySysClockThread(delay: SceKernelSysClock?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceKernelDelaySysClockThread(delay?.toLong() ?: 0L)") as Int

public actual fun sceKernelDelaySysClockThreadCB(delay: SceKernelSysClock?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceKernelDelaySysClockThreadCB(delay?.toLong() ?: 0L)") as Int

public actual fun sceKernelChangeCurrentThreadAttr(unknown: Int, attr: Int): Int =
    js("require('@kotlinmania/libc-native-bindings').sceKernelChangeCurrentThreadAttr(unknown, attr)") as Int

public actual fun sceKernelChangeThreadPriority(thid: SceUid, priority: Int): Int =
    js("require('@kotlinmania/libc-native-bindings').sceKernelChangeThreadPriority(thid, priority)") as Int

public actual fun sceKernelRotateThreadReadyQueue(priority: Int): Int =
    js("require('@kotlinmania/libc-native-bindings').sceKernelRotateThreadReadyQueue(priority)") as Int

public actual fun sceKernelReleaseWaitThread(thid: SceUid): Int =
    js("require('@kotlinmania/libc-native-bindings').sceKernelReleaseWaitThread(thid)") as Int

public actual fun sceKernelGetThreadId(): Int =
    js("require('@kotlinmania/libc-native-bindings').sceKernelGetThreadId()") as Int

public actual fun sceKernelGetThreadCurrentPriority(): Int =
    js("require('@kotlinmania/libc-native-bindings').sceKernelGetThreadCurrentPriority()") as Int

public actual fun sceKernelGetThreadExitStatus(thid: SceUid): Int =
    js("require('@kotlinmania/libc-native-bindings').sceKernelGetThreadExitStatus(thid)") as Int

public actual fun sceKernelCheckThreadStack(): Int =
    js("require('@kotlinmania/libc-native-bindings').sceKernelCheckThreadStack()") as Int

public actual fun sceKernelGetThreadStackFreeSize(thid: SceUid): Int =
    js("require('@kotlinmania/libc-native-bindings').sceKernelGetThreadStackFreeSize(thid)") as Int

public actual fun sceKernelReferThreadStatus(thid: SceUid, info: SceKernelThreadInfo?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceKernelReferThreadStatus(thid, info?.toLong() ?: 0L)") as Int

public actual fun sceKernelReferThreadRunStatus(thid: SceUid, status: SceKernelThreadRunStatus?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceKernelReferThreadRunStatus(thid, status?.toLong() ?: 0L)") as Int

public actual fun sceKernelCreateSema(name: COpaquePointer?, attr: UInt, initVal: Int, maxVal: Int, option: SceKernelSemaOptParam?): SceUid =
    js("require('@kotlinmania/libc-native-bindings').sceKernelCreateSema(name?.value ?: 0L, attr, initVal, maxVal, option?.toLong() ?: 0L)") as SceUid

public actual fun sceKernelDeleteSema(semaId: SceUid): Int =
    js("require('@kotlinmania/libc-native-bindings').sceKernelDeleteSema(semaId)") as Int

public actual fun sceKernelSignalSema(semaId: SceUid, signal: Int): Int =
    js("require('@kotlinmania/libc-native-bindings').sceKernelSignalSema(semaId, signal)") as Int

public actual fun sceKernelWaitSema(semaId: SceUid, signal: Int, timeout: UInt?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceKernelWaitSema(semaId, signal, timeout?.toLong() ?: 0L)") as Int

public actual fun sceKernelWaitSemaCB(semaId: SceUid, signal: Int, timeout: UInt?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceKernelWaitSemaCB(semaId, signal, timeout?.toLong() ?: 0L)") as Int

public actual fun sceKernelPollSema(semaId: SceUid, signal: Int): Int =
    js("require('@kotlinmania/libc-native-bindings').sceKernelPollSema(semaId, signal)") as Int

public actual fun sceKernelReferSemaStatus(semaId: SceUid, info: SceKernelSemaInfo?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceKernelReferSemaStatus(semaId, info?.toLong() ?: 0L)") as Int

public actual fun sceKernelCreateEventFlag(name: COpaquePointer?, attr: Int, bits: Int, opt: SceKernelEventFlagOptParam?): SceUid =
    js("require('@kotlinmania/libc-native-bindings').sceKernelCreateEventFlag(name?.value ?: 0L, attr, bits, opt?.toLong() ?: 0L)") as SceUid

public actual fun sceKernelSetEventFlag(evId: SceUid, bits: UInt): Int =
    js("require('@kotlinmania/libc-native-bindings').sceKernelSetEventFlag(evId, bits)") as Int

public actual fun sceKernelClearEventFlag(evId: SceUid, bits: UInt): Int =
    js("require('@kotlinmania/libc-native-bindings').sceKernelClearEventFlag(evId, bits)") as Int

public actual fun sceKernelPollEventFlag(evId: SceUid, bits: UInt, wait: Int, outBits: UInt?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceKernelPollEventFlag(evId, bits, wait, outBits?.toLong() ?: 0L)") as Int

public actual fun sceKernelWaitEventFlag(evId: SceUid, bits: UInt, wait: Int, outBits: UInt?, timeout: UInt?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceKernelWaitEventFlag(evId, bits, wait, outBits?.toLong() ?: 0L, timeout?.toLong() ?: 0L)") as Int

public actual fun sceKernelWaitEventFlagCB(evId: SceUid, bits: UInt, wait: Int, outBits: UInt?, timeout: UInt?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceKernelWaitEventFlagCB(evId, bits, wait, outBits?.toLong() ?: 0L, timeout?.toLong() ?: 0L)") as Int

public actual fun sceKernelDeleteEventFlag(evId: SceUid): Int =
    js("require('@kotlinmania/libc-native-bindings').sceKernelDeleteEventFlag(evId)") as Int

public actual fun sceKernelReferEventFlagStatus(event: SceUid, status: SceKernelEventFlagInfo?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceKernelReferEventFlagStatus(event, status?.toLong() ?: 0L)") as Int

public actual fun sceKernelCreateMbx(name: COpaquePointer?, attr: UInt, option: SceKernelMbxOptParam?): SceUid =
    js("require('@kotlinmania/libc-native-bindings').sceKernelCreateMbx(name?.value ?: 0L, attr, option?.toLong() ?: 0L)") as SceUid

public actual fun sceKernelDeleteMbx(mbxId: SceUid): Int =
    js("require('@kotlinmania/libc-native-bindings').sceKernelDeleteMbx(mbxId)") as Int

public actual fun sceKernelSendMbx(mbxId: SceUid, message: COpaquePointer?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceKernelSendMbx(mbxId, message?.value ?: 0L)") as Int

public actual fun sceKernelReceiveMbx(mbxId: SceUid, message: COpaquePointer?, timeout: UInt?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceKernelReceiveMbx(mbxId, message?.value ?: 0L, timeout?.toLong() ?: 0L)") as Int

public actual fun sceKernelReceiveMbxCB(mbxId: SceUid, message: COpaquePointer?, timeout: UInt?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceKernelReceiveMbxCB(mbxId, message?.value ?: 0L, timeout?.toLong() ?: 0L)") as Int

public actual fun sceKernelPollMbx(mbxId: SceUid, pmessage: COpaquePointer?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceKernelPollMbx(mbxId, pmessage?.value ?: 0L)") as Int

public actual fun sceKernelCancelReceiveMbx(mbxId: SceUid, num: Int?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceKernelCancelReceiveMbx(mbxId, num?.toLong() ?: 0L)") as Int

public actual fun sceKernelReferMbxStatus(mbxId: SceUid, info: SceKernelMbxInfo?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceKernelReferMbxStatus(mbxId, info?.toLong() ?: 0L)") as Int

public actual fun sceKernelSetAlarm(clock: UInt, handler: SceKernelAlarmHandler, common: COpaquePointer?): SceUid =
    js("require('@kotlinmania/libc-native-bindings').sceKernelSetAlarm(clock, handler, common?.value ?: 0L)") as SceUid

public actual fun sceKernelSetSysClockAlarm(clock: SceKernelSysClock?, handler: SceKernelAlarmHandler?, common: COpaquePointer?): SceUid =
    js("require('@kotlinmania/libc-native-bindings').sceKernelSetSysClockAlarm(clock?.toLong() ?: 0L, handler?.toLong() ?: 0L, common?.value ?: 0L)") as SceUid

public actual fun sceKernelCancelAlarm(alarmId: SceUid): Int =
    js("require('@kotlinmania/libc-native-bindings').sceKernelCancelAlarm(alarmId)") as Int

public actual fun sceKernelReferAlarmStatus(alarmId: SceUid, info: SceKernelAlarmInfo?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceKernelReferAlarmStatus(alarmId, info?.toLong() ?: 0L)") as Int

public actual fun sceKernelCreateCallback(name: COpaquePointer?, func: SceKernelCallbackFunction, arg: COpaquePointer?): SceUid =
    js("require('@kotlinmania/libc-native-bindings').sceKernelCreateCallback(name?.value ?: 0L, func, arg?.value ?: 0L)") as SceUid

public actual fun sceKernelReferCallbackStatus(cb: SceUid, status: SceKernelCallbackInfo?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceKernelReferCallbackStatus(cb, status?.toLong() ?: 0L)") as Int

public actual fun sceKernelDeleteCallback(cb: SceUid): Int =
    js("require('@kotlinmania/libc-native-bindings').sceKernelDeleteCallback(cb)") as Int

public actual fun sceKernelNotifyCallback(cb: SceUid, arg2: Int): Int =
    js("require('@kotlinmania/libc-native-bindings').sceKernelNotifyCallback(cb, arg2)") as Int

public actual fun sceKernelCancelCallback(cb: SceUid): Int =
    js("require('@kotlinmania/libc-native-bindings').sceKernelCancelCallback(cb)") as Int

public actual fun sceKernelGetCallbackCount(cb: SceUid): Int =
    js("require('@kotlinmania/libc-native-bindings').sceKernelGetCallbackCount(cb)") as Int

public actual fun sceKernelCheckCallback(): Int =
    js("require('@kotlinmania/libc-native-bindings').sceKernelCheckCallback()") as Int

public actual fun sceKernelGetThreadmanIdList(type: SceKernelIdListType, readBuf: SceUid?, readBufSize: Int, idCount: Int?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceKernelGetThreadmanIdList(type, readBuf?.toLong() ?: 0L, readBufSize, idCount?.toLong() ?: 0L)") as Int

public actual fun sceKernelReferSystemStatus(status: SceKernelSystemStatus?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceKernelReferSystemStatus(status?.toLong() ?: 0L)") as Int

public actual fun sceKernelCreateMsgPipe(name: COpaquePointer?, part: Int, attr: Int, unk1: COpaquePointer?, opt: COpaquePointer?): SceUid =
    js("require('@kotlinmania/libc-native-bindings').sceKernelCreateMsgPipe(name?.value ?: 0L, part, attr, unk1?.value ?: 0L, opt?.value ?: 0L)") as SceUid

public actual fun sceKernelDeleteMsgPipe(uid: SceUid): Int =
    js("require('@kotlinmania/libc-native-bindings').sceKernelDeleteMsgPipe(uid)") as Int

public actual fun sceKernelSendMsgPipe(uid: SceUid, message: COpaquePointer?, size: UInt, unk1: Int, unk2: COpaquePointer?, timeout: UInt?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceKernelSendMsgPipe(uid, message?.value ?: 0L, size, unk1, unk2?.value ?: 0L, timeout?.toLong() ?: 0L)") as Int

public actual fun sceKernelSendMsgPipeCB(uid: SceUid, message: COpaquePointer?, size: UInt, unk1: Int, unk2: COpaquePointer?, timeout: UInt?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceKernelSendMsgPipeCB(uid, message?.value ?: 0L, size, unk1, unk2?.value ?: 0L, timeout?.toLong() ?: 0L)") as Int

public actual fun sceKernelTrySendMsgPipe(uid: SceUid, message: COpaquePointer?, size: UInt, unk1: Int, unk2: COpaquePointer?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceKernelTrySendMsgPipe(uid, message?.value ?: 0L, size, unk1, unk2?.value ?: 0L)") as Int

public actual fun sceKernelReceiveMsgPipe(uid: SceUid, message: COpaquePointer?, size: UInt, unk1: Int, unk2: COpaquePointer?, timeout: UInt?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceKernelReceiveMsgPipe(uid, message?.value ?: 0L, size, unk1, unk2?.value ?: 0L, timeout?.toLong() ?: 0L)") as Int

public actual fun sceKernelReceiveMsgPipeCB(uid: SceUid, message: COpaquePointer?, size: UInt, unk1: Int, unk2: COpaquePointer?, timeout: UInt?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceKernelReceiveMsgPipeCB(uid, message?.value ?: 0L, size, unk1, unk2?.value ?: 0L, timeout?.toLong() ?: 0L)") as Int

public actual fun sceKernelTryReceiveMsgPipe(uid: SceUid, message: COpaquePointer?, size: UInt, unk1: Int, unk2: COpaquePointer?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceKernelTryReceiveMsgPipe(uid, message?.value ?: 0L, size, unk1, unk2?.value ?: 0L)") as Int

public actual fun sceKernelCancelMsgPipe(uid: SceUid, send: Int?, recv: Int?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceKernelCancelMsgPipe(uid, send?.toLong() ?: 0L, recv?.toLong() ?: 0L)") as Int

public actual fun sceKernelReferMsgPipeStatus(uid: SceUid, info: SceKernelMppInfo?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceKernelReferMsgPipeStatus(uid, info?.toLong() ?: 0L)") as Int

public actual fun sceKernelCreateVpl(name: COpaquePointer?, part: Int, attr: Int, size: UInt, opt: SceKernelVplOptParam?): SceUid =
    js("require('@kotlinmania/libc-native-bindings').sceKernelCreateVpl(name?.value ?: 0L, part, attr, size, opt?.toLong() ?: 0L)") as SceUid

public actual fun sceKernelDeleteVpl(uid: SceUid): Int =
    js("require('@kotlinmania/libc-native-bindings').sceKernelDeleteVpl(uid)") as Int

public actual fun sceKernelAllocateVpl(uid: SceUid, size: UInt, data: COpaquePointer?, timeout: UInt?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceKernelAllocateVpl(uid, size, data?.value ?: 0L, timeout?.toLong() ?: 0L)") as Int

public actual fun sceKernelAllocateVplCB(uid: SceUid, size: UInt, data: COpaquePointer?, timeout: UInt?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceKernelAllocateVplCB(uid, size, data?.value ?: 0L, timeout?.toLong() ?: 0L)") as Int

public actual fun sceKernelTryAllocateVpl(uid: SceUid, size: UInt, data: COpaquePointer?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceKernelTryAllocateVpl(uid, size, data?.value ?: 0L)") as Int

public actual fun sceKernelFreeVpl(uid: SceUid, data: COpaquePointer?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceKernelFreeVpl(uid, data?.value ?: 0L)") as Int

public actual fun sceKernelCancelVpl(uid: SceUid, num: Int?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceKernelCancelVpl(uid, num?.toLong() ?: 0L)") as Int

public actual fun sceKernelReferVplStatus(uid: SceUid, info: SceKernelVplInfo?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceKernelReferVplStatus(uid, info?.toLong() ?: 0L)") as Int

public actual fun sceKernelCreateFpl(name: COpaquePointer?, part: Int, attr: Int, size: UInt, blocks: UInt, opt: SceKernelFplOptParam?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceKernelCreateFpl(name?.value ?: 0L, part, attr, size, blocks, opt?.toLong() ?: 0L)") as Int

public actual fun sceKernelDeleteFpl(uid: SceUid): Int =
    js("require('@kotlinmania/libc-native-bindings').sceKernelDeleteFpl(uid)") as Int

public actual fun sceKernelAllocateFpl(uid: SceUid, data: COpaquePointer?, timeout: UInt?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceKernelAllocateFpl(uid, data?.value ?: 0L, timeout?.toLong() ?: 0L)") as Int

public actual fun sceKernelAllocateFplCB(uid: SceUid, data: COpaquePointer?, timeout: UInt?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceKernelAllocateFplCB(uid, data?.value ?: 0L, timeout?.toLong() ?: 0L)") as Int

public actual fun sceKernelTryAllocateFpl(uid: SceUid, data: COpaquePointer?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceKernelTryAllocateFpl(uid, data?.value ?: 0L)") as Int

public actual fun sceKernelFreeFpl(uid: SceUid, data: COpaquePointer?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceKernelFreeFpl(uid, data?.value ?: 0L)") as Int

public actual fun sceKernelCancelFpl(uid: SceUid, pnum: Int?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceKernelCancelFpl(uid, pnum?.toLong() ?: 0L)") as Int

public actual fun sceKernelReferFplStatus(uid: SceUid, info: SceKernelFplInfo?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceKernelReferFplStatus(uid, info?.toLong() ?: 0L)") as Int

public actual fun sceKernelUSec2SysClock(usec: UInt, clock: SceKernelSysClock?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceKernelUSec2SysClock(usec, clock?.toLong() ?: 0L)") as Int

public actual fun sceKernelUSec2SysClockWide(usec: UInt): Long =
    js("require('@kotlinmania/libc-native-bindings').sceKernelUSec2SysClockWide(usec)") as Long

public actual fun sceKernelSysClock2USec(clock: SceKernelSysClock?, low: UInt?, high: UInt?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceKernelSysClock2USec(clock?.toLong() ?: 0L, low?.toLong() ?: 0L, high?.toLong() ?: 0L)") as Int

public actual fun sceKernelSysClock2USecWide(clock: Long, low: UInt?, high: UInt?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceKernelSysClock2USecWide(clock, low?.toLong() ?: 0L, high?.toLong() ?: 0L)") as Int

public actual fun sceKernelGetSystemTime(time: SceKernelSysClock?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceKernelGetSystemTime(time?.toLong() ?: 0L)") as Int

public actual fun sceKernelGetSystemTimeWide(): Long =
    js("require('@kotlinmania/libc-native-bindings').sceKernelGetSystemTimeWide()") as Long

public actual fun sceKernelGetSystemTimeLow(): UInt =
    js("require('@kotlinmania/libc-native-bindings').sceKernelGetSystemTimeLow()") as UInt

public actual fun sceKernelCreateVTimer(name: COpaquePointer?, opt: SceKernelVTimerOptParam?): SceUid =
    js("require('@kotlinmania/libc-native-bindings').sceKernelCreateVTimer(name?.value ?: 0L, opt?.toLong() ?: 0L)") as SceUid

public actual fun sceKernelDeleteVTimer(uid: SceUid): Int =
    js("require('@kotlinmania/libc-native-bindings').sceKernelDeleteVTimer(uid)") as Int

public actual fun sceKernelGetVTimerBase(uid: SceUid, base: SceKernelSysClock?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceKernelGetVTimerBase(uid, base?.toLong() ?: 0L)") as Int

public actual fun sceKernelGetVTimerBaseWide(uid: SceUid): Long =
    js("require('@kotlinmania/libc-native-bindings').sceKernelGetVTimerBaseWide(uid)") as Long

public actual fun sceKernelGetVTimerTime(uid: SceUid, time: SceKernelSysClock?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceKernelGetVTimerTime(uid, time?.toLong() ?: 0L)") as Int

public actual fun sceKernelGetVTimerTimeWide(uid: SceUid): Long =
    js("require('@kotlinmania/libc-native-bindings').sceKernelGetVTimerTimeWide(uid)") as Long

public actual fun sceKernelSetVTimerTime(uid: SceUid, time: SceKernelSysClock?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceKernelSetVTimerTime(uid, time?.toLong() ?: 0L)") as Int

public actual fun sceKernelSetVTimerTimeWide(uid: SceUid, time: Long): Long =
    js("require('@kotlinmania/libc-native-bindings').sceKernelSetVTimerTimeWide(uid, time)") as Long

public actual fun sceKernelStartVTimer(uid: SceUid): Int =
    js("require('@kotlinmania/libc-native-bindings').sceKernelStartVTimer(uid)") as Int

public actual fun sceKernelStopVTimer(uid: SceUid): Int =
    js("require('@kotlinmania/libc-native-bindings').sceKernelStopVTimer(uid)") as Int

public actual fun sceKernelSetVTimerHandler(uid: SceUid, time: SceKernelSysClock?, handler: SceKernelVTimerHandler, common: COpaquePointer?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceKernelSetVTimerHandler(uid, time?.toLong() ?: 0L, handler, common?.value ?: 0L)") as Int

public actual fun sceKernelSetVTimerHandlerWide(uid: SceUid, time: Long, handler: SceKernelVTimerHandlerWide, common: COpaquePointer?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceKernelSetVTimerHandlerWide(uid, time, handler, common?.value ?: 0L)") as Int

public actual fun sceKernelCancelVTimerHandler(uid: SceUid): Int =
    js("require('@kotlinmania/libc-native-bindings').sceKernelCancelVTimerHandler(uid)") as Int

public actual fun sceKernelReferVTimerStatus(uid: SceUid, info: SceKernelVTimerInfo?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceKernelReferVTimerStatus(uid, info?.toLong() ?: 0L)") as Int

public actual fun sceKernelRegisterThreadEventHandler(name: COpaquePointer?, threadId: SceUid, mask: Int, handler: SceKernelThreadEventHandler, common: COpaquePointer?): SceUid =
    js("require('@kotlinmania/libc-native-bindings').sceKernelRegisterThreadEventHandler(name?.value ?: 0L, threadId, mask, handler, common?.value ?: 0L)") as SceUid

public actual fun sceKernelReleaseThreadEventHandler(uid: SceUid): Int =
    js("require('@kotlinmania/libc-native-bindings').sceKernelReleaseThreadEventHandler(uid)") as Int

public actual fun sceKernelReferThreadEventHandlerStatus(uid: SceUid, info: SceKernelThreadEventHandlerInfo?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceKernelReferThreadEventHandlerStatus(uid, info?.toLong() ?: 0L)") as Int

public actual fun sceKernelReferThreadProfiler(): DebugProfilerRegs? =
    js("require('@kotlinmania/libc-native-bindings').sceKernelReferThreadProfiler()") as DebugProfilerRegs?

public actual fun sceKernelReferGlobalProfiler(): DebugProfilerRegs? =
    js("require('@kotlinmania/libc-native-bindings').sceKernelReferGlobalProfiler()") as DebugProfilerRegs?

public actual fun sceUsbStart(driverName: COpaquePointer?, size: Int, args: COpaquePointer?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceUsbStart(driverName?.value ?: 0L, size, args?.value ?: 0L)") as Int

public actual fun sceUsbStop(driverName: COpaquePointer?, size: Int, args: COpaquePointer?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceUsbStop(driverName?.value ?: 0L, size, args?.value ?: 0L)") as Int

public actual fun sceUsbActivate(pid: UInt): Int =
    js("require('@kotlinmania/libc-native-bindings').sceUsbActivate(pid)") as Int

public actual fun sceUsbDeactivate(pid: UInt): Int =
    js("require('@kotlinmania/libc-native-bindings').sceUsbDeactivate(pid)") as Int

public actual fun sceUsbGetState(): Int =
    js("require('@kotlinmania/libc-native-bindings').sceUsbGetState()") as Int

public actual fun sceUsbGetDrvState(driverName: COpaquePointer?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceUsbGetDrvState(driverName?.value ?: 0L)") as Int

public actual fun sceUsbCamSetupStill(param: UsbCamSetupStillParam?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceUsbCamSetupStill(param?.toLong() ?: 0L)") as Int

public actual fun sceUsbCamSetupStillEx(param: UsbCamSetupStillExParam?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceUsbCamSetupStillEx(param?.toLong() ?: 0L)") as Int

public actual fun sceUsbCamStillInputBlocking(buf: COpaquePointer?, size: ULong): Int =
    js("require('@kotlinmania/libc-native-bindings').sceUsbCamStillInputBlocking(buf?.value ?: 0L, size)") as Int

public actual fun sceUsbCamStillInput(buf: COpaquePointer?, size: ULong): Int =
    js("require('@kotlinmania/libc-native-bindings').sceUsbCamStillInput(buf?.value ?: 0L, size)") as Int

public actual fun sceUsbCamStillWaitInputEnd(): Int =
    js("require('@kotlinmania/libc-native-bindings').sceUsbCamStillWaitInputEnd()") as Int

public actual fun sceUsbCamStillPollInputEnd(): Int =
    js("require('@kotlinmania/libc-native-bindings').sceUsbCamStillPollInputEnd()") as Int

public actual fun sceUsbCamStillCancelInput(): Int =
    js("require('@kotlinmania/libc-native-bindings').sceUsbCamStillCancelInput()") as Int

public actual fun sceUsbCamStillGetInputLength(): Int =
    js("require('@kotlinmania/libc-native-bindings').sceUsbCamStillGetInputLength()") as Int

public actual fun sceUsbCamSetupVideo(param: UsbCamSetupVideoParam?, workArea: COpaquePointer?, workAreaSize: Int): Int =
    js("require('@kotlinmania/libc-native-bindings').sceUsbCamSetupVideo(param?.toLong() ?: 0L, workArea?.value ?: 0L, workAreaSize)") as Int

public actual fun sceUsbCamSetupVideoEx(param: UsbCamSetupVideoExParam?, workArea: COpaquePointer?, workAreaSize: Int): Int =
    js("require('@kotlinmania/libc-native-bindings').sceUsbCamSetupVideoEx(param?.toLong() ?: 0L, workArea?.value ?: 0L, workAreaSize)") as Int

public actual fun sceUsbCamStartVideo(): Int =
    js("require('@kotlinmania/libc-native-bindings').sceUsbCamStartVideo()") as Int

public actual fun sceUsbCamStopVideo(): Int =
    js("require('@kotlinmania/libc-native-bindings').sceUsbCamStopVideo()") as Int

public actual fun sceUsbCamReadVideoFrameBlocking(buf: COpaquePointer?, size: ULong): Int =
    js("require('@kotlinmania/libc-native-bindings').sceUsbCamReadVideoFrameBlocking(buf?.value ?: 0L, size)") as Int

public actual fun sceUsbCamReadVideoFrame(buf: COpaquePointer?, size: ULong): Int =
    js("require('@kotlinmania/libc-native-bindings').sceUsbCamReadVideoFrame(buf?.value ?: 0L, size)") as Int

public actual fun sceUsbCamWaitReadVideoFrameEnd(): Int =
    js("require('@kotlinmania/libc-native-bindings').sceUsbCamWaitReadVideoFrameEnd()") as Int

public actual fun sceUsbCamPollReadVideoFrameEnd(): Int =
    js("require('@kotlinmania/libc-native-bindings').sceUsbCamPollReadVideoFrameEnd()") as Int

public actual fun sceUsbCamGetReadVideoFrameSize(): Int =
    js("require('@kotlinmania/libc-native-bindings').sceUsbCamGetReadVideoFrameSize()") as Int

public actual fun sceUsbCamSetSaturation(saturation: Int): Int =
    js("require('@kotlinmania/libc-native-bindings').sceUsbCamSetSaturation(saturation)") as Int

public actual fun sceUsbCamSetBrightness(brightness: Int): Int =
    js("require('@kotlinmania/libc-native-bindings').sceUsbCamSetBrightness(brightness)") as Int

public actual fun sceUsbCamSetContrast(contrast: Int): Int =
    js("require('@kotlinmania/libc-native-bindings').sceUsbCamSetContrast(contrast)") as Int

public actual fun sceUsbCamSetSharpness(sharpness: Int): Int =
    js("require('@kotlinmania/libc-native-bindings').sceUsbCamSetSharpness(sharpness)") as Int

public actual fun sceUsbCamSetImageEffectMode(effectMode: UsbCamEffectMode): Int =
    js("require('@kotlinmania/libc-native-bindings').sceUsbCamSetImageEffectMode(effectMode)") as Int

public actual fun sceUsbCamSetEvLevel(exposureLevel: UsbCamEvLevel): Int =
    js("require('@kotlinmania/libc-native-bindings').sceUsbCamSetEvLevel(exposureLevel)") as Int

public actual fun sceUsbCamSetReverseMode(reverseFlags: Int): Int =
    js("require('@kotlinmania/libc-native-bindings').sceUsbCamSetReverseMode(reverseFlags)") as Int

public actual fun sceUsbCamSetZoom(zoom: Int): Int =
    js("require('@kotlinmania/libc-native-bindings').sceUsbCamSetZoom(zoom)") as Int

public actual fun sceUsbCamGetSaturation(saturation: Int?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceUsbCamGetSaturation(saturation?.toLong() ?: 0L)") as Int

public actual fun sceUsbCamGetBrightness(brightness: Int?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceUsbCamGetBrightness(brightness?.toLong() ?: 0L)") as Int

public actual fun sceUsbCamGetContrast(contrast: Int?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceUsbCamGetContrast(contrast?.toLong() ?: 0L)") as Int

public actual fun sceUsbCamGetSharpness(sharpness: Int?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceUsbCamGetSharpness(sharpness?.toLong() ?: 0L)") as Int

public actual fun sceUsbCamGetImageEffectMode(effectMode: UsbCamEffectMode?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceUsbCamGetImageEffectMode(effectMode?.toLong() ?: 0L)") as Int

public actual fun sceUsbCamGetEvLevel(exposureLevel: UsbCamEvLevel?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceUsbCamGetEvLevel(exposureLevel?.toLong() ?: 0L)") as Int

public actual fun sceUsbCamGetReverseMode(reverseFlags: Int?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceUsbCamGetReverseMode(reverseFlags?.toLong() ?: 0L)") as Int

public actual fun sceUsbCamGetZoom(zoom: Int?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceUsbCamGetZoom(zoom?.toLong() ?: 0L)") as Int

public actual fun sceUsbCamAutoImageReverseSW(on: Int): Int =
    js("require('@kotlinmania/libc-native-bindings').sceUsbCamAutoImageReverseSW(on)") as Int

public actual fun sceUsbCamGetAutoImageReverseState(): Int =
    js("require('@kotlinmania/libc-native-bindings').sceUsbCamGetAutoImageReverseState()") as Int

public actual fun sceUsbCamGetLensDirection(): Int =
    js("require('@kotlinmania/libc-native-bindings').sceUsbCamGetLensDirection()") as Int

public actual fun sceUsbstorBootRegisterNotify(eventFlag: SceUid): Int =
    js("require('@kotlinmania/libc-native-bindings').sceUsbstorBootRegisterNotify(eventFlag)") as Int

public actual fun sceUsbstorBootUnregisterNotify(eventFlag: UInt): Int =
    js("require('@kotlinmania/libc-native-bindings').sceUsbstorBootUnregisterNotify(eventFlag)") as Int

public actual fun sceUsbstorBootSetCapacity(size: UInt): Int =
    js("require('@kotlinmania/libc-native-bindings').sceUsbstorBootSetCapacity(size)") as Int

public actual fun scePowerRegisterCallback(slot: Int, cbid: SceUid): Int =
    js("require('@kotlinmania/libc-native-bindings').scePowerRegisterCallback(slot, cbid)") as Int

public actual fun scePowerUnregisterCallback(slot: Int): Int =
    js("require('@kotlinmania/libc-native-bindings').scePowerUnregisterCallback(slot)") as Int

public actual fun scePowerIsPowerOnline(): Int =
    js("require('@kotlinmania/libc-native-bindings').scePowerIsPowerOnline()") as Int

public actual fun scePowerIsBatteryExist(): Int =
    js("require('@kotlinmania/libc-native-bindings').scePowerIsBatteryExist()") as Int

public actual fun scePowerIsBatteryCharging(): Int =
    js("require('@kotlinmania/libc-native-bindings').scePowerIsBatteryCharging()") as Int

public actual fun scePowerGetBatteryChargingStatus(): Int =
    js("require('@kotlinmania/libc-native-bindings').scePowerGetBatteryChargingStatus()") as Int

public actual fun scePowerIsLowBattery(): Int =
    js("require('@kotlinmania/libc-native-bindings').scePowerIsLowBattery()") as Int

public actual fun scePowerGetBatteryLifePercent(): Int =
    js("require('@kotlinmania/libc-native-bindings').scePowerGetBatteryLifePercent()") as Int

public actual fun scePowerGetBatteryLifeTime(): Int =
    js("require('@kotlinmania/libc-native-bindings').scePowerGetBatteryLifeTime()") as Int

public actual fun scePowerGetBatteryTemp(): Int =
    js("require('@kotlinmania/libc-native-bindings').scePowerGetBatteryTemp()") as Int

public actual fun scePowerGetBatteryElec(): Int =
    js("require('@kotlinmania/libc-native-bindings').scePowerGetBatteryElec()") as Int

public actual fun scePowerGetBatteryVolt(): Int =
    js("require('@kotlinmania/libc-native-bindings').scePowerGetBatteryVolt()") as Int

public actual fun scePowerSetCpuClockFrequency(cpufreq: Int): Int =
    js("require('@kotlinmania/libc-native-bindings').scePowerSetCpuClockFrequency(cpufreq)") as Int

public actual fun scePowerSetBusClockFrequency(busfreq: Int): Int =
    js("require('@kotlinmania/libc-native-bindings').scePowerSetBusClockFrequency(busfreq)") as Int

public actual fun scePowerGetCpuClockFrequency(): Int =
    js("require('@kotlinmania/libc-native-bindings').scePowerGetCpuClockFrequency()") as Int

public actual fun scePowerGetCpuClockFrequencyInt(): Int =
    js("require('@kotlinmania/libc-native-bindings').scePowerGetCpuClockFrequencyInt()") as Int

public actual fun scePowerGetCpuClockFrequencyFloat(): Float =
    js("require('@kotlinmania/libc-native-bindings').scePowerGetCpuClockFrequencyFloat()") as Float

public actual fun scePowerGetBusClockFrequency(): Int =
    js("require('@kotlinmania/libc-native-bindings').scePowerGetBusClockFrequency()") as Int

public actual fun scePowerGetBusClockFrequencyInt(): Int =
    js("require('@kotlinmania/libc-native-bindings').scePowerGetBusClockFrequencyInt()") as Int

public actual fun scePowerGetBusClockFrequencyFloat(): Float =
    js("require('@kotlinmania/libc-native-bindings').scePowerGetBusClockFrequencyFloat()") as Float

public actual fun scePowerSetClockFrequency(pllfreq: Int, cpufreq: Int, busfreq: Int): Int =
    js("require('@kotlinmania/libc-native-bindings').scePowerSetClockFrequency(pllfreq, cpufreq, busfreq)") as Int

public actual fun scePowerLock(unknown: Int): Int =
    js("require('@kotlinmania/libc-native-bindings').scePowerLock(unknown)") as Int

public actual fun scePowerUnlock(unknown: Int): Int =
    js("require('@kotlinmania/libc-native-bindings').scePowerUnlock(unknown)") as Int

public actual fun scePowerTick(t: PowerTick): Int =
    js("require('@kotlinmania/libc-native-bindings').scePowerTick(t)") as Int

public actual fun scePowerGetIdleTimer(): Int =
    js("require('@kotlinmania/libc-native-bindings').scePowerGetIdleTimer()") as Int

public actual fun scePowerIdleTimerEnable(unknown: Int): Int =
    js("require('@kotlinmania/libc-native-bindings').scePowerIdleTimerEnable(unknown)") as Int

public actual fun scePowerIdleTimerDisable(unknown: Int): Int =
    js("require('@kotlinmania/libc-native-bindings').scePowerIdleTimerDisable(unknown)") as Int

public actual fun scePowerRequestStandby(): Int =
    js("require('@kotlinmania/libc-native-bindings').scePowerRequestStandby()") as Int

public actual fun scePowerRequestSuspend(): Int =
    js("require('@kotlinmania/libc-native-bindings').scePowerRequestSuspend()") as Int

public actual fun sceWlanDevIsPowerOn(): Int =
    js("require('@kotlinmania/libc-native-bindings').sceWlanDevIsPowerOn()") as Int

public actual fun sceWlanGetSwitchState(): Int =
    js("require('@kotlinmania/libc-native-bindings').sceWlanGetSwitchState()") as Int

public actual fun sceWlanGetEtherAddr(etherAddr: COpaquePointer?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceWlanGetEtherAddr(etherAddr?.value ?: 0L)") as Int

public actual fun sceWlanDevAttach(): Int =
    js("require('@kotlinmania/libc-native-bindings').sceWlanDevAttach()") as Int

public actual fun sceWlanDevDetach(): Int =
    js("require('@kotlinmania/libc-native-bindings').sceWlanDevDetach()") as Int

public actual fun sceRtcGetTickResolution(): UInt =
    js("require('@kotlinmania/libc-native-bindings').sceRtcGetTickResolution()") as UInt

public actual fun sceRtcGetCurrentTick(tick: ULong?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceRtcGetCurrentTick(tick?.toLong() ?: 0L)") as Int

public actual fun sceRtcGetCurrentClock(tm: ScePspDateTime?, tz: Int): Int =
    js("require('@kotlinmania/libc-native-bindings').sceRtcGetCurrentClock(tm?.toLong() ?: 0L, tz)") as Int

public actual fun sceRtcGetCurrentClockLocalTime(tm: ScePspDateTime?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceRtcGetCurrentClockLocalTime(tm?.toLong() ?: 0L)") as Int

public actual fun sceRtcConvertUtcToLocalTime(tickUtc: ULong?, tickLocal: ULong?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceRtcConvertUtcToLocalTime(tickUtc?.toLong() ?: 0L, tickLocal?.toLong() ?: 0L)") as Int

public actual fun sceRtcConvertLocalTimeToUTC(tickLocal: ULong?, tickUtc: ULong?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceRtcConvertLocalTimeToUTC(tickLocal?.toLong() ?: 0L, tickUtc?.toLong() ?: 0L)") as Int

public actual fun sceRtcIsLeapYear(year: Int): Int =
    js("require('@kotlinmania/libc-native-bindings').sceRtcIsLeapYear(year)") as Int

public actual fun sceRtcGetDaysInMonth(year: Int, month: Int): Int =
    js("require('@kotlinmania/libc-native-bindings').sceRtcGetDaysInMonth(year, month)") as Int

public actual fun sceRtcGetDayOfWeek(year: Int, month: Int, day: Int): Int =
    js("require('@kotlinmania/libc-native-bindings').sceRtcGetDayOfWeek(year, month, day)") as Int

public actual fun sceRtcCheckValid(date: ScePspDateTime?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceRtcCheckValid(date?.toLong() ?: 0L)") as Int

public actual fun sceRtcSetTick(date: ScePspDateTime?, tick: ULong?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceRtcSetTick(date?.toLong() ?: 0L, tick?.toLong() ?: 0L)") as Int

public actual fun sceRtcGetTick(date: ScePspDateTime?, tick: ULong?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceRtcGetTick(date?.toLong() ?: 0L, tick?.toLong() ?: 0L)") as Int

public actual fun sceRtcCompareTick(tick1: ULong?, tick2: ULong?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceRtcCompareTick(tick1?.toLong() ?: 0L, tick2?.toLong() ?: 0L)") as Int

public actual fun sceRtcTickAddTicks(destTick: ULong?, srcTick: ULong?, numTicks: ULong): Int =
    js("require('@kotlinmania/libc-native-bindings').sceRtcTickAddTicks(destTick?.toLong() ?: 0L, srcTick?.toLong() ?: 0L, numTicks)") as Int

public actual fun sceRtcTickAddMicroseconds(destTick: ULong?, srcTick: ULong?, numMs: ULong): Int =
    js("require('@kotlinmania/libc-native-bindings').sceRtcTickAddMicroseconds(destTick?.toLong() ?: 0L, srcTick?.toLong() ?: 0L, numMs)") as Int

public actual fun sceRtcTickAddSeconds(destTick: ULong?, srcTick: ULong?, numSeconds: ULong): Int =
    js("require('@kotlinmania/libc-native-bindings').sceRtcTickAddSeconds(destTick?.toLong() ?: 0L, srcTick?.toLong() ?: 0L, numSeconds)") as Int

public actual fun sceRtcTickAddMinutes(destTick: ULong?, srcTick: ULong?, numMinutes: ULong): Int =
    js("require('@kotlinmania/libc-native-bindings').sceRtcTickAddMinutes(destTick?.toLong() ?: 0L, srcTick?.toLong() ?: 0L, numMinutes)") as Int

public actual fun sceRtcTickAddHours(destTick: ULong?, srcTick: ULong?, numHours: ULong): Int =
    js("require('@kotlinmania/libc-native-bindings').sceRtcTickAddHours(destTick?.toLong() ?: 0L, srcTick?.toLong() ?: 0L, numHours)") as Int

public actual fun sceRtcTickAddDays(destTick: ULong?, srcTick: ULong?, numDays: ULong): Int =
    js("require('@kotlinmania/libc-native-bindings').sceRtcTickAddDays(destTick?.toLong() ?: 0L, srcTick?.toLong() ?: 0L, numDays)") as Int

public actual fun sceRtcTickAddWeeks(destTick: ULong?, srcTick: ULong?, numWeeks: ULong): Int =
    js("require('@kotlinmania/libc-native-bindings').sceRtcTickAddWeeks(destTick?.toLong() ?: 0L, srcTick?.toLong() ?: 0L, numWeeks)") as Int

public actual fun sceRtcTickAddMonths(destTick: ULong?, srcTick: ULong?, numMonths: ULong): Int =
    js("require('@kotlinmania/libc-native-bindings').sceRtcTickAddMonths(destTick?.toLong() ?: 0L, srcTick?.toLong() ?: 0L, numMonths)") as Int

public actual fun sceRtcTickAddYears(destTick: ULong?, srcTick: ULong?, numYears: ULong): Int =
    js("require('@kotlinmania/libc-native-bindings').sceRtcTickAddYears(destTick?.toLong() ?: 0L, srcTick?.toLong() ?: 0L, numYears)") as Int

public actual fun sceRtcSetTimeT(date: ScePspDateTime?, time: UInt): Int =
    js("require('@kotlinmania/libc-native-bindings').sceRtcSetTimeT(date?.toLong() ?: 0L, time)") as Int

public actual fun sceRtcGetTimeT(date: ScePspDateTime?, time: UInt?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceRtcGetTimeT(date?.toLong() ?: 0L, time?.toLong() ?: 0L)") as Int

public actual fun sceRtcSetTime64T(date: ScePspDateTime?, time: ULong): Int =
    js("require('@kotlinmania/libc-native-bindings').sceRtcSetTime64T(date?.toLong() ?: 0L, time)") as Int

public actual fun sceRtcGetTime64T(date: ScePspDateTime?, time: ULong?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceRtcGetTime64T(date?.toLong() ?: 0L, time?.toLong() ?: 0L)") as Int

public actual fun sceRtcSetDosTime(date: ScePspDateTime?, dosTime: UInt): Int =
    js("require('@kotlinmania/libc-native-bindings').sceRtcSetDosTime(date?.toLong() ?: 0L, dosTime)") as Int

public actual fun sceRtcGetDosTime(date: ScePspDateTime?, dosTime: UInt): Int =
    js("require('@kotlinmania/libc-native-bindings').sceRtcGetDosTime(date?.toLong() ?: 0L, dosTime)") as Int

public actual fun sceRtcSetWin32FileTime(date: ScePspDateTime?, time: ULong?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceRtcSetWin32FileTime(date?.toLong() ?: 0L, time?.toLong() ?: 0L)") as Int

public actual fun sceRtcGetWin32FileTime(date: ScePspDateTime?, time: ULong?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceRtcGetWin32FileTime(date?.toLong() ?: 0L, time?.toLong() ?: 0L)") as Int

public actual fun sceRtcParseDateTime(destTick: ULong?, dateString: COpaquePointer?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceRtcParseDateTime(destTick?.toLong() ?: 0L, dateString?.value ?: 0L)") as Int

public actual fun sceRtcFormatRFC3339(pszDateTime: COpaquePointer?, pUtc: ULong?, timeZoneMinutes: Int): Int =
    js("require('@kotlinmania/libc-native-bindings').sceRtcFormatRFC3339(pszDateTime?.value ?: 0L, pUtc?.toLong() ?: 0L, timeZoneMinutes)") as Int

public actual fun sceRtcFormatRFC3339LocalTime(pszDateTime: COpaquePointer?, pUtc: ULong?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceRtcFormatRFC3339LocalTime(pszDateTime?.value ?: 0L, pUtc?.toLong() ?: 0L)") as Int

public actual fun sceRtcParseRFC3339(pUtc: ULong?, pszDateTime: COpaquePointer?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceRtcParseRFC3339(pUtc?.toLong() ?: 0L, pszDateTime?.value ?: 0L)") as Int

public actual fun sceRtcFormatRFC2822(pszDateTime: COpaquePointer?, pUtc: ULong?, timeZoneMinutes: Int): Int =
    js("require('@kotlinmania/libc-native-bindings').sceRtcFormatRFC2822(pszDateTime?.value ?: 0L, pUtc?.toLong() ?: 0L, timeZoneMinutes)") as Int

public actual fun sceRtcFormatRFC2822LocalTime(pszDateTime: COpaquePointer?, pUtc: ULong?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceRtcFormatRFC2822LocalTime(pszDateTime?.value ?: 0L, pUtc?.toLong() ?: 0L)") as Int

public actual fun sceIoOpen(file: COpaquePointer?, flags: Int, permissions: IoPermissions): SceUid =
    js("require('@kotlinmania/libc-native-bindings').sceIoOpen(file?.value ?: 0L, flags, permissions)") as SceUid

public actual fun sceIoOpenAsync(file: COpaquePointer?, flags: Int, permissions: IoPermissions): SceUid =
    js("require('@kotlinmania/libc-native-bindings').sceIoOpenAsync(file?.value ?: 0L, flags, permissions)") as SceUid

public actual fun sceIoClose(fd: SceUid): Int =
    js("require('@kotlinmania/libc-native-bindings').sceIoClose(fd)") as Int

public actual fun sceIoCloseAsync(fd: SceUid): Int =
    js("require('@kotlinmania/libc-native-bindings').sceIoCloseAsync(fd)") as Int

public actual fun sceIoRead(fd: SceUid, data: COpaquePointer?, size: UInt): Int =
    js("require('@kotlinmania/libc-native-bindings').sceIoRead(fd, data?.value ?: 0L, size)") as Int

public actual fun sceIoReadAsync(fd: SceUid, data: COpaquePointer?, size: UInt): Int =
    js("require('@kotlinmania/libc-native-bindings').sceIoReadAsync(fd, data?.value ?: 0L, size)") as Int

public actual fun sceIoWrite(fd: SceUid, data: COpaquePointer?, size: ULong): Int =
    js("require('@kotlinmania/libc-native-bindings').sceIoWrite(fd, data?.value ?: 0L, size)") as Int

public actual fun sceIoWriteAsync(fd: SceUid, data: COpaquePointer?, size: UInt): Int =
    js("require('@kotlinmania/libc-native-bindings').sceIoWriteAsync(fd, data?.value ?: 0L, size)") as Int

public actual fun sceIoLseek(fd: SceUid, offset: Long, whence: IoWhence): Long =
    js("require('@kotlinmania/libc-native-bindings').sceIoLseek(fd, offset, whence)") as Long

public actual fun sceIoLseekAsync(fd: SceUid, offset: Long, whence: IoWhence): Int =
    js("require('@kotlinmania/libc-native-bindings').sceIoLseekAsync(fd, offset, whence)") as Int

public actual fun sceIoLseek32(fd: SceUid, offset: Int, whence: IoWhence): Int =
    js("require('@kotlinmania/libc-native-bindings').sceIoLseek32(fd, offset, whence)") as Int

public actual fun sceIoLseek32Async(fd: SceUid, offset: Int, whence: IoWhence): Int =
    js("require('@kotlinmania/libc-native-bindings').sceIoLseek32Async(fd, offset, whence)") as Int

public actual fun sceIoRemove(file: COpaquePointer?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceIoRemove(file?.value ?: 0L)") as Int

public actual fun sceIoMkdir(dir: COpaquePointer?, mode: IoPermissions): Int =
    js("require('@kotlinmania/libc-native-bindings').sceIoMkdir(dir?.value ?: 0L, mode)") as Int

public actual fun sceIoRmdir(path: COpaquePointer?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceIoRmdir(path?.value ?: 0L)") as Int

public actual fun sceIoChdir(path: COpaquePointer?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceIoChdir(path?.value ?: 0L)") as Int

public actual fun sceIoRename(oldname: COpaquePointer?, newname: COpaquePointer?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceIoRename(oldname?.value ?: 0L, newname?.value ?: 0L)") as Int

public actual fun sceIoDopen(dirname: COpaquePointer?): SceUid =
    js("require('@kotlinmania/libc-native-bindings').sceIoDopen(dirname?.value ?: 0L)") as SceUid

public actual fun sceIoDread(fd: SceUid, dir: SceIoDirent?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceIoDread(fd, dir?.toLong() ?: 0L)") as Int

public actual fun sceIoDclose(fd: SceUid): Int =
    js("require('@kotlinmania/libc-native-bindings').sceIoDclose(fd)") as Int

public actual fun sceIoDevctl(dev: COpaquePointer?, cmd: UInt, indata: COpaquePointer?, inlen: Int, outdata: COpaquePointer?, outlen: Int): Int =
    js("require('@kotlinmania/libc-native-bindings').sceIoDevctl(dev?.value ?: 0L, cmd, indata?.value ?: 0L, inlen, outdata?.value ?: 0L, outlen)") as Int

public actual fun sceIoAssign(dev1: COpaquePointer?, dev2: COpaquePointer?, dev3: COpaquePointer?, mode: IoAssignPerms, unk1: COpaquePointer?, unk2: Int): Int =
    js("require('@kotlinmania/libc-native-bindings').sceIoAssign(dev1?.value ?: 0L, dev2?.value ?: 0L, dev3?.value ?: 0L, mode, unk1?.value ?: 0L, unk2)") as Int

public actual fun sceIoUnassign(dev: COpaquePointer?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceIoUnassign(dev?.value ?: 0L)") as Int

public actual fun sceIoGetstat(file: COpaquePointer?, stat: SceIoStat?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceIoGetstat(file?.value ?: 0L, stat?.toLong() ?: 0L)") as Int

public actual fun sceIoChstat(file: COpaquePointer?, stat: SceIoStat?, bits: Int): Int =
    js("require('@kotlinmania/libc-native-bindings').sceIoChstat(file?.value ?: 0L, stat?.toLong() ?: 0L, bits)") as Int

public actual fun sceIoIoctl(fd: SceUid, cmd: UInt, indata: COpaquePointer?, inlen: Int, outdata: COpaquePointer?, outlen: Int): Int =
    js("require('@kotlinmania/libc-native-bindings').sceIoIoctl(fd, cmd, indata?.value ?: 0L, inlen, outdata?.value ?: 0L, outlen)") as Int

public actual fun sceIoIoctlAsync(fd: SceUid, cmd: UInt, indata: COpaquePointer?, inlen: Int, outdata: COpaquePointer?, outlen: Int): Int =
    js("require('@kotlinmania/libc-native-bindings').sceIoIoctlAsync(fd, cmd, indata?.value ?: 0L, inlen, outdata?.value ?: 0L, outlen)") as Int

public actual fun sceIoSync(device: COpaquePointer?, unk: UInt): Int =
    js("require('@kotlinmania/libc-native-bindings').sceIoSync(device?.value ?: 0L, unk)") as Int

public actual fun sceIoWaitAsync(fd: SceUid, res: Long?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceIoWaitAsync(fd, res?.toLong() ?: 0L)") as Int

public actual fun sceIoWaitAsyncCB(fd: SceUid, res: Long?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceIoWaitAsyncCB(fd, res?.toLong() ?: 0L)") as Int

public actual fun sceIoPollAsync(fd: SceUid, res: Long?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceIoPollAsync(fd, res?.toLong() ?: 0L)") as Int

public actual fun sceIoGetAsyncStat(fd: SceUid, poll: Int, res: Long?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceIoGetAsyncStat(fd, poll, res?.toLong() ?: 0L)") as Int

public actual fun sceIoCancel(fd: SceUid): Int =
    js("require('@kotlinmania/libc-native-bindings').sceIoCancel(fd)") as Int

public actual fun sceIoGetDevType(fd: SceUid): Int =
    js("require('@kotlinmania/libc-native-bindings').sceIoGetDevType(fd)") as Int

public actual fun sceIoChangeAsyncPriority(fd: SceUid, pri: Int): Int =
    js("require('@kotlinmania/libc-native-bindings').sceIoChangeAsyncPriority(fd, pri)") as Int

public actual fun sceIoSetAsyncCallback(fd: SceUid, cb: SceUid, argp: COpaquePointer?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceIoSetAsyncCallback(fd, cb, argp?.value ?: 0L)") as Int

public actual fun sceJpegInitMJpeg(): Int =
    js("require('@kotlinmania/libc-native-bindings').sceJpegInitMJpeg()") as Int

public actual fun sceJpegFinishMJpeg(): Int =
    js("require('@kotlinmania/libc-native-bindings').sceJpegFinishMJpeg()") as Int

public actual fun sceJpegCreateMJpeg(width: Int, height: Int): Int =
    js("require('@kotlinmania/libc-native-bindings').sceJpegCreateMJpeg(width, height)") as Int

public actual fun sceJpegDeleteMJpeg(): Int =
    js("require('@kotlinmania/libc-native-bindings').sceJpegDeleteMJpeg()") as Int

public actual fun sceJpegDecodeMJpeg(jpegBuf: COpaquePointer?, size: ULong, rgba: COpaquePointer?, unk: UInt): Int =
    js("require('@kotlinmania/libc-native-bindings').sceJpegDecodeMJpeg(jpegBuf?.value ?: 0L, size, rgba?.value ?: 0L, unk)") as Int

public actual fun sceUmdCheckMedium(): Int =
    js("require('@kotlinmania/libc-native-bindings').sceUmdCheckMedium()") as Int

public actual fun sceUmdGetDiscInfo(info: UmdInfo?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceUmdGetDiscInfo(info?.toLong() ?: 0L)") as Int

public actual fun sceUmdActivate(unit: Int, drive: COpaquePointer?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceUmdActivate(unit, drive?.value ?: 0L)") as Int

public actual fun sceUmdDeactivate(unit: Int, drive: COpaquePointer?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceUmdDeactivate(unit, drive?.value ?: 0L)") as Int

public actual fun sceUmdWaitDriveStat(state: Int): Int =
    js("require('@kotlinmania/libc-native-bindings').sceUmdWaitDriveStat(state)") as Int

public actual fun sceUmdWaitDriveStatWithTimer(state: Int, timeout: UInt): Int =
    js("require('@kotlinmania/libc-native-bindings').sceUmdWaitDriveStatWithTimer(state, timeout)") as Int

public actual fun sceUmdWaitDriveStatCB(state: Int, timeout: UInt): Int =
    js("require('@kotlinmania/libc-native-bindings').sceUmdWaitDriveStatCB(state, timeout)") as Int

public actual fun sceUmdCancelWaitDriveStat(): Int =
    js("require('@kotlinmania/libc-native-bindings').sceUmdCancelWaitDriveStat()") as Int

public actual fun sceUmdGetDriveStat(): Int =
    js("require('@kotlinmania/libc-native-bindings').sceUmdGetDriveStat()") as Int

public actual fun sceUmdGetErrorStat(): Int =
    js("require('@kotlinmania/libc-native-bindings').sceUmdGetErrorStat()") as Int

public actual fun sceUmdRegisterUMDCallBack(cbid: Int): Int =
    js("require('@kotlinmania/libc-native-bindings').sceUmdRegisterUMDCallBack(cbid)") as Int

public actual fun sceUmdUnRegisterUMDCallBack(cbid: Int): Int =
    js("require('@kotlinmania/libc-native-bindings').sceUmdUnRegisterUMDCallBack(cbid)") as Int

public actual fun sceUmdReplacePermit(): Int =
    js("require('@kotlinmania/libc-native-bindings').sceUmdReplacePermit()") as Int

public actual fun sceUmdReplaceProhibit(): Int =
    js("require('@kotlinmania/libc-native-bindings').sceUmdReplaceProhibit()") as Int

public actual fun sceMpegInit(): Int =
    js("require('@kotlinmania/libc-native-bindings').sceMpegInit()") as Int

public actual fun sceMpegFinish() {
    js("require('@kotlinmania/libc-native-bindings').sceMpegFinish()")
}

public actual fun sceMpegRingbufferQueryMemSize(packets: Int): Int =
    js("require('@kotlinmania/libc-native-bindings').sceMpegRingbufferQueryMemSize(packets)") as Int

public actual fun sceMpegRingbufferConstruct(ringbuffer: SceMpegRingbuffer?, packets: Int, data: COpaquePointer?, size: Int, callback: SceMpegRingbufferCb, cbParam: COpaquePointer?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceMpegRingbufferConstruct(ringbuffer?.toLong() ?: 0L, packets, data?.value ?: 0L, size, callback, cbParam?.value ?: 0L)") as Int

public actual fun sceMpegRingbufferDestruct(ringbuffer: SceMpegRingbuffer?) {
    js("require('@kotlinmania/libc-native-bindings').sceMpegRingbufferDestruct(ringbuffer?.toLong() ?: 0L)")
}

public actual fun sceMpegRingbufferAvailableSize(ringbuffer: SceMpegRingbuffer?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceMpegRingbufferAvailableSize(ringbuffer?.toLong() ?: 0L)") as Int

public actual fun sceMpegRingbufferPut(ringbuffer: SceMpegRingbuffer?, numPackets: Int, available: Int): Int =
    js("require('@kotlinmania/libc-native-bindings').sceMpegRingbufferPut(ringbuffer?.toLong() ?: 0L, numPackets, available)") as Int

public actual fun sceMpegQueryMemSize(unk: Int): Int =
    js("require('@kotlinmania/libc-native-bindings').sceMpegQueryMemSize(unk)") as Int

public actual fun sceMpegCreate(handle: SceMpeg, data: COpaquePointer?, size: Int, ringbuffer: SceMpegRingbuffer?, frameWidth: Int, unk1: Int, unk2: Int): Int =
    js("require('@kotlinmania/libc-native-bindings').sceMpegCreate(handle, data?.value ?: 0L, size, ringbuffer?.toLong() ?: 0L, frameWidth, unk1, unk2)") as Int

public actual fun sceMpegDelete(handle: SceMpeg) {
    js("require('@kotlinmania/libc-native-bindings').sceMpegDelete(handle)")
}

public actual fun sceMpegQueryStreamOffset(handle: SceMpeg, buffer: COpaquePointer?, offset: Int?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceMpegQueryStreamOffset(handle, buffer?.value ?: 0L, offset?.toLong() ?: 0L)") as Int

public actual fun sceMpegQueryStreamSize(buffer: COpaquePointer?, size: Int?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceMpegQueryStreamSize(buffer?.value ?: 0L, size?.toLong() ?: 0L)") as Int

public actual fun sceMpegRegistStream(handle: SceMpeg, streamId: Int, unk: Int): SceMpegStream =
    js("require('@kotlinmania/libc-native-bindings').sceMpegRegistStream(handle, streamId, unk)") as SceMpegStream

public actual fun sceMpegUnRegistStream(handle: SceMpeg, stream: SceMpegStream) {
    js("require('@kotlinmania/libc-native-bindings').sceMpegUnRegistStream(handle, stream)")
}

public actual fun sceMpegFlushAllStream(handle: SceMpeg): Int =
    js("require('@kotlinmania/libc-native-bindings').sceMpegFlushAllStream(handle)") as Int

public actual fun sceMpegMallocAvcEsBuf(handle: SceMpeg): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').sceMpegMallocAvcEsBuf(handle)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun sceMpegFreeAvcEsBuf(handle: SceMpeg, buf: COpaquePointer?) {
    js("require('@kotlinmania/libc-native-bindings').sceMpegFreeAvcEsBuf(handle, buf?.value ?: 0L)")
}

public actual fun sceMpegQueryAtracEsSize(handle: SceMpeg, esSize: Int?, outSize: Int?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceMpegQueryAtracEsSize(handle, esSize?.toLong() ?: 0L, outSize?.toLong() ?: 0L)") as Int

public actual fun sceMpegInitAu(handle: SceMpeg, esBuffer: COpaquePointer?, au: SceMpegAu?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceMpegInitAu(handle, esBuffer?.value ?: 0L, au?.toLong() ?: 0L)") as Int

public actual fun sceMpegGetAvcAu(handle: SceMpeg, stream: SceMpegStream, au: SceMpegAu?, unk: Int?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceMpegGetAvcAu(handle, stream, au?.toLong() ?: 0L, unk?.toLong() ?: 0L)") as Int

public actual fun sceMpegAvcDecodeMode(handle: SceMpeg, mode: SceMpegAvcMode?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceMpegAvcDecodeMode(handle, mode?.toLong() ?: 0L)") as Int

public actual fun sceMpegAvcDecode(handle: SceMpeg, au: SceMpegAu?, iframeWidth: Int, buffer: COpaquePointer?, init: Int?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceMpegAvcDecode(handle, au?.toLong() ?: 0L, iframeWidth, buffer?.value ?: 0L, init?.toLong() ?: 0L)") as Int

public actual fun sceMpegAvcDecodeStop(handle: SceMpeg, frameWidth: Int, buffer: COpaquePointer?, status: Int?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceMpegAvcDecodeStop(handle, frameWidth, buffer?.value ?: 0L, status?.toLong() ?: 0L)") as Int

public actual fun sceMpegGetAtracAu(handle: SceMpeg, stream: SceMpegStream, au: SceMpegAu?, unk: COpaquePointer?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceMpegGetAtracAu(handle, stream, au?.toLong() ?: 0L, unk?.value ?: 0L)") as Int

public actual fun sceMpegAtracDecode(handle: SceMpeg, au: SceMpegAu?, buffer: COpaquePointer?, init: Int): Int =
    js("require('@kotlinmania/libc-native-bindings').sceMpegAtracDecode(handle, au?.toLong() ?: 0L, buffer?.value ?: 0L, init)") as Int

public actual fun sceMpegBaseYCrCbCopyVme(yuvBuffer: COpaquePointer?, buffer: Int?, type: Int): Int =
    js("require('@kotlinmania/libc-native-bindings').sceMpegBaseYCrCbCopyVme(yuvBuffer?.value ?: 0L, buffer?.toLong() ?: 0L, type)") as Int

public actual fun sceMpegBaseCscInit(width: Int): Int =
    js("require('@kotlinmania/libc-native-bindings').sceMpegBaseCscInit(width)") as Int

public actual fun sceMpegBaseCscVme(rgbBuffer: COpaquePointer?, rgbBuffer2: COpaquePointer?, width: Int, yCrCbBuffer: SceMpegYCrCbBuffer?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceMpegBaseCscVme(rgbBuffer?.value ?: 0L, rgbBuffer2?.value ?: 0L, width, yCrCbBuffer?.toLong() ?: 0L)") as Int

public actual fun sceMpegbaseBea18f91(lli: SceMpegLLI?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceMpegbaseBea18f91(lli?.toLong() ?: 0L)") as Int

public actual fun sceHprmPeekCurrentKey(key: Int?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceHprmPeekCurrentKey(key?.toLong() ?: 0L)") as Int

public actual fun sceHprmPeekLatch(latch: List<UInt>?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceHprmPeekLatch(latch?.toLong() ?: 0L)") as Int

public actual fun sceHprmReadLatch(latch: List<UInt>?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceHprmReadLatch(latch?.toLong() ?: 0L)") as Int

public actual fun sceHprmIsHeadphoneExist(): Int =
    js("require('@kotlinmania/libc-native-bindings').sceHprmIsHeadphoneExist()") as Int

public actual fun sceHprmIsRemoteExist(): Int =
    js("require('@kotlinmania/libc-native-bindings').sceHprmIsRemoteExist()") as Int

public actual fun sceHprmIsMicrophoneExist(): Int =
    js("require('@kotlinmania/libc-native-bindings').sceHprmIsMicrophoneExist()") as Int

public actual fun sceGuDepthBuffer(zbp: COpaquePointer?, zbw: Int) {
    js("require('@kotlinmania/libc-native-bindings').sceGuDepthBuffer(zbp?.value ?: 0L, zbw)")
}

public actual fun sceGuDispBuffer(width: Int, height: Int, dispbp: COpaquePointer?, dispbw: Int) {
    js("require('@kotlinmania/libc-native-bindings').sceGuDispBuffer(width, height, dispbp?.value ?: 0L, dispbw)")
}

public actual fun sceGuDrawBuffer(psm: DisplayPixelFormat, fbp: COpaquePointer?, fbw: Int) {
    js("require('@kotlinmania/libc-native-bindings').sceGuDrawBuffer(psm, fbp?.value ?: 0L, fbw)")
}

public actual fun sceGuDrawBufferList(psm: DisplayPixelFormat, fbp: COpaquePointer?, fbw: Int) {
    js("require('@kotlinmania/libc-native-bindings').sceGuDrawBufferList(psm, fbp?.value ?: 0L, fbw)")
}

public actual fun sceGuDisplay(state: Boolean): Boolean =
    js("require('@kotlinmania/libc-native-bindings').sceGuDisplay(state)") as Boolean

public actual fun sceGuDepthFunc(function: DepthFunc) {
    js("require('@kotlinmania/libc-native-bindings').sceGuDepthFunc(function)")
}

public actual fun sceGuDepthMask(mask: Int) {
    js("require('@kotlinmania/libc-native-bindings').sceGuDepthMask(mask)")
}

public actual fun sceGuDepthOffset(offset: Int) {
    js("require('@kotlinmania/libc-native-bindings').sceGuDepthOffset(offset)")
}

public actual fun sceGuDepthRange(near: Int, far: Int) {
    js("require('@kotlinmania/libc-native-bindings').sceGuDepthRange(near, far)")
}

public actual fun sceGuFog(near: Float, far: Float, color: UInt) {
    js("require('@kotlinmania/libc-native-bindings').sceGuFog(near, far, color)")
}

public actual fun sceGuInit() {
    js("require('@kotlinmania/libc-native-bindings').sceGuInit()")
}

public actual fun sceGuTerm() {
    js("require('@kotlinmania/libc-native-bindings').sceGuTerm()")
}

public actual fun sceGuBreak(mode: Int) {
    js("require('@kotlinmania/libc-native-bindings').sceGuBreak(mode)")
}

public actual fun sceGuContinue() {
    js("require('@kotlinmania/libc-native-bindings').sceGuContinue()")
}

public actual fun sceGuSetCallback(signal: GuCallbackId, callback: GuCallback): GuCallback =
    js("require('@kotlinmania/libc-native-bindings').sceGuSetCallback(signal, callback)") as GuCallback

public actual fun sceGuSignal(behavior: SignalBehavior, signal: Int) {
    js("require('@kotlinmania/libc-native-bindings').sceGuSignal(behavior, signal)")
}

public actual fun sceGuSendCommandf(cmd: GeCommand, argument: Float) {
    js("require('@kotlinmania/libc-native-bindings').sceGuSendCommandf(cmd, argument)")
}

public actual fun sceGuSendCommandi(cmd: GeCommand, argument: Int) {
    js("require('@kotlinmania/libc-native-bindings').sceGuSendCommandi(cmd, argument)")
}

public actual fun sceGuGetMemory(size: Int): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').sceGuGetMemory(size)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun sceGuStart(contextType: GuContextType, list: COpaquePointer?) {
    js("require('@kotlinmania/libc-native-bindings').sceGuStart(contextType, list?.value ?: 0L)")
}

public actual fun sceGuFinish(): Int =
    js("require('@kotlinmania/libc-native-bindings').sceGuFinish()") as Int

public actual fun sceGuFinishId(id: UInt): Int =
    js("require('@kotlinmania/libc-native-bindings').sceGuFinishId(id)") as Int

public actual fun sceGuCallList(list: COpaquePointer?) {
    js("require('@kotlinmania/libc-native-bindings').sceGuCallList(list?.value ?: 0L)")
}

public actual fun sceGuCallMode(mode: Int) {
    js("require('@kotlinmania/libc-native-bindings').sceGuCallMode(mode)")
}

public actual fun sceGuCheckList(): Int =
    js("require('@kotlinmania/libc-native-bindings').sceGuCheckList()") as Int

public actual fun sceGuSendList(mode: GuQueueMode, list: COpaquePointer?, context: GeContext?) {
    js("require('@kotlinmania/libc-native-bindings').sceGuSendList(mode, list?.value ?: 0L, context?.toLong() ?: 0L)")
}

public actual fun sceGuSwapBuffers(): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').sceGuSwapBuffers()") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun sceGuSync(mode: GuSyncMode, behavior: GuSyncBehavior): GeListState =
    js("require('@kotlinmania/libc-native-bindings').sceGuSync(mode, behavior)") as GeListState

public actual fun sceGuDrawArray(prim: GuPrimitive, vtype: Int, count: Int, indices: COpaquePointer?, vertices: COpaquePointer?) {
    js("require('@kotlinmania/libc-native-bindings').sceGuDrawArray(prim, vtype, count, indices?.value ?: 0L, vertices?.value ?: 0L)")
}

public actual fun sceGuBeginObject(vtype: Int, count: Int, indices: COpaquePointer?, vertices: COpaquePointer?) {
    js("require('@kotlinmania/libc-native-bindings').sceGuBeginObject(vtype, count, indices?.value ?: 0L, vertices?.value ?: 0L)")
}

public actual fun sceGuEndObject() {
    js("require('@kotlinmania/libc-native-bindings').sceGuEndObject()")
}

public actual fun sceGuSetStatus(state: GuState, status: Int) {
    js("require('@kotlinmania/libc-native-bindings').sceGuSetStatus(state, status)")
}

public actual fun sceGuGetStatus(state: GuState): Boolean =
    js("require('@kotlinmania/libc-native-bindings').sceGuGetStatus(state)") as Boolean

public actual fun sceGuSetAllStatus(status: Int) {
    js("require('@kotlinmania/libc-native-bindings').sceGuSetAllStatus(status)")
}

public actual fun sceGuGetAllStatus(): Int =
    js("require('@kotlinmania/libc-native-bindings').sceGuGetAllStatus()") as Int

public actual fun sceGuEnable(state: GuState) {
    js("require('@kotlinmania/libc-native-bindings').sceGuEnable(state)")
}

public actual fun sceGuDisable(state: GuState) {
    js("require('@kotlinmania/libc-native-bindings').sceGuDisable(state)")
}

public actual fun sceGuLight(light: Int, type: LightType, components: Int, position: ScePspFVector3) {
    js("require('@kotlinmania/libc-native-bindings').sceGuLight(light, type, components, position)")
}

public actual fun sceGuLightAtt(light: Int, atten0: Float, atten1: Float, atten2: Float) {
    js("require('@kotlinmania/libc-native-bindings').sceGuLightAtt(light, atten0, atten1, atten2)")
}

public actual fun sceGuLightColor(light: Int, component: Int, color: UInt) {
    js("require('@kotlinmania/libc-native-bindings').sceGuLightColor(light, component, color)")
}

public actual fun sceGuLightMode(mode: LightMode) {
    js("require('@kotlinmania/libc-native-bindings').sceGuLightMode(mode)")
}

public actual fun sceGuLightSpot(light: Int, direction: ScePspFVector3, exponent: Float, cutoff: Float) {
    js("require('@kotlinmania/libc-native-bindings').sceGuLightSpot(light, direction, exponent, cutoff)")
}

public actual fun sceGuClear(flags: Int) {
    js("require('@kotlinmania/libc-native-bindings').sceGuClear(flags)")
}

public actual fun sceGuClearColor(color: UInt) {
    js("require('@kotlinmania/libc-native-bindings').sceGuClearColor(color)")
}

public actual fun sceGuClearDepth(depth: UInt) {
    js("require('@kotlinmania/libc-native-bindings').sceGuClearDepth(depth)")
}

public actual fun sceGuClearStencil(stencil: UInt) {
    js("require('@kotlinmania/libc-native-bindings').sceGuClearStencil(stencil)")
}

public actual fun sceGuPixelMask(mask: UInt) {
    js("require('@kotlinmania/libc-native-bindings').sceGuPixelMask(mask)")
}

public actual fun sceGuColor(color: UInt) {
    js("require('@kotlinmania/libc-native-bindings').sceGuColor(color)")
}

public actual fun sceGuColorFunc(func: ColorFunc, color: UInt, mask: UInt) {
    js("require('@kotlinmania/libc-native-bindings').sceGuColorFunc(func, color, mask)")
}

public actual fun sceGuColorMaterial(components: Int) {
    js("require('@kotlinmania/libc-native-bindings').sceGuColorMaterial(components)")
}

public actual fun sceGuAlphaFunc(func: AlphaFunc, value: Int, mask: Int) {
    js("require('@kotlinmania/libc-native-bindings').sceGuAlphaFunc(func, value, mask)")
}

public actual fun sceGuAmbient(color: UInt) {
    js("require('@kotlinmania/libc-native-bindings').sceGuAmbient(color)")
}

public actual fun sceGuAmbientColor(color: UInt) {
    js("require('@kotlinmania/libc-native-bindings').sceGuAmbientColor(color)")
}

public actual fun sceGuBlendFunc(op: BlendOp, src: BlendSrc, dest: BlendDst, srcFix: UInt, destFix: UInt) {
    js("require('@kotlinmania/libc-native-bindings').sceGuBlendFunc(op, src, dest, srcFix, destFix)")
}

public actual fun sceGuMaterial(components: Int, color: UInt) {
    js("require('@kotlinmania/libc-native-bindings').sceGuMaterial(components, color)")
}

public actual fun sceGuModelColor(emissive: UInt, ambient: UInt, diffuse: UInt, specular: UInt) {
    js("require('@kotlinmania/libc-native-bindings').sceGuModelColor(emissive, ambient, diffuse, specular)")
}

public actual fun sceGuStencilFunc(func: StencilFunc, ref: Int, mask: Int) {
    js("require('@kotlinmania/libc-native-bindings').sceGuStencilFunc(func, ref, mask)")
}

public actual fun sceGuStencilOp(fail: StencilOperation, zfail: StencilOperation, zpass: StencilOperation) {
    js("require('@kotlinmania/libc-native-bindings').sceGuStencilOp(fail, zfail, zpass)")
}

public actual fun sceGuSpecular(power: Float) {
    js("require('@kotlinmania/libc-native-bindings').sceGuSpecular(power)")
}

public actual fun sceGuFrontFace(order: FrontFaceDirection) {
    js("require('@kotlinmania/libc-native-bindings').sceGuFrontFace(order)")
}

public actual fun sceGuLogicalOp(op: LogicalOperation) {
    js("require('@kotlinmania/libc-native-bindings').sceGuLogicalOp(op)")
}

public actual fun sceGuSetDither(matrix: ScePspIMatrix4) {
    js("require('@kotlinmania/libc-native-bindings').sceGuSetDither(matrix)")
}

public actual fun sceGuShadeModel(mode: ShadingModel) {
    js("require('@kotlinmania/libc-native-bindings').sceGuShadeModel(mode)")
}

public actual fun sceGuCopyImage(psm: DisplayPixelFormat, sx: Int, sy: Int, width: Int, height: Int, srcw: Int, src: COpaquePointer?, dx: Int, dy: Int, destw: Int, dest: COpaquePointer?) {
    js("require('@kotlinmania/libc-native-bindings').sceGuCopyImage(psm, sx, sy, width, height, srcw, src?.value ?: 0L, dx, dy, destw, dest?.value ?: 0L)")
}

public actual fun sceGuTexEnvColor(color: UInt) {
    js("require('@kotlinmania/libc-native-bindings').sceGuTexEnvColor(color)")
}

public actual fun sceGuTexFilter(min: TextureFilter, mag: TextureFilter) {
    js("require('@kotlinmania/libc-native-bindings').sceGuTexFilter(min, mag)")
}

public actual fun sceGuTexFlush() {
    js("require('@kotlinmania/libc-native-bindings').sceGuTexFlush()")
}

public actual fun sceGuTexFunc(tfx: TextureEffect, tcc: TextureColorComponent) {
    js("require('@kotlinmania/libc-native-bindings').sceGuTexFunc(tfx, tcc)")
}

public actual fun sceGuTexImage(mipmap: MipmapLevel, width: Int, height: Int, tbw: Int, tbp: COpaquePointer?) {
    js("require('@kotlinmania/libc-native-bindings').sceGuTexImage(mipmap, width, height, tbw, tbp?.value ?: 0L)")
}

public actual fun sceGuTexLevelMode(mode: TextureLevelMode, bias: Float) {
    js("require('@kotlinmania/libc-native-bindings').sceGuTexLevelMode(mode, bias)")
}

public actual fun sceGuTexMapMode(mode: TextureMapMode, a1: UInt, a2: UInt) {
    js("require('@kotlinmania/libc-native-bindings').sceGuTexMapMode(mode, a1, a2)")
}

public actual fun sceGuTexMode(tpsm: TexturePixelFormat, maxmips: Int, a2: Int, swizzle: Int) {
    js("require('@kotlinmania/libc-native-bindings').sceGuTexMode(tpsm, maxmips, a2, swizzle)")
}

public actual fun sceGuTexOffset(u: Float, v: Float) {
    js("require('@kotlinmania/libc-native-bindings').sceGuTexOffset(u, v)")
}

public actual fun sceGuTexProjMapMode(mode: TextureProjectionMapMode) {
    js("require('@kotlinmania/libc-native-bindings').sceGuTexProjMapMode(mode)")
}

public actual fun sceGuTexScale(u: Float, v: Float) {
    js("require('@kotlinmania/libc-native-bindings').sceGuTexScale(u, v)")
}

public actual fun sceGuTexSlope(slope: Float) {
    js("require('@kotlinmania/libc-native-bindings').sceGuTexSlope(slope)")
}

public actual fun sceGuTexSync() {
    js("require('@kotlinmania/libc-native-bindings').sceGuTexSync()")
}

public actual fun sceGuTexWrap(u: GuTexWrapMode, v: GuTexWrapMode) {
    js("require('@kotlinmania/libc-native-bindings').sceGuTexWrap(u, v)")
}

public actual fun sceGuClutLoad(numBlocks: Int, cbp: COpaquePointer?) {
    js("require('@kotlinmania/libc-native-bindings').sceGuClutLoad(numBlocks, cbp?.value ?: 0L)")
}

public actual fun sceGuClutMode(cpsm: ClutPixelFormat, shift: UInt, mask: UInt, a3: UInt) {
    js("require('@kotlinmania/libc-native-bindings').sceGuClutMode(cpsm, shift, mask, a3)")
}

public actual fun sceGuOffset(x: UInt, y: UInt) {
    js("require('@kotlinmania/libc-native-bindings').sceGuOffset(x, y)")
}

public actual fun sceGuScissor(x: Int, y: Int, w: Int, h: Int) {
    js("require('@kotlinmania/libc-native-bindings').sceGuScissor(x, y, w, h)")
}

public actual fun sceGuViewport(cx: Int, cy: Int, width: Int, height: Int) {
    js("require('@kotlinmania/libc-native-bindings').sceGuViewport(cx, cy, width, height)")
}

public actual fun sceGuDrawBezier(vType: Int, uCount: Int, vCount: Int, indices: COpaquePointer?, vertices: COpaquePointer?) {
    js("require('@kotlinmania/libc-native-bindings').sceGuDrawBezier(vType, uCount, vCount, indices?.value ?: 0L, vertices?.value ?: 0L)")
}

public actual fun sceGuPatchDivide(ulevel: UInt, vlevel: UInt) {
    js("require('@kotlinmania/libc-native-bindings').sceGuPatchDivide(ulevel, vlevel)")
}

public actual fun sceGuPatchFrontFace(a0: UInt) {
    js("require('@kotlinmania/libc-native-bindings').sceGuPatchFrontFace(a0)")
}

public actual fun sceGuPatchPrim(prim: PatchPrimitive) {
    js("require('@kotlinmania/libc-native-bindings').sceGuPatchPrim(prim)")
}

public actual fun sceGuDrawSpline(vType: Int, uCount: Int, vCount: Int, uEdge: Int, vEdge: Int, indices: COpaquePointer?, vertices: COpaquePointer?) {
    js("require('@kotlinmania/libc-native-bindings').sceGuDrawSpline(vType, uCount, vCount, uEdge, vEdge, indices?.value ?: 0L, vertices?.value ?: 0L)")
}

public actual fun sceGuSetMatrix(type: MatrixMode, matrix: ScePspFMatrix4) {
    js("require('@kotlinmania/libc-native-bindings').sceGuSetMatrix(type, matrix)")
}

public actual fun sceGuBoneMatrix(index: UInt, matrix: ScePspFMatrix4) {
    js("require('@kotlinmania/libc-native-bindings').sceGuBoneMatrix(index, matrix)")
}

public actual fun sceGuMorphWeight(index: Int, weight: Float) {
    js("require('@kotlinmania/libc-native-bindings').sceGuMorphWeight(index, weight)")
}

public actual fun sceGuDrawArrayN(primitiveType: GuPrimitive, vType: Int, count: Int, a3: Int, indices: COpaquePointer?, vertices: COpaquePointer?) {
    js("require('@kotlinmania/libc-native-bindings').sceGuDrawArrayN(primitiveType, vType, count, a3, indices?.value ?: 0L, vertices?.value ?: 0L)")
}

public actual fun sceGumDrawArray(prim: GuPrimitive, vType: Int, count: Int, indices: COpaquePointer?, vertices: COpaquePointer?) {
    js("require('@kotlinmania/libc-native-bindings').sceGumDrawArray(prim, vType, count, indices?.value ?: 0L, vertices?.value ?: 0L)")
}

public actual fun sceGumDrawArrayN(prim: GuPrimitive, vType: Int, count: Int, a3: Int, indices: COpaquePointer?, vertices: COpaquePointer?) {
    js("require('@kotlinmania/libc-native-bindings').sceGumDrawArrayN(prim, vType, count, a3, indices?.value ?: 0L, vertices?.value ?: 0L)")
}

public actual fun sceGumDrawBezier(vType: Int, uCount: Int, vCount: Int, indices: COpaquePointer?, vertices: COpaquePointer?) {
    js("require('@kotlinmania/libc-native-bindings').sceGumDrawBezier(vType, uCount, vCount, indices?.value ?: 0L, vertices?.value ?: 0L)")
}

public actual fun sceGumDrawSpline(vType: Int, uCount: Int, vCount: Int, uEdge: Int, vEdge: Int, indices: COpaquePointer?, vertices: COpaquePointer?) {
    js("require('@kotlinmania/libc-native-bindings').sceGumDrawSpline(vType, uCount, vCount, uEdge, vEdge, indices?.value ?: 0L, vertices?.value ?: 0L)")
}

public actual fun sceGumFastInverse() {
    js("require('@kotlinmania/libc-native-bindings').sceGumFastInverse()")
}

public actual fun sceGumFullInverse() {
    js("require('@kotlinmania/libc-native-bindings').sceGumFullInverse()")
}

public actual fun sceGumLoadIdentity() {
    js("require('@kotlinmania/libc-native-bindings').sceGumLoadIdentity()")
}

public actual fun sceGumLoadMatrix(m: ScePspFMatrix4) {
    js("require('@kotlinmania/libc-native-bindings').sceGumLoadMatrix(m)")
}

public actual fun sceGumLookAt(eye: ScePspFVector3, center: ScePspFVector3, up: ScePspFVector3) {
    js("require('@kotlinmania/libc-native-bindings').sceGumLookAt(eye, center, up)")
}

public actual fun sceGumMatrixMode(mode: MatrixMode) {
    js("require('@kotlinmania/libc-native-bindings').sceGumMatrixMode(mode)")
}

public actual fun sceGumMultMatrix(m: ScePspFMatrix4) {
    js("require('@kotlinmania/libc-native-bindings').sceGumMultMatrix(m)")
}

public actual fun sceGumOrtho(left: Float, right: Float, bottom: Float, top: Float, near: Float, far: Float) {
    js("require('@kotlinmania/libc-native-bindings').sceGumOrtho(left, right, bottom, top, near, far)")
}

public actual fun sceGumPerspective(fovy: Float, aspect: Float, near: Float, far: Float) {
    js("require('@kotlinmania/libc-native-bindings').sceGumPerspective(fovy, aspect, near, far)")
}

public actual fun sceGumPopMatrix() {
    js("require('@kotlinmania/libc-native-bindings').sceGumPopMatrix()")
}

public actual fun sceGumPushMatrix() {
    js("require('@kotlinmania/libc-native-bindings').sceGumPushMatrix()")
}

public actual fun sceGumRotateX(angle: Float) {
    js("require('@kotlinmania/libc-native-bindings').sceGumRotateX(angle)")
}

public actual fun sceGumRotateY(angle: Float) {
    js("require('@kotlinmania/libc-native-bindings').sceGumRotateY(angle)")
}

public actual fun sceGumRotateZ(angle: Float) {
    js("require('@kotlinmania/libc-native-bindings').sceGumRotateZ(angle)")
}

public actual fun sceGumRotateXYZ(v: ScePspFVector3) {
    js("require('@kotlinmania/libc-native-bindings').sceGumRotateXYZ(v)")
}

public actual fun sceGumRotateZYX(v: ScePspFVector3) {
    js("require('@kotlinmania/libc-native-bindings').sceGumRotateZYX(v)")
}

public actual fun sceGumScale(v: ScePspFVector3) {
    js("require('@kotlinmania/libc-native-bindings').sceGumScale(v)")
}

public actual fun sceGumStoreMatrix(m: ScePspFMatrix4) {
    js("require('@kotlinmania/libc-native-bindings').sceGumStoreMatrix(m)")
}

public actual fun sceGumTranslate(v: ScePspFVector3) {
    js("require('@kotlinmania/libc-native-bindings').sceGumTranslate(v)")
}

public actual fun sceGumUpdateMatrix() {
    js("require('@kotlinmania/libc-native-bindings').sceGumUpdateMatrix()")
}

public actual fun sceMp3ReserveMp3Handle(args: SceMp3InitArg?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceMp3ReserveMp3Handle(args?.toLong() ?: 0L)") as Int

public actual fun sceMp3ReleaseMp3Handle(handle: Mp3Handle): Int =
    js("require('@kotlinmania/libc-native-bindings').sceMp3ReleaseMp3Handle(handle)") as Int

public actual fun sceMp3InitResource(): Int =
    js("require('@kotlinmania/libc-native-bindings').sceMp3InitResource()") as Int

public actual fun sceMp3TermResource(): Int =
    js("require('@kotlinmania/libc-native-bindings').sceMp3TermResource()") as Int

public actual fun sceMp3Init(handle: Mp3Handle): Int =
    js("require('@kotlinmania/libc-native-bindings').sceMp3Init(handle)") as Int

public actual fun sceMp3Decode(handle: Mp3Handle, dst: COpaquePointer?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceMp3Decode(handle, dst?.value ?: 0L)") as Int

public actual fun sceMp3GetInfoToAddStreamData(handle: Mp3Handle, dst: COpaquePointer?, toWrite: Int?, srcPos: Int?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceMp3GetInfoToAddStreamData(handle, dst?.value ?: 0L, toWrite?.toLong() ?: 0L, srcPos?.toLong() ?: 0L)") as Int

public actual fun sceMp3NotifyAddStreamData(handle: Mp3Handle, size: Int): Int =
    js("require('@kotlinmania/libc-native-bindings').sceMp3NotifyAddStreamData(handle, size)") as Int

public actual fun sceMp3CheckStreamDataNeeded(handle: Mp3Handle): Int =
    js("require('@kotlinmania/libc-native-bindings').sceMp3CheckStreamDataNeeded(handle)") as Int

public actual fun sceMp3SetLoopNum(handle: Mp3Handle, loop: Int): Int =
    js("require('@kotlinmania/libc-native-bindings').sceMp3SetLoopNum(handle, loop)") as Int

public actual fun sceMp3GetLoopNum(handle: Mp3Handle): Int =
    js("require('@kotlinmania/libc-native-bindings').sceMp3GetLoopNum(handle)") as Int

public actual fun sceMp3GetSumDecodedSample(handle: Mp3Handle): Int =
    js("require('@kotlinmania/libc-native-bindings').sceMp3GetSumDecodedSample(handle)") as Int

public actual fun sceMp3GetMaxOutputSample(handle: Mp3Handle): Int =
    js("require('@kotlinmania/libc-native-bindings').sceMp3GetMaxOutputSample(handle)") as Int

public actual fun sceMp3GetSamplingRate(handle: Mp3Handle): Int =
    js("require('@kotlinmania/libc-native-bindings').sceMp3GetSamplingRate(handle)") as Int

public actual fun sceMp3GetBitRate(handle: Mp3Handle): Int =
    js("require('@kotlinmania/libc-native-bindings').sceMp3GetBitRate(handle)") as Int

public actual fun sceMp3GetMp3ChannelNum(handle: Mp3Handle): Int =
    js("require('@kotlinmania/libc-native-bindings').sceMp3GetMp3ChannelNum(handle)") as Int

public actual fun sceMp3ResetPlayPosition(handle: Mp3Handle): Int =
    js("require('@kotlinmania/libc-native-bindings').sceMp3ResetPlayPosition(handle)") as Int

public actual fun sceRegOpenRegistry(reg: Key?, mode: Int, handle: RegHandle?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceRegOpenRegistry(reg?.toLong() ?: 0L, mode, handle?.toLong() ?: 0L)") as Int

public actual fun sceRegFlushRegistry(handle: RegHandle): Int =
    js("require('@kotlinmania/libc-native-bindings').sceRegFlushRegistry(handle)") as Int

public actual fun sceRegCloseRegistry(handle: RegHandle): Int =
    js("require('@kotlinmania/libc-native-bindings').sceRegCloseRegistry(handle)") as Int

public actual fun sceRegOpenCategory(handle: RegHandle, name: COpaquePointer?, mode: Int, dirHandle: RegHandle?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceRegOpenCategory(handle, name?.value ?: 0L, mode, dirHandle?.toLong() ?: 0L)") as Int

public actual fun sceRegRemoveCategory(handle: RegHandle, name: COpaquePointer?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceRegRemoveCategory(handle, name?.value ?: 0L)") as Int

public actual fun sceRegCloseCategory(dirHandle: RegHandle): Int =
    js("require('@kotlinmania/libc-native-bindings').sceRegCloseCategory(dirHandle)") as Int

public actual fun sceRegFlushCategory(dirHandle: RegHandle): Int =
    js("require('@kotlinmania/libc-native-bindings').sceRegFlushCategory(dirHandle)") as Int

public actual fun sceRegGetKeyInfo(dirHandle: RegHandle, name: COpaquePointer?, keyHandle: RegHandle?, type: KeyType?, size: ULong?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceRegGetKeyInfo(dirHandle, name?.value ?: 0L, keyHandle?.toLong() ?: 0L, type?.toLong() ?: 0L, size?.toLong() ?: 0L)") as Int

public actual fun sceRegGetKeyInfoByName(dirHandle: RegHandle, name: COpaquePointer?, type: KeyType?, size: ULong?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceRegGetKeyInfoByName(dirHandle, name?.value ?: 0L, type?.toLong() ?: 0L, size?.toLong() ?: 0L)") as Int

public actual fun sceRegGetKeyValue(dirHandle: RegHandle, keyHandle: RegHandle, buf: COpaquePointer?, size: ULong): Int =
    js("require('@kotlinmania/libc-native-bindings').sceRegGetKeyValue(dirHandle, keyHandle, buf?.value ?: 0L, size)") as Int

public actual fun sceRegGetKeyValueByName(dirHandle: RegHandle, name: COpaquePointer?, buf: COpaquePointer?, size: ULong): Int =
    js("require('@kotlinmania/libc-native-bindings').sceRegGetKeyValueByName(dirHandle, name?.value ?: 0L, buf?.value ?: 0L, size)") as Int

public actual fun sceRegSetKeyValue(dirHandle: RegHandle, name: COpaquePointer?, buf: COpaquePointer?, size: ULong): Int =
    js("require('@kotlinmania/libc-native-bindings').sceRegSetKeyValue(dirHandle, name?.value ?: 0L, buf?.value ?: 0L, size)") as Int

public actual fun sceRegGetKeysNum(dirHandle: RegHandle, num: Int?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceRegGetKeysNum(dirHandle, num?.toLong() ?: 0L)") as Int

public actual fun sceRegGetKeys(dirHandle: RegHandle, buf: COpaquePointer?, num: Int): Int =
    js("require('@kotlinmania/libc-native-bindings').sceRegGetKeys(dirHandle, buf?.value ?: 0L, num)") as Int

public actual fun sceRegCreateKey(dirHandle: RegHandle, name: COpaquePointer?, type: Int, size: ULong): Int =
    js("require('@kotlinmania/libc-native-bindings').sceRegCreateKey(dirHandle, name?.value ?: 0L, type, size)") as Int

public actual fun sceRegRemoveRegistry(key: Key?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceRegRemoveRegistry(key?.toLong() ?: 0L)") as Int

public actual fun sceOpenPSIDGetOpenPSID(openpsid: OpenPSID?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceOpenPSIDGetOpenPSID(openpsid?.toLong() ?: 0L)") as Int

public actual fun sceUtilityMsgDialogInitStart(params: UtilityMsgDialogParams?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceUtilityMsgDialogInitStart(params?.toLong() ?: 0L)") as Int

public actual fun sceUtilityMsgDialogShutdownStart() {
    js("require('@kotlinmania/libc-native-bindings').sceUtilityMsgDialogShutdownStart()")
}

public actual fun sceUtilityMsgDialogGetStatus(): Int =
    js("require('@kotlinmania/libc-native-bindings').sceUtilityMsgDialogGetStatus()") as Int

public actual fun sceUtilityMsgDialogUpdate(n: Int) {
    js("require('@kotlinmania/libc-native-bindings').sceUtilityMsgDialogUpdate(n)")
}

public actual fun sceUtilityMsgDialogAbort(): Int =
    js("require('@kotlinmania/libc-native-bindings').sceUtilityMsgDialogAbort()") as Int

public actual fun sceUtilityNetconfInitStart(data: UtilityNetconfData?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceUtilityNetconfInitStart(data?.toLong() ?: 0L)") as Int

public actual fun sceUtilityNetconfShutdownStart(): Int =
    js("require('@kotlinmania/libc-native-bindings').sceUtilityNetconfShutdownStart()") as Int

public actual fun sceUtilityNetconfUpdate(unknown: Int): Int =
    js("require('@kotlinmania/libc-native-bindings').sceUtilityNetconfUpdate(unknown)") as Int

public actual fun sceUtilityNetconfGetStatus(): Int =
    js("require('@kotlinmania/libc-native-bindings').sceUtilityNetconfGetStatus()") as Int

public actual fun sceUtilityCheckNetParam(id: Int): Int =
    js("require('@kotlinmania/libc-native-bindings').sceUtilityCheckNetParam(id)") as Int

public actual fun sceUtilityGetNetParam(conf: Int, param: NetParam, data: UtilityNetData?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceUtilityGetNetParam(conf, param, data?.toLong() ?: 0L)") as Int

public actual fun sceUtilitySavedataInitStart(params: SceUtilitySavedataParam?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceUtilitySavedataInitStart(params?.toLong() ?: 0L)") as Int

public actual fun sceUtilitySavedataGetStatus(): Int =
    js("require('@kotlinmania/libc-native-bindings').sceUtilitySavedataGetStatus()") as Int

public actual fun sceUtilitySavedataShutdownStart(): Int =
    js("require('@kotlinmania/libc-native-bindings').sceUtilitySavedataShutdownStart()") as Int

public actual fun sceUtilitySavedataUpdate(unknown: Int) {
    js("require('@kotlinmania/libc-native-bindings').sceUtilitySavedataUpdate(unknown)")
}

public actual fun sceUtilityGameSharingInitStart(params: UtilityGameSharingParams?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceUtilityGameSharingInitStart(params?.toLong() ?: 0L)") as Int

public actual fun sceUtilityGameSharingShutdownStart() {
    js("require('@kotlinmania/libc-native-bindings').sceUtilityGameSharingShutdownStart()")
}

public actual fun sceUtilityGameSharingGetStatus(): Int =
    js("require('@kotlinmania/libc-native-bindings').sceUtilityGameSharingGetStatus()") as Int

public actual fun sceUtilityGameSharingUpdate(n: Int) {
    js("require('@kotlinmania/libc-native-bindings').sceUtilityGameSharingUpdate(n)")
}

public actual fun sceUtilityHtmlViewerInitStart(params: UtilityHtmlViewerParam?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceUtilityHtmlViewerInitStart(params?.toLong() ?: 0L)") as Int

public actual fun sceUtilityHtmlViewerShutdownStart(): Int =
    js("require('@kotlinmania/libc-native-bindings').sceUtilityHtmlViewerShutdownStart()") as Int

public actual fun sceUtilityHtmlViewerUpdate(n: Int): Int =
    js("require('@kotlinmania/libc-native-bindings').sceUtilityHtmlViewerUpdate(n)") as Int

public actual fun sceUtilityHtmlViewerGetStatus(): Int =
    js("require('@kotlinmania/libc-native-bindings').sceUtilityHtmlViewerGetStatus()") as Int

public actual fun sceUtilitySetSystemParamInt(id: SystemParamId, value: Int): Int =
    js("require('@kotlinmania/libc-native-bindings').sceUtilitySetSystemParamInt(id, value)") as Int

public actual fun sceUtilitySetSystemParamString(id: SystemParamId, str: COpaquePointer?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceUtilitySetSystemParamString(id, str?.value ?: 0L)") as Int

public actual fun sceUtilityGetSystemParamInt(id: SystemParamId, value: Int?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceUtilityGetSystemParamInt(id, value?.toLong() ?: 0L)") as Int

public actual fun sceUtilityGetSystemParamString(id: SystemParamId, str: COpaquePointer?, len: Int): Int =
    js("require('@kotlinmania/libc-native-bindings').sceUtilityGetSystemParamString(id, str?.value ?: 0L, len)") as Int

public actual fun sceUtilityOskInitStart(params: SceUtilityOskParams?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceUtilityOskInitStart(params?.toLong() ?: 0L)") as Int

public actual fun sceUtilityOskShutdownStart(): Int =
    js("require('@kotlinmania/libc-native-bindings').sceUtilityOskShutdownStart()") as Int

public actual fun sceUtilityOskUpdate(n: Int): Int =
    js("require('@kotlinmania/libc-native-bindings').sceUtilityOskUpdate(n)") as Int

public actual fun sceUtilityOskGetStatus(): Int =
    js("require('@kotlinmania/libc-native-bindings').sceUtilityOskGetStatus()") as Int

public actual fun sceUtilityLoadNetModule(module: NetModule): Int =
    js("require('@kotlinmania/libc-native-bindings').sceUtilityLoadNetModule(module)") as Int

public actual fun sceUtilityUnloadNetModule(module: NetModule): Int =
    js("require('@kotlinmania/libc-native-bindings').sceUtilityUnloadNetModule(module)") as Int

public actual fun sceUtilityLoadAvModule(module: AvModule): Int =
    js("require('@kotlinmania/libc-native-bindings').sceUtilityLoadAvModule(module)") as Int

public actual fun sceUtilityUnloadAvModule(module: AvModule): Int =
    js("require('@kotlinmania/libc-native-bindings').sceUtilityUnloadAvModule(module)") as Int

public actual fun sceUtilityLoadUsbModule(module: UsbModule): Int =
    js("require('@kotlinmania/libc-native-bindings').sceUtilityLoadUsbModule(module)") as Int

public actual fun sceUtilityUnloadUsbModule(module: UsbModule): Int =
    js("require('@kotlinmania/libc-native-bindings').sceUtilityUnloadUsbModule(module)") as Int

public actual fun sceUtilityLoadModule(module: Module): Int =
    js("require('@kotlinmania/libc-native-bindings').sceUtilityLoadModule(module)") as Int

public actual fun sceUtilityUnloadModule(module: Module): Int =
    js("require('@kotlinmania/libc-native-bindings').sceUtilityUnloadModule(module)") as Int

public actual fun sceUtilityCreateNetParam(conf: Int): Int =
    js("require('@kotlinmania/libc-native-bindings').sceUtilityCreateNetParam(conf)") as Int

public actual fun sceUtilitySetNetParam(param: NetParam, value: COpaquePointer?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceUtilitySetNetParam(param, value?.value ?: 0L)") as Int

public actual fun sceUtilityCopyNetParam(src: Int, dest: Int): Int =
    js("require('@kotlinmania/libc-native-bindings').sceUtilityCopyNetParam(src, dest)") as Int

public actual fun sceUtilityDeleteNetParam(conf: Int): Int =
    js("require('@kotlinmania/libc-native-bindings').sceUtilityDeleteNetParam(conf)") as Int

public actual fun sceNetInit(poolsize: Int, calloutprio: Int, calloutstack: Int, netintrprio: Int, netintrstack: Int): Int =
    js("require('@kotlinmania/libc-native-bindings').sceNetInit(poolsize, calloutprio, calloutstack, netintrprio, netintrstack)") as Int

public actual fun sceNetTerm(): Int =
    js("require('@kotlinmania/libc-native-bindings').sceNetTerm()") as Int

public actual fun sceNetFreeThreadinfo(thid: Int): Int =
    js("require('@kotlinmania/libc-native-bindings').sceNetFreeThreadinfo(thid)") as Int

public actual fun sceNetThreadAbort(thid: Int): Int =
    js("require('@kotlinmania/libc-native-bindings').sceNetThreadAbort(thid)") as Int

public actual fun sceNetEtherStrton(name: COpaquePointer?, mac: COpaquePointer?) {
    js("require('@kotlinmania/libc-native-bindings').sceNetEtherStrton(name?.value ?: 0L, mac?.value ?: 0L)")
}

public actual fun sceNetEtherNtostr(mac: COpaquePointer?, name: COpaquePointer?) {
    js("require('@kotlinmania/libc-native-bindings').sceNetEtherNtostr(mac?.value ?: 0L, name?.value ?: 0L)")
}

public actual fun sceNetGetLocalEtherAddr(mac: COpaquePointer?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceNetGetLocalEtherAddr(mac?.value ?: 0L)") as Int

public actual fun sceNetGetMallocStat(stat: SceNetMallocStat?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceNetGetMallocStat(stat?.toLong() ?: 0L)") as Int

public actual fun sceNetAdhocctlInit(stacksize: Int, priority: Int, adhocId: SceNetAdhocctlAdhocId?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceNetAdhocctlInit(stacksize, priority, adhocId?.toLong() ?: 0L)") as Int

public actual fun sceNetAdhocctlTerm(): Int =
    js("require('@kotlinmania/libc-native-bindings').sceNetAdhocctlTerm()") as Int

public actual fun sceNetAdhocctlConnect(name: COpaquePointer?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceNetAdhocctlConnect(name?.value ?: 0L)") as Int

public actual fun sceNetAdhocctlDisconnect(): Int =
    js("require('@kotlinmania/libc-native-bindings').sceNetAdhocctlDisconnect()") as Int

public actual fun sceNetAdhocctlGetState(event: Int?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceNetAdhocctlGetState(event?.toLong() ?: 0L)") as Int

public actual fun sceNetAdhocctlCreate(name: COpaquePointer?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceNetAdhocctlCreate(name?.value ?: 0L)") as Int

public actual fun sceNetAdhocctlJoin(scaninfo: SceNetAdhocctlScanInfo?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceNetAdhocctlJoin(scaninfo?.toLong() ?: 0L)") as Int

public actual fun sceNetAdhocctlGetAdhocId(id: SceNetAdhocctlAdhocId?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceNetAdhocctlGetAdhocId(id?.toLong() ?: 0L)") as Int

public actual fun sceNetAdhocctlCreateEnterGameMode(name: COpaquePointer?, unknown: Int, num: Int, macs: COpaquePointer?, timeout: UInt, unknown2: Int): Int =
    js("require('@kotlinmania/libc-native-bindings').sceNetAdhocctlCreateEnterGameMode(name?.value ?: 0L, unknown, num, macs?.value ?: 0L, timeout, unknown2)") as Int

public actual fun sceNetAdhocctlJoinEnterGameMode(name: COpaquePointer?, hostmac: COpaquePointer?, timeout: UInt, unknown: Int): Int =
    js("require('@kotlinmania/libc-native-bindings').sceNetAdhocctlJoinEnterGameMode(name?.value ?: 0L, hostmac?.value ?: 0L, timeout, unknown)") as Int

public actual fun sceNetAdhocctlGetGameModeInfo(gamemodeinfo: SceNetAdhocctlGameModeInfo?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceNetAdhocctlGetGameModeInfo(gamemodeinfo?.toLong() ?: 0L)") as Int

public actual fun sceNetAdhocctlExitGameMode(): Int =
    js("require('@kotlinmania/libc-native-bindings').sceNetAdhocctlExitGameMode()") as Int

public actual fun sceNetAdhocctlGetPeerList(length: Int?, buf: COpaquePointer?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceNetAdhocctlGetPeerList(length?.toLong() ?: 0L, buf?.value ?: 0L)") as Int

public actual fun sceNetAdhocctlGetPeerInfo(mac: COpaquePointer?, size: Int, peerinfo: SceNetAdhocctlPeerInfo?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceNetAdhocctlGetPeerInfo(mac?.value ?: 0L, size, peerinfo?.toLong() ?: 0L)") as Int

public actual fun sceNetAdhocctlScan(): Int =
    js("require('@kotlinmania/libc-native-bindings').sceNetAdhocctlScan()") as Int

public actual fun sceNetAdhocctlGetScanInfo(length: Int?, buf: COpaquePointer?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceNetAdhocctlGetScanInfo(length?.toLong() ?: 0L, buf?.value ?: 0L)") as Int

public actual fun sceNetAdhocctlAddHandler(handler: SceNetAdhocctlHandler, unknown: COpaquePointer?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceNetAdhocctlAddHandler(handler, unknown?.value ?: 0L)") as Int

public actual fun sceNetAdhocctlDelHandler(id: Int): Int =
    js("require('@kotlinmania/libc-native-bindings').sceNetAdhocctlDelHandler(id)") as Int

public actual fun sceNetAdhocctlGetNameByAddr(mac: COpaquePointer?, nickname: COpaquePointer?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceNetAdhocctlGetNameByAddr(mac?.value ?: 0L, nickname?.value ?: 0L)") as Int

public actual fun sceNetAdhocctlGetAddrByName(nickname: COpaquePointer?, length: Int?, buf: COpaquePointer?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceNetAdhocctlGetAddrByName(nickname?.value ?: 0L, length?.toLong() ?: 0L, buf?.value ?: 0L)") as Int

public actual fun sceNetAdhocctlGetParameter(params: SceNetAdhocctlParams?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceNetAdhocctlGetParameter(params?.toLong() ?: 0L)") as Int

public actual fun sceNetAdhocInit(): Int =
    js("require('@kotlinmania/libc-native-bindings').sceNetAdhocInit()") as Int

public actual fun sceNetAdhocTerm(): Int =
    js("require('@kotlinmania/libc-native-bindings').sceNetAdhocTerm()") as Int

public actual fun sceNetAdhocPdpCreate(mac: COpaquePointer?, port: UShort, bufSize: UInt, unk1: Int): Int =
    js("require('@kotlinmania/libc-native-bindings').sceNetAdhocPdpCreate(mac?.value ?: 0L, port, bufSize, unk1)") as Int

public actual fun sceNetAdhocPdpDelete(id: Int, unk1: Int): Int =
    js("require('@kotlinmania/libc-native-bindings').sceNetAdhocPdpDelete(id, unk1)") as Int

public actual fun sceNetAdhocPdpSend(id: Int, destMacAddr: COpaquePointer?, port: UShort, data: COpaquePointer?, len: UInt, timeout: UInt, nonblock: Int): Int =
    js("require('@kotlinmania/libc-native-bindings').sceNetAdhocPdpSend(id, destMacAddr?.value ?: 0L, port, data?.value ?: 0L, len, timeout, nonblock)") as Int

public actual fun sceNetAdhocPdpRecv(id: Int, srcMacAddr: COpaquePointer?, port: UShort?, data: COpaquePointer?, dataLength: COpaquePointer?, timeout: UInt, nonblock: Int): Int =
    js("require('@kotlinmania/libc-native-bindings').sceNetAdhocPdpRecv(id, srcMacAddr?.value ?: 0L, port?.toLong() ?: 0L, data?.value ?: 0L, dataLength?.value ?: 0L, timeout, nonblock)") as Int

public actual fun sceNetAdhocGetPdpStat(size: Int?, stat: SceNetAdhocPdpStat?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceNetAdhocGetPdpStat(size?.toLong() ?: 0L, stat?.toLong() ?: 0L)") as Int

public actual fun sceNetAdhocGameModeCreateMaster(data: COpaquePointer?, size: Int): Int =
    js("require('@kotlinmania/libc-native-bindings').sceNetAdhocGameModeCreateMaster(data?.value ?: 0L, size)") as Int

public actual fun sceNetAdhocGameModeCreateReplica(mac: COpaquePointer?, data: COpaquePointer?, size: Int): Int =
    js("require('@kotlinmania/libc-native-bindings').sceNetAdhocGameModeCreateReplica(mac?.value ?: 0L, data?.value ?: 0L, size)") as Int

public actual fun sceNetAdhocGameModeUpdateMaster(): Int =
    js("require('@kotlinmania/libc-native-bindings').sceNetAdhocGameModeUpdateMaster()") as Int

public actual fun sceNetAdhocGameModeUpdateReplica(id: Int, unk1: Int): Int =
    js("require('@kotlinmania/libc-native-bindings').sceNetAdhocGameModeUpdateReplica(id, unk1)") as Int

public actual fun sceNetAdhocGameModeDeleteMaster(): Int =
    js("require('@kotlinmania/libc-native-bindings').sceNetAdhocGameModeDeleteMaster()") as Int

public actual fun sceNetAdhocGameModeDeleteReplica(id: Int): Int =
    js("require('@kotlinmania/libc-native-bindings').sceNetAdhocGameModeDeleteReplica(id)") as Int

public actual fun sceNetAdhocPtpOpen(srcmac: COpaquePointer?, srcport: UShort, destmac: COpaquePointer?, destport: UShort, bufSize: UInt, delay: UInt, count: Int, unk1: Int): Int =
    js("require('@kotlinmania/libc-native-bindings').sceNetAdhocPtpOpen(srcmac?.value ?: 0L, srcport, destmac?.value ?: 0L, destport, bufSize, delay, count, unk1)") as Int

public actual fun sceNetAdhocPtpConnect(id: Int, timeout: UInt, nonblock: Int): Int =
    js("require('@kotlinmania/libc-native-bindings').sceNetAdhocPtpConnect(id, timeout, nonblock)") as Int

public actual fun sceNetAdhocPtpListen(srcmac: COpaquePointer?, srcport: UShort, bufSize: UInt, delay: UInt, count: Int, queue: Int, unk1: Int): Int =
    js("require('@kotlinmania/libc-native-bindings').sceNetAdhocPtpListen(srcmac?.value ?: 0L, srcport, bufSize, delay, count, queue, unk1)") as Int

public actual fun sceNetAdhocPtpAccept(id: Int, mac: COpaquePointer?, port: UShort?, timeout: UInt, nonblock: Int): Int =
    js("require('@kotlinmania/libc-native-bindings').sceNetAdhocPtpAccept(id, mac?.value ?: 0L, port?.toLong() ?: 0L, timeout, nonblock)") as Int

public actual fun sceNetAdhocPtpSend(id: Int, data: COpaquePointer?, dataSize: Int?, timeout: UInt, nonblock: Int): Int =
    js("require('@kotlinmania/libc-native-bindings').sceNetAdhocPtpSend(id, data?.value ?: 0L, dataSize?.toLong() ?: 0L, timeout, nonblock)") as Int

public actual fun sceNetAdhocPtpRecv(id: Int, data: COpaquePointer?, dataSize: Int?, timeout: UInt, nonblock: Int): Int =
    js("require('@kotlinmania/libc-native-bindings').sceNetAdhocPtpRecv(id, data?.value ?: 0L, dataSize?.toLong() ?: 0L, timeout, nonblock)") as Int

public actual fun sceNetAdhocPtpFlush(id: Int, timeout: UInt, nonblock: Int): Int =
    js("require('@kotlinmania/libc-native-bindings').sceNetAdhocPtpFlush(id, timeout, nonblock)") as Int

public actual fun sceNetAdhocPtpClose(id: Int, unk1: Int): Int =
    js("require('@kotlinmania/libc-native-bindings').sceNetAdhocPtpClose(id, unk1)") as Int

public actual fun sceNetAdhocGetPtpStat(size: Int?, stat: SceNetAdhocPtpStat?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceNetAdhocGetPtpStat(size?.toLong() ?: 0L, stat?.toLong() ?: 0L)") as Int

public actual fun sceNetAdhocMatchingInit(memsize: Int): Int =
    js("require('@kotlinmania/libc-native-bindings').sceNetAdhocMatchingInit(memsize)") as Int

public actual fun sceNetAdhocMatchingTerm(): Int =
    js("require('@kotlinmania/libc-native-bindings').sceNetAdhocMatchingTerm()") as Int

public actual fun sceNetAdhocMatchingCreate(mode: AdhocMatchingMode, maxPeers: Int, port: UShort, bufSize: Int, helloDelay: UInt, pingDelay: UInt, initCount: Int, msgDelay: UInt, callback: AdhocMatchingCallback): Int =
    js("require('@kotlinmania/libc-native-bindings').sceNetAdhocMatchingCreate(mode, maxPeers, port, bufSize, helloDelay, pingDelay, initCount, msgDelay, callback)") as Int

public actual fun sceNetAdhocMatchingDelete(matchingId: Int): Int =
    js("require('@kotlinmania/libc-native-bindings').sceNetAdhocMatchingDelete(matchingId)") as Int

public actual fun sceNetAdhocMatchingStart(matchingId: Int, evthPri: Int, evthStack: Int, inthPri: Int, inthStack: Int, optLen: Int, optData: COpaquePointer?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceNetAdhocMatchingStart(matchingId, evthPri, evthStack, inthPri, inthStack, optLen, optData?.value ?: 0L)") as Int

public actual fun sceNetAdhocMatchingStop(matchingId: Int): Int =
    js("require('@kotlinmania/libc-native-bindings').sceNetAdhocMatchingStop(matchingId)") as Int

public actual fun sceNetAdhocMatchingSelectTarget(matchingId: Int, mac: COpaquePointer?, optLen: Int, optData: COpaquePointer?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceNetAdhocMatchingSelectTarget(matchingId, mac?.value ?: 0L, optLen, optData?.value ?: 0L)") as Int

public actual fun sceNetAdhocMatchingCancelTarget(matchingId: Int, mac: COpaquePointer?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceNetAdhocMatchingCancelTarget(matchingId, mac?.value ?: 0L)") as Int

public actual fun sceNetAdhocMatchingCancelTargetWithOpt(matchingId: Int, mac: COpaquePointer?, optLen: Int, optData: COpaquePointer?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceNetAdhocMatchingCancelTargetWithOpt(matchingId, mac?.value ?: 0L, optLen, optData?.value ?: 0L)") as Int

public actual fun sceNetAdhocMatchingSendData(matchingId: Int, mac: COpaquePointer?, dataLen: Int, data: COpaquePointer?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceNetAdhocMatchingSendData(matchingId, mac?.value ?: 0L, dataLen, data?.value ?: 0L)") as Int

public actual fun sceNetAdhocMatchingAbortSendData(matchingId: Int, mac: COpaquePointer?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceNetAdhocMatchingAbortSendData(matchingId, mac?.value ?: 0L)") as Int

public actual fun sceNetAdhocMatchingSetHelloOpt(matchingId: Int, optLen: Int, optData: COpaquePointer?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceNetAdhocMatchingSetHelloOpt(matchingId, optLen, optData?.value ?: 0L)") as Int

public actual fun sceNetAdhocMatchingGetHelloOpt(matchingId: Int, optLen: Int?, optData: COpaquePointer?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceNetAdhocMatchingGetHelloOpt(matchingId, optLen?.toLong() ?: 0L, optData?.value ?: 0L)") as Int

public actual fun sceNetAdhocMatchingGetMembers(matchingId: Int, length: Int?, buf: COpaquePointer?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceNetAdhocMatchingGetMembers(matchingId, length?.toLong() ?: 0L, buf?.value ?: 0L)") as Int

public actual fun sceNetAdhocMatchingGetPoolMaxAlloc(): Int =
    js("require('@kotlinmania/libc-native-bindings').sceNetAdhocMatchingGetPoolMaxAlloc()") as Int

public actual fun sceNetAdhocMatchingGetPoolStat(poolstat: AdhocPoolStat?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceNetAdhocMatchingGetPoolStat(poolstat?.toLong() ?: 0L)") as Int

public actual fun sceNetApctlInit(stackSize: Int, initPriority: Int): Int =
    js("require('@kotlinmania/libc-native-bindings').sceNetApctlInit(stackSize, initPriority)") as Int

public actual fun sceNetApctlTerm(): Int =
    js("require('@kotlinmania/libc-native-bindings').sceNetApctlTerm()") as Int

public actual fun sceNetApctlGetInfo(code: ApctlInfo, pinfo: SceNetApctlInfo?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceNetApctlGetInfo(code, pinfo?.toLong() ?: 0L)") as Int

public actual fun sceNetApctlAddHandler(handler: SceNetApctlHandler, parg: COpaquePointer?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceNetApctlAddHandler(handler, parg?.value ?: 0L)") as Int

public actual fun sceNetApctlDelHandler(handlerId: Int): Int =
    js("require('@kotlinmania/libc-native-bindings').sceNetApctlDelHandler(handlerId)") as Int

public actual fun sceNetApctlConnect(connIndex: Int): Int =
    js("require('@kotlinmania/libc-native-bindings').sceNetApctlConnect(connIndex)") as Int

public actual fun sceNetApctlDisconnect(): Int =
    js("require('@kotlinmania/libc-native-bindings').sceNetApctlDisconnect()") as Int

public actual fun sceNetApctlGetState(pstate: ApctlState?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceNetApctlGetState(pstate?.toLong() ?: 0L)") as Int

public actual fun sceNetInetInit(): Int =
    js("require('@kotlinmania/libc-native-bindings').sceNetInetInit()") as Int

public actual fun sceNetInetTerm(): Int =
    js("require('@kotlinmania/libc-native-bindings').sceNetInetTerm()") as Int

public actual fun sceNetInetAccept(s: Int, addr: Sockaddr?, addrLen: UInt?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceNetInetAccept(s, addr?.toLong() ?: 0L, addrLen?.toLong() ?: 0L)") as Int

public actual fun sceNetInetBind(s: Int, myAddr: Sockaddr?, addrLen: SocklenT): Int =
    js("require('@kotlinmania/libc-native-bindings').sceNetInetBind(s, myAddr?.toLong() ?: 0L, addrLen)") as Int

public actual fun sceNetInetConnect(s: Int, servAddr: Sockaddr?, addrLen: SocklenT): Int =
    js("require('@kotlinmania/libc-native-bindings').sceNetInetConnect(s, servAddr?.toLong() ?: 0L, addrLen)") as Int

public actual fun sceNetInetGetsockopt(s: Int, level: Int, optName: Int, optVal: COpaquePointer?, optlEn: UInt?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceNetInetGetsockopt(s, level, optName, optVal?.value ?: 0L, optlEn?.toLong() ?: 0L)") as Int

public actual fun sceNetInetListen(s: Int, backlog: Int): Int =
    js("require('@kotlinmania/libc-native-bindings').sceNetInetListen(s, backlog)") as Int

public actual fun sceNetInetRecv(s: Int, buf: COpaquePointer?, len: ULong, flags: Int): ULong =
    js("require('@kotlinmania/libc-native-bindings').sceNetInetRecv(s, buf?.value ?: 0L, len, flags)") as ULong

public actual fun sceNetInetRecvfrom(s: Int, buf: COpaquePointer?, flags: ULong, arg1: Int, from: Sockaddr?, fromLen: UInt?): ULong =
    js("require('@kotlinmania/libc-native-bindings').sceNetInetRecvfrom(s, buf?.value ?: 0L, flags, arg1, from?.toLong() ?: 0L, fromLen?.toLong() ?: 0L)") as ULong

public actual fun sceNetInetSend(s: Int, buf: COpaquePointer?, len: ULong, flags: Int): ULong =
    js("require('@kotlinmania/libc-native-bindings').sceNetInetSend(s, buf?.value ?: 0L, len, flags)") as ULong

public actual fun sceNetInetSendto(s: Int, buf: COpaquePointer?, len: ULong, flags: Int, to: Sockaddr?, toLen: SocklenT): ULong =
    js("require('@kotlinmania/libc-native-bindings').sceNetInetSendto(s, buf?.value ?: 0L, len, flags, to?.toLong() ?: 0L, toLen)") as ULong

public actual fun sceNetInetSetsockopt(s: Int, level: Int, optName: Int, optVal: COpaquePointer?, optLen: SocklenT): Int =
    js("require('@kotlinmania/libc-native-bindings').sceNetInetSetsockopt(s, level, optName, optVal?.value ?: 0L, optLen)") as Int

public actual fun sceNetInetShutdown(s: Int, how: Int): Int =
    js("require('@kotlinmania/libc-native-bindings').sceNetInetShutdown(s, how)") as Int

public actual fun sceNetInetSocket(domain: Int, type: Int, protocol: Int): Int =
    js("require('@kotlinmania/libc-native-bindings').sceNetInetSocket(domain, type, protocol)") as Int

public actual fun sceNetInetClose(s: Int): Int =
    js("require('@kotlinmania/libc-native-bindings').sceNetInetClose(s)") as Int

public actual fun sceNetInetGetErrno(): Int =
    js("require('@kotlinmania/libc-native-bindings').sceNetInetGetErrno()") as Int

public actual fun sceSslInit(unknown1: Int): Int =
    js("require('@kotlinmania/libc-native-bindings').sceSslInit(unknown1)") as Int

public actual fun sceSslEnd(): Int =
    js("require('@kotlinmania/libc-native-bindings').sceSslEnd()") as Int

public actual fun sceSslGetUsedMemoryMax(memory: UInt?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceSslGetUsedMemoryMax(memory?.toLong() ?: 0L)") as Int

public actual fun sceSslGetUsedMemoryCurrent(memory: UInt?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceSslGetUsedMemoryCurrent(memory?.toLong() ?: 0L)") as Int

public actual fun sceHttpInit(unknown1: UInt): Int =
    js("require('@kotlinmania/libc-native-bindings').sceHttpInit(unknown1)") as Int

public actual fun sceHttpEnd(): Int =
    js("require('@kotlinmania/libc-native-bindings').sceHttpEnd()") as Int

public actual fun sceHttpCreateTemplate(agent: COpaquePointer?, unknown1: Int, unknown2: Int): Int =
    js("require('@kotlinmania/libc-native-bindings').sceHttpCreateTemplate(agent?.value ?: 0L, unknown1, unknown2)") as Int

public actual fun sceHttpDeleteTemplate(templateid: Int): Int =
    js("require('@kotlinmania/libc-native-bindings').sceHttpDeleteTemplate(templateid)") as Int

public actual fun sceHttpCreateConnection(templateid: Int, host: COpaquePointer?, unknown1: COpaquePointer?, port: UShort, unknown2: Int): Int =
    js("require('@kotlinmania/libc-native-bindings').sceHttpCreateConnection(templateid, host?.value ?: 0L, unknown1?.value ?: 0L, port, unknown2)") as Int

public actual fun sceHttpCreateConnectionWithURL(templateid: Int, url: COpaquePointer?, unknown1: Int): Int =
    js("require('@kotlinmania/libc-native-bindings').sceHttpCreateConnectionWithURL(templateid, url?.value ?: 0L, unknown1)") as Int

public actual fun sceHttpDeleteConnection(connectionId: Int): Int =
    js("require('@kotlinmania/libc-native-bindings').sceHttpDeleteConnection(connectionId)") as Int

public actual fun sceHttpCreateRequest(connectionId: Int, method: HttpMethod, path: COpaquePointer?, contentLength: ULong): Int =
    js("require('@kotlinmania/libc-native-bindings').sceHttpCreateRequest(connectionId, method, path?.value ?: 0L, contentLength)") as Int

public actual fun sceHttpCreateRequestWithURL(connectionId: Int, method: HttpMethod, url: COpaquePointer?, contentLength: ULong): Int =
    js("require('@kotlinmania/libc-native-bindings').sceHttpCreateRequestWithURL(connectionId, method, url?.value ?: 0L, contentLength)") as Int

public actual fun sceHttpDeleteRequest(requestId: Int): Int =
    js("require('@kotlinmania/libc-native-bindings').sceHttpDeleteRequest(requestId)") as Int

public actual fun sceHttpSendRequest(requestId: Int, data: COpaquePointer?, dataSize: UInt): Int =
    js("require('@kotlinmania/libc-native-bindings').sceHttpSendRequest(requestId, data?.value ?: 0L, dataSize)") as Int

public actual fun sceHttpAbortRequest(requestId: Int): Int =
    js("require('@kotlinmania/libc-native-bindings').sceHttpAbortRequest(requestId)") as Int

public actual fun sceHttpReadData(requestId: Int, data: COpaquePointer?, dataSize: UInt): Int =
    js("require('@kotlinmania/libc-native-bindings').sceHttpReadData(requestId, data?.value ?: 0L, dataSize)") as Int

public actual fun sceHttpGetContentLength(requestId: Int, contentLength: ULong?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceHttpGetContentLength(requestId, contentLength?.toLong() ?: 0L)") as Int

public actual fun sceHttpGetStatusCode(requestId: Int, statusCode: Int?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceHttpGetStatusCode(requestId, statusCode?.toLong() ?: 0L)") as Int

public actual fun sceHttpSetResolveTimeOut(id: Int, timeout: UInt): Int =
    js("require('@kotlinmania/libc-native-bindings').sceHttpSetResolveTimeOut(id, timeout)") as Int

public actual fun sceHttpSetResolveRetry(id: Int, count: Int): Int =
    js("require('@kotlinmania/libc-native-bindings').sceHttpSetResolveRetry(id, count)") as Int

public actual fun sceHttpSetConnectTimeOut(id: Int, timeout: UInt): Int =
    js("require('@kotlinmania/libc-native-bindings').sceHttpSetConnectTimeOut(id, timeout)") as Int

public actual fun sceHttpSetSendTimeOut(id: Int, timeout: UInt): Int =
    js("require('@kotlinmania/libc-native-bindings').sceHttpSetSendTimeOut(id, timeout)") as Int

public actual fun sceHttpSetRecvTimeOut(id: Int, timeout: UInt): Int =
    js("require('@kotlinmania/libc-native-bindings').sceHttpSetRecvTimeOut(id, timeout)") as Int

public actual fun sceHttpEnableKeepAlive(id: Int): Int =
    js("require('@kotlinmania/libc-native-bindings').sceHttpEnableKeepAlive(id)") as Int

public actual fun sceHttpDisableKeepAlive(id: Int): Int =
    js("require('@kotlinmania/libc-native-bindings').sceHttpDisableKeepAlive(id)") as Int

public actual fun sceHttpEnableRedirect(id: Int): Int =
    js("require('@kotlinmania/libc-native-bindings').sceHttpEnableRedirect(id)") as Int

public actual fun sceHttpDisableRedirect(id: Int): Int =
    js("require('@kotlinmania/libc-native-bindings').sceHttpDisableRedirect(id)") as Int

public actual fun sceHttpEnableCookie(id: Int): Int =
    js("require('@kotlinmania/libc-native-bindings').sceHttpEnableCookie(id)") as Int

public actual fun sceHttpDisableCookie(id: Int): Int =
    js("require('@kotlinmania/libc-native-bindings').sceHttpDisableCookie(id)") as Int

public actual fun sceHttpSaveSystemCookie(): Int =
    js("require('@kotlinmania/libc-native-bindings').sceHttpSaveSystemCookie()") as Int

public actual fun sceHttpLoadSystemCookie(): Int =
    js("require('@kotlinmania/libc-native-bindings').sceHttpLoadSystemCookie()") as Int

public actual fun sceHttpAddExtraHeader(id: Int, name: COpaquePointer?, value: COpaquePointer?, unknown1: Int): Int =
    js("require('@kotlinmania/libc-native-bindings').sceHttpAddExtraHeader(id, name?.value ?: 0L, value?.value ?: 0L, unknown1)") as Int

public actual fun sceHttpDeleteHeader(id: Int, name: COpaquePointer?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceHttpDeleteHeader(id, name?.value ?: 0L)") as Int

public actual fun sceHttpsInit(unknown1: Int, unknown2: Int, unknown3: Int, unknown4: Int): Int =
    js("require('@kotlinmania/libc-native-bindings').sceHttpsInit(unknown1, unknown2, unknown3, unknown4)") as Int

public actual fun sceHttpsEnd(): Int =
    js("require('@kotlinmania/libc-native-bindings').sceHttpsEnd()") as Int

public actual fun sceHttpsLoadDefaultCert(unknown1: Int, unknown2: Int): Int =
    js("require('@kotlinmania/libc-native-bindings').sceHttpsLoadDefaultCert(unknown1, unknown2)") as Int

public actual fun sceHttpDisableAuth(id: Int): Int =
    js("require('@kotlinmania/libc-native-bindings').sceHttpDisableAuth(id)") as Int

public actual fun sceHttpDisableCache(id: Int): Int =
    js("require('@kotlinmania/libc-native-bindings').sceHttpDisableCache(id)") as Int

public actual fun sceHttpEnableAuth(id: Int): Int =
    js("require('@kotlinmania/libc-native-bindings').sceHttpEnableAuth(id)") as Int

public actual fun sceHttpEnableCache(id: Int): Int =
    js("require('@kotlinmania/libc-native-bindings').sceHttpEnableCache(id)") as Int

public actual fun sceHttpEndCache(): Int =
    js("require('@kotlinmania/libc-native-bindings').sceHttpEndCache()") as Int

public actual fun sceHttpGetAllHeader(request: Int, header: COpaquePointer?, headerSize: UInt?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceHttpGetAllHeader(request, header?.value ?: 0L, headerSize?.toLong() ?: 0L)") as Int

public actual fun sceHttpGetNetworkErrno(request: Int, errNum: Int?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceHttpGetNetworkErrno(request, errNum?.toLong() ?: 0L)") as Int

public actual fun sceHttpGetProxy(id: Int, activateFlag: Int?, mode: Int?, proxyHost: COpaquePointer?, len: ULong, proxyPort: UShort?): Int =
    js("require('@kotlinmania/libc-native-bindings').sceHttpGetProxy(id, activateFlag?.toLong() ?: 0L, mode?.toLong() ?: 0L, proxyHost?.value ?: 0L, len, proxyPort?.toLong() ?: 0L)") as Int

public actual fun sceHttpInitCache(maxSize: ULong): Int =
    js("require('@kotlinmania/libc-native-bindings').sceHttpInitCache(maxSize)") as Int

public actual fun sceHttpSetAuthInfoCB(id: Int, cbfunc: HttpPasswordCB): Int =
    js("require('@kotlinmania/libc-native-bindings').sceHttpSetAuthInfoCB(id, cbfunc)") as Int

public actual fun sceHttpSetProxy(id: Int, activateFlag: Int, mode: Int, newProxyHost: COpaquePointer?, newProxyPort: UShort): Int =
    js("require('@kotlinmania/libc-native-bindings').sceHttpSetProxy(id, activateFlag, mode, newProxyHost?.value ?: 0L, newProxyPort)") as Int

public actual fun sceHttpSetResHeaderMaxSize(id: Int, headerSize: UInt): Int =
    js("require('@kotlinmania/libc-native-bindings').sceHttpSetResHeaderMaxSize(id, headerSize)") as Int

public actual fun sceHttpSetMallocFunction(mallocFunc: HttpMallocFunction, freeFunc: HttpFreeFunction, reallocFunc: HttpReallocFunction): Int =
    js("require('@kotlinmania/libc-native-bindings').sceHttpSetMallocFunction(mallocFunc, freeFunc, reallocFunc)") as Int

public actual fun sceNetResolverInit(): Int =
    js("require('@kotlinmania/libc-native-bindings').sceNetResolverInit()") as Int

public actual fun sceNetResolverCreate(rid: Int?, buf: COpaquePointer?, bufLength: UInt): Int =
    js("require('@kotlinmania/libc-native-bindings').sceNetResolverCreate(rid?.toLong() ?: 0L, buf?.value ?: 0L, bufLength)") as Int

public actual fun sceNetResolverDelete(rid: Int): Int =
    js("require('@kotlinmania/libc-native-bindings').sceNetResolverDelete(rid)") as Int

public actual fun sceNetResolverStartNtoA(rid: Int, hostname: COpaquePointer?, addr: InAddr?, timeout: UInt, retry: Int): Int =
    js("require('@kotlinmania/libc-native-bindings').sceNetResolverStartNtoA(rid, hostname?.value ?: 0L, addr?.toLong() ?: 0L, timeout, retry)") as Int

public actual fun sceNetResolverStartAtoN(rid: Int, addr: InAddr?, hostname: COpaquePointer?, hostnameLen: UInt, timeout: UInt, retry: Int): Int =
    js("require('@kotlinmania/libc-native-bindings').sceNetResolverStartAtoN(rid, addr?.toLong() ?: 0L, hostname?.value ?: 0L, hostnameLen, timeout, retry)") as Int

public actual fun sceNetResolverStop(rid: Int): Int =
    js("require('@kotlinmania/libc-native-bindings').sceNetResolverStop(rid)") as Int

public actual fun sceNetResolverTerm(): Int =
    js("require('@kotlinmania/libc-native-bindings').sceNetResolverTerm()") as Int
