@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.psp

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.COpaquePointer

public actual fun sceAudioChReserve(channel: Int, sampleCount: Int, format: AudioFormat): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceAudioChRelease(channel: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceAudioOutput(channel: Int, vol: Int, buf: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceAudioOutputBlocking(channel: Int, vol: Int, buf: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceAudioOutputPanned(channel: Int, leftVol: Int, rightVol: Int, buf: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceAudioOutputPannedBlocking(channel: Int, leftVol: Int, rightVol: Int, buf: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceAudioGetChannelRestLen(channel: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceAudioGetChannelRestLength(channel: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceAudioSetChannelDataLen(channel: Int, sampleCount: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceAudioChangeChannelConfig(channel: Int, format: AudioFormat): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceAudioChangeChannelVolume(channel: Int, leftVol: Int, rightVol: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceAudioOutput2Reserve(sampleCount: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceAudioOutput2Release(): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceAudioOutput2ChangeLength(sampleCount: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceAudioOutput2OutputBlocking(vol: Int, buf: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceAudioOutput2GetRestSample(): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceAudioSRCChReserve(sampleCount: Int, freq: AudioOutputFrequency, channels: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceAudioSRCChRelease(): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceAudioSRCOutputBlocking(vol: Int, buf: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceAudioInputInit(unknown1: Int, gain: Int, unknown2: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceAudioInputInitEx(params: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceAudioInputBlocking(sampleCount: Int, freq: AudioInputFrequency, buf: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun sceAudioInput(sampleCount: Int, freq: AudioInputFrequency, buf: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun sceAudioGetInputLength(): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceAudioWaitInputEnd(): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceAudioPollInputEnd(): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceAtracGetAtracID(uiCodecType: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceAtracSetDataAndGetID(buf: COpaquePointer?, bufsize: ULong): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceAtracDecodeData(atracId: Int, outSamples: COpaquePointer?, outN: COpaquePointer?, outEnd: COpaquePointer?, outRemainFrame: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceAtracGetRemainFrame(atracId: Int, outRemainFrame: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceAtracGetStreamDataInfo(atracId: Int, writePointer: COpaquePointer?, availableBytes: COpaquePointer?, readOffset: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceAtracAddStreamData(atracId: Int, bytesToAdd: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceAtracGetBitrate(atracId: Int, outBitrate: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceAtracSetLoopNum(atracId: Int, nloops: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceAtracReleaseAtracID(atracId: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceAtracGetNextSample(atracId: Int, outN: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceAtracGetMaxSample(atracId: Int, outMax: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceAtracGetBufferInfoForReseting(atracId: Int, uiSample: UInt, pbufferInfo: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceAtracGetChannel(atracId: Int, puiChannel: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceAtracGetInternalErrorInfo(atracId: Int, piResult: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceAtracGetLoopStatus(atracId: Int, piLoopNum: COpaquePointer?, puiLoopStatus: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceAtracGetNextDecodePosition(atracId: Int, puiSamplePosition: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceAtracGetSecondBufferInfo(atracId: Int, puiPosition: COpaquePointer?, puiDataByte: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceAtracGetSoundSample(atracId: Int, piEndSample: COpaquePointer?, piLoopStartSample: COpaquePointer?, piLoopEndSample: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceAtracResetPlayPosition(atracId: Int, uiSample: UInt, uiWriteByteFirstBuf: UInt, uiWriteByteSecondBuf: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceAtracSetData(atracId: Int, pucBufferAddr: COpaquePointer?, uiBufferByte: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceAtracSetHalfwayBuffer(atracId: Int, pucBufferAddr: COpaquePointer?, uiReadByte: UInt, uiBufferByte: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceAtracSetHalfwayBufferAndGetID(pucBufferAddr: COpaquePointer?, uiReadByte: UInt, uiBufferByte: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceAtracSetSecondBuffer(atracId: Int, pucSecondBufferAddr: COpaquePointer?, uiSecondBufferByte: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceCtrlSetSamplingCycle(cycle: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceCtrlGetSamplingCycle(pcycle: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceCtrlSetSamplingMode(mode: CtrlMode): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceCtrlGetSamplingMode(pmode: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceCtrlPeekBufferPositive(padData: COpaquePointer?, count: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceCtrlPeekBufferNegative(padData: COpaquePointer?, count: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceCtrlReadBufferPositive(padData: COpaquePointer?, count: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceCtrlReadBufferNegative(padData: COpaquePointer?, count: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceCtrlPeekLatch(latchData: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceCtrlReadLatch(latchData: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceCtrlSetIdleCancelThreshold(idlereset: Int, idleback: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceCtrlGetIdleCancelThreshold(idlereset: COpaquePointer?, idleback: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceDisplaySetMode(mode: DisplayMode, width: ULong, height: ULong): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceDisplayGetMode(pmode: COpaquePointer?, pwidth: COpaquePointer?, pheight: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceDisplaySetFrameBuf(topAddr: COpaquePointer?, bufferWidth: ULong, pixelFormat: DisplayPixelFormat, sync: DisplaySetBufSync): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceDisplayGetFrameBuf(topAddr: COpaquePointer?, bufferWidth: COpaquePointer?, pixelFormat: COpaquePointer?, sync: DisplaySetBufSync): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceDisplayGetVcount(): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceDisplayWaitVblank(): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceDisplayWaitVblankCB(): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceDisplayWaitVblankStart(): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceDisplayWaitVblankStartCB(): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceDisplayGetAccumulatedHcount(): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceDisplayGetCurrentHcount(): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceDisplayGetFramePerSec(): Float =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceDisplayIsForeground(): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceDisplayIsVblank(): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceGeEdramGetSize(): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceGeEdramGetAddr(): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceGeEdramSetAddrTranslation(width: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceGeGetCmd(cmd: Int): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceGeGetMtx(type: GeMatrixType, matrix: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceGeGetStack(stackId: Int, stack: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceGeSaveContext(context: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceGeRestoreContext(context: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceGeListEnQueue(list: COpaquePointer?, stall: COpaquePointer?, cbid: Int, arg: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceGeListEnQueueHead(list: COpaquePointer?, stall: COpaquePointer?, cbid: Int, arg: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceGeListDeQueue(qid: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceGeListUpdateStallAddr(qid: Int, stall: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceGeListSync(qid: Int, syncType: Int): GeListState =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceGeDrawSync(syncType: Int): GeListState =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceGeBreak(mode: Int, pParam: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceGeContinue(): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceGeSetCallback(cb: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceGeUnsetCallback(cbid: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelExitGame() {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun sceKernelRegisterExitCallback(id: SceUid): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelLoadExec(file: COpaquePointer?, param: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelAllocPartitionMemory(partition: SceSysMemPartitionId, name: COpaquePointer?, type: SceSysMemBlockTypes, size: UInt, addr: COpaquePointer?): SceUid =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelGetBlockHeadAddr(blockid: SceUid): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelFreePartitionMemory(blockid: SceUid): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelTotalFreeMemSize(): ULong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelMaxFreeMemSize(): ULong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelDevkitVersion(): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelSetCompiledSdkVersion(version: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelGetCompiledSdkVersion(): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelLibcTime(t: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelLibcClock(): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelLibcGettimeofday(tp: COpaquePointer?, tzp: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelDcacheWritebackAll() {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun sceKernelDcacheWritebackInvalidateAll() {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun sceKernelDcacheWritebackRange(p: COpaquePointer?, size: UInt) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun sceKernelDcacheWritebackInvalidateRange(p: COpaquePointer?, size: UInt) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun sceKernelDcacheInvalidateRange(p: COpaquePointer?, size: UInt) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun sceKernelIcacheInvalidateAll() {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun sceKernelIcacheInvalidateRange(p: COpaquePointer?, size: UInt) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun sceKernelUtilsMt19937Init(ctx: COpaquePointer?, seed: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelUtilsMt19937UInt(ctx: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelUtilsMd5Digest(data: COpaquePointer?, size: UInt, digest: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelUtilsMd5BlockInit(ctx: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelUtilsMd5BlockUpdate(ctx: COpaquePointer?, data: COpaquePointer?, size: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelUtilsMd5BlockResult(ctx: COpaquePointer?, digest: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelUtilsSha1Digest(data: COpaquePointer?, size: UInt, digest: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelUtilsSha1BlockInit(ctx: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelUtilsSha1BlockUpdate(ctx: COpaquePointer?, data: COpaquePointer?, size: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelUtilsSha1BlockResult(ctx: COpaquePointer?, digest: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelRegisterSubIntrHandler(intNo: Int, no: Int, handler: COpaquePointer?, arg: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelReleaseSubIntrHandler(intNo: Int, no: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelEnableSubIntr(intNo: Int, no: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelDisableSubIntr(intNo: Int, no: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun queryIntrHandlerInfo(intrCode: SceUid, subIntrCode: SceUid, data: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelCpuSuspendIntr(): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelCpuResumeIntr(flags: UInt) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun sceKernelCpuResumeIntrWithSync(flags: UInt) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun sceKernelIsCpuIntrSuspended(flags: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelIsCpuIntrEnable(): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelLoadModule(path: COpaquePointer?, flags: Int, option: COpaquePointer?): SceUid =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelLoadModuleMs(path: COpaquePointer?, flags: Int, option: COpaquePointer?): SceUid =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelLoadModuleByID(fid: SceUid, flags: Int, option: COpaquePointer?): SceUid =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelLoadModuleBufferUsbWlan(bufSize: ULong, buf: COpaquePointer?, flags: Int, option: COpaquePointer?): SceUid =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelStartModule(modId: SceUid, argSize: ULong, argp: COpaquePointer?, status: COpaquePointer?, option: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelStopModule(modId: SceUid, argSize: ULong, argp: COpaquePointer?, status: COpaquePointer?, option: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelUnloadModule(modId: SceUid): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelSelfStopUnloadModule(unknown: Int, argSize: ULong, argp: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelStopUnloadSelfModule(argSize: ULong, argp: COpaquePointer?, status: COpaquePointer?, option: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelQueryModuleInfo(modId: SceUid, info: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelGetModuleIdList(readBuf: COpaquePointer?, readBufSize: Int, idCount: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelVolatileMemLock(unk: Int, ptr: COpaquePointer?, size: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelVolatileMemTryLock(unk: Int, ptr: COpaquePointer?, size: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelVolatileMemUnlock(unk: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelStdin(): SceUid =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelStdout(): SceUid =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelStderr(): SceUid =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelGetThreadmanIdType(uid: SceUid): SceKernelIdListType =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelCreateThread(name: COpaquePointer?, entry: SceKernelThreadEntry, initPriority: Int, stackSize: Int, attr: Int, option: COpaquePointer?): SceUid =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelDeleteThread(thid: SceUid): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelStartThread(id: SceUid, argLen: ULong, argP: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelExitThread(status: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelExitDeleteThread(status: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelTerminateThread(thid: SceUid): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelTerminateDeleteThread(thid: SceUid): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelSuspendDispatchThread(): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelResumeDispatchThread(state: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelSleepThread(): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelSleepThreadCB(): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelWakeupThread(thid: SceUid): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelCancelWakeupThread(thid: SceUid): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelSuspendThread(thid: SceUid): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelResumeThread(thid: SceUid): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelWaitThreadEnd(thid: SceUid, timeout: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelWaitThreadEndCB(thid: SceUid, timeout: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelDelayThread(delay: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelDelayThreadCB(delay: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelDelaySysClockThread(delay: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelDelaySysClockThreadCB(delay: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelChangeCurrentThreadAttr(unknown: Int, attr: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelChangeThreadPriority(thid: SceUid, priority: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelRotateThreadReadyQueue(priority: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelReleaseWaitThread(thid: SceUid): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelGetThreadId(): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelGetThreadCurrentPriority(): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelGetThreadExitStatus(thid: SceUid): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelCheckThreadStack(): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelGetThreadStackFreeSize(thid: SceUid): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelReferThreadStatus(thid: SceUid, info: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelReferThreadRunStatus(thid: SceUid, status: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelCreateSema(name: COpaquePointer?, attr: UInt, initVal: Int, maxVal: Int, option: COpaquePointer?): SceUid =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelDeleteSema(semaId: SceUid): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelSignalSema(semaId: SceUid, signal: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelWaitSema(semaId: SceUid, signal: Int, timeout: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelWaitSemaCB(semaId: SceUid, signal: Int, timeout: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelPollSema(semaId: SceUid, signal: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelReferSemaStatus(semaId: SceUid, info: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelCreateEventFlag(name: COpaquePointer?, attr: Int, bits: Int, opt: COpaquePointer?): SceUid =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelSetEventFlag(evId: SceUid, bits: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelClearEventFlag(evId: SceUid, bits: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelPollEventFlag(evId: SceUid, bits: UInt, wait: Int, outBits: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelWaitEventFlag(evId: SceUid, bits: UInt, wait: Int, outBits: COpaquePointer?, timeout: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelWaitEventFlagCB(evId: SceUid, bits: UInt, wait: Int, outBits: COpaquePointer?, timeout: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelDeleteEventFlag(evId: SceUid): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelReferEventFlagStatus(event: SceUid, status: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelCreateMbx(name: COpaquePointer?, attr: UInt, option: COpaquePointer?): SceUid =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelDeleteMbx(mbxId: SceUid): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelSendMbx(mbxId: SceUid, message: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelReceiveMbx(mbxId: SceUid, message: COpaquePointer?, timeout: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelReceiveMbxCB(mbxId: SceUid, message: COpaquePointer?, timeout: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelPollMbx(mbxId: SceUid, pmessage: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelCancelReceiveMbx(mbxId: SceUid, num: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelReferMbxStatus(mbxId: SceUid, info: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelSetAlarm(clock: UInt, handler: SceKernelAlarmHandler, common: COpaquePointer?): SceUid =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelSetSysClockAlarm(clock: COpaquePointer?, handler: COpaquePointer?, common: COpaquePointer?): SceUid =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelCancelAlarm(alarmId: SceUid): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelReferAlarmStatus(alarmId: SceUid, info: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelCreateCallback(name: COpaquePointer?, func: SceKernelCallbackFunction, arg: COpaquePointer?): SceUid =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelReferCallbackStatus(cb: SceUid, status: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelDeleteCallback(cb: SceUid): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelNotifyCallback(cb: SceUid, arg2: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelCancelCallback(cb: SceUid): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelGetCallbackCount(cb: SceUid): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelCheckCallback(): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelGetThreadmanIdList(type: SceKernelIdListType, readBuf: COpaquePointer?, readBufSize: Int, idCount: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelReferSystemStatus(status: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelCreateMsgPipe(name: COpaquePointer?, part: Int, attr: Int, unk1: COpaquePointer?, opt: COpaquePointer?): SceUid =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelDeleteMsgPipe(uid: SceUid): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelSendMsgPipe(uid: SceUid, message: COpaquePointer?, size: UInt, unk1: Int, unk2: COpaquePointer?, timeout: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelSendMsgPipeCB(uid: SceUid, message: COpaquePointer?, size: UInt, unk1: Int, unk2: COpaquePointer?, timeout: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelTrySendMsgPipe(uid: SceUid, message: COpaquePointer?, size: UInt, unk1: Int, unk2: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelReceiveMsgPipe(uid: SceUid, message: COpaquePointer?, size: UInt, unk1: Int, unk2: COpaquePointer?, timeout: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelReceiveMsgPipeCB(uid: SceUid, message: COpaquePointer?, size: UInt, unk1: Int, unk2: COpaquePointer?, timeout: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelTryReceiveMsgPipe(uid: SceUid, message: COpaquePointer?, size: UInt, unk1: Int, unk2: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelCancelMsgPipe(uid: SceUid, send: COpaquePointer?, recv: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelReferMsgPipeStatus(uid: SceUid, info: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelCreateVpl(name: COpaquePointer?, part: Int, attr: Int, size: UInt, opt: COpaquePointer?): SceUid =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelDeleteVpl(uid: SceUid): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelAllocateVpl(uid: SceUid, size: UInt, data: COpaquePointer?, timeout: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelAllocateVplCB(uid: SceUid, size: UInt, data: COpaquePointer?, timeout: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelTryAllocateVpl(uid: SceUid, size: UInt, data: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelFreeVpl(uid: SceUid, data: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelCancelVpl(uid: SceUid, num: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelReferVplStatus(uid: SceUid, info: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelCreateFpl(name: COpaquePointer?, part: Int, attr: Int, size: UInt, blocks: UInt, opt: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelDeleteFpl(uid: SceUid): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelAllocateFpl(uid: SceUid, data: COpaquePointer?, timeout: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelAllocateFplCB(uid: SceUid, data: COpaquePointer?, timeout: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelTryAllocateFpl(uid: SceUid, data: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelFreeFpl(uid: SceUid, data: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelCancelFpl(uid: SceUid, pnum: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelReferFplStatus(uid: SceUid, info: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelUSec2SysClock(usec: UInt, clock: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelUSec2SysClockWide(usec: UInt): Long =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelSysClock2USec(clock: COpaquePointer?, low: COpaquePointer?, high: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelSysClock2USecWide(clock: Long, low: COpaquePointer?, high: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelGetSystemTime(time: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelGetSystemTimeWide(): Long =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelGetSystemTimeLow(): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelCreateVTimer(name: COpaquePointer?, opt: COpaquePointer?): SceUid =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelDeleteVTimer(uid: SceUid): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelGetVTimerBase(uid: SceUid, base: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelGetVTimerBaseWide(uid: SceUid): Long =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelGetVTimerTime(uid: SceUid, time: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelGetVTimerTimeWide(uid: SceUid): Long =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelSetVTimerTime(uid: SceUid, time: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelSetVTimerTimeWide(uid: SceUid, time: Long): Long =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelStartVTimer(uid: SceUid): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelStopVTimer(uid: SceUid): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelSetVTimerHandler(uid: SceUid, time: COpaquePointer?, handler: SceKernelVTimerHandler, common: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelSetVTimerHandlerWide(uid: SceUid, time: Long, handler: SceKernelVTimerHandlerWide, common: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelCancelVTimerHandler(uid: SceUid): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelReferVTimerStatus(uid: SceUid, info: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelRegisterThreadEventHandler(name: COpaquePointer?, threadId: SceUid, mask: Int, handler: SceKernelThreadEventHandler, common: COpaquePointer?): SceUid =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelReleaseThreadEventHandler(uid: SceUid): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelReferThreadEventHandlerStatus(uid: SceUid, info: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelReferThreadProfiler(): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceKernelReferGlobalProfiler(): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceUsbStart(driverName: COpaquePointer?, size: Int, args: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceUsbStop(driverName: COpaquePointer?, size: Int, args: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceUsbActivate(pid: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceUsbDeactivate(pid: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceUsbGetState(): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceUsbGetDrvState(driverName: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceUsbCamSetupStill(param: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceUsbCamSetupStillEx(param: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceUsbCamStillInputBlocking(buf: COpaquePointer?, size: ULong): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceUsbCamStillInput(buf: COpaquePointer?, size: ULong): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceUsbCamStillWaitInputEnd(): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceUsbCamStillPollInputEnd(): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceUsbCamStillCancelInput(): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceUsbCamStillGetInputLength(): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceUsbCamSetupVideo(param: COpaquePointer?, workArea: COpaquePointer?, workAreaSize: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceUsbCamSetupVideoEx(param: COpaquePointer?, workArea: COpaquePointer?, workAreaSize: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceUsbCamStartVideo(): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceUsbCamStopVideo(): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceUsbCamReadVideoFrameBlocking(buf: COpaquePointer?, size: ULong): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceUsbCamReadVideoFrame(buf: COpaquePointer?, size: ULong): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceUsbCamWaitReadVideoFrameEnd(): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceUsbCamPollReadVideoFrameEnd(): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceUsbCamGetReadVideoFrameSize(): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceUsbCamSetSaturation(saturation: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceUsbCamSetBrightness(brightness: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceUsbCamSetContrast(contrast: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceUsbCamSetSharpness(sharpness: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceUsbCamSetImageEffectMode(effectMode: UsbCamEffectMode): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceUsbCamSetEvLevel(exposureLevel: UsbCamEvLevel): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceUsbCamSetReverseMode(reverseFlags: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceUsbCamSetZoom(zoom: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceUsbCamGetSaturation(saturation: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceUsbCamGetBrightness(brightness: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceUsbCamGetContrast(contrast: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceUsbCamGetSharpness(sharpness: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceUsbCamGetImageEffectMode(effectMode: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceUsbCamGetEvLevel(exposureLevel: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceUsbCamGetReverseMode(reverseFlags: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceUsbCamGetZoom(zoom: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceUsbCamAutoImageReverseSW(on: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceUsbCamGetAutoImageReverseState(): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceUsbCamGetLensDirection(): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceUsbstorBootRegisterNotify(eventFlag: SceUid): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceUsbstorBootUnregisterNotify(eventFlag: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceUsbstorBootSetCapacity(size: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun scePowerRegisterCallback(slot: Int, cbid: SceUid): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun scePowerUnregisterCallback(slot: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun scePowerIsPowerOnline(): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun scePowerIsBatteryExist(): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun scePowerIsBatteryCharging(): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun scePowerGetBatteryChargingStatus(): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun scePowerIsLowBattery(): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun scePowerGetBatteryLifePercent(): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun scePowerGetBatteryLifeTime(): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun scePowerGetBatteryTemp(): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun scePowerGetBatteryElec(): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun scePowerGetBatteryVolt(): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun scePowerSetCpuClockFrequency(cpufreq: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun scePowerSetBusClockFrequency(busfreq: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun scePowerGetCpuClockFrequency(): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun scePowerGetCpuClockFrequencyInt(): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun scePowerGetCpuClockFrequencyFloat(): Float =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun scePowerGetBusClockFrequency(): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun scePowerGetBusClockFrequencyInt(): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun scePowerGetBusClockFrequencyFloat(): Float =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun scePowerSetClockFrequency(pllfreq: Int, cpufreq: Int, busfreq: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun scePowerLock(unknown: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun scePowerUnlock(unknown: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun scePowerTick(t: PowerTick): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun scePowerGetIdleTimer(): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun scePowerIdleTimerEnable(unknown: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun scePowerIdleTimerDisable(unknown: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun scePowerRequestStandby(): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun scePowerRequestSuspend(): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceWlanDevIsPowerOn(): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceWlanGetSwitchState(): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceWlanGetEtherAddr(etherAddr: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceWlanDevAttach(): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceWlanDevDetach(): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceRtcGetTickResolution(): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceRtcGetCurrentTick(tick: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceRtcGetCurrentClock(tm: COpaquePointer?, tz: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceRtcGetCurrentClockLocalTime(tm: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceRtcConvertUtcToLocalTime(tickUtc: COpaquePointer?, tickLocal: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceRtcConvertLocalTimeToUTC(tickLocal: COpaquePointer?, tickUtc: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceRtcIsLeapYear(year: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceRtcGetDaysInMonth(year: Int, month: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceRtcGetDayOfWeek(year: Int, month: Int, day: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceRtcCheckValid(date: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceRtcSetTick(date: COpaquePointer?, tick: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceRtcGetTick(date: COpaquePointer?, tick: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceRtcCompareTick(tick1: COpaquePointer?, tick2: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceRtcTickAddTicks(destTick: COpaquePointer?, srcTick: COpaquePointer?, numTicks: ULong): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceRtcTickAddMicroseconds(destTick: COpaquePointer?, srcTick: COpaquePointer?, numMs: ULong): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceRtcTickAddSeconds(destTick: COpaquePointer?, srcTick: COpaquePointer?, numSeconds: ULong): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceRtcTickAddMinutes(destTick: COpaquePointer?, srcTick: COpaquePointer?, numMinutes: ULong): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceRtcTickAddHours(destTick: COpaquePointer?, srcTick: COpaquePointer?, numHours: ULong): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceRtcTickAddDays(destTick: COpaquePointer?, srcTick: COpaquePointer?, numDays: ULong): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceRtcTickAddWeeks(destTick: COpaquePointer?, srcTick: COpaquePointer?, numWeeks: ULong): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceRtcTickAddMonths(destTick: COpaquePointer?, srcTick: COpaquePointer?, numMonths: ULong): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceRtcTickAddYears(destTick: COpaquePointer?, srcTick: COpaquePointer?, numYears: ULong): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceRtcSetTimeT(date: COpaquePointer?, time: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceRtcGetTimeT(date: COpaquePointer?, time: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceRtcSetTime64T(date: COpaquePointer?, time: ULong): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceRtcGetTime64T(date: COpaquePointer?, time: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceRtcSetDosTime(date: COpaquePointer?, dosTime: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceRtcGetDosTime(date: COpaquePointer?, dosTime: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceRtcSetWin32FileTime(date: COpaquePointer?, time: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceRtcGetWin32FileTime(date: COpaquePointer?, time: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceRtcParseDateTime(destTick: COpaquePointer?, dateString: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceRtcFormatRFC3339(pszDateTime: COpaquePointer?, pUtc: COpaquePointer?, timeZoneMinutes: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceRtcFormatRFC3339LocalTime(pszDateTime: COpaquePointer?, pUtc: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceRtcParseRFC3339(pUtc: COpaquePointer?, pszDateTime: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceRtcFormatRFC2822(pszDateTime: COpaquePointer?, pUtc: COpaquePointer?, timeZoneMinutes: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceRtcFormatRFC2822LocalTime(pszDateTime: COpaquePointer?, pUtc: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceIoOpen(file: COpaquePointer?, flags: Int, permissions: IoPermissions): SceUid =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceIoOpenAsync(file: COpaquePointer?, flags: Int, permissions: IoPermissions): SceUid =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceIoClose(fd: SceUid): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceIoCloseAsync(fd: SceUid): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceIoRead(fd: SceUid, data: COpaquePointer?, size: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceIoReadAsync(fd: SceUid, data: COpaquePointer?, size: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceIoWrite(fd: SceUid, data: COpaquePointer?, size: ULong): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceIoWriteAsync(fd: SceUid, data: COpaquePointer?, size: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceIoLseek(fd: SceUid, offset: Long, whence: IoWhence): Long =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceIoLseekAsync(fd: SceUid, offset: Long, whence: IoWhence): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceIoLseek32(fd: SceUid, offset: Int, whence: IoWhence): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceIoLseek32Async(fd: SceUid, offset: Int, whence: IoWhence): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceIoRemove(file: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceIoMkdir(dir: COpaquePointer?, mode: IoPermissions): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceIoRmdir(path: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceIoChdir(path: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceIoRename(oldname: COpaquePointer?, newname: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceIoDopen(dirname: COpaquePointer?): SceUid =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceIoDread(fd: SceUid, dir: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceIoDclose(fd: SceUid): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceIoDevctl(dev: COpaquePointer?, cmd: UInt, indata: COpaquePointer?, inlen: Int, outdata: COpaquePointer?, outlen: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceIoAssign(dev1: COpaquePointer?, dev2: COpaquePointer?, dev3: COpaquePointer?, mode: IoAssignPerms, unk1: COpaquePointer?, unk2: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceIoUnassign(dev: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceIoGetstat(file: COpaquePointer?, stat: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceIoChstat(file: COpaquePointer?, stat: COpaquePointer?, bits: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceIoIoctl(fd: SceUid, cmd: UInt, indata: COpaquePointer?, inlen: Int, outdata: COpaquePointer?, outlen: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceIoIoctlAsync(fd: SceUid, cmd: UInt, indata: COpaquePointer?, inlen: Int, outdata: COpaquePointer?, outlen: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceIoSync(device: COpaquePointer?, unk: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceIoWaitAsync(fd: SceUid, res: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceIoWaitAsyncCB(fd: SceUid, res: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceIoPollAsync(fd: SceUid, res: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceIoGetAsyncStat(fd: SceUid, poll: Int, res: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceIoCancel(fd: SceUid): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceIoGetDevType(fd: SceUid): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceIoChangeAsyncPriority(fd: SceUid, pri: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceIoSetAsyncCallback(fd: SceUid, cb: SceUid, argp: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceJpegInitMJpeg(): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceJpegFinishMJpeg(): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceJpegCreateMJpeg(width: Int, height: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceJpegDeleteMJpeg(): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceJpegDecodeMJpeg(jpegBuf: COpaquePointer?, size: ULong, rgba: COpaquePointer?, unk: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceUmdCheckMedium(): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceUmdGetDiscInfo(info: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceUmdActivate(unit: Int, drive: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceUmdDeactivate(unit: Int, drive: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceUmdWaitDriveStat(state: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceUmdWaitDriveStatWithTimer(state: Int, timeout: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceUmdWaitDriveStatCB(state: Int, timeout: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceUmdCancelWaitDriveStat(): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceUmdGetDriveStat(): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceUmdGetErrorStat(): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceUmdRegisterUMDCallBack(cbid: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceUmdUnRegisterUMDCallBack(cbid: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceUmdReplacePermit(): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceUmdReplaceProhibit(): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceMpegInit(): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceMpegFinish() {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun sceMpegRingbufferQueryMemSize(packets: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceMpegRingbufferConstruct(ringbuffer: COpaquePointer?, packets: Int, data: COpaquePointer?, size: Int, callback: SceMpegRingbufferCb, cbParam: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceMpegRingbufferDestruct(ringbuffer: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun sceMpegRingbufferAvailableSize(ringbuffer: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceMpegRingbufferPut(ringbuffer: COpaquePointer?, numPackets: Int, available: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceMpegQueryMemSize(unk: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceMpegCreate(handle: SceMpeg, data: COpaquePointer?, size: Int, ringbuffer: COpaquePointer?, frameWidth: Int, unk1: Int, unk2: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceMpegDelete(handle: SceMpeg) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun sceMpegQueryStreamOffset(handle: SceMpeg, buffer: COpaquePointer?, offset: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceMpegQueryStreamSize(buffer: COpaquePointer?, size: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceMpegRegistStream(handle: SceMpeg, streamId: Int, unk: Int): SceMpegStream =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceMpegUnRegistStream(handle: SceMpeg, stream: SceMpegStream) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun sceMpegFlushAllStream(handle: SceMpeg): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceMpegMallocAvcEsBuf(handle: SceMpeg): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceMpegFreeAvcEsBuf(handle: SceMpeg, buf: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun sceMpegQueryAtracEsSize(handle: SceMpeg, esSize: COpaquePointer?, outSize: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceMpegInitAu(handle: SceMpeg, esBuffer: COpaquePointer?, au: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceMpegGetAvcAu(handle: SceMpeg, stream: SceMpegStream, au: COpaquePointer?, unk: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceMpegAvcDecodeMode(handle: SceMpeg, mode: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceMpegAvcDecode(handle: SceMpeg, au: COpaquePointer?, iframeWidth: Int, buffer: COpaquePointer?, init: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceMpegAvcDecodeStop(handle: SceMpeg, frameWidth: Int, buffer: COpaquePointer?, status: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceMpegGetAtracAu(handle: SceMpeg, stream: SceMpegStream, au: COpaquePointer?, unk: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceMpegAtracDecode(handle: SceMpeg, au: COpaquePointer?, buffer: COpaquePointer?, init: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceMpegBaseYCrCbCopyVme(yuvBuffer: COpaquePointer?, buffer: COpaquePointer?, type: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceMpegBaseCscInit(width: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceMpegBaseCscVme(rgbBuffer: COpaquePointer?, rgbBuffer2: COpaquePointer?, width: Int, yCrCbBuffer: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceMpegbaseBea18f91(lli: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceHprmPeekCurrentKey(key: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceHprmPeekLatch(latch: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceHprmReadLatch(latch: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceHprmIsHeadphoneExist(): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceHprmIsRemoteExist(): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceHprmIsMicrophoneExist(): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceGuDepthBuffer(zbp: COpaquePointer?, zbw: Int) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun sceGuDispBuffer(width: Int, height: Int, dispbp: COpaquePointer?, dispbw: Int) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun sceGuDrawBuffer(psm: DisplayPixelFormat, fbp: COpaquePointer?, fbw: Int) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun sceGuDrawBufferList(psm: DisplayPixelFormat, fbp: COpaquePointer?, fbw: Int) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun sceGuDisplay(state: Boolean): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceGuDepthFunc(function: DepthFunc) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun sceGuDepthMask(mask: Int) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun sceGuDepthOffset(offset: Int) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun sceGuDepthRange(near: Int, far: Int) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun sceGuFog(near: Float, far: Float, color: UInt) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun sceGuInit() {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun sceGuTerm() {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun sceGuBreak(mode: Int) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun sceGuContinue() {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun sceGuSetCallback(signal: GuCallbackId, callback: GuCallback): GuCallback =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceGuSignal(behavior: SignalBehavior, signal: Int) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun sceGuSendCommandf(cmd: GeCommand, argument: Float) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun sceGuSendCommandi(cmd: GeCommand, argument: Int) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun sceGuGetMemory(size: Int): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceGuStart(contextType: GuContextType, list: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun sceGuFinish(): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceGuFinishId(id: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceGuCallList(list: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun sceGuCallMode(mode: Int) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun sceGuCheckList(): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceGuSendList(mode: GuQueueMode, list: COpaquePointer?, context: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun sceGuSwapBuffers(): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceGuSync(mode: GuSyncMode, behavior: GuSyncBehavior): GeListState =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceGuDrawArray(prim: GuPrimitive, vtype: Int, count: Int, indices: COpaquePointer?, vertices: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun sceGuBeginObject(vtype: Int, count: Int, indices: COpaquePointer?, vertices: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun sceGuEndObject() {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun sceGuSetStatus(state: GuState, status: Int) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun sceGuGetStatus(state: GuState): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceGuSetAllStatus(status: Int) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun sceGuGetAllStatus(): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceGuEnable(state: GuState) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun sceGuDisable(state: GuState) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun sceGuLight(light: Int, type: LightType, components: Int, position: ScePspFVector3) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun sceGuLightAtt(light: Int, atten0: Float, atten1: Float, atten2: Float) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun sceGuLightColor(light: Int, component: Int, color: UInt) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun sceGuLightMode(mode: LightMode) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun sceGuLightSpot(light: Int, direction: ScePspFVector3, exponent: Float, cutoff: Float) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun sceGuClear(flags: Int) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun sceGuClearColor(color: UInt) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun sceGuClearDepth(depth: UInt) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun sceGuClearStencil(stencil: UInt) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun sceGuPixelMask(mask: UInt) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun sceGuColor(color: UInt) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun sceGuColorFunc(func: ColorFunc, color: UInt, mask: UInt) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun sceGuColorMaterial(components: Int) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun sceGuAlphaFunc(func: AlphaFunc, value: Int, mask: Int) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun sceGuAmbient(color: UInt) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun sceGuAmbientColor(color: UInt) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun sceGuBlendFunc(op: BlendOp, src: BlendSrc, dest: BlendDst, srcFix: UInt, destFix: UInt) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun sceGuMaterial(components: Int, color: UInt) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun sceGuModelColor(emissive: UInt, ambient: UInt, diffuse: UInt, specular: UInt) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun sceGuStencilFunc(func: StencilFunc, ref: Int, mask: Int) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun sceGuStencilOp(fail: StencilOperation, zfail: StencilOperation, zpass: StencilOperation) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun sceGuSpecular(power: Float) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun sceGuFrontFace(order: FrontFaceDirection) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun sceGuLogicalOp(op: LogicalOperation) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun sceGuSetDither(matrix: ScePspIMatrix4) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun sceGuShadeModel(mode: ShadingModel) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun sceGuCopyImage(psm: DisplayPixelFormat, sx: Int, sy: Int, width: Int, height: Int, srcw: Int, src: COpaquePointer?, dx: Int, dy: Int, destw: Int, dest: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun sceGuTexEnvColor(color: UInt) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun sceGuTexFilter(min: TextureFilter, mag: TextureFilter) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun sceGuTexFlush() {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun sceGuTexFunc(tfx: TextureEffect, tcc: TextureColorComponent) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun sceGuTexImage(mipmap: MipmapLevel, width: Int, height: Int, tbw: Int, tbp: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun sceGuTexLevelMode(mode: TextureLevelMode, bias: Float) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun sceGuTexMapMode(mode: TextureMapMode, a1: UInt, a2: UInt) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun sceGuTexMode(tpsm: TexturePixelFormat, maxmips: Int, a2: Int, swizzle: Int) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun sceGuTexOffset(u: Float, v: Float) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun sceGuTexProjMapMode(mode: TextureProjectionMapMode) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun sceGuTexScale(u: Float, v: Float) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun sceGuTexSlope(slope: Float) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun sceGuTexSync() {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun sceGuTexWrap(u: GuTexWrapMode, v: GuTexWrapMode) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun sceGuClutLoad(numBlocks: Int, cbp: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun sceGuClutMode(cpsm: ClutPixelFormat, shift: UInt, mask: UInt, a3: UInt) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun sceGuOffset(x: UInt, y: UInt) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun sceGuScissor(x: Int, y: Int, w: Int, h: Int) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun sceGuViewport(cx: Int, cy: Int, width: Int, height: Int) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun sceGuDrawBezier(vType: Int, uCount: Int, vCount: Int, indices: COpaquePointer?, vertices: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun sceGuPatchDivide(ulevel: UInt, vlevel: UInt) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun sceGuPatchFrontFace(a0: UInt) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun sceGuPatchPrim(prim: PatchPrimitive) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun sceGuDrawSpline(vType: Int, uCount: Int, vCount: Int, uEdge: Int, vEdge: Int, indices: COpaquePointer?, vertices: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun sceGuSetMatrix(type: MatrixMode, matrix: ScePspFMatrix4) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun sceGuBoneMatrix(index: UInt, matrix: ScePspFMatrix4) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun sceGuMorphWeight(index: Int, weight: Float) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun sceGuDrawArrayN(primitiveType: GuPrimitive, vType: Int, count: Int, a3: Int, indices: COpaquePointer?, vertices: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun sceGumDrawArray(prim: GuPrimitive, vType: Int, count: Int, indices: COpaquePointer?, vertices: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun sceGumDrawArrayN(prim: GuPrimitive, vType: Int, count: Int, a3: Int, indices: COpaquePointer?, vertices: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun sceGumDrawBezier(vType: Int, uCount: Int, vCount: Int, indices: COpaquePointer?, vertices: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun sceGumDrawSpline(vType: Int, uCount: Int, vCount: Int, uEdge: Int, vEdge: Int, indices: COpaquePointer?, vertices: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun sceGumFastInverse() {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun sceGumFullInverse() {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun sceGumLoadIdentity() {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun sceGumLoadMatrix(m: ScePspFMatrix4) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun sceGumLookAt(eye: ScePspFVector3, center: ScePspFVector3, up: ScePspFVector3) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun sceGumMatrixMode(mode: MatrixMode) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun sceGumMultMatrix(m: ScePspFMatrix4) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun sceGumOrtho(left: Float, right: Float, bottom: Float, top: Float, near: Float, far: Float) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun sceGumPerspective(fovy: Float, aspect: Float, near: Float, far: Float) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun sceGumPopMatrix() {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun sceGumPushMatrix() {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun sceGumRotateX(angle: Float) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun sceGumRotateY(angle: Float) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun sceGumRotateZ(angle: Float) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun sceGumRotateXYZ(v: ScePspFVector3) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun sceGumRotateZYX(v: ScePspFVector3) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun sceGumScale(v: ScePspFVector3) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun sceGumStoreMatrix(m: ScePspFMatrix4) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun sceGumTranslate(v: ScePspFVector3) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun sceGumUpdateMatrix() {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun sceMp3ReserveMp3Handle(args: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceMp3ReleaseMp3Handle(handle: Mp3Handle): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceMp3InitResource(): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceMp3TermResource(): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceMp3Init(handle: Mp3Handle): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceMp3Decode(handle: Mp3Handle, dst: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceMp3GetInfoToAddStreamData(handle: Mp3Handle, dst: COpaquePointer?, toWrite: COpaquePointer?, srcPos: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceMp3NotifyAddStreamData(handle: Mp3Handle, size: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceMp3CheckStreamDataNeeded(handle: Mp3Handle): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceMp3SetLoopNum(handle: Mp3Handle, loop: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceMp3GetLoopNum(handle: Mp3Handle): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceMp3GetSumDecodedSample(handle: Mp3Handle): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceMp3GetMaxOutputSample(handle: Mp3Handle): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceMp3GetSamplingRate(handle: Mp3Handle): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceMp3GetBitRate(handle: Mp3Handle): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceMp3GetMp3ChannelNum(handle: Mp3Handle): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceMp3ResetPlayPosition(handle: Mp3Handle): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceRegOpenRegistry(reg: COpaquePointer?, mode: Int, handle: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceRegFlushRegistry(handle: RegHandle): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceRegCloseRegistry(handle: RegHandle): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceRegOpenCategory(handle: RegHandle, name: COpaquePointer?, mode: Int, dirHandle: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceRegRemoveCategory(handle: RegHandle, name: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceRegCloseCategory(dirHandle: RegHandle): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceRegFlushCategory(dirHandle: RegHandle): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceRegGetKeyInfo(dirHandle: RegHandle, name: COpaquePointer?, keyHandle: COpaquePointer?, type: COpaquePointer?, size: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceRegGetKeyInfoByName(dirHandle: RegHandle, name: COpaquePointer?, type: COpaquePointer?, size: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceRegGetKeyValue(dirHandle: RegHandle, keyHandle: RegHandle, buf: COpaquePointer?, size: ULong): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceRegGetKeyValueByName(dirHandle: RegHandle, name: COpaquePointer?, buf: COpaquePointer?, size: ULong): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceRegSetKeyValue(dirHandle: RegHandle, name: COpaquePointer?, buf: COpaquePointer?, size: ULong): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceRegGetKeysNum(dirHandle: RegHandle, num: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceRegGetKeys(dirHandle: RegHandle, buf: COpaquePointer?, num: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceRegCreateKey(dirHandle: RegHandle, name: COpaquePointer?, type: Int, size: ULong): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceRegRemoveRegistry(key: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceOpenPSIDGetOpenPSID(openpsid: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceUtilityMsgDialogInitStart(params: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceUtilityMsgDialogShutdownStart() {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun sceUtilityMsgDialogGetStatus(): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceUtilityMsgDialogUpdate(n: Int) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun sceUtilityMsgDialogAbort(): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceUtilityNetconfInitStart(data: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceUtilityNetconfShutdownStart(): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceUtilityNetconfUpdate(unknown: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceUtilityNetconfGetStatus(): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceUtilityCheckNetParam(id: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceUtilityGetNetParam(conf: Int, param: NetParam, data: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceUtilitySavedataInitStart(params: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceUtilitySavedataGetStatus(): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceUtilitySavedataShutdownStart(): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceUtilitySavedataUpdate(unknown: Int) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun sceUtilityGameSharingInitStart(params: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceUtilityGameSharingShutdownStart() {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun sceUtilityGameSharingGetStatus(): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceUtilityGameSharingUpdate(n: Int) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun sceUtilityHtmlViewerInitStart(params: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceUtilityHtmlViewerShutdownStart(): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceUtilityHtmlViewerUpdate(n: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceUtilityHtmlViewerGetStatus(): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceUtilitySetSystemParamInt(id: SystemParamId, value: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceUtilitySetSystemParamString(id: SystemParamId, str: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceUtilityGetSystemParamInt(id: SystemParamId, value: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceUtilityGetSystemParamString(id: SystemParamId, str: COpaquePointer?, len: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceUtilityOskInitStart(params: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceUtilityOskShutdownStart(): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceUtilityOskUpdate(n: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceUtilityOskGetStatus(): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceUtilityLoadNetModule(module: NetModule): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceUtilityUnloadNetModule(module: NetModule): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceUtilityLoadAvModule(module: AvModule): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceUtilityUnloadAvModule(module: AvModule): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceUtilityLoadUsbModule(module: UsbModule): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceUtilityUnloadUsbModule(module: UsbModule): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceUtilityLoadModule(module: Module): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceUtilityUnloadModule(module: Module): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceUtilityCreateNetParam(conf: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceUtilitySetNetParam(param: NetParam, value: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceUtilityCopyNetParam(src: Int, dest: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceUtilityDeleteNetParam(conf: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceNetInit(poolsize: Int, calloutprio: Int, calloutstack: Int, netintrprio: Int, netintrstack: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceNetTerm(): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceNetFreeThreadinfo(thid: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceNetThreadAbort(thid: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceNetEtherStrton(name: COpaquePointer?, mac: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun sceNetEtherNtostr(mac: COpaquePointer?, name: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun sceNetGetLocalEtherAddr(mac: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceNetGetMallocStat(stat: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceNetAdhocctlInit(stacksize: Int, priority: Int, adhocId: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceNetAdhocctlTerm(): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceNetAdhocctlConnect(name: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceNetAdhocctlDisconnect(): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceNetAdhocctlGetState(event: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceNetAdhocctlCreate(name: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceNetAdhocctlJoin(scaninfo: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceNetAdhocctlGetAdhocId(id: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceNetAdhocctlCreateEnterGameMode(name: COpaquePointer?, unknown: Int, num: Int, macs: COpaquePointer?, timeout: UInt, unknown2: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceNetAdhocctlJoinEnterGameMode(name: COpaquePointer?, hostmac: COpaquePointer?, timeout: UInt, unknown: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceNetAdhocctlGetGameModeInfo(gamemodeinfo: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceNetAdhocctlExitGameMode(): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceNetAdhocctlGetPeerList(length: COpaquePointer?, buf: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceNetAdhocctlGetPeerInfo(mac: COpaquePointer?, size: Int, peerinfo: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceNetAdhocctlScan(): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceNetAdhocctlGetScanInfo(length: COpaquePointer?, buf: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceNetAdhocctlAddHandler(handler: SceNetAdhocctlHandler, unknown: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceNetAdhocctlDelHandler(id: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceNetAdhocctlGetNameByAddr(mac: COpaquePointer?, nickname: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceNetAdhocctlGetAddrByName(nickname: COpaquePointer?, length: COpaquePointer?, buf: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceNetAdhocctlGetParameter(params: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceNetAdhocInit(): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceNetAdhocTerm(): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceNetAdhocPdpCreate(mac: COpaquePointer?, port: UShort, bufSize: UInt, unk1: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceNetAdhocPdpDelete(id: Int, unk1: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceNetAdhocPdpSend(id: Int, destMacAddr: COpaquePointer?, port: UShort, data: COpaquePointer?, len: UInt, timeout: UInt, nonblock: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceNetAdhocPdpRecv(id: Int, srcMacAddr: COpaquePointer?, port: COpaquePointer?, data: COpaquePointer?, dataLength: COpaquePointer?, timeout: UInt, nonblock: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceNetAdhocGetPdpStat(size: COpaquePointer?, stat: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceNetAdhocGameModeCreateMaster(data: COpaquePointer?, size: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceNetAdhocGameModeCreateReplica(mac: COpaquePointer?, data: COpaquePointer?, size: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceNetAdhocGameModeUpdateMaster(): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceNetAdhocGameModeUpdateReplica(id: Int, unk1: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceNetAdhocGameModeDeleteMaster(): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceNetAdhocGameModeDeleteReplica(id: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceNetAdhocPtpOpen(srcmac: COpaquePointer?, srcport: UShort, destmac: COpaquePointer?, destport: UShort, bufSize: UInt, delay: UInt, count: Int, unk1: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceNetAdhocPtpConnect(id: Int, timeout: UInt, nonblock: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceNetAdhocPtpListen(srcmac: COpaquePointer?, srcport: UShort, bufSize: UInt, delay: UInt, count: Int, queue: Int, unk1: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceNetAdhocPtpAccept(id: Int, mac: COpaquePointer?, port: COpaquePointer?, timeout: UInt, nonblock: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceNetAdhocPtpSend(id: Int, data: COpaquePointer?, dataSize: COpaquePointer?, timeout: UInt, nonblock: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceNetAdhocPtpRecv(id: Int, data: COpaquePointer?, dataSize: COpaquePointer?, timeout: UInt, nonblock: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceNetAdhocPtpFlush(id: Int, timeout: UInt, nonblock: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceNetAdhocPtpClose(id: Int, unk1: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceNetAdhocGetPtpStat(size: COpaquePointer?, stat: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceNetAdhocMatchingInit(memsize: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceNetAdhocMatchingTerm(): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceNetAdhocMatchingCreate(mode: AdhocMatchingMode, maxPeers: Int, port: UShort, bufSize: Int, helloDelay: UInt, pingDelay: UInt, initCount: Int, msgDelay: UInt, callback: AdhocMatchingCallback): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceNetAdhocMatchingDelete(matchingId: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceNetAdhocMatchingStart(matchingId: Int, evthPri: Int, evthStack: Int, inthPri: Int, inthStack: Int, optLen: Int, optData: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceNetAdhocMatchingStop(matchingId: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceNetAdhocMatchingSelectTarget(matchingId: Int, mac: COpaquePointer?, optLen: Int, optData: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceNetAdhocMatchingCancelTarget(matchingId: Int, mac: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceNetAdhocMatchingCancelTargetWithOpt(matchingId: Int, mac: COpaquePointer?, optLen: Int, optData: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceNetAdhocMatchingSendData(matchingId: Int, mac: COpaquePointer?, dataLen: Int, data: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceNetAdhocMatchingAbortSendData(matchingId: Int, mac: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceNetAdhocMatchingSetHelloOpt(matchingId: Int, optLen: Int, optData: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceNetAdhocMatchingGetHelloOpt(matchingId: Int, optLen: COpaquePointer?, optData: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceNetAdhocMatchingGetMembers(matchingId: Int, length: COpaquePointer?, buf: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceNetAdhocMatchingGetPoolMaxAlloc(): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceNetAdhocMatchingGetPoolStat(poolstat: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceNetApctlInit(stackSize: Int, initPriority: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceNetApctlTerm(): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceNetApctlGetInfo(code: ApctlInfo, pinfo: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceNetApctlAddHandler(handler: SceNetApctlHandler, parg: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceNetApctlDelHandler(handlerId: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceNetApctlConnect(connIndex: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceNetApctlDisconnect(): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceNetApctlGetState(pstate: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceNetInetInit(): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceNetInetTerm(): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceNetInetAccept(s: Int, addr: COpaquePointer?, addrLen: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceNetInetBind(s: Int, myAddr: COpaquePointer?, addrLen: SocklenT): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceNetInetConnect(s: Int, servAddr: COpaquePointer?, addrLen: SocklenT): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceNetInetGetsockopt(s: Int, level: Int, optName: Int, optVal: COpaquePointer?, optlEn: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceNetInetListen(s: Int, backlog: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceNetInetRecv(s: Int, buf: COpaquePointer?, len: ULong, flags: Int): ULong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceNetInetRecvfrom(s: Int, buf: COpaquePointer?, flags: ULong, arg1: Int, from: COpaquePointer?, fromLen: COpaquePointer?): ULong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceNetInetSend(s: Int, buf: COpaquePointer?, len: ULong, flags: Int): ULong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceNetInetSendto(s: Int, buf: COpaquePointer?, len: ULong, flags: Int, to: COpaquePointer?, toLen: SocklenT): ULong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceNetInetSetsockopt(s: Int, level: Int, optName: Int, optVal: COpaquePointer?, optLen: SocklenT): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceNetInetShutdown(s: Int, how: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceNetInetSocket(domain: Int, type: Int, protocol: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceNetInetClose(s: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceNetInetGetErrno(): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceSslInit(unknown1: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceSslEnd(): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceSslGetUsedMemoryMax(memory: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceSslGetUsedMemoryCurrent(memory: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceHttpInit(unknown1: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceHttpEnd(): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceHttpCreateTemplate(agent: COpaquePointer?, unknown1: Int, unknown2: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceHttpDeleteTemplate(templateid: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceHttpCreateConnection(templateid: Int, host: COpaquePointer?, unknown1: COpaquePointer?, port: UShort, unknown2: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceHttpCreateConnectionWithURL(templateid: Int, url: COpaquePointer?, unknown1: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceHttpDeleteConnection(connectionId: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceHttpCreateRequest(connectionId: Int, method: HttpMethod, path: COpaquePointer?, contentLength: ULong): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceHttpCreateRequestWithURL(connectionId: Int, method: HttpMethod, url: COpaquePointer?, contentLength: ULong): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceHttpDeleteRequest(requestId: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceHttpSendRequest(requestId: Int, data: COpaquePointer?, dataSize: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceHttpAbortRequest(requestId: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceHttpReadData(requestId: Int, data: COpaquePointer?, dataSize: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceHttpGetContentLength(requestId: Int, contentLength: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceHttpGetStatusCode(requestId: Int, statusCode: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceHttpSetResolveTimeOut(id: Int, timeout: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceHttpSetResolveRetry(id: Int, count: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceHttpSetConnectTimeOut(id: Int, timeout: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceHttpSetSendTimeOut(id: Int, timeout: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceHttpSetRecvTimeOut(id: Int, timeout: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceHttpEnableKeepAlive(id: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceHttpDisableKeepAlive(id: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceHttpEnableRedirect(id: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceHttpDisableRedirect(id: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceHttpEnableCookie(id: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceHttpDisableCookie(id: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceHttpSaveSystemCookie(): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceHttpLoadSystemCookie(): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceHttpAddExtraHeader(id: Int, name: COpaquePointer?, value: COpaquePointer?, unknown1: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceHttpDeleteHeader(id: Int, name: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceHttpsInit(unknown1: Int, unknown2: Int, unknown3: Int, unknown4: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceHttpsEnd(): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceHttpsLoadDefaultCert(unknown1: Int, unknown2: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceHttpDisableAuth(id: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceHttpDisableCache(id: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceHttpEnableAuth(id: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceHttpEnableCache(id: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceHttpEndCache(): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceHttpGetAllHeader(request: Int, header: COpaquePointer?, headerSize: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceHttpGetNetworkErrno(request: Int, errNum: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceHttpGetProxy(id: Int, activateFlag: COpaquePointer?, mode: COpaquePointer?, proxyHost: COpaquePointer?, len: ULong, proxyPort: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceHttpInitCache(maxSize: ULong): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceHttpSetAuthInfoCB(id: Int, cbfunc: HttpPasswordCB): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceHttpSetProxy(id: Int, activateFlag: Int, mode: Int, newProxyHost: COpaquePointer?, newProxyPort: UShort): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceHttpSetResHeaderMaxSize(id: Int, headerSize: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceHttpSetMallocFunction(mallocFunc: HttpMallocFunction, freeFunc: HttpFreeFunction, reallocFunc: HttpReallocFunction): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceNetResolverInit(): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceNetResolverCreate(rid: COpaquePointer?, buf: COpaquePointer?, bufLength: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceNetResolverDelete(rid: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceNetResolverStartNtoA(rid: Int, hostname: COpaquePointer?, addr: COpaquePointer?, timeout: UInt, retry: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceNetResolverStartAtoN(rid: Int, addr: COpaquePointer?, hostname: COpaquePointer?, hostnameLen: UInt, timeout: UInt, retry: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceNetResolverStop(rid: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sceNetResolverTerm(): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
