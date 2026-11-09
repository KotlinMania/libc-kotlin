@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.psp

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.COpaquePointer
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun sceAudioChReserve(channel: Int, sampleCount: Int, format: AudioFormat): Int =
    0

public actual fun sceAudioChRelease(channel: Int): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceAudioChRelease(channel)

public actual fun sceAudioOutput(channel: Int, vol: Int, buf: COpaquePointer?): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceAudioOutput(channel, vol, buf?.value?.toCPointer<ByteVar>())

public actual fun sceAudioOutputBlocking(channel: Int, vol: Int, buf: COpaquePointer?): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceAudioOutputBlocking(channel, vol, buf?.value?.toCPointer<ByteVar>())

public actual fun sceAudioOutputPanned(channel: Int, leftVol: Int, rightVol: Int, buf: COpaquePointer?): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceAudioOutputPanned(channel, leftVol, rightVol, buf?.value?.toCPointer<ByteVar>())

public actual fun sceAudioOutputPannedBlocking(channel: Int, leftVol: Int, rightVol: Int, buf: COpaquePointer?): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceAudioOutputPannedBlocking(channel, leftVol, rightVol, buf?.value?.toCPointer<ByteVar>())

public actual fun sceAudioGetChannelRestLen(channel: Int): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceAudioGetChannelRestLen(channel)

public actual fun sceAudioGetChannelRestLength(channel: Int): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceAudioGetChannelRestLength(channel)

public actual fun sceAudioSetChannelDataLen(channel: Int, sampleCount: Int): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceAudioSetChannelDataLen(channel, sampleCount)

public actual fun sceAudioChangeChannelConfig(channel: Int, format: AudioFormat): Int =
    0

public actual fun sceAudioChangeChannelVolume(channel: Int, leftVol: Int, rightVol: Int): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceAudioChangeChannelVolume(channel, leftVol, rightVol)

public actual fun sceAudioOutput2Reserve(sampleCount: Int): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceAudioOutput2Reserve(sampleCount)

public actual fun sceAudioOutput2Release(): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceAudioOutput2Release()

public actual fun sceAudioOutput2ChangeLength(sampleCount: Int): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceAudioOutput2ChangeLength(sampleCount)

public actual fun sceAudioOutput2OutputBlocking(vol: Int, buf: COpaquePointer?): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceAudioOutput2OutputBlocking(vol, buf?.value?.toCPointer<ByteVar>())

public actual fun sceAudioOutput2GetRestSample(): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceAudioOutput2GetRestSample()

public actual fun sceAudioSRCChReserve(sampleCount: Int, freq: AudioOutputFrequency, channels: Int): Int =
    0

public actual fun sceAudioSRCChRelease(): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceAudioSRCChRelease()

public actual fun sceAudioSRCOutputBlocking(vol: Int, buf: COpaquePointer?): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceAudioSRCOutputBlocking(vol, buf?.value?.toCPointer<ByteVar>())

public actual fun sceAudioInputInit(unknown1: Int, gain: Int, unknown2: Int): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceAudioInputInit(unknown1, gain, unknown2)

public actual fun sceAudioInputInitEx(params: COpaquePointer?): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceAudioInputInitEx(params?.value?.toCPointer<ByteVar>())

public actual fun sceAudioInputBlocking(sampleCount: Int, freq: AudioInputFrequency, buf: COpaquePointer?) {
}

public actual fun sceAudioInput(sampleCount: Int, freq: AudioInputFrequency, buf: COpaquePointer?) {
}

public actual fun sceAudioGetInputLength(): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceAudioGetInputLength()

public actual fun sceAudioWaitInputEnd(): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceAudioWaitInputEnd()

public actual fun sceAudioPollInputEnd(): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceAudioPollInputEnd()

public actual fun sceAtracGetAtracID(uiCodecType: UInt): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceAtracGetAtracID(uiCodecType)

public actual fun sceAtracSetDataAndGetID(buf: COpaquePointer?, bufsize: ULong): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceAtracSetDataAndGetID(buf?.value?.toCPointer<ByteVar>(), bufsize)

public actual fun sceAtracDecodeData(atracId: Int, outSamples: COpaquePointer?, outN: COpaquePointer?, outEnd: COpaquePointer?, outRemainFrame: COpaquePointer?): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceAtracDecodeData(atracId, outSamples?.value?.toCPointer<ByteVar>(), outN?.value?.toCPointer<ByteVar>(), outEnd?.value?.toCPointer<ByteVar>(), outRemainFrame?.value?.toCPointer<ByteVar>())

public actual fun sceAtracGetRemainFrame(atracId: Int, outRemainFrame: COpaquePointer?): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceAtracGetRemainFrame(atracId, outRemainFrame?.value?.toCPointer<ByteVar>())

public actual fun sceAtracGetStreamDataInfo(atracId: Int, writePointer: COpaquePointer?, availableBytes: COpaquePointer?, readOffset: COpaquePointer?): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceAtracGetStreamDataInfo(atracId, writePointer?.value?.toCPointer<ByteVar>(), availableBytes?.value?.toCPointer<ByteVar>(), readOffset?.value?.toCPointer<ByteVar>())

public actual fun sceAtracAddStreamData(atracId: Int, bytesToAdd: UInt): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceAtracAddStreamData(atracId, bytesToAdd)

public actual fun sceAtracGetBitrate(atracId: Int, outBitrate: COpaquePointer?): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceAtracGetBitrate(atracId, outBitrate?.value?.toCPointer<ByteVar>())

public actual fun sceAtracSetLoopNum(atracId: Int, nloops: Int): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceAtracSetLoopNum(atracId, nloops)

public actual fun sceAtracReleaseAtracID(atracId: Int): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceAtracReleaseAtracID(atracId)

public actual fun sceAtracGetNextSample(atracId: Int, outN: COpaquePointer?): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceAtracGetNextSample(atracId, outN?.value?.toCPointer<ByteVar>())

public actual fun sceAtracGetMaxSample(atracId: Int, outMax: COpaquePointer?): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceAtracGetMaxSample(atracId, outMax?.value?.toCPointer<ByteVar>())

public actual fun sceAtracGetBufferInfoForReseting(atracId: Int, uiSample: UInt, pbufferInfo: COpaquePointer?): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceAtracGetBufferInfoForReseting(atracId, uiSample, pbufferInfo?.value?.toCPointer<ByteVar>())

public actual fun sceAtracGetChannel(atracId: Int, puiChannel: COpaquePointer?): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceAtracGetChannel(atracId, puiChannel?.value?.toCPointer<ByteVar>())

public actual fun sceAtracGetInternalErrorInfo(atracId: Int, piResult: COpaquePointer?): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceAtracGetInternalErrorInfo(atracId, piResult?.value?.toCPointer<ByteVar>())

public actual fun sceAtracGetLoopStatus(atracId: Int, piLoopNum: COpaquePointer?, puiLoopStatus: COpaquePointer?): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceAtracGetLoopStatus(atracId, piLoopNum?.value?.toCPointer<ByteVar>(), puiLoopStatus?.value?.toCPointer<ByteVar>())

public actual fun sceAtracGetNextDecodePosition(atracId: Int, puiSamplePosition: COpaquePointer?): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceAtracGetNextDecodePosition(atracId, puiSamplePosition?.value?.toCPointer<ByteVar>())

public actual fun sceAtracGetSecondBufferInfo(atracId: Int, puiPosition: COpaquePointer?, puiDataByte: COpaquePointer?): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceAtracGetSecondBufferInfo(atracId, puiPosition?.value?.toCPointer<ByteVar>(), puiDataByte?.value?.toCPointer<ByteVar>())

public actual fun sceAtracGetSoundSample(atracId: Int, piEndSample: COpaquePointer?, piLoopStartSample: COpaquePointer?, piLoopEndSample: COpaquePointer?): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceAtracGetSoundSample(atracId, piEndSample?.value?.toCPointer<ByteVar>(), piLoopStartSample?.value?.toCPointer<ByteVar>(), piLoopEndSample?.value?.toCPointer<ByteVar>())

public actual fun sceAtracResetPlayPosition(atracId: Int, uiSample: UInt, uiWriteByteFirstBuf: UInt, uiWriteByteSecondBuf: UInt): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceAtracResetPlayPosition(atracId, uiSample, uiWriteByteFirstBuf, uiWriteByteSecondBuf)

public actual fun sceAtracSetData(atracId: Int, pucBufferAddr: COpaquePointer?, uiBufferByte: UInt): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceAtracSetData(atracId, pucBufferAddr?.value?.toCPointer<ByteVar>(), uiBufferByte)

public actual fun sceAtracSetHalfwayBuffer(atracId: Int, pucBufferAddr: COpaquePointer?, uiReadByte: UInt, uiBufferByte: UInt): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceAtracSetHalfwayBuffer(atracId, pucBufferAddr?.value?.toCPointer<ByteVar>(), uiReadByte, uiBufferByte)

public actual fun sceAtracSetHalfwayBufferAndGetID(pucBufferAddr: COpaquePointer?, uiReadByte: UInt, uiBufferByte: UInt): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceAtracSetHalfwayBufferAndGetID(pucBufferAddr?.value?.toCPointer<ByteVar>(), uiReadByte, uiBufferByte)

public actual fun sceAtracSetSecondBuffer(atracId: Int, pucSecondBufferAddr: COpaquePointer?, uiSecondBufferByte: UInt): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceAtracSetSecondBuffer(atracId, pucSecondBufferAddr?.value?.toCPointer<ByteVar>(), uiSecondBufferByte)

public actual fun sceCtrlSetSamplingCycle(cycle: Int): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceCtrlSetSamplingCycle(cycle)

public actual fun sceCtrlGetSamplingCycle(pcycle: COpaquePointer?): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceCtrlGetSamplingCycle(pcycle?.value?.toCPointer<ByteVar>())

public actual fun sceCtrlSetSamplingMode(mode: CtrlMode): Int =
    0

public actual fun sceCtrlGetSamplingMode(pmode: COpaquePointer?): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceCtrlGetSamplingMode(pmode?.value?.toCPointer<ByteVar>())

public actual fun sceCtrlPeekBufferPositive(padData: COpaquePointer?, count: Int): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceCtrlPeekBufferPositive(padData?.value?.toCPointer<ByteVar>(), count)

public actual fun sceCtrlPeekBufferNegative(padData: COpaquePointer?, count: Int): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceCtrlPeekBufferNegative(padData?.value?.toCPointer<ByteVar>(), count)

public actual fun sceCtrlReadBufferPositive(padData: COpaquePointer?, count: Int): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceCtrlReadBufferPositive(padData?.value?.toCPointer<ByteVar>(), count)

public actual fun sceCtrlReadBufferNegative(padData: COpaquePointer?, count: Int): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceCtrlReadBufferNegative(padData?.value?.toCPointer<ByteVar>(), count)

public actual fun sceCtrlPeekLatch(latchData: COpaquePointer?): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceCtrlPeekLatch(latchData?.value?.toCPointer<ByteVar>())

public actual fun sceCtrlReadLatch(latchData: COpaquePointer?): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceCtrlReadLatch(latchData?.value?.toCPointer<ByteVar>())

public actual fun sceCtrlSetIdleCancelThreshold(idlereset: Int, idleback: Int): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceCtrlSetIdleCancelThreshold(idlereset, idleback)

public actual fun sceCtrlGetIdleCancelThreshold(idlereset: COpaquePointer?, idleback: COpaquePointer?): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceCtrlGetIdleCancelThreshold(idlereset?.value?.toCPointer<ByteVar>(), idleback?.value?.toCPointer<ByteVar>())

public actual fun sceDisplaySetMode(mode: DisplayMode, width: ULong, height: ULong): UInt =
    0u

public actual fun sceDisplayGetMode(pmode: COpaquePointer?, pwidth: COpaquePointer?, pheight: COpaquePointer?): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceDisplayGetMode(pmode?.value?.toCPointer<ByteVar>(), pwidth?.value?.toCPointer<ByteVar>(), pheight?.value?.toCPointer<ByteVar>())

public actual fun sceDisplaySetFrameBuf(topAddr: COpaquePointer?, bufferWidth: ULong, pixelFormat: DisplayPixelFormat, sync: DisplaySetBufSync): UInt =
    0u

public actual fun sceDisplayGetFrameBuf(topAddr: COpaquePointer?, bufferWidth: COpaquePointer?, pixelFormat: COpaquePointer?, sync: DisplaySetBufSync): Int =
    0

public actual fun sceDisplayGetVcount(): UInt =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceDisplayGetVcount()

public actual fun sceDisplayWaitVblank(): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceDisplayWaitVblank()

public actual fun sceDisplayWaitVblankCB(): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceDisplayWaitVblankCB()

public actual fun sceDisplayWaitVblankStart(): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceDisplayWaitVblankStart()

public actual fun sceDisplayWaitVblankStartCB(): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceDisplayWaitVblankStartCB()

public actual fun sceDisplayGetAccumulatedHcount(): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceDisplayGetAccumulatedHcount()

public actual fun sceDisplayGetCurrentHcount(): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceDisplayGetCurrentHcount()

public actual fun sceDisplayGetFramePerSec(): Float =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceDisplayGetFramePerSec()

public actual fun sceDisplayIsForeground(): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceDisplayIsForeground()

public actual fun sceDisplayIsVblank(): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceDisplayIsVblank()

public actual fun sceGeEdramGetSize(): UInt =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGeEdramGetSize()

public actual fun sceGeEdramGetAddr(): COpaquePointer? =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGeEdramGetAddr()?.let { COpaquePointer(it.toLong()) }

public actual fun sceGeEdramSetAddrTranslation(width: Int): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGeEdramSetAddrTranslation(width)

public actual fun sceGeGetCmd(cmd: Int): UInt =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGeGetCmd(cmd)

public actual fun sceGeGetMtx(type: GeMatrixType, matrix: COpaquePointer?): Int =
    0

public actual fun sceGeGetStack(stackId: Int, stack: COpaquePointer?): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGeGetStack(stackId, stack?.value?.toCPointer<ByteVar>())

public actual fun sceGeSaveContext(context: COpaquePointer?): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGeSaveContext(context?.value?.toCPointer<ByteVar>())

public actual fun sceGeRestoreContext(context: COpaquePointer?): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGeRestoreContext(context?.value?.toCPointer<ByteVar>())

public actual fun sceGeListEnQueue(list: COpaquePointer?, stall: COpaquePointer?, cbid: Int, arg: COpaquePointer?): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGeListEnQueue(list?.value?.toCPointer<ByteVar>(), stall?.value?.toCPointer<ByteVar>(), cbid, arg?.value?.toCPointer<ByteVar>())

public actual fun sceGeListEnQueueHead(list: COpaquePointer?, stall: COpaquePointer?, cbid: Int, arg: COpaquePointer?): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGeListEnQueueHead(list?.value?.toCPointer<ByteVar>(), stall?.value?.toCPointer<ByteVar>(), cbid, arg?.value?.toCPointer<ByteVar>())

public actual fun sceGeListDeQueue(qid: Int): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGeListDeQueue(qid)

public actual fun sceGeListUpdateStallAddr(qid: Int, stall: COpaquePointer?): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGeListUpdateStallAddr(qid, stall?.value?.toCPointer<ByteVar>())

public actual fun sceGeListSync(qid: Int, syncType: Int): GeListState =
    null as GeListState

public actual fun sceGeDrawSync(syncType: Int): GeListState =
    null as GeListState

public actual fun sceGeBreak(mode: Int, pParam: COpaquePointer?): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGeBreak(mode, pParam?.value?.toCPointer<ByteVar>())

public actual fun sceGeContinue(): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGeContinue()

public actual fun sceGeSetCallback(cb: COpaquePointer?): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGeSetCallback(cb?.value?.toCPointer<ByteVar>())

public actual fun sceGeUnsetCallback(cbid: Int): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGeUnsetCallback(cbid)

public actual fun sceKernelExitGame() {
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceKernelExitGame()
}

public actual fun sceKernelRegisterExitCallback(id: SceUid): Int =
    0

public actual fun sceKernelLoadExec(file: COpaquePointer?, param: COpaquePointer?): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceKernelLoadExec(file?.value?.toCPointer<ByteVar>(), param?.value?.toCPointer<ByteVar>())

public actual fun sceKernelAllocPartitionMemory(partition: SceSysMemPartitionId, name: COpaquePointer?, type: SceSysMemBlockTypes, size: UInt, addr: COpaquePointer?): SceUid =
    null as SceUid

public actual fun sceKernelGetBlockHeadAddr(blockid: SceUid): COpaquePointer? =
    null

public actual fun sceKernelFreePartitionMemory(blockid: SceUid): Int =
    0

public actual fun sceKernelTotalFreeMemSize(): ULong =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceKernelTotalFreeMemSize()

public actual fun sceKernelMaxFreeMemSize(): ULong =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceKernelMaxFreeMemSize()

public actual fun sceKernelDevkitVersion(): UInt =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceKernelDevkitVersion()

public actual fun sceKernelSetCompiledSdkVersion(version: UInt): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceKernelSetCompiledSdkVersion(version)

public actual fun sceKernelGetCompiledSdkVersion(): UInt =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceKernelGetCompiledSdkVersion()

public actual fun sceKernelLibcTime(t: COpaquePointer?): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceKernelLibcTime(t?.value?.toCPointer<ByteVar>())

public actual fun sceKernelLibcClock(): UInt =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceKernelLibcClock()

public actual fun sceKernelLibcGettimeofday(tp: COpaquePointer?, tzp: COpaquePointer?): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceKernelLibcGettimeofday(tp?.value?.toCPointer<ByteVar>(), tzp?.value?.toCPointer<ByteVar>())

public actual fun sceKernelDcacheWritebackAll() {
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceKernelDcacheWritebackAll()
}

public actual fun sceKernelDcacheWritebackInvalidateAll() {
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceKernelDcacheWritebackInvalidateAll()
}

public actual fun sceKernelDcacheWritebackRange(p: COpaquePointer?, size: UInt) {
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceKernelDcacheWritebackRange(p?.value?.toCPointer<ByteVar>(), size)
}

public actual fun sceKernelDcacheWritebackInvalidateRange(p: COpaquePointer?, size: UInt) {
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceKernelDcacheWritebackInvalidateRange(p?.value?.toCPointer<ByteVar>(), size)
}

public actual fun sceKernelDcacheInvalidateRange(p: COpaquePointer?, size: UInt) {
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceKernelDcacheInvalidateRange(p?.value?.toCPointer<ByteVar>(), size)
}

public actual fun sceKernelIcacheInvalidateAll() {
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceKernelIcacheInvalidateAll()
}

public actual fun sceKernelIcacheInvalidateRange(p: COpaquePointer?, size: UInt) {
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceKernelIcacheInvalidateRange(p?.value?.toCPointer<ByteVar>(), size)
}

public actual fun sceKernelUtilsMt19937Init(ctx: COpaquePointer?, seed: UInt): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceKernelUtilsMt19937Init(ctx?.value?.toCPointer<ByteVar>(), seed)

public actual fun sceKernelUtilsMt19937UInt(ctx: COpaquePointer?): UInt =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceKernelUtilsMt19937UInt(ctx?.value?.toCPointer<ByteVar>())

public actual fun sceKernelUtilsMd5Digest(data: COpaquePointer?, size: UInt, digest: COpaquePointer?): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceKernelUtilsMd5Digest(data?.value?.toCPointer<ByteVar>(), size, digest?.value?.toCPointer<ByteVar>())

public actual fun sceKernelUtilsMd5BlockInit(ctx: COpaquePointer?): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceKernelUtilsMd5BlockInit(ctx?.value?.toCPointer<ByteVar>())

public actual fun sceKernelUtilsMd5BlockUpdate(ctx: COpaquePointer?, data: COpaquePointer?, size: UInt): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceKernelUtilsMd5BlockUpdate(ctx?.value?.toCPointer<ByteVar>(), data?.value?.toCPointer<ByteVar>(), size)

public actual fun sceKernelUtilsMd5BlockResult(ctx: COpaquePointer?, digest: COpaquePointer?): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceKernelUtilsMd5BlockResult(ctx?.value?.toCPointer<ByteVar>(), digest?.value?.toCPointer<ByteVar>())

public actual fun sceKernelUtilsSha1Digest(data: COpaquePointer?, size: UInt, digest: COpaquePointer?): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceKernelUtilsSha1Digest(data?.value?.toCPointer<ByteVar>(), size, digest?.value?.toCPointer<ByteVar>())

public actual fun sceKernelUtilsSha1BlockInit(ctx: COpaquePointer?): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceKernelUtilsSha1BlockInit(ctx?.value?.toCPointer<ByteVar>())

public actual fun sceKernelUtilsSha1BlockUpdate(ctx: COpaquePointer?, data: COpaquePointer?, size: UInt): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceKernelUtilsSha1BlockUpdate(ctx?.value?.toCPointer<ByteVar>(), data?.value?.toCPointer<ByteVar>(), size)

public actual fun sceKernelUtilsSha1BlockResult(ctx: COpaquePointer?, digest: COpaquePointer?): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceKernelUtilsSha1BlockResult(ctx?.value?.toCPointer<ByteVar>(), digest?.value?.toCPointer<ByteVar>())

public actual fun sceKernelRegisterSubIntrHandler(intNo: Int, no: Int, handler: COpaquePointer?, arg: COpaquePointer?): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceKernelRegisterSubIntrHandler(intNo, no, handler?.value?.toCPointer<ByteVar>(), arg?.value?.toCPointer<ByteVar>())

public actual fun sceKernelReleaseSubIntrHandler(intNo: Int, no: Int): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceKernelReleaseSubIntrHandler(intNo, no)

public actual fun sceKernelEnableSubIntr(intNo: Int, no: Int): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceKernelEnableSubIntr(intNo, no)

public actual fun sceKernelDisableSubIntr(intNo: Int, no: Int): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceKernelDisableSubIntr(intNo, no)

public actual fun queryIntrHandlerInfo(intrCode: SceUid, subIntrCode: SceUid, data: COpaquePointer?): Int =
    0

public actual fun sceKernelCpuSuspendIntr(): UInt =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceKernelCpuSuspendIntr()

public actual fun sceKernelCpuResumeIntr(flags: UInt) {
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceKernelCpuResumeIntr(flags)
}

public actual fun sceKernelCpuResumeIntrWithSync(flags: UInt) {
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceKernelCpuResumeIntrWithSync(flags)
}

public actual fun sceKernelIsCpuIntrSuspended(flags: UInt): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceKernelIsCpuIntrSuspended(flags)

public actual fun sceKernelIsCpuIntrEnable(): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceKernelIsCpuIntrEnable()

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
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceKernelSelfStopUnloadModule(unknown, argSize, argp?.value?.toCPointer<ByteVar>())

public actual fun sceKernelStopUnloadSelfModule(argSize: ULong, argp: COpaquePointer?, status: COpaquePointer?, option: COpaquePointer?): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceKernelStopUnloadSelfModule(argSize, argp?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>(), option?.value?.toCPointer<ByteVar>())

public actual fun sceKernelQueryModuleInfo(modId: SceUid, info: COpaquePointer?): Int =
    0

public actual fun sceKernelGetModuleIdList(readBuf: COpaquePointer?, readBufSize: Int, idCount: COpaquePointer?): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceKernelGetModuleIdList(readBuf?.value?.toCPointer<ByteVar>(), readBufSize, idCount?.value?.toCPointer<ByteVar>())

public actual fun sceKernelVolatileMemLock(unk: Int, ptr: COpaquePointer?, size: COpaquePointer?): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceKernelVolatileMemLock(unk, ptr?.value?.toCPointer<ByteVar>(), size?.value?.toCPointer<ByteVar>())

public actual fun sceKernelVolatileMemTryLock(unk: Int, ptr: COpaquePointer?, size: COpaquePointer?): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceKernelVolatileMemTryLock(unk, ptr?.value?.toCPointer<ByteVar>(), size?.value?.toCPointer<ByteVar>())

public actual fun sceKernelVolatileMemUnlock(unk: Int): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceKernelVolatileMemUnlock(unk)

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
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceKernelExitThread(status)

public actual fun sceKernelExitDeleteThread(status: Int): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceKernelExitDeleteThread(status)

public actual fun sceKernelTerminateThread(thid: SceUid): Int =
    0

public actual fun sceKernelTerminateDeleteThread(thid: SceUid): Int =
    0

public actual fun sceKernelSuspendDispatchThread(): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceKernelSuspendDispatchThread()

public actual fun sceKernelResumeDispatchThread(state: Int): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceKernelResumeDispatchThread(state)

public actual fun sceKernelSleepThread(): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceKernelSleepThread()

public actual fun sceKernelSleepThreadCB(): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceKernelSleepThreadCB()

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
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceKernelDelayThread(delay)

public actual fun sceKernelDelayThreadCB(delay: UInt): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceKernelDelayThreadCB(delay)

public actual fun sceKernelDelaySysClockThread(delay: COpaquePointer?): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceKernelDelaySysClockThread(delay?.value?.toCPointer<ByteVar>())

public actual fun sceKernelDelaySysClockThreadCB(delay: COpaquePointer?): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceKernelDelaySysClockThreadCB(delay?.value?.toCPointer<ByteVar>())

public actual fun sceKernelChangeCurrentThreadAttr(unknown: Int, attr: Int): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceKernelChangeCurrentThreadAttr(unknown, attr)

public actual fun sceKernelChangeThreadPriority(thid: SceUid, priority: Int): Int =
    0

public actual fun sceKernelRotateThreadReadyQueue(priority: Int): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceKernelRotateThreadReadyQueue(priority)

public actual fun sceKernelReleaseWaitThread(thid: SceUid): Int =
    0

public actual fun sceKernelGetThreadId(): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceKernelGetThreadId()

public actual fun sceKernelGetThreadCurrentPriority(): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceKernelGetThreadCurrentPriority()

public actual fun sceKernelGetThreadExitStatus(thid: SceUid): Int =
    0

public actual fun sceKernelCheckThreadStack(): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceKernelCheckThreadStack()

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
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceKernelCheckCallback()

public actual fun sceKernelGetThreadmanIdList(type: SceKernelIdListType, readBuf: COpaquePointer?, readBufSize: Int, idCount: COpaquePointer?): Int =
    0

public actual fun sceKernelReferSystemStatus(status: COpaquePointer?): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceKernelReferSystemStatus(status?.value?.toCPointer<ByteVar>())

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
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceKernelCreateFpl(name?.value?.toCPointer<ByteVar>(), part, attr, size, blocks, opt?.value?.toCPointer<ByteVar>())

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
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceKernelUSec2SysClock(usec, clock?.value?.toCPointer<ByteVar>())

public actual fun sceKernelUSec2SysClockWide(usec: UInt): Long =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceKernelUSec2SysClockWide(usec)

public actual fun sceKernelSysClock2USec(clock: COpaquePointer?, low: COpaquePointer?, high: COpaquePointer?): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceKernelSysClock2USec(clock?.value?.toCPointer<ByteVar>(), low?.value?.toCPointer<ByteVar>(), high?.value?.toCPointer<ByteVar>())

public actual fun sceKernelSysClock2USecWide(clock: Long, low: COpaquePointer?, high: COpaquePointer?): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceKernelSysClock2USecWide(clock, low?.value?.toCPointer<ByteVar>(), high?.value?.toCPointer<ByteVar>())

public actual fun sceKernelGetSystemTime(time: COpaquePointer?): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceKernelGetSystemTime(time?.value?.toCPointer<ByteVar>())

public actual fun sceKernelGetSystemTimeWide(): Long =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceKernelGetSystemTimeWide()

public actual fun sceKernelGetSystemTimeLow(): UInt =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceKernelGetSystemTimeLow()

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
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceKernelReferThreadProfiler()?.let { COpaquePointer(it.toLong()) }

public actual fun sceKernelReferGlobalProfiler(): COpaquePointer? =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceKernelReferGlobalProfiler()?.let { COpaquePointer(it.toLong()) }

public actual fun sceUsbStart(driverName: COpaquePointer?, size: Int, args: COpaquePointer?): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUsbStart(driverName?.value?.toCPointer<ByteVar>(), size, args?.value?.toCPointer<ByteVar>())

public actual fun sceUsbStop(driverName: COpaquePointer?, size: Int, args: COpaquePointer?): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUsbStop(driverName?.value?.toCPointer<ByteVar>(), size, args?.value?.toCPointer<ByteVar>())

public actual fun sceUsbActivate(pid: UInt): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUsbActivate(pid)

public actual fun sceUsbDeactivate(pid: UInt): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUsbDeactivate(pid)

public actual fun sceUsbGetState(): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUsbGetState()

public actual fun sceUsbGetDrvState(driverName: COpaquePointer?): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUsbGetDrvState(driverName?.value?.toCPointer<ByteVar>())

public actual fun sceUsbCamSetupStill(param: COpaquePointer?): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUsbCamSetupStill(param?.value?.toCPointer<ByteVar>())

public actual fun sceUsbCamSetupStillEx(param: COpaquePointer?): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUsbCamSetupStillEx(param?.value?.toCPointer<ByteVar>())

public actual fun sceUsbCamStillInputBlocking(buf: COpaquePointer?, size: ULong): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUsbCamStillInputBlocking(buf?.value?.toCPointer<ByteVar>(), size)

public actual fun sceUsbCamStillInput(buf: COpaquePointer?, size: ULong): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUsbCamStillInput(buf?.value?.toCPointer<ByteVar>(), size)

public actual fun sceUsbCamStillWaitInputEnd(): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUsbCamStillWaitInputEnd()

public actual fun sceUsbCamStillPollInputEnd(): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUsbCamStillPollInputEnd()

public actual fun sceUsbCamStillCancelInput(): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUsbCamStillCancelInput()

public actual fun sceUsbCamStillGetInputLength(): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUsbCamStillGetInputLength()

public actual fun sceUsbCamSetupVideo(param: COpaquePointer?, workArea: COpaquePointer?, workAreaSize: Int): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUsbCamSetupVideo(param?.value?.toCPointer<ByteVar>(), workArea?.value?.toCPointer<ByteVar>(), workAreaSize)

public actual fun sceUsbCamSetupVideoEx(param: COpaquePointer?, workArea: COpaquePointer?, workAreaSize: Int): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUsbCamSetupVideoEx(param?.value?.toCPointer<ByteVar>(), workArea?.value?.toCPointer<ByteVar>(), workAreaSize)

public actual fun sceUsbCamStartVideo(): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUsbCamStartVideo()

public actual fun sceUsbCamStopVideo(): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUsbCamStopVideo()

public actual fun sceUsbCamReadVideoFrameBlocking(buf: COpaquePointer?, size: ULong): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUsbCamReadVideoFrameBlocking(buf?.value?.toCPointer<ByteVar>(), size)

public actual fun sceUsbCamReadVideoFrame(buf: COpaquePointer?, size: ULong): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUsbCamReadVideoFrame(buf?.value?.toCPointer<ByteVar>(), size)

public actual fun sceUsbCamWaitReadVideoFrameEnd(): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUsbCamWaitReadVideoFrameEnd()

public actual fun sceUsbCamPollReadVideoFrameEnd(): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUsbCamPollReadVideoFrameEnd()

public actual fun sceUsbCamGetReadVideoFrameSize(): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUsbCamGetReadVideoFrameSize()

public actual fun sceUsbCamSetSaturation(saturation: Int): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUsbCamSetSaturation(saturation)

public actual fun sceUsbCamSetBrightness(brightness: Int): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUsbCamSetBrightness(brightness)

public actual fun sceUsbCamSetContrast(contrast: Int): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUsbCamSetContrast(contrast)

public actual fun sceUsbCamSetSharpness(sharpness: Int): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUsbCamSetSharpness(sharpness)

public actual fun sceUsbCamSetImageEffectMode(effectMode: UsbCamEffectMode): Int =
    0

public actual fun sceUsbCamSetEvLevel(exposureLevel: UsbCamEvLevel): Int =
    0

public actual fun sceUsbCamSetReverseMode(reverseFlags: Int): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUsbCamSetReverseMode(reverseFlags)

public actual fun sceUsbCamSetZoom(zoom: Int): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUsbCamSetZoom(zoom)

public actual fun sceUsbCamGetSaturation(saturation: COpaquePointer?): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUsbCamGetSaturation(saturation?.value?.toCPointer<ByteVar>())

public actual fun sceUsbCamGetBrightness(brightness: COpaquePointer?): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUsbCamGetBrightness(brightness?.value?.toCPointer<ByteVar>())

public actual fun sceUsbCamGetContrast(contrast: COpaquePointer?): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUsbCamGetContrast(contrast?.value?.toCPointer<ByteVar>())

public actual fun sceUsbCamGetSharpness(sharpness: COpaquePointer?): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUsbCamGetSharpness(sharpness?.value?.toCPointer<ByteVar>())

public actual fun sceUsbCamGetImageEffectMode(effectMode: COpaquePointer?): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUsbCamGetImageEffectMode(effectMode?.value?.toCPointer<ByteVar>())

public actual fun sceUsbCamGetEvLevel(exposureLevel: COpaquePointer?): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUsbCamGetEvLevel(exposureLevel?.value?.toCPointer<ByteVar>())

public actual fun sceUsbCamGetReverseMode(reverseFlags: COpaquePointer?): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUsbCamGetReverseMode(reverseFlags?.value?.toCPointer<ByteVar>())

public actual fun sceUsbCamGetZoom(zoom: COpaquePointer?): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUsbCamGetZoom(zoom?.value?.toCPointer<ByteVar>())

public actual fun sceUsbCamAutoImageReverseSW(on: Int): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUsbCamAutoImageReverseSW(on)

public actual fun sceUsbCamGetAutoImageReverseState(): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUsbCamGetAutoImageReverseState()

public actual fun sceUsbCamGetLensDirection(): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUsbCamGetLensDirection()

public actual fun sceUsbstorBootRegisterNotify(eventFlag: SceUid): Int =
    0

public actual fun sceUsbstorBootUnregisterNotify(eventFlag: UInt): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUsbstorBootUnregisterNotify(eventFlag)

public actual fun sceUsbstorBootSetCapacity(size: UInt): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUsbstorBootSetCapacity(size)

public actual fun scePowerRegisterCallback(slot: Int, cbid: SceUid): Int =
    0

public actual fun scePowerUnregisterCallback(slot: Int): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_scePowerUnregisterCallback(slot)

public actual fun scePowerIsPowerOnline(): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_scePowerIsPowerOnline()

public actual fun scePowerIsBatteryExist(): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_scePowerIsBatteryExist()

public actual fun scePowerIsBatteryCharging(): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_scePowerIsBatteryCharging()

public actual fun scePowerGetBatteryChargingStatus(): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_scePowerGetBatteryChargingStatus()

public actual fun scePowerIsLowBattery(): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_scePowerIsLowBattery()

public actual fun scePowerGetBatteryLifePercent(): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_scePowerGetBatteryLifePercent()

public actual fun scePowerGetBatteryLifeTime(): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_scePowerGetBatteryLifeTime()

public actual fun scePowerGetBatteryTemp(): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_scePowerGetBatteryTemp()

public actual fun scePowerGetBatteryElec(): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_scePowerGetBatteryElec()

public actual fun scePowerGetBatteryVolt(): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_scePowerGetBatteryVolt()

public actual fun scePowerSetCpuClockFrequency(cpufreq: Int): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_scePowerSetCpuClockFrequency(cpufreq)

public actual fun scePowerSetBusClockFrequency(busfreq: Int): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_scePowerSetBusClockFrequency(busfreq)

public actual fun scePowerGetCpuClockFrequency(): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_scePowerGetCpuClockFrequency()

public actual fun scePowerGetCpuClockFrequencyInt(): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_scePowerGetCpuClockFrequencyInt()

public actual fun scePowerGetCpuClockFrequencyFloat(): Float =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_scePowerGetCpuClockFrequencyFloat()

public actual fun scePowerGetBusClockFrequency(): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_scePowerGetBusClockFrequency()

public actual fun scePowerGetBusClockFrequencyInt(): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_scePowerGetBusClockFrequencyInt()

public actual fun scePowerGetBusClockFrequencyFloat(): Float =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_scePowerGetBusClockFrequencyFloat()

public actual fun scePowerSetClockFrequency(pllfreq: Int, cpufreq: Int, busfreq: Int): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_scePowerSetClockFrequency(pllfreq, cpufreq, busfreq)

public actual fun scePowerLock(unknown: Int): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_scePowerLock(unknown)

public actual fun scePowerUnlock(unknown: Int): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_scePowerUnlock(unknown)

public actual fun scePowerTick(t: PowerTick): Int =
    0

public actual fun scePowerGetIdleTimer(): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_scePowerGetIdleTimer()

public actual fun scePowerIdleTimerEnable(unknown: Int): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_scePowerIdleTimerEnable(unknown)

public actual fun scePowerIdleTimerDisable(unknown: Int): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_scePowerIdleTimerDisable(unknown)

public actual fun scePowerRequestStandby(): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_scePowerRequestStandby()

public actual fun scePowerRequestSuspend(): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_scePowerRequestSuspend()

public actual fun sceWlanDevIsPowerOn(): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceWlanDevIsPowerOn()

public actual fun sceWlanGetSwitchState(): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceWlanGetSwitchState()

public actual fun sceWlanGetEtherAddr(etherAddr: COpaquePointer?): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceWlanGetEtherAddr(etherAddr?.value?.toCPointer<ByteVar>())

public actual fun sceWlanDevAttach(): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceWlanDevAttach()

public actual fun sceWlanDevDetach(): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceWlanDevDetach()

public actual fun sceRtcGetTickResolution(): UInt =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceRtcGetTickResolution()

public actual fun sceRtcGetCurrentTick(tick: COpaquePointer?): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceRtcGetCurrentTick(tick?.value?.toCPointer<ByteVar>())

public actual fun sceRtcGetCurrentClock(tm: COpaquePointer?, tz: Int): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceRtcGetCurrentClock(tm?.value?.toCPointer<ByteVar>(), tz)

public actual fun sceRtcGetCurrentClockLocalTime(tm: COpaquePointer?): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceRtcGetCurrentClockLocalTime(tm?.value?.toCPointer<ByteVar>())

public actual fun sceRtcConvertUtcToLocalTime(tickUtc: COpaquePointer?, tickLocal: COpaquePointer?): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceRtcConvertUtcToLocalTime(tickUtc?.value?.toCPointer<ByteVar>(), tickLocal?.value?.toCPointer<ByteVar>())

public actual fun sceRtcConvertLocalTimeToUTC(tickLocal: COpaquePointer?, tickUtc: COpaquePointer?): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceRtcConvertLocalTimeToUTC(tickLocal?.value?.toCPointer<ByteVar>(), tickUtc?.value?.toCPointer<ByteVar>())

public actual fun sceRtcIsLeapYear(year: Int): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceRtcIsLeapYear(year)

public actual fun sceRtcGetDaysInMonth(year: Int, month: Int): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceRtcGetDaysInMonth(year, month)

public actual fun sceRtcGetDayOfWeek(year: Int, month: Int, day: Int): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceRtcGetDayOfWeek(year, month, day)

public actual fun sceRtcCheckValid(date: COpaquePointer?): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceRtcCheckValid(date?.value?.toCPointer<ByteVar>())

public actual fun sceRtcSetTick(date: COpaquePointer?, tick: COpaquePointer?): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceRtcSetTick(date?.value?.toCPointer<ByteVar>(), tick?.value?.toCPointer<ByteVar>())

public actual fun sceRtcGetTick(date: COpaquePointer?, tick: COpaquePointer?): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceRtcGetTick(date?.value?.toCPointer<ByteVar>(), tick?.value?.toCPointer<ByteVar>())

public actual fun sceRtcCompareTick(tick1: COpaquePointer?, tick2: COpaquePointer?): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceRtcCompareTick(tick1?.value?.toCPointer<ByteVar>(), tick2?.value?.toCPointer<ByteVar>())

public actual fun sceRtcTickAddTicks(destTick: COpaquePointer?, srcTick: COpaquePointer?, numTicks: ULong): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceRtcTickAddTicks(destTick?.value?.toCPointer<ByteVar>(), srcTick?.value?.toCPointer<ByteVar>(), numTicks)

public actual fun sceRtcTickAddMicroseconds(destTick: COpaquePointer?, srcTick: COpaquePointer?, numMs: ULong): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceRtcTickAddMicroseconds(destTick?.value?.toCPointer<ByteVar>(), srcTick?.value?.toCPointer<ByteVar>(), numMs)

public actual fun sceRtcTickAddSeconds(destTick: COpaquePointer?, srcTick: COpaquePointer?, numSeconds: ULong): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceRtcTickAddSeconds(destTick?.value?.toCPointer<ByteVar>(), srcTick?.value?.toCPointer<ByteVar>(), numSeconds)

public actual fun sceRtcTickAddMinutes(destTick: COpaquePointer?, srcTick: COpaquePointer?, numMinutes: ULong): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceRtcTickAddMinutes(destTick?.value?.toCPointer<ByteVar>(), srcTick?.value?.toCPointer<ByteVar>(), numMinutes)

public actual fun sceRtcTickAddHours(destTick: COpaquePointer?, srcTick: COpaquePointer?, numHours: ULong): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceRtcTickAddHours(destTick?.value?.toCPointer<ByteVar>(), srcTick?.value?.toCPointer<ByteVar>(), numHours)

public actual fun sceRtcTickAddDays(destTick: COpaquePointer?, srcTick: COpaquePointer?, numDays: ULong): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceRtcTickAddDays(destTick?.value?.toCPointer<ByteVar>(), srcTick?.value?.toCPointer<ByteVar>(), numDays)

public actual fun sceRtcTickAddWeeks(destTick: COpaquePointer?, srcTick: COpaquePointer?, numWeeks: ULong): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceRtcTickAddWeeks(destTick?.value?.toCPointer<ByteVar>(), srcTick?.value?.toCPointer<ByteVar>(), numWeeks)

public actual fun sceRtcTickAddMonths(destTick: COpaquePointer?, srcTick: COpaquePointer?, numMonths: ULong): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceRtcTickAddMonths(destTick?.value?.toCPointer<ByteVar>(), srcTick?.value?.toCPointer<ByteVar>(), numMonths)

public actual fun sceRtcTickAddYears(destTick: COpaquePointer?, srcTick: COpaquePointer?, numYears: ULong): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceRtcTickAddYears(destTick?.value?.toCPointer<ByteVar>(), srcTick?.value?.toCPointer<ByteVar>(), numYears)

public actual fun sceRtcSetTimeT(date: COpaquePointer?, time: UInt): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceRtcSetTimeT(date?.value?.toCPointer<ByteVar>(), time)

public actual fun sceRtcGetTimeT(date: COpaquePointer?, time: COpaquePointer?): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceRtcGetTimeT(date?.value?.toCPointer<ByteVar>(), time?.value?.toCPointer<ByteVar>())

public actual fun sceRtcSetTime64T(date: COpaquePointer?, time: ULong): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceRtcSetTime64T(date?.value?.toCPointer<ByteVar>(), time)

public actual fun sceRtcGetTime64T(date: COpaquePointer?, time: COpaquePointer?): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceRtcGetTime64T(date?.value?.toCPointer<ByteVar>(), time?.value?.toCPointer<ByteVar>())

public actual fun sceRtcSetDosTime(date: COpaquePointer?, dosTime: UInt): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceRtcSetDosTime(date?.value?.toCPointer<ByteVar>(), dosTime)

public actual fun sceRtcGetDosTime(date: COpaquePointer?, dosTime: UInt): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceRtcGetDosTime(date?.value?.toCPointer<ByteVar>(), dosTime)

public actual fun sceRtcSetWin32FileTime(date: COpaquePointer?, time: COpaquePointer?): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceRtcSetWin32FileTime(date?.value?.toCPointer<ByteVar>(), time?.value?.toCPointer<ByteVar>())

public actual fun sceRtcGetWin32FileTime(date: COpaquePointer?, time: COpaquePointer?): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceRtcGetWin32FileTime(date?.value?.toCPointer<ByteVar>(), time?.value?.toCPointer<ByteVar>())

public actual fun sceRtcParseDateTime(destTick: COpaquePointer?, dateString: COpaquePointer?): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceRtcParseDateTime(destTick?.value?.toCPointer<ByteVar>(), dateString?.value?.toCPointer<ByteVar>())

public actual fun sceRtcFormatRFC3339(pszDateTime: COpaquePointer?, pUtc: COpaquePointer?, timeZoneMinutes: Int): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceRtcFormatRFC3339(pszDateTime?.value?.toCPointer<ByteVar>(), pUtc?.value?.toCPointer<ByteVar>(), timeZoneMinutes)

public actual fun sceRtcFormatRFC3339LocalTime(pszDateTime: COpaquePointer?, pUtc: COpaquePointer?): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceRtcFormatRFC3339LocalTime(pszDateTime?.value?.toCPointer<ByteVar>(), pUtc?.value?.toCPointer<ByteVar>())

public actual fun sceRtcParseRFC3339(pUtc: COpaquePointer?, pszDateTime: COpaquePointer?): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceRtcParseRFC3339(pUtc?.value?.toCPointer<ByteVar>(), pszDateTime?.value?.toCPointer<ByteVar>())

public actual fun sceRtcFormatRFC2822(pszDateTime: COpaquePointer?, pUtc: COpaquePointer?, timeZoneMinutes: Int): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceRtcFormatRFC2822(pszDateTime?.value?.toCPointer<ByteVar>(), pUtc?.value?.toCPointer<ByteVar>(), timeZoneMinutes)

public actual fun sceRtcFormatRFC2822LocalTime(pszDateTime: COpaquePointer?, pUtc: COpaquePointer?): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceRtcFormatRFC2822LocalTime(pszDateTime?.value?.toCPointer<ByteVar>(), pUtc?.value?.toCPointer<ByteVar>())

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
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceIoRemove(file?.value?.toCPointer<ByteVar>())

public actual fun sceIoMkdir(dir: COpaquePointer?, mode: IoPermissions): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceIoMkdir(dir?.value?.toCPointer<ByteVar>(), mode)

public actual fun sceIoRmdir(path: COpaquePointer?): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceIoRmdir(path?.value?.toCPointer<ByteVar>())

public actual fun sceIoChdir(path: COpaquePointer?): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceIoChdir(path?.value?.toCPointer<ByteVar>())

public actual fun sceIoRename(oldname: COpaquePointer?, newname: COpaquePointer?): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceIoRename(oldname?.value?.toCPointer<ByteVar>(), newname?.value?.toCPointer<ByteVar>())

public actual fun sceIoDopen(dirname: COpaquePointer?): SceUid =
    null as SceUid

public actual fun sceIoDread(fd: SceUid, dir: COpaquePointer?): Int =
    0

public actual fun sceIoDclose(fd: SceUid): Int =
    0

public actual fun sceIoDevctl(dev: COpaquePointer?, cmd: UInt, indata: COpaquePointer?, inlen: Int, outdata: COpaquePointer?, outlen: Int): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceIoDevctl(dev?.value?.toCPointer<ByteVar>(), cmd, indata?.value?.toCPointer<ByteVar>(), inlen, outdata?.value?.toCPointer<ByteVar>(), outlen)

public actual fun sceIoAssign(dev1: COpaquePointer?, dev2: COpaquePointer?, dev3: COpaquePointer?, mode: IoAssignPerms, unk1: COpaquePointer?, unk2: Int): Int =
    0

public actual fun sceIoUnassign(dev: COpaquePointer?): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceIoUnassign(dev?.value?.toCPointer<ByteVar>())

public actual fun sceIoGetstat(file: COpaquePointer?, stat: COpaquePointer?): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceIoGetstat(file?.value?.toCPointer<ByteVar>(), stat?.value?.toCPointer<ByteVar>())

public actual fun sceIoChstat(file: COpaquePointer?, stat: COpaquePointer?, bits: Int): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceIoChstat(file?.value?.toCPointer<ByteVar>(), stat?.value?.toCPointer<ByteVar>(), bits)

public actual fun sceIoIoctl(fd: SceUid, cmd: UInt, indata: COpaquePointer?, inlen: Int, outdata: COpaquePointer?, outlen: Int): Int =
    0

public actual fun sceIoIoctlAsync(fd: SceUid, cmd: UInt, indata: COpaquePointer?, inlen: Int, outdata: COpaquePointer?, outlen: Int): Int =
    0

public actual fun sceIoSync(device: COpaquePointer?, unk: UInt): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceIoSync(device?.value?.toCPointer<ByteVar>(), unk)

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
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceJpegInitMJpeg()

public actual fun sceJpegFinishMJpeg(): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceJpegFinishMJpeg()

public actual fun sceJpegCreateMJpeg(width: Int, height: Int): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceJpegCreateMJpeg(width, height)

public actual fun sceJpegDeleteMJpeg(): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceJpegDeleteMJpeg()

public actual fun sceJpegDecodeMJpeg(jpegBuf: COpaquePointer?, size: ULong, rgba: COpaquePointer?, unk: UInt): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceJpegDecodeMJpeg(jpegBuf?.value?.toCPointer<ByteVar>(), size, rgba?.value?.toCPointer<ByteVar>(), unk)

public actual fun sceUmdCheckMedium(): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUmdCheckMedium()

public actual fun sceUmdGetDiscInfo(info: COpaquePointer?): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUmdGetDiscInfo(info?.value?.toCPointer<ByteVar>())

public actual fun sceUmdActivate(unit: Int, drive: COpaquePointer?): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUmdActivate(unit, drive?.value?.toCPointer<ByteVar>())

public actual fun sceUmdDeactivate(unit: Int, drive: COpaquePointer?): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUmdDeactivate(unit, drive?.value?.toCPointer<ByteVar>())

public actual fun sceUmdWaitDriveStat(state: Int): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUmdWaitDriveStat(state)

public actual fun sceUmdWaitDriveStatWithTimer(state: Int, timeout: UInt): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUmdWaitDriveStatWithTimer(state, timeout)

public actual fun sceUmdWaitDriveStatCB(state: Int, timeout: UInt): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUmdWaitDriveStatCB(state, timeout)

public actual fun sceUmdCancelWaitDriveStat(): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUmdCancelWaitDriveStat()

public actual fun sceUmdGetDriveStat(): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUmdGetDriveStat()

public actual fun sceUmdGetErrorStat(): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUmdGetErrorStat()

public actual fun sceUmdRegisterUMDCallBack(cbid: Int): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUmdRegisterUMDCallBack(cbid)

public actual fun sceUmdUnRegisterUMDCallBack(cbid: Int): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUmdUnRegisterUMDCallBack(cbid)

public actual fun sceUmdReplacePermit(): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUmdReplacePermit()

public actual fun sceUmdReplaceProhibit(): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUmdReplaceProhibit()

public actual fun sceMpegInit(): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceMpegInit()

public actual fun sceMpegFinish() {
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceMpegFinish()
}

public actual fun sceMpegRingbufferQueryMemSize(packets: Int): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceMpegRingbufferQueryMemSize(packets)

public actual fun sceMpegRingbufferConstruct(ringbuffer: COpaquePointer?, packets: Int, data: COpaquePointer?, size: Int, callback: SceMpegRingbufferCb, cbParam: COpaquePointer?): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceMpegRingbufferConstruct(ringbuffer?.value?.toCPointer<ByteVar>(), packets, data?.value?.toCPointer<ByteVar>(), size, 0L.toCPointer<ByteVar>(), cbParam?.value?.toCPointer<ByteVar>())

public actual fun sceMpegRingbufferDestruct(ringbuffer: COpaquePointer?) {
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceMpegRingbufferDestruct(ringbuffer?.value?.toCPointer<ByteVar>())
}

public actual fun sceMpegRingbufferAvailableSize(ringbuffer: COpaquePointer?): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceMpegRingbufferAvailableSize(ringbuffer?.value?.toCPointer<ByteVar>())

public actual fun sceMpegRingbufferPut(ringbuffer: COpaquePointer?, numPackets: Int, available: Int): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceMpegRingbufferPut(ringbuffer?.value?.toCPointer<ByteVar>(), numPackets, available)

public actual fun sceMpegQueryMemSize(unk: Int): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceMpegQueryMemSize(unk)

public actual fun sceMpegCreate(handle: SceMpeg, data: COpaquePointer?, size: Int, ringbuffer: COpaquePointer?, frameWidth: Int, unk1: Int, unk2: Int): Int =
    0

public actual fun sceMpegDelete(handle: SceMpeg) {
}

public actual fun sceMpegQueryStreamOffset(handle: SceMpeg, buffer: COpaquePointer?, offset: COpaquePointer?): Int =
    0

public actual fun sceMpegQueryStreamSize(buffer: COpaquePointer?, size: COpaquePointer?): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceMpegQueryStreamSize(buffer?.value?.toCPointer<ByteVar>(), size?.value?.toCPointer<ByteVar>())

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
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceMpegBaseYCrCbCopyVme(yuvBuffer?.value?.toCPointer<ByteVar>(), buffer?.value?.toCPointer<ByteVar>(), type)

public actual fun sceMpegBaseCscInit(width: Int): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceMpegBaseCscInit(width)

public actual fun sceMpegBaseCscVme(rgbBuffer: COpaquePointer?, rgbBuffer2: COpaquePointer?, width: Int, yCrCbBuffer: COpaquePointer?): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceMpegBaseCscVme(rgbBuffer?.value?.toCPointer<ByteVar>(), rgbBuffer2?.value?.toCPointer<ByteVar>(), width, yCrCbBuffer?.value?.toCPointer<ByteVar>())

public actual fun sceMpegbaseBea18f91(lli: COpaquePointer?): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceMpegbaseBea18f91(lli?.value?.toCPointer<ByteVar>())

public actual fun sceHprmPeekCurrentKey(key: COpaquePointer?): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceHprmPeekCurrentKey(key?.value?.toCPointer<ByteVar>())

public actual fun sceHprmPeekLatch(latch: COpaquePointer?): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceHprmPeekLatch(latch?.value?.toCPointer<ByteVar>())

public actual fun sceHprmReadLatch(latch: COpaquePointer?): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceHprmReadLatch(latch?.value?.toCPointer<ByteVar>())

public actual fun sceHprmIsHeadphoneExist(): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceHprmIsHeadphoneExist()

public actual fun sceHprmIsRemoteExist(): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceHprmIsRemoteExist()

public actual fun sceHprmIsMicrophoneExist(): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceHprmIsMicrophoneExist()

public actual fun sceGuDepthBuffer(zbp: COpaquePointer?, zbw: Int) {
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGuDepthBuffer(zbp?.value?.toCPointer<ByteVar>(), zbw)
}

public actual fun sceGuDispBuffer(width: Int, height: Int, dispbp: COpaquePointer?, dispbw: Int) {
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGuDispBuffer(width, height, dispbp?.value?.toCPointer<ByteVar>(), dispbw)
}

public actual fun sceGuDrawBuffer(psm: DisplayPixelFormat, fbp: COpaquePointer?, fbw: Int) {
}

public actual fun sceGuDrawBufferList(psm: DisplayPixelFormat, fbp: COpaquePointer?, fbw: Int) {
}

public actual fun sceGuDisplay(state: Boolean): Boolean =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGuDisplay(state)

public actual fun sceGuDepthFunc(function: DepthFunc) {
}

public actual fun sceGuDepthMask(mask: Int) {
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGuDepthMask(mask)
}

public actual fun sceGuDepthOffset(offset: Int) {
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGuDepthOffset(offset)
}

public actual fun sceGuDepthRange(near: Int, far: Int) {
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGuDepthRange(near, far)
}

public actual fun sceGuFog(near: Float, far: Float, color: UInt) {
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGuFog(near, far, color)
}

public actual fun sceGuInit() {
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGuInit()
}

public actual fun sceGuTerm() {
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGuTerm()
}

public actual fun sceGuBreak(mode: Int) {
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGuBreak(mode)
}

public actual fun sceGuContinue() {
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGuContinue()
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
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGuGetMemory(size)?.let { COpaquePointer(it.toLong()) }

public actual fun sceGuStart(contextType: GuContextType, list: COpaquePointer?) {
}

public actual fun sceGuFinish(): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGuFinish()

public actual fun sceGuFinishId(id: UInt): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGuFinishId(id)

public actual fun sceGuCallList(list: COpaquePointer?) {
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGuCallList(list?.value?.toCPointer<ByteVar>())
}

public actual fun sceGuCallMode(mode: Int) {
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGuCallMode(mode)
}

public actual fun sceGuCheckList(): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGuCheckList()

public actual fun sceGuSendList(mode: GuQueueMode, list: COpaquePointer?, context: COpaquePointer?) {
}

public actual fun sceGuSwapBuffers(): COpaquePointer? =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGuSwapBuffers()?.let { COpaquePointer(it.toLong()) }

public actual fun sceGuSync(mode: GuSyncMode, behavior: GuSyncBehavior): GeListState =
    null as GeListState

public actual fun sceGuDrawArray(prim: GuPrimitive, vtype: Int, count: Int, indices: COpaquePointer?, vertices: COpaquePointer?) {
}

public actual fun sceGuBeginObject(vtype: Int, count: Int, indices: COpaquePointer?, vertices: COpaquePointer?) {
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGuBeginObject(vtype, count, indices?.value?.toCPointer<ByteVar>(), vertices?.value?.toCPointer<ByteVar>())
}

public actual fun sceGuEndObject() {
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGuEndObject()
}

public actual fun sceGuSetStatus(state: GuState, status: Int) {
}

public actual fun sceGuGetStatus(state: GuState): Boolean =
    false

public actual fun sceGuSetAllStatus(status: Int) {
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGuSetAllStatus(status)
}

public actual fun sceGuGetAllStatus(): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGuGetAllStatus()

public actual fun sceGuEnable(state: GuState) {
}

public actual fun sceGuDisable(state: GuState) {
}

public actual fun sceGuLight(light: Int, type: LightType, components: Int, position: ScePspFVector3) {
}

public actual fun sceGuLightAtt(light: Int, atten0: Float, atten1: Float, atten2: Float) {
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGuLightAtt(light, atten0, atten1, atten2)
}

public actual fun sceGuLightColor(light: Int, component: Int, color: UInt) {
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGuLightColor(light, component, color)
}

public actual fun sceGuLightMode(mode: LightMode) {
}

public actual fun sceGuLightSpot(light: Int, direction: ScePspFVector3, exponent: Float, cutoff: Float) {
}

public actual fun sceGuClear(flags: Int) {
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGuClear(flags)
}

public actual fun sceGuClearColor(color: UInt) {
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGuClearColor(color)
}

public actual fun sceGuClearDepth(depth: UInt) {
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGuClearDepth(depth)
}

public actual fun sceGuClearStencil(stencil: UInt) {
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGuClearStencil(stencil)
}

public actual fun sceGuPixelMask(mask: UInt) {
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGuPixelMask(mask)
}

public actual fun sceGuColor(color: UInt) {
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGuColor(color)
}

public actual fun sceGuColorFunc(func: ColorFunc, color: UInt, mask: UInt) {
}

public actual fun sceGuColorMaterial(components: Int) {
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGuColorMaterial(components)
}

public actual fun sceGuAlphaFunc(func: AlphaFunc, value: Int, mask: Int) {
}

public actual fun sceGuAmbient(color: UInt) {
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGuAmbient(color)
}

public actual fun sceGuAmbientColor(color: UInt) {
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGuAmbientColor(color)
}

public actual fun sceGuBlendFunc(op: BlendOp, src: BlendSrc, dest: BlendDst, srcFix: UInt, destFix: UInt) {
}

public actual fun sceGuMaterial(components: Int, color: UInt) {
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGuMaterial(components, color)
}

public actual fun sceGuModelColor(emissive: UInt, ambient: UInt, diffuse: UInt, specular: UInt) {
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGuModelColor(emissive, ambient, diffuse, specular)
}

public actual fun sceGuStencilFunc(func: StencilFunc, ref: Int, mask: Int) {
}

public actual fun sceGuStencilOp(fail: StencilOperation, zfail: StencilOperation, zpass: StencilOperation) {
}

public actual fun sceGuSpecular(power: Float) {
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGuSpecular(power)
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
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGuTexEnvColor(color)
}

public actual fun sceGuTexFilter(min: TextureFilter, mag: TextureFilter) {
}

public actual fun sceGuTexFlush() {
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGuTexFlush()
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
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGuTexOffset(u, v)
}

public actual fun sceGuTexProjMapMode(mode: TextureProjectionMapMode) {
}

public actual fun sceGuTexScale(u: Float, v: Float) {
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGuTexScale(u, v)
}

public actual fun sceGuTexSlope(slope: Float) {
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGuTexSlope(slope)
}

public actual fun sceGuTexSync() {
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGuTexSync()
}

public actual fun sceGuTexWrap(u: GuTexWrapMode, v: GuTexWrapMode) {
}

public actual fun sceGuClutLoad(numBlocks: Int, cbp: COpaquePointer?) {
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGuClutLoad(numBlocks, cbp?.value?.toCPointer<ByteVar>())
}

public actual fun sceGuClutMode(cpsm: ClutPixelFormat, shift: UInt, mask: UInt, a3: UInt) {
}

public actual fun sceGuOffset(x: UInt, y: UInt) {
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGuOffset(x, y)
}

public actual fun sceGuScissor(x: Int, y: Int, w: Int, h: Int) {
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGuScissor(x, y, w, h)
}

public actual fun sceGuViewport(cx: Int, cy: Int, width: Int, height: Int) {
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGuViewport(cx, cy, width, height)
}

public actual fun sceGuDrawBezier(vType: Int, uCount: Int, vCount: Int, indices: COpaquePointer?, vertices: COpaquePointer?) {
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGuDrawBezier(vType, uCount, vCount, indices?.value?.toCPointer<ByteVar>(), vertices?.value?.toCPointer<ByteVar>())
}

public actual fun sceGuPatchDivide(ulevel: UInt, vlevel: UInt) {
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGuPatchDivide(ulevel, vlevel)
}

public actual fun sceGuPatchFrontFace(a0: UInt) {
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGuPatchFrontFace(a0)
}

public actual fun sceGuPatchPrim(prim: PatchPrimitive) {
}

public actual fun sceGuDrawSpline(vType: Int, uCount: Int, vCount: Int, uEdge: Int, vEdge: Int, indices: COpaquePointer?, vertices: COpaquePointer?) {
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGuDrawSpline(vType, uCount, vCount, uEdge, vEdge, indices?.value?.toCPointer<ByteVar>(), vertices?.value?.toCPointer<ByteVar>())
}

public actual fun sceGuSetMatrix(type: MatrixMode, matrix: ScePspFMatrix4) {
}

public actual fun sceGuBoneMatrix(index: UInt, matrix: ScePspFMatrix4) {
}

public actual fun sceGuMorphWeight(index: Int, weight: Float) {
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGuMorphWeight(index, weight)
}

public actual fun sceGuDrawArrayN(primitiveType: GuPrimitive, vType: Int, count: Int, a3: Int, indices: COpaquePointer?, vertices: COpaquePointer?) {
}

public actual fun sceGumDrawArray(prim: GuPrimitive, vType: Int, count: Int, indices: COpaquePointer?, vertices: COpaquePointer?) {
}

public actual fun sceGumDrawArrayN(prim: GuPrimitive, vType: Int, count: Int, a3: Int, indices: COpaquePointer?, vertices: COpaquePointer?) {
}

public actual fun sceGumDrawBezier(vType: Int, uCount: Int, vCount: Int, indices: COpaquePointer?, vertices: COpaquePointer?) {
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGumDrawBezier(vType, uCount, vCount, indices?.value?.toCPointer<ByteVar>(), vertices?.value?.toCPointer<ByteVar>())
}

public actual fun sceGumDrawSpline(vType: Int, uCount: Int, vCount: Int, uEdge: Int, vEdge: Int, indices: COpaquePointer?, vertices: COpaquePointer?) {
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGumDrawSpline(vType, uCount, vCount, uEdge, vEdge, indices?.value?.toCPointer<ByteVar>(), vertices?.value?.toCPointer<ByteVar>())
}

public actual fun sceGumFastInverse() {
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGumFastInverse()
}

public actual fun sceGumFullInverse() {
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGumFullInverse()
}

public actual fun sceGumLoadIdentity() {
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGumLoadIdentity()
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
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGumOrtho(left, right, bottom, top, near, far)
}

public actual fun sceGumPerspective(fovy: Float, aspect: Float, near: Float, far: Float) {
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGumPerspective(fovy, aspect, near, far)
}

public actual fun sceGumPopMatrix() {
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGumPopMatrix()
}

public actual fun sceGumPushMatrix() {
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGumPushMatrix()
}

public actual fun sceGumRotateX(angle: Float) {
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGumRotateX(angle)
}

public actual fun sceGumRotateY(angle: Float) {
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGumRotateY(angle)
}

public actual fun sceGumRotateZ(angle: Float) {
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGumRotateZ(angle)
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
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceGumUpdateMatrix()
}

public actual fun sceMp3ReserveMp3Handle(args: COpaquePointer?): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceMp3ReserveMp3Handle(args?.value?.toCPointer<ByteVar>())

public actual fun sceMp3ReleaseMp3Handle(handle: Mp3Handle): Int =
    0

public actual fun sceMp3InitResource(): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceMp3InitResource()

public actual fun sceMp3TermResource(): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceMp3TermResource()

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
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceRegOpenRegistry(reg?.value?.toCPointer<ByteVar>(), mode, handle?.value?.toCPointer<ByteVar>())

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
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceRegRemoveRegistry(key?.value?.toCPointer<ByteVar>())

public actual fun sceOpenPSIDGetOpenPSID(openpsid: COpaquePointer?): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceOpenPSIDGetOpenPSID(openpsid?.value?.toCPointer<ByteVar>())

public actual fun sceUtilityMsgDialogInitStart(params: COpaquePointer?): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUtilityMsgDialogInitStart(params?.value?.toCPointer<ByteVar>())

public actual fun sceUtilityMsgDialogShutdownStart() {
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUtilityMsgDialogShutdownStart()
}

public actual fun sceUtilityMsgDialogGetStatus(): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUtilityMsgDialogGetStatus()

public actual fun sceUtilityMsgDialogUpdate(n: Int) {
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUtilityMsgDialogUpdate(n)
}

public actual fun sceUtilityMsgDialogAbort(): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUtilityMsgDialogAbort()

public actual fun sceUtilityNetconfInitStart(data: COpaquePointer?): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUtilityNetconfInitStart(data?.value?.toCPointer<ByteVar>())

public actual fun sceUtilityNetconfShutdownStart(): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUtilityNetconfShutdownStart()

public actual fun sceUtilityNetconfUpdate(unknown: Int): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUtilityNetconfUpdate(unknown)

public actual fun sceUtilityNetconfGetStatus(): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUtilityNetconfGetStatus()

public actual fun sceUtilityCheckNetParam(id: Int): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUtilityCheckNetParam(id)

public actual fun sceUtilityGetNetParam(conf: Int, param: NetParam, data: COpaquePointer?): Int =
    0

public actual fun sceUtilitySavedataInitStart(params: COpaquePointer?): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUtilitySavedataInitStart(params?.value?.toCPointer<ByteVar>())

public actual fun sceUtilitySavedataGetStatus(): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUtilitySavedataGetStatus()

public actual fun sceUtilitySavedataShutdownStart(): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUtilitySavedataShutdownStart()

public actual fun sceUtilitySavedataUpdate(unknown: Int) {
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUtilitySavedataUpdate(unknown)
}

public actual fun sceUtilityGameSharingInitStart(params: COpaquePointer?): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUtilityGameSharingInitStart(params?.value?.toCPointer<ByteVar>())

public actual fun sceUtilityGameSharingShutdownStart() {
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUtilityGameSharingShutdownStart()
}

public actual fun sceUtilityGameSharingGetStatus(): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUtilityGameSharingGetStatus()

public actual fun sceUtilityGameSharingUpdate(n: Int) {
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUtilityGameSharingUpdate(n)
}

public actual fun sceUtilityHtmlViewerInitStart(params: COpaquePointer?): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUtilityHtmlViewerInitStart(params?.value?.toCPointer<ByteVar>())

public actual fun sceUtilityHtmlViewerShutdownStart(): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUtilityHtmlViewerShutdownStart()

public actual fun sceUtilityHtmlViewerUpdate(n: Int): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUtilityHtmlViewerUpdate(n)

public actual fun sceUtilityHtmlViewerGetStatus(): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUtilityHtmlViewerGetStatus()

public actual fun sceUtilitySetSystemParamInt(id: SystemParamId, value: Int): Int =
    0

public actual fun sceUtilitySetSystemParamString(id: SystemParamId, str: COpaquePointer?): Int =
    0

public actual fun sceUtilityGetSystemParamInt(id: SystemParamId, value: COpaquePointer?): Int =
    0

public actual fun sceUtilityGetSystemParamString(id: SystemParamId, str: COpaquePointer?, len: Int): Int =
    0

public actual fun sceUtilityOskInitStart(params: COpaquePointer?): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUtilityOskInitStart(params?.value?.toCPointer<ByteVar>())

public actual fun sceUtilityOskShutdownStart(): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUtilityOskShutdownStart()

public actual fun sceUtilityOskUpdate(n: Int): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUtilityOskUpdate(n)

public actual fun sceUtilityOskGetStatus(): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUtilityOskGetStatus()

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
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUtilityCreateNetParam(conf)

public actual fun sceUtilitySetNetParam(param: NetParam, value: COpaquePointer?): Int =
    0

public actual fun sceUtilityCopyNetParam(src: Int, dest: Int): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUtilityCopyNetParam(src, dest)

public actual fun sceUtilityDeleteNetParam(conf: Int): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceUtilityDeleteNetParam(conf)

public actual fun sceNetInit(poolsize: Int, calloutprio: Int, calloutstack: Int, netintrprio: Int, netintrstack: Int): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetInit(poolsize, calloutprio, calloutstack, netintrprio, netintrstack)

public actual fun sceNetTerm(): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetTerm()

public actual fun sceNetFreeThreadinfo(thid: Int): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetFreeThreadinfo(thid)

public actual fun sceNetThreadAbort(thid: Int): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetThreadAbort(thid)

public actual fun sceNetEtherStrton(name: COpaquePointer?, mac: COpaquePointer?) {
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetEtherStrton(name?.value?.toCPointer<ByteVar>(), mac?.value?.toCPointer<ByteVar>())
}

public actual fun sceNetEtherNtostr(mac: COpaquePointer?, name: COpaquePointer?) {
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetEtherNtostr(mac?.value?.toCPointer<ByteVar>(), name?.value?.toCPointer<ByteVar>())
}

public actual fun sceNetGetLocalEtherAddr(mac: COpaquePointer?): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetGetLocalEtherAddr(mac?.value?.toCPointer<ByteVar>())

public actual fun sceNetGetMallocStat(stat: COpaquePointer?): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetGetMallocStat(stat?.value?.toCPointer<ByteVar>())

public actual fun sceNetAdhocctlInit(stacksize: Int, priority: Int, adhocId: COpaquePointer?): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetAdhocctlInit(stacksize, priority, adhocId?.value?.toCPointer<ByteVar>())

public actual fun sceNetAdhocctlTerm(): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetAdhocctlTerm()

public actual fun sceNetAdhocctlConnect(name: COpaquePointer?): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetAdhocctlConnect(name?.value?.toCPointer<ByteVar>())

public actual fun sceNetAdhocctlDisconnect(): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetAdhocctlDisconnect()

public actual fun sceNetAdhocctlGetState(event: COpaquePointer?): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetAdhocctlGetState(event?.value?.toCPointer<ByteVar>())

public actual fun sceNetAdhocctlCreate(name: COpaquePointer?): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetAdhocctlCreate(name?.value?.toCPointer<ByteVar>())

public actual fun sceNetAdhocctlJoin(scaninfo: COpaquePointer?): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetAdhocctlJoin(scaninfo?.value?.toCPointer<ByteVar>())

public actual fun sceNetAdhocctlGetAdhocId(id: COpaquePointer?): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetAdhocctlGetAdhocId(id?.value?.toCPointer<ByteVar>())

public actual fun sceNetAdhocctlCreateEnterGameMode(name: COpaquePointer?, unknown: Int, num: Int, macs: COpaquePointer?, timeout: UInt, unknown2: Int): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetAdhocctlCreateEnterGameMode(name?.value?.toCPointer<ByteVar>(), unknown, num, macs?.value?.toCPointer<ByteVar>(), timeout, unknown2)

public actual fun sceNetAdhocctlJoinEnterGameMode(name: COpaquePointer?, hostmac: COpaquePointer?, timeout: UInt, unknown: Int): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetAdhocctlJoinEnterGameMode(name?.value?.toCPointer<ByteVar>(), hostmac?.value?.toCPointer<ByteVar>(), timeout, unknown)

public actual fun sceNetAdhocctlGetGameModeInfo(gamemodeinfo: COpaquePointer?): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetAdhocctlGetGameModeInfo(gamemodeinfo?.value?.toCPointer<ByteVar>())

public actual fun sceNetAdhocctlExitGameMode(): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetAdhocctlExitGameMode()

public actual fun sceNetAdhocctlGetPeerList(length: COpaquePointer?, buf: COpaquePointer?): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetAdhocctlGetPeerList(length?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>())

public actual fun sceNetAdhocctlGetPeerInfo(mac: COpaquePointer?, size: Int, peerinfo: COpaquePointer?): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetAdhocctlGetPeerInfo(mac?.value?.toCPointer<ByteVar>(), size, peerinfo?.value?.toCPointer<ByteVar>())

public actual fun sceNetAdhocctlScan(): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetAdhocctlScan()

public actual fun sceNetAdhocctlGetScanInfo(length: COpaquePointer?, buf: COpaquePointer?): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetAdhocctlGetScanInfo(length?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>())

public actual fun sceNetAdhocctlAddHandler(handler: SceNetAdhocctlHandler, unknown: COpaquePointer?): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetAdhocctlAddHandler(0L.toCPointer<ByteVar>(), unknown?.value?.toCPointer<ByteVar>())

public actual fun sceNetAdhocctlDelHandler(id: Int): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetAdhocctlDelHandler(id)

public actual fun sceNetAdhocctlGetNameByAddr(mac: COpaquePointer?, nickname: COpaquePointer?): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetAdhocctlGetNameByAddr(mac?.value?.toCPointer<ByteVar>(), nickname?.value?.toCPointer<ByteVar>())

public actual fun sceNetAdhocctlGetAddrByName(nickname: COpaquePointer?, length: COpaquePointer?, buf: COpaquePointer?): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetAdhocctlGetAddrByName(nickname?.value?.toCPointer<ByteVar>(), length?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>())

public actual fun sceNetAdhocctlGetParameter(params: COpaquePointer?): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetAdhocctlGetParameter(params?.value?.toCPointer<ByteVar>())

public actual fun sceNetAdhocInit(): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetAdhocInit()

public actual fun sceNetAdhocTerm(): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetAdhocTerm()

public actual fun sceNetAdhocPdpCreate(mac: COpaquePointer?, port: UShort, bufSize: UInt, unk1: Int): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetAdhocPdpCreate(mac?.value?.toCPointer<ByteVar>(), port, bufSize, unk1)

public actual fun sceNetAdhocPdpDelete(id: Int, unk1: Int): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetAdhocPdpDelete(id, unk1)

public actual fun sceNetAdhocPdpSend(id: Int, destMacAddr: COpaquePointer?, port: UShort, data: COpaquePointer?, len: UInt, timeout: UInt, nonblock: Int): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetAdhocPdpSend(id, destMacAddr?.value?.toCPointer<ByteVar>(), port, data?.value?.toCPointer<ByteVar>(), len, timeout, nonblock)

public actual fun sceNetAdhocPdpRecv(id: Int, srcMacAddr: COpaquePointer?, port: COpaquePointer?, data: COpaquePointer?, dataLength: COpaquePointer?, timeout: UInt, nonblock: Int): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetAdhocPdpRecv(id, srcMacAddr?.value?.toCPointer<ByteVar>(), port?.value?.toCPointer<ByteVar>(), data?.value?.toCPointer<ByteVar>(), dataLength?.value?.toCPointer<ByteVar>(), timeout, nonblock)

public actual fun sceNetAdhocGetPdpStat(size: COpaquePointer?, stat: COpaquePointer?): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetAdhocGetPdpStat(size?.value?.toCPointer<ByteVar>(), stat?.value?.toCPointer<ByteVar>())

public actual fun sceNetAdhocGameModeCreateMaster(data: COpaquePointer?, size: Int): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetAdhocGameModeCreateMaster(data?.value?.toCPointer<ByteVar>(), size)

public actual fun sceNetAdhocGameModeCreateReplica(mac: COpaquePointer?, data: COpaquePointer?, size: Int): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetAdhocGameModeCreateReplica(mac?.value?.toCPointer<ByteVar>(), data?.value?.toCPointer<ByteVar>(), size)

public actual fun sceNetAdhocGameModeUpdateMaster(): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetAdhocGameModeUpdateMaster()

public actual fun sceNetAdhocGameModeUpdateReplica(id: Int, unk1: Int): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetAdhocGameModeUpdateReplica(id, unk1)

public actual fun sceNetAdhocGameModeDeleteMaster(): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetAdhocGameModeDeleteMaster()

public actual fun sceNetAdhocGameModeDeleteReplica(id: Int): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetAdhocGameModeDeleteReplica(id)

public actual fun sceNetAdhocPtpOpen(srcmac: COpaquePointer?, srcport: UShort, destmac: COpaquePointer?, destport: UShort, bufSize: UInt, delay: UInt, count: Int, unk1: Int): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetAdhocPtpOpen(srcmac?.value?.toCPointer<ByteVar>(), srcport, destmac?.value?.toCPointer<ByteVar>(), destport, bufSize, delay, count, unk1)

public actual fun sceNetAdhocPtpConnect(id: Int, timeout: UInt, nonblock: Int): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetAdhocPtpConnect(id, timeout, nonblock)

public actual fun sceNetAdhocPtpListen(srcmac: COpaquePointer?, srcport: UShort, bufSize: UInt, delay: UInt, count: Int, queue: Int, unk1: Int): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetAdhocPtpListen(srcmac?.value?.toCPointer<ByteVar>(), srcport, bufSize, delay, count, queue, unk1)

public actual fun sceNetAdhocPtpAccept(id: Int, mac: COpaquePointer?, port: COpaquePointer?, timeout: UInt, nonblock: Int): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetAdhocPtpAccept(id, mac?.value?.toCPointer<ByteVar>(), port?.value?.toCPointer<ByteVar>(), timeout, nonblock)

public actual fun sceNetAdhocPtpSend(id: Int, data: COpaquePointer?, dataSize: COpaquePointer?, timeout: UInt, nonblock: Int): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetAdhocPtpSend(id, data?.value?.toCPointer<ByteVar>(), dataSize?.value?.toCPointer<ByteVar>(), timeout, nonblock)

public actual fun sceNetAdhocPtpRecv(id: Int, data: COpaquePointer?, dataSize: COpaquePointer?, timeout: UInt, nonblock: Int): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetAdhocPtpRecv(id, data?.value?.toCPointer<ByteVar>(), dataSize?.value?.toCPointer<ByteVar>(), timeout, nonblock)

public actual fun sceNetAdhocPtpFlush(id: Int, timeout: UInt, nonblock: Int): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetAdhocPtpFlush(id, timeout, nonblock)

public actual fun sceNetAdhocPtpClose(id: Int, unk1: Int): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetAdhocPtpClose(id, unk1)

public actual fun sceNetAdhocGetPtpStat(size: COpaquePointer?, stat: COpaquePointer?): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetAdhocGetPtpStat(size?.value?.toCPointer<ByteVar>(), stat?.value?.toCPointer<ByteVar>())

public actual fun sceNetAdhocMatchingInit(memsize: Int): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetAdhocMatchingInit(memsize)

public actual fun sceNetAdhocMatchingTerm(): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetAdhocMatchingTerm()

public actual fun sceNetAdhocMatchingCreate(mode: AdhocMatchingMode, maxPeers: Int, port: UShort, bufSize: Int, helloDelay: UInt, pingDelay: UInt, initCount: Int, msgDelay: UInt, callback: AdhocMatchingCallback): Int =
    0

public actual fun sceNetAdhocMatchingDelete(matchingId: Int): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetAdhocMatchingDelete(matchingId)

public actual fun sceNetAdhocMatchingStart(matchingId: Int, evthPri: Int, evthStack: Int, inthPri: Int, inthStack: Int, optLen: Int, optData: COpaquePointer?): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetAdhocMatchingStart(matchingId, evthPri, evthStack, inthPri, inthStack, optLen, optData?.value?.toCPointer<ByteVar>())

public actual fun sceNetAdhocMatchingStop(matchingId: Int): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetAdhocMatchingStop(matchingId)

public actual fun sceNetAdhocMatchingSelectTarget(matchingId: Int, mac: COpaquePointer?, optLen: Int, optData: COpaquePointer?): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetAdhocMatchingSelectTarget(matchingId, mac?.value?.toCPointer<ByteVar>(), optLen, optData?.value?.toCPointer<ByteVar>())

public actual fun sceNetAdhocMatchingCancelTarget(matchingId: Int, mac: COpaquePointer?): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetAdhocMatchingCancelTarget(matchingId, mac?.value?.toCPointer<ByteVar>())

public actual fun sceNetAdhocMatchingCancelTargetWithOpt(matchingId: Int, mac: COpaquePointer?, optLen: Int, optData: COpaquePointer?): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetAdhocMatchingCancelTargetWithOpt(matchingId, mac?.value?.toCPointer<ByteVar>(), optLen, optData?.value?.toCPointer<ByteVar>())

public actual fun sceNetAdhocMatchingSendData(matchingId: Int, mac: COpaquePointer?, dataLen: Int, data: COpaquePointer?): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetAdhocMatchingSendData(matchingId, mac?.value?.toCPointer<ByteVar>(), dataLen, data?.value?.toCPointer<ByteVar>())

public actual fun sceNetAdhocMatchingAbortSendData(matchingId: Int, mac: COpaquePointer?): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetAdhocMatchingAbortSendData(matchingId, mac?.value?.toCPointer<ByteVar>())

public actual fun sceNetAdhocMatchingSetHelloOpt(matchingId: Int, optLen: Int, optData: COpaquePointer?): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetAdhocMatchingSetHelloOpt(matchingId, optLen, optData?.value?.toCPointer<ByteVar>())

public actual fun sceNetAdhocMatchingGetHelloOpt(matchingId: Int, optLen: COpaquePointer?, optData: COpaquePointer?): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetAdhocMatchingGetHelloOpt(matchingId, optLen?.value?.toCPointer<ByteVar>(), optData?.value?.toCPointer<ByteVar>())

public actual fun sceNetAdhocMatchingGetMembers(matchingId: Int, length: COpaquePointer?, buf: COpaquePointer?): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetAdhocMatchingGetMembers(matchingId, length?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>())

public actual fun sceNetAdhocMatchingGetPoolMaxAlloc(): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetAdhocMatchingGetPoolMaxAlloc()

public actual fun sceNetAdhocMatchingGetPoolStat(poolstat: COpaquePointer?): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetAdhocMatchingGetPoolStat(poolstat?.value?.toCPointer<ByteVar>())

public actual fun sceNetApctlInit(stackSize: Int, initPriority: Int): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetApctlInit(stackSize, initPriority)

public actual fun sceNetApctlTerm(): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetApctlTerm()

public actual fun sceNetApctlGetInfo(code: ApctlInfo, pinfo: COpaquePointer?): Int =
    0

public actual fun sceNetApctlAddHandler(handler: SceNetApctlHandler, parg: COpaquePointer?): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetApctlAddHandler(0L.toCPointer<ByteVar>(), parg?.value?.toCPointer<ByteVar>())

public actual fun sceNetApctlDelHandler(handlerId: Int): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetApctlDelHandler(handlerId)

public actual fun sceNetApctlConnect(connIndex: Int): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetApctlConnect(connIndex)

public actual fun sceNetApctlDisconnect(): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetApctlDisconnect()

public actual fun sceNetApctlGetState(pstate: COpaquePointer?): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetApctlGetState(pstate?.value?.toCPointer<ByteVar>())

public actual fun sceNetInetInit(): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetInetInit()

public actual fun sceNetInetTerm(): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetInetTerm()

public actual fun sceNetInetAccept(s: Int, addr: COpaquePointer?, addrLen: COpaquePointer?): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetInetAccept(s, addr?.value?.toCPointer<ByteVar>(), addrLen?.value?.toCPointer<ByteVar>())

public actual fun sceNetInetBind(s: Int, myAddr: COpaquePointer?, addrLen: SocklenT): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetInetBind(s, myAddr?.value?.toCPointer<ByteVar>(), addrLen)

public actual fun sceNetInetConnect(s: Int, servAddr: COpaquePointer?, addrLen: SocklenT): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetInetConnect(s, servAddr?.value?.toCPointer<ByteVar>(), addrLen)

public actual fun sceNetInetGetsockopt(s: Int, level: Int, optName: Int, optVal: COpaquePointer?, optlEn: COpaquePointer?): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetInetGetsockopt(s, level, optName, optVal?.value?.toCPointer<ByteVar>(), optlEn?.value?.toCPointer<ByteVar>())

public actual fun sceNetInetListen(s: Int, backlog: Int): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetInetListen(s, backlog)

public actual fun sceNetInetRecv(s: Int, buf: COpaquePointer?, len: ULong, flags: Int): ULong =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetInetRecv(s, buf?.value?.toCPointer<ByteVar>(), len, flags)

public actual fun sceNetInetRecvfrom(s: Int, buf: COpaquePointer?, flags: ULong, arg1: Int, from: COpaquePointer?, fromLen: COpaquePointer?): ULong =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetInetRecvfrom(s, buf?.value?.toCPointer<ByteVar>(), flags, arg1, from?.value?.toCPointer<ByteVar>(), fromLen?.value?.toCPointer<ByteVar>())

public actual fun sceNetInetSend(s: Int, buf: COpaquePointer?, len: ULong, flags: Int): ULong =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetInetSend(s, buf?.value?.toCPointer<ByteVar>(), len, flags)

public actual fun sceNetInetSendto(s: Int, buf: COpaquePointer?, len: ULong, flags: Int, to: COpaquePointer?, toLen: SocklenT): ULong =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetInetSendto(s, buf?.value?.toCPointer<ByteVar>(), len, flags, to?.value?.toCPointer<ByteVar>(), toLen)

public actual fun sceNetInetSetsockopt(s: Int, level: Int, optName: Int, optVal: COpaquePointer?, optLen: SocklenT): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetInetSetsockopt(s, level, optName, optVal?.value?.toCPointer<ByteVar>(), optLen)

public actual fun sceNetInetShutdown(s: Int, how: Int): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetInetShutdown(s, how)

public actual fun sceNetInetSocket(domain: Int, type: Int, protocol: Int): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetInetSocket(domain, type, protocol)

public actual fun sceNetInetClose(s: Int): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetInetClose(s)

public actual fun sceNetInetGetErrno(): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetInetGetErrno()

public actual fun sceSslInit(unknown1: Int): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceSslInit(unknown1)

public actual fun sceSslEnd(): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceSslEnd()

public actual fun sceSslGetUsedMemoryMax(memory: COpaquePointer?): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceSslGetUsedMemoryMax(memory?.value?.toCPointer<ByteVar>())

public actual fun sceSslGetUsedMemoryCurrent(memory: COpaquePointer?): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceSslGetUsedMemoryCurrent(memory?.value?.toCPointer<ByteVar>())

public actual fun sceHttpInit(unknown1: UInt): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceHttpInit(unknown1)

public actual fun sceHttpEnd(): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceHttpEnd()

public actual fun sceHttpCreateTemplate(agent: COpaquePointer?, unknown1: Int, unknown2: Int): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceHttpCreateTemplate(agent?.value?.toCPointer<ByteVar>(), unknown1, unknown2)

public actual fun sceHttpDeleteTemplate(templateid: Int): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceHttpDeleteTemplate(templateid)

public actual fun sceHttpCreateConnection(templateid: Int, host: COpaquePointer?, unknown1: COpaquePointer?, port: UShort, unknown2: Int): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceHttpCreateConnection(templateid, host?.value?.toCPointer<ByteVar>(), unknown1?.value?.toCPointer<ByteVar>(), port, unknown2)

public actual fun sceHttpCreateConnectionWithURL(templateid: Int, url: COpaquePointer?, unknown1: Int): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceHttpCreateConnectionWithURL(templateid, url?.value?.toCPointer<ByteVar>(), unknown1)

public actual fun sceHttpDeleteConnection(connectionId: Int): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceHttpDeleteConnection(connectionId)

public actual fun sceHttpCreateRequest(connectionId: Int, method: HttpMethod, path: COpaquePointer?, contentLength: ULong): Int =
    0

public actual fun sceHttpCreateRequestWithURL(connectionId: Int, method: HttpMethod, url: COpaquePointer?, contentLength: ULong): Int =
    0

public actual fun sceHttpDeleteRequest(requestId: Int): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceHttpDeleteRequest(requestId)

public actual fun sceHttpSendRequest(requestId: Int, data: COpaquePointer?, dataSize: UInt): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceHttpSendRequest(requestId, data?.value?.toCPointer<ByteVar>(), dataSize)

public actual fun sceHttpAbortRequest(requestId: Int): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceHttpAbortRequest(requestId)

public actual fun sceHttpReadData(requestId: Int, data: COpaquePointer?, dataSize: UInt): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceHttpReadData(requestId, data?.value?.toCPointer<ByteVar>(), dataSize)

public actual fun sceHttpGetContentLength(requestId: Int, contentLength: COpaquePointer?): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceHttpGetContentLength(requestId, contentLength?.value?.toCPointer<ByteVar>())

public actual fun sceHttpGetStatusCode(requestId: Int, statusCode: COpaquePointer?): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceHttpGetStatusCode(requestId, statusCode?.value?.toCPointer<ByteVar>())

public actual fun sceHttpSetResolveTimeOut(id: Int, timeout: UInt): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceHttpSetResolveTimeOut(id, timeout)

public actual fun sceHttpSetResolveRetry(id: Int, count: Int): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceHttpSetResolveRetry(id, count)

public actual fun sceHttpSetConnectTimeOut(id: Int, timeout: UInt): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceHttpSetConnectTimeOut(id, timeout)

public actual fun sceHttpSetSendTimeOut(id: Int, timeout: UInt): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceHttpSetSendTimeOut(id, timeout)

public actual fun sceHttpSetRecvTimeOut(id: Int, timeout: UInt): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceHttpSetRecvTimeOut(id, timeout)

public actual fun sceHttpEnableKeepAlive(id: Int): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceHttpEnableKeepAlive(id)

public actual fun sceHttpDisableKeepAlive(id: Int): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceHttpDisableKeepAlive(id)

public actual fun sceHttpEnableRedirect(id: Int): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceHttpEnableRedirect(id)

public actual fun sceHttpDisableRedirect(id: Int): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceHttpDisableRedirect(id)

public actual fun sceHttpEnableCookie(id: Int): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceHttpEnableCookie(id)

public actual fun sceHttpDisableCookie(id: Int): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceHttpDisableCookie(id)

public actual fun sceHttpSaveSystemCookie(): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceHttpSaveSystemCookie()

public actual fun sceHttpLoadSystemCookie(): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceHttpLoadSystemCookie()

public actual fun sceHttpAddExtraHeader(id: Int, name: COpaquePointer?, value: COpaquePointer?, unknown1: Int): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceHttpAddExtraHeader(id, name?.value?.toCPointer<ByteVar>(), value?.value?.toCPointer<ByteVar>(), unknown1)

public actual fun sceHttpDeleteHeader(id: Int, name: COpaquePointer?): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceHttpDeleteHeader(id, name?.value?.toCPointer<ByteVar>())

public actual fun sceHttpsInit(unknown1: Int, unknown2: Int, unknown3: Int, unknown4: Int): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceHttpsInit(unknown1, unknown2, unknown3, unknown4)

public actual fun sceHttpsEnd(): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceHttpsEnd()

public actual fun sceHttpsLoadDefaultCert(unknown1: Int, unknown2: Int): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceHttpsLoadDefaultCert(unknown1, unknown2)

public actual fun sceHttpDisableAuth(id: Int): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceHttpDisableAuth(id)

public actual fun sceHttpDisableCache(id: Int): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceHttpDisableCache(id)

public actual fun sceHttpEnableAuth(id: Int): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceHttpEnableAuth(id)

public actual fun sceHttpEnableCache(id: Int): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceHttpEnableCache(id)

public actual fun sceHttpEndCache(): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceHttpEndCache()

public actual fun sceHttpGetAllHeader(request: Int, header: COpaquePointer?, headerSize: COpaquePointer?): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceHttpGetAllHeader(request, header?.value?.toCPointer<ByteVar>(), headerSize?.value?.toCPointer<ByteVar>())

public actual fun sceHttpGetNetworkErrno(request: Int, errNum: COpaquePointer?): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceHttpGetNetworkErrno(request, errNum?.value?.toCPointer<ByteVar>())

public actual fun sceHttpGetProxy(id: Int, activateFlag: COpaquePointer?, mode: COpaquePointer?, proxyHost: COpaquePointer?, len: ULong, proxyPort: COpaquePointer?): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceHttpGetProxy(id, activateFlag?.value?.toCPointer<ByteVar>(), mode?.value?.toCPointer<ByteVar>(), proxyHost?.value?.toCPointer<ByteVar>(), len, proxyPort?.value?.toCPointer<ByteVar>())

public actual fun sceHttpInitCache(maxSize: ULong): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceHttpInitCache(maxSize)

public actual fun sceHttpSetAuthInfoCB(id: Int, cbfunc: HttpPasswordCB): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceHttpSetAuthInfoCB(id, 0L.toCPointer<ByteVar>())

public actual fun sceHttpSetProxy(id: Int, activateFlag: Int, mode: Int, newProxyHost: COpaquePointer?, newProxyPort: UShort): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceHttpSetProxy(id, activateFlag, mode, newProxyHost?.value?.toCPointer<ByteVar>(), newProxyPort)

public actual fun sceHttpSetResHeaderMaxSize(id: Int, headerSize: UInt): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceHttpSetResHeaderMaxSize(id, headerSize)

public actual fun sceHttpSetMallocFunction(mallocFunc: HttpMallocFunction, freeFunc: HttpFreeFunction, reallocFunc: HttpReallocFunction): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceHttpSetMallocFunction(0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())

public actual fun sceNetResolverInit(): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetResolverInit()

public actual fun sceNetResolverCreate(rid: COpaquePointer?, buf: COpaquePointer?, bufLength: UInt): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetResolverCreate(rid?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), bufLength)

public actual fun sceNetResolverDelete(rid: Int): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetResolverDelete(rid)

public actual fun sceNetResolverStartNtoA(rid: Int, hostname: COpaquePointer?, addr: COpaquePointer?, timeout: UInt, retry: Int): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetResolverStartNtoA(rid, hostname?.value?.toCPointer<ByteVar>(), addr?.value?.toCPointer<ByteVar>(), timeout, retry)

public actual fun sceNetResolverStartAtoN(rid: Int, addr: COpaquePointer?, hostname: COpaquePointer?, hostnameLen: UInt, timeout: UInt, retry: Int): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetResolverStartAtoN(rid, addr?.value?.toCPointer<ByteVar>(), hostname?.value?.toCPointer<ByteVar>(), hostnameLen, timeout, retry)

public actual fun sceNetResolverStop(rid: Int): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetResolverStop(rid)

public actual fun sceNetResolverTerm(): Int =
    io.github.kotlinmania.libc.psp.cinterop.libc_psp_sceNetResolverTerm()
