@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.libc.psp

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

// The host must provide the C companion wrapper exports in import module libc.
public actual fun sceAudioChReserve(channel: Int, sampleCount: Int, format: AudioFormat): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceAudioChReserve")

@kotlin.wasm.WasmImport("libc", "libcPspSceAudioChRelease")
private external fun wasiLibcPspSceAudioChRelease(channel: Int): Int

public actual fun sceAudioChRelease(channel: Int): Int =
    wasiLibcPspSceAudioChRelease(channel)

public actual fun sceAudioOutput(channel: Int, vol: Int, buf: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceAudioOutput")

public actual fun sceAudioOutputBlocking(channel: Int, vol: Int, buf: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceAudioOutputBlocking")

public actual fun sceAudioOutputPanned(channel: Int, leftVol: Int, rightVol: Int, buf: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceAudioOutputPanned")

public actual fun sceAudioOutputPannedBlocking(channel: Int, leftVol: Int, rightVol: Int, buf: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceAudioOutputPannedBlocking")

@kotlin.wasm.WasmImport("libc", "libcPspSceAudioGetChannelRestLen")
private external fun wasiLibcPspSceAudioGetChannelRestLen(channel: Int): Int

public actual fun sceAudioGetChannelRestLen(channel: Int): Int =
    wasiLibcPspSceAudioGetChannelRestLen(channel)

@kotlin.wasm.WasmImport("libc", "libcPspSceAudioGetChannelRestLength")
private external fun wasiLibcPspSceAudioGetChannelRestLength(channel: Int): Int

public actual fun sceAudioGetChannelRestLength(channel: Int): Int =
    wasiLibcPspSceAudioGetChannelRestLength(channel)

@kotlin.wasm.WasmImport("libc", "libcPspSceAudioSetChannelDataLen")
private external fun wasiLibcPspSceAudioSetChannelDataLen(channel: Int, sampleCount: Int): Int

public actual fun sceAudioSetChannelDataLen(channel: Int, sampleCount: Int): Int =
    wasiLibcPspSceAudioSetChannelDataLen(channel, sampleCount)

public actual fun sceAudioChangeChannelConfig(channel: Int, format: AudioFormat): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceAudioChangeChannelConfig")

@kotlin.wasm.WasmImport("libc", "libcPspSceAudioChangeChannelVolume")
private external fun wasiLibcPspSceAudioChangeChannelVolume(channel: Int, leftVol: Int, rightVol: Int): Int

public actual fun sceAudioChangeChannelVolume(channel: Int, leftVol: Int, rightVol: Int): Int =
    wasiLibcPspSceAudioChangeChannelVolume(channel, leftVol, rightVol)

@kotlin.wasm.WasmImport("libc", "libcPspSceAudioOutput2Reserve")
private external fun wasiLibcPspSceAudioOutput2Reserve(sampleCount: Int): Int

public actual fun sceAudioOutput2Reserve(sampleCount: Int): Int =
    wasiLibcPspSceAudioOutput2Reserve(sampleCount)

@kotlin.wasm.WasmImport("libc", "libcPspSceAudioOutput2Release")
private external fun wasiLibcPspSceAudioOutput2Release(): Int

public actual fun sceAudioOutput2Release(): Int =
    wasiLibcPspSceAudioOutput2Release()

@kotlin.wasm.WasmImport("libc", "libcPspSceAudioOutput2ChangeLength")
private external fun wasiLibcPspSceAudioOutput2ChangeLength(sampleCount: Int): Int

public actual fun sceAudioOutput2ChangeLength(sampleCount: Int): Int =
    wasiLibcPspSceAudioOutput2ChangeLength(sampleCount)

public actual fun sceAudioOutput2OutputBlocking(vol: Int, buf: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceAudioOutput2OutputBlocking")

@kotlin.wasm.WasmImport("libc", "libcPspSceAudioOutput2GetRestSample")
private external fun wasiLibcPspSceAudioOutput2GetRestSample(): Int

public actual fun sceAudioOutput2GetRestSample(): Int =
    wasiLibcPspSceAudioOutput2GetRestSample()

public actual fun sceAudioSRCChReserve(sampleCount: Int, freq: AudioOutputFrequency, channels: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceAudioSRCChReserve")

@kotlin.wasm.WasmImport("libc", "libcPspSceAudioSRCChRelease")
private external fun wasiLibcPspSceAudioSRCChRelease(): Int

public actual fun sceAudioSRCChRelease(): Int =
    wasiLibcPspSceAudioSRCChRelease()

public actual fun sceAudioSRCOutputBlocking(vol: Int, buf: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceAudioSRCOutputBlocking")

@kotlin.wasm.WasmImport("libc", "libcPspSceAudioInputInit")
private external fun wasiLibcPspSceAudioInputInit(unknown1: Int, gain: Int, unknown2: Int): Int

public actual fun sceAudioInputInit(unknown1: Int, gain: Int, unknown2: Int): Int =
    wasiLibcPspSceAudioInputInit(unknown1, gain, unknown2)

public actual fun sceAudioInputInitEx(params: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceAudioInputInitEx")

public actual fun sceAudioInputBlocking(sampleCount: Int, freq: AudioInputFrequency, buf: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceAudioInputBlocking")

public actual fun sceAudioInput(sampleCount: Int, freq: AudioInputFrequency, buf: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceAudioInput")

@kotlin.wasm.WasmImport("libc", "libcPspSceAudioGetInputLength")
private external fun wasiLibcPspSceAudioGetInputLength(): Int

public actual fun sceAudioGetInputLength(): Int =
    wasiLibcPspSceAudioGetInputLength()

@kotlin.wasm.WasmImport("libc", "libcPspSceAudioWaitInputEnd")
private external fun wasiLibcPspSceAudioWaitInputEnd(): Int

public actual fun sceAudioWaitInputEnd(): Int =
    wasiLibcPspSceAudioWaitInputEnd()

@kotlin.wasm.WasmImport("libc", "libcPspSceAudioPollInputEnd")
private external fun wasiLibcPspSceAudioPollInputEnd(): Int

public actual fun sceAudioPollInputEnd(): Int =
    wasiLibcPspSceAudioPollInputEnd()

@kotlin.wasm.WasmImport("libc", "libcPspSceAtracGetAtracID")
private external fun wasiLibcPspSceAtracGetAtracID(uiCodecType: Int): Int

public actual fun sceAtracGetAtracID(uiCodecType: UInt): Int =
    wasiLibcPspSceAtracGetAtracID(uiCodecType.toInt())

public actual fun sceAtracSetDataAndGetID(buf: MutPtr, bufsize: ULong): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceAtracSetDataAndGetID")

public actual fun sceAtracDecodeData(atracId: Int, outSamples: MutPtr, outN: MutPtr, outEnd: MutPtr, outRemainFrame: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceAtracDecodeData")

public actual fun sceAtracGetRemainFrame(atracId: Int, outRemainFrame: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceAtracGetRemainFrame")

public actual fun sceAtracGetStreamDataInfo(atracId: Int, writePointer: MutPtr, availableBytes: MutPtr, readOffset: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceAtracGetStreamDataInfo")

@kotlin.wasm.WasmImport("libc", "libcPspSceAtracAddStreamData")
private external fun wasiLibcPspSceAtracAddStreamData(atracId: Int, bytesToAdd: Int): Int

public actual fun sceAtracAddStreamData(atracId: Int, bytesToAdd: UInt): Int =
    wasiLibcPspSceAtracAddStreamData(atracId, bytesToAdd.toInt())

public actual fun sceAtracGetBitrate(atracId: Int, outBitrate: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceAtracGetBitrate")

@kotlin.wasm.WasmImport("libc", "libcPspSceAtracSetLoopNum")
private external fun wasiLibcPspSceAtracSetLoopNum(atracId: Int, nloops: Int): Int

public actual fun sceAtracSetLoopNum(atracId: Int, nloops: Int): Int =
    wasiLibcPspSceAtracSetLoopNum(atracId, nloops)

@kotlin.wasm.WasmImport("libc", "libcPspSceAtracReleaseAtracID")
private external fun wasiLibcPspSceAtracReleaseAtracID(atracId: Int): Int

public actual fun sceAtracReleaseAtracID(atracId: Int): Int =
    wasiLibcPspSceAtracReleaseAtracID(atracId)

public actual fun sceAtracGetNextSample(atracId: Int, outN: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceAtracGetNextSample")

public actual fun sceAtracGetMaxSample(atracId: Int, outMax: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceAtracGetMaxSample")

public actual fun sceAtracGetBufferInfoForReseting(atracId: Int, uiSample: UInt, pbufferInfo: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceAtracGetBufferInfoForReseting")

public actual fun sceAtracGetChannel(atracId: Int, puiChannel: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceAtracGetChannel")

public actual fun sceAtracGetInternalErrorInfo(atracId: Int, piResult: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceAtracGetInternalErrorInfo")

public actual fun sceAtracGetLoopStatus(atracId: Int, piLoopNum: MutPtr, puiLoopStatus: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceAtracGetLoopStatus")

public actual fun sceAtracGetNextDecodePosition(atracId: Int, puiSamplePosition: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceAtracGetNextDecodePosition")

public actual fun sceAtracGetSecondBufferInfo(atracId: Int, puiPosition: MutPtr, puiDataByte: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceAtracGetSecondBufferInfo")

public actual fun sceAtracGetSoundSample(atracId: Int, piEndSample: MutPtr, piLoopStartSample: MutPtr, piLoopEndSample: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceAtracGetSoundSample")

@kotlin.wasm.WasmImport("libc", "libcPspSceAtracResetPlayPosition")
private external fun wasiLibcPspSceAtracResetPlayPosition(atracId: Int, uiSample: Int, uiWriteByteFirstBuf: Int, uiWriteByteSecondBuf: Int): Int

public actual fun sceAtracResetPlayPosition(atracId: Int, uiSample: UInt, uiWriteByteFirstBuf: UInt, uiWriteByteSecondBuf: UInt): Int =
    wasiLibcPspSceAtracResetPlayPosition(atracId, uiSample.toInt(), uiWriteByteFirstBuf.toInt(), uiWriteByteSecondBuf.toInt())

public actual fun sceAtracSetData(atracId: Int, pucBufferAddr: MutPtr, uiBufferByte: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceAtracSetData")

public actual fun sceAtracSetHalfwayBuffer(atracId: Int, pucBufferAddr: MutPtr, uiReadByte: UInt, uiBufferByte: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceAtracSetHalfwayBuffer")

public actual fun sceAtracSetHalfwayBufferAndGetID(pucBufferAddr: MutPtr, uiReadByte: UInt, uiBufferByte: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceAtracSetHalfwayBufferAndGetID")

public actual fun sceAtracSetSecondBuffer(atracId: Int, pucSecondBufferAddr: MutPtr, uiSecondBufferByte: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceAtracSetSecondBuffer")

@kotlin.wasm.WasmImport("libc", "libcPspSceCtrlSetSamplingCycle")
private external fun wasiLibcPspSceCtrlSetSamplingCycle(cycle: Int): Int

public actual fun sceCtrlSetSamplingCycle(cycle: Int): Int =
    wasiLibcPspSceCtrlSetSamplingCycle(cycle)

public actual fun sceCtrlGetSamplingCycle(pcycle: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceCtrlGetSamplingCycle")

public actual fun sceCtrlSetSamplingMode(mode: CtrlMode): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceCtrlSetSamplingMode")

public actual fun sceCtrlGetSamplingMode(pmode: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceCtrlGetSamplingMode")

public actual fun sceCtrlPeekBufferPositive(padData: MutPtr, count: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceCtrlPeekBufferPositive")

public actual fun sceCtrlPeekBufferNegative(padData: MutPtr, count: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceCtrlPeekBufferNegative")

public actual fun sceCtrlReadBufferPositive(padData: MutPtr, count: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceCtrlReadBufferPositive")

public actual fun sceCtrlReadBufferNegative(padData: MutPtr, count: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceCtrlReadBufferNegative")

public actual fun sceCtrlPeekLatch(latchData: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceCtrlPeekLatch")

public actual fun sceCtrlReadLatch(latchData: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceCtrlReadLatch")

@kotlin.wasm.WasmImport("libc", "libcPspSceCtrlSetIdleCancelThreshold")
private external fun wasiLibcPspSceCtrlSetIdleCancelThreshold(idlereset: Int, idleback: Int): Int

public actual fun sceCtrlSetIdleCancelThreshold(idlereset: Int, idleback: Int): Int =
    wasiLibcPspSceCtrlSetIdleCancelThreshold(idlereset, idleback)

public actual fun sceCtrlGetIdleCancelThreshold(idlereset: MutPtr, idleback: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceCtrlGetIdleCancelThreshold")

public actual fun sceDisplaySetMode(mode: DisplayMode, width: ULong, height: ULong): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceDisplaySetMode")

public actual fun sceDisplayGetMode(pmode: MutPtr, pwidth: MutPtr, pheight: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceDisplayGetMode")

public actual fun sceDisplaySetFrameBuf(topAddr: ConstPtr, bufferWidth: ULong, pixelFormat: DisplayPixelFormat, sync: DisplaySetBufSync): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceDisplaySetFrameBuf")

public actual fun sceDisplayGetFrameBuf(topAddr: MutPtr, bufferWidth: MutPtr, pixelFormat: MutPtr, sync: DisplaySetBufSync): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceDisplayGetFrameBuf")

@kotlin.wasm.WasmImport("libc", "libcPspSceDisplayGetVcount")
private external fun wasiLibcPspSceDisplayGetVcount(): Int

public actual fun sceDisplayGetVcount(): UInt =
    wasiLibcPspSceDisplayGetVcount().toUInt()

@kotlin.wasm.WasmImport("libc", "libcPspSceDisplayWaitVblank")
private external fun wasiLibcPspSceDisplayWaitVblank(): Int

public actual fun sceDisplayWaitVblank(): Int =
    wasiLibcPspSceDisplayWaitVblank()

@kotlin.wasm.WasmImport("libc", "libcPspSceDisplayWaitVblankCB")
private external fun wasiLibcPspSceDisplayWaitVblankCB(): Int

public actual fun sceDisplayWaitVblankCB(): Int =
    wasiLibcPspSceDisplayWaitVblankCB()

@kotlin.wasm.WasmImport("libc", "libcPspSceDisplayWaitVblankStart")
private external fun wasiLibcPspSceDisplayWaitVblankStart(): Int

public actual fun sceDisplayWaitVblankStart(): Int =
    wasiLibcPspSceDisplayWaitVblankStart()

@kotlin.wasm.WasmImport("libc", "libcPspSceDisplayWaitVblankStartCB")
private external fun wasiLibcPspSceDisplayWaitVblankStartCB(): Int

public actual fun sceDisplayWaitVblankStartCB(): Int =
    wasiLibcPspSceDisplayWaitVblankStartCB()

@kotlin.wasm.WasmImport("libc", "libcPspSceDisplayGetAccumulatedHcount")
private external fun wasiLibcPspSceDisplayGetAccumulatedHcount(): Int

public actual fun sceDisplayGetAccumulatedHcount(): Int =
    wasiLibcPspSceDisplayGetAccumulatedHcount()

@kotlin.wasm.WasmImport("libc", "libcPspSceDisplayGetCurrentHcount")
private external fun wasiLibcPspSceDisplayGetCurrentHcount(): Int

public actual fun sceDisplayGetCurrentHcount(): Int =
    wasiLibcPspSceDisplayGetCurrentHcount()

@kotlin.wasm.WasmImport("libc", "libcPspSceDisplayGetFramePerSec")
private external fun wasiLibcPspSceDisplayGetFramePerSec(): Float

public actual fun sceDisplayGetFramePerSec(): Float =
    wasiLibcPspSceDisplayGetFramePerSec()

@kotlin.wasm.WasmImport("libc", "libcPspSceDisplayIsForeground")
private external fun wasiLibcPspSceDisplayIsForeground(): Int

public actual fun sceDisplayIsForeground(): Int =
    wasiLibcPspSceDisplayIsForeground()

@kotlin.wasm.WasmImport("libc", "libcPspSceDisplayIsVblank")
private external fun wasiLibcPspSceDisplayIsVblank(): Int

public actual fun sceDisplayIsVblank(): Int =
    wasiLibcPspSceDisplayIsVblank()

@kotlin.wasm.WasmImport("libc", "libcPspSceGeEdramGetSize")
private external fun wasiLibcPspSceGeEdramGetSize(): Int

public actual fun sceGeEdramGetSize(): UInt =
    wasiLibcPspSceGeEdramGetSize().toUInt()

public actual fun sceGeEdramGetAddr(): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceGeEdramGetAddr")

@kotlin.wasm.WasmImport("libc", "libcPspSceGeEdramSetAddrTranslation")
private external fun wasiLibcPspSceGeEdramSetAddrTranslation(width: Int): Int

public actual fun sceGeEdramSetAddrTranslation(width: Int): Int =
    wasiLibcPspSceGeEdramSetAddrTranslation(width)

@kotlin.wasm.WasmImport("libc", "libcPspSceGeGetCmd")
private external fun wasiLibcPspSceGeGetCmd(cmd: Int): Int

public actual fun sceGeGetCmd(cmd: Int): UInt =
    wasiLibcPspSceGeGetCmd(cmd).toUInt()

public actual fun sceGeGetMtx(type: GeMatrixType, matrix: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceGeGetMtx")

public actual fun sceGeGetStack(stackId: Int, stack: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceGeGetStack")

public actual fun sceGeSaveContext(context: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceGeSaveContext")

public actual fun sceGeRestoreContext(context: ConstPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceGeRestoreContext")

public actual fun sceGeListEnQueue(list: ConstPtr, stall: MutPtr, cbid: Int, arg: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceGeListEnQueue")

public actual fun sceGeListEnQueueHead(list: ConstPtr, stall: MutPtr, cbid: Int, arg: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceGeListEnQueueHead")

@kotlin.wasm.WasmImport("libc", "libcPspSceGeListDeQueue")
private external fun wasiLibcPspSceGeListDeQueue(qid: Int): Int

public actual fun sceGeListDeQueue(qid: Int): Int =
    wasiLibcPspSceGeListDeQueue(qid)

public actual fun sceGeListUpdateStallAddr(qid: Int, stall: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceGeListUpdateStallAddr")

public actual fun sceGeListSync(qid: Int, syncType: Int): GeListState =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceGeListSync")

public actual fun sceGeDrawSync(syncType: Int): GeListState =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceGeDrawSync")

public actual fun sceGeBreak(mode: Int, pParam: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceGeBreak")

@kotlin.wasm.WasmImport("libc", "libcPspSceGeContinue")
private external fun wasiLibcPspSceGeContinue(): Int

public actual fun sceGeContinue(): Int =
    wasiLibcPspSceGeContinue()

public actual fun sceGeSetCallback(cb: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceGeSetCallback")

@kotlin.wasm.WasmImport("libc", "libcPspSceGeUnsetCallback")
private external fun wasiLibcPspSceGeUnsetCallback(cbid: Int): Int

public actual fun sceGeUnsetCallback(cbid: Int): Int =
    wasiLibcPspSceGeUnsetCallback(cbid)

@kotlin.wasm.WasmImport("libc", "libcPspSceKernelExitGame")
private external fun wasiLibcPspSceKernelExitGame(): Unit

public actual fun sceKernelExitGame(): Unit =
    wasiLibcPspSceKernelExitGame()

public actual fun sceKernelRegisterExitCallback(id: SceUid): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceKernelRegisterExitCallback")

public actual fun sceKernelLoadExec(file: ConstPtr, param: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceKernelLoadExec")

public actual fun sceKernelAllocPartitionMemory(partition: SceSysMemPartitionId, name: ConstPtr, type: SceSysMemBlockTypes, size: UInt, addr: MutPtr): SceUid =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceKernelAllocPartitionMemory")

public actual fun sceKernelGetBlockHeadAddr(blockid: SceUid): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceKernelGetBlockHeadAddr")

public actual fun sceKernelFreePartitionMemory(blockid: SceUid): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceKernelFreePartitionMemory")

@kotlin.wasm.WasmImport("libc", "libcPspSceKernelTotalFreeMemSize")
private external fun wasiLibcPspSceKernelTotalFreeMemSize(): Long

public actual fun sceKernelTotalFreeMemSize(): ULong =
    wasiLibcPspSceKernelTotalFreeMemSize().toULong()

@kotlin.wasm.WasmImport("libc", "libcPspSceKernelMaxFreeMemSize")
private external fun wasiLibcPspSceKernelMaxFreeMemSize(): Long

public actual fun sceKernelMaxFreeMemSize(): ULong =
    wasiLibcPspSceKernelMaxFreeMemSize().toULong()

@kotlin.wasm.WasmImport("libc", "libcPspSceKernelDevkitVersion")
private external fun wasiLibcPspSceKernelDevkitVersion(): Int

public actual fun sceKernelDevkitVersion(): UInt =
    wasiLibcPspSceKernelDevkitVersion().toUInt()

@kotlin.wasm.WasmImport("libc", "libcPspSceKernelSetCompiledSdkVersion")
private external fun wasiLibcPspSceKernelSetCompiledSdkVersion(version: Int): Int

public actual fun sceKernelSetCompiledSdkVersion(version: UInt): Int =
    wasiLibcPspSceKernelSetCompiledSdkVersion(version.toInt())

@kotlin.wasm.WasmImport("libc", "libcPspSceKernelGetCompiledSdkVersion")
private external fun wasiLibcPspSceKernelGetCompiledSdkVersion(): Int

public actual fun sceKernelGetCompiledSdkVersion(): UInt =
    wasiLibcPspSceKernelGetCompiledSdkVersion().toUInt()

public actual fun sceKernelLibcTime(t: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceKernelLibcTime")

@kotlin.wasm.WasmImport("libc", "libcPspSceKernelLibcClock")
private external fun wasiLibcPspSceKernelLibcClock(): Int

public actual fun sceKernelLibcClock(): UInt =
    wasiLibcPspSceKernelLibcClock().toUInt()

public actual fun sceKernelLibcGettimeofday(tp: MutPtr, tzp: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceKernelLibcGettimeofday")

@kotlin.wasm.WasmImport("libc", "libcPspSceKernelDcacheWritebackAll")
private external fun wasiLibcPspSceKernelDcacheWritebackAll(): Unit

public actual fun sceKernelDcacheWritebackAll(): Unit =
    wasiLibcPspSceKernelDcacheWritebackAll()

@kotlin.wasm.WasmImport("libc", "libcPspSceKernelDcacheWritebackInvalidateAll")
private external fun wasiLibcPspSceKernelDcacheWritebackInvalidateAll(): Unit

public actual fun sceKernelDcacheWritebackInvalidateAll(): Unit =
    wasiLibcPspSceKernelDcacheWritebackInvalidateAll()

public actual fun sceKernelDcacheWritebackRange(p: ConstPtr, size: UInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceKernelDcacheWritebackRange")

public actual fun sceKernelDcacheWritebackInvalidateRange(p: ConstPtr, size: UInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceKernelDcacheWritebackInvalidateRange")

public actual fun sceKernelDcacheInvalidateRange(p: ConstPtr, size: UInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceKernelDcacheInvalidateRange")

@kotlin.wasm.WasmImport("libc", "libcPspSceKernelIcacheInvalidateAll")
private external fun wasiLibcPspSceKernelIcacheInvalidateAll(): Unit

public actual fun sceKernelIcacheInvalidateAll(): Unit =
    wasiLibcPspSceKernelIcacheInvalidateAll()

public actual fun sceKernelIcacheInvalidateRange(p: ConstPtr, size: UInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceKernelIcacheInvalidateRange")

public actual fun sceKernelUtilsMt19937Init(ctx: MutPtr, seed: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceKernelUtilsMt19937Init")

public actual fun sceKernelUtilsMt19937UInt(ctx: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceKernelUtilsMt19937UInt")

public actual fun sceKernelUtilsMd5Digest(data: MutPtr, size: UInt, digest: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceKernelUtilsMd5Digest")

public actual fun sceKernelUtilsMd5BlockInit(ctx: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceKernelUtilsMd5BlockInit")

public actual fun sceKernelUtilsMd5BlockUpdate(ctx: MutPtr, data: MutPtr, size: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceKernelUtilsMd5BlockUpdate")

public actual fun sceKernelUtilsMd5BlockResult(ctx: MutPtr, digest: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceKernelUtilsMd5BlockResult")

public actual fun sceKernelUtilsSha1Digest(data: MutPtr, size: UInt, digest: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceKernelUtilsSha1Digest")

public actual fun sceKernelUtilsSha1BlockInit(ctx: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceKernelUtilsSha1BlockInit")

public actual fun sceKernelUtilsSha1BlockUpdate(ctx: MutPtr, data: MutPtr, size: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceKernelUtilsSha1BlockUpdate")

public actual fun sceKernelUtilsSha1BlockResult(ctx: MutPtr, digest: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceKernelUtilsSha1BlockResult")

public actual fun sceKernelRegisterSubIntrHandler(intNo: Int, no: Int, handler: MutPtr, arg: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceKernelRegisterSubIntrHandler")

@kotlin.wasm.WasmImport("libc", "libcPspSceKernelReleaseSubIntrHandler")
private external fun wasiLibcPspSceKernelReleaseSubIntrHandler(intNo: Int, no: Int): Int

public actual fun sceKernelReleaseSubIntrHandler(intNo: Int, no: Int): Int =
    wasiLibcPspSceKernelReleaseSubIntrHandler(intNo, no)

@kotlin.wasm.WasmImport("libc", "libcPspSceKernelEnableSubIntr")
private external fun wasiLibcPspSceKernelEnableSubIntr(intNo: Int, no: Int): Int

public actual fun sceKernelEnableSubIntr(intNo: Int, no: Int): Int =
    wasiLibcPspSceKernelEnableSubIntr(intNo, no)

@kotlin.wasm.WasmImport("libc", "libcPspSceKernelDisableSubIntr")
private external fun wasiLibcPspSceKernelDisableSubIntr(intNo: Int, no: Int): Int

public actual fun sceKernelDisableSubIntr(intNo: Int, no: Int): Int =
    wasiLibcPspSceKernelDisableSubIntr(intNo, no)

public actual fun queryIntrHandlerInfo(intrCode: SceUid, subIntrCode: SceUid, data: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspQueryIntrHandlerInfo")

@kotlin.wasm.WasmImport("libc", "libcPspSceKernelCpuSuspendIntr")
private external fun wasiLibcPspSceKernelCpuSuspendIntr(): Int

public actual fun sceKernelCpuSuspendIntr(): UInt =
    wasiLibcPspSceKernelCpuSuspendIntr().toUInt()

@kotlin.wasm.WasmImport("libc", "libcPspSceKernelCpuResumeIntr")
private external fun wasiLibcPspSceKernelCpuResumeIntr(flags: Int): Unit

public actual fun sceKernelCpuResumeIntr(flags: UInt): Unit =
    wasiLibcPspSceKernelCpuResumeIntr(flags.toInt())

@kotlin.wasm.WasmImport("libc", "libcPspSceKernelCpuResumeIntrWithSync")
private external fun wasiLibcPspSceKernelCpuResumeIntrWithSync(flags: Int): Unit

public actual fun sceKernelCpuResumeIntrWithSync(flags: UInt): Unit =
    wasiLibcPspSceKernelCpuResumeIntrWithSync(flags.toInt())

@kotlin.wasm.WasmImport("libc", "libcPspSceKernelIsCpuIntrSuspended")
private external fun wasiLibcPspSceKernelIsCpuIntrSuspended(flags: Int): Int

public actual fun sceKernelIsCpuIntrSuspended(flags: UInt): Int =
    wasiLibcPspSceKernelIsCpuIntrSuspended(flags.toInt())

@kotlin.wasm.WasmImport("libc", "libcPspSceKernelIsCpuIntrEnable")
private external fun wasiLibcPspSceKernelIsCpuIntrEnable(): Int

public actual fun sceKernelIsCpuIntrEnable(): Int =
    wasiLibcPspSceKernelIsCpuIntrEnable()

public actual fun sceKernelLoadModule(path: ConstPtr, flags: Int, option: MutPtr): SceUid =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceKernelLoadModule")

public actual fun sceKernelLoadModuleMs(path: ConstPtr, flags: Int, option: MutPtr): SceUid =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceKernelLoadModuleMs")

public actual fun sceKernelLoadModuleByID(fid: SceUid, flags: Int, option: MutPtr): SceUid =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceKernelLoadModuleByID")

public actual fun sceKernelLoadModuleBufferUsbWlan(bufSize: ULong, buf: MutPtr, flags: Int, option: MutPtr): SceUid =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceKernelLoadModuleBufferUsbWlan")

public actual fun sceKernelStartModule(modId: SceUid, argSize: ULong, argp: MutPtr, status: MutPtr, option: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceKernelStartModule")

public actual fun sceKernelStopModule(modId: SceUid, argSize: ULong, argp: MutPtr, status: MutPtr, option: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceKernelStopModule")

public actual fun sceKernelUnloadModule(modId: SceUid): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceKernelUnloadModule")

public actual fun sceKernelSelfStopUnloadModule(unknown: Int, argSize: ULong, argp: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceKernelSelfStopUnloadModule")

public actual fun sceKernelStopUnloadSelfModule(argSize: ULong, argp: MutPtr, status: MutPtr, option: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceKernelStopUnloadSelfModule")

public actual fun sceKernelQueryModuleInfo(modId: SceUid, info: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceKernelQueryModuleInfo")

public actual fun sceKernelGetModuleIdList(readBuf: MutPtr, readBufSize: Int, idCount: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceKernelGetModuleIdList")

public actual fun sceKernelVolatileMemLock(unk: Int, ptr: MutPtr, size: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceKernelVolatileMemLock")

public actual fun sceKernelVolatileMemTryLock(unk: Int, ptr: MutPtr, size: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceKernelVolatileMemTryLock")

@kotlin.wasm.WasmImport("libc", "libcPspSceKernelVolatileMemUnlock")
private external fun wasiLibcPspSceKernelVolatileMemUnlock(unk: Int): Int

public actual fun sceKernelVolatileMemUnlock(unk: Int): Int =
    wasiLibcPspSceKernelVolatileMemUnlock(unk)

public actual fun sceKernelStdin(): SceUid =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceKernelStdin")

public actual fun sceKernelStdout(): SceUid =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceKernelStdout")

public actual fun sceKernelStderr(): SceUid =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceKernelStderr")

public actual fun sceKernelGetThreadmanIdType(uid: SceUid): SceKernelIdListType =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceKernelGetThreadmanIdType")

public actual fun sceKernelCreateThread(name: ConstPtr, entry: SceKernelThreadEntry, initPriority: Int, stackSize: Int, attr: Int, option: MutPtr): SceUid =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceKernelCreateThread")

public actual fun sceKernelDeleteThread(thid: SceUid): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceKernelDeleteThread")

public actual fun sceKernelStartThread(id: SceUid, argLen: ULong, argP: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceKernelStartThread")

@kotlin.wasm.WasmImport("libc", "libcPspSceKernelExitThread")
private external fun wasiLibcPspSceKernelExitThread(status: Int): Int

public actual fun sceKernelExitThread(status: Int): Int =
    wasiLibcPspSceKernelExitThread(status)

@kotlin.wasm.WasmImport("libc", "libcPspSceKernelExitDeleteThread")
private external fun wasiLibcPspSceKernelExitDeleteThread(status: Int): Int

public actual fun sceKernelExitDeleteThread(status: Int): Int =
    wasiLibcPspSceKernelExitDeleteThread(status)

public actual fun sceKernelTerminateThread(thid: SceUid): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceKernelTerminateThread")

public actual fun sceKernelTerminateDeleteThread(thid: SceUid): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceKernelTerminateDeleteThread")

@kotlin.wasm.WasmImport("libc", "libcPspSceKernelSuspendDispatchThread")
private external fun wasiLibcPspSceKernelSuspendDispatchThread(): Int

public actual fun sceKernelSuspendDispatchThread(): Int =
    wasiLibcPspSceKernelSuspendDispatchThread()

@kotlin.wasm.WasmImport("libc", "libcPspSceKernelResumeDispatchThread")
private external fun wasiLibcPspSceKernelResumeDispatchThread(state: Int): Int

public actual fun sceKernelResumeDispatchThread(state: Int): Int =
    wasiLibcPspSceKernelResumeDispatchThread(state)

@kotlin.wasm.WasmImport("libc", "libcPspSceKernelSleepThread")
private external fun wasiLibcPspSceKernelSleepThread(): Int

public actual fun sceKernelSleepThread(): Int =
    wasiLibcPspSceKernelSleepThread()

@kotlin.wasm.WasmImport("libc", "libcPspSceKernelSleepThreadCB")
private external fun wasiLibcPspSceKernelSleepThreadCB(): Int

public actual fun sceKernelSleepThreadCB(): Int =
    wasiLibcPspSceKernelSleepThreadCB()

public actual fun sceKernelWakeupThread(thid: SceUid): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceKernelWakeupThread")

public actual fun sceKernelCancelWakeupThread(thid: SceUid): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceKernelCancelWakeupThread")

public actual fun sceKernelSuspendThread(thid: SceUid): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceKernelSuspendThread")

public actual fun sceKernelResumeThread(thid: SceUid): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceKernelResumeThread")

public actual fun sceKernelWaitThreadEnd(thid: SceUid, timeout: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceKernelWaitThreadEnd")

public actual fun sceKernelWaitThreadEndCB(thid: SceUid, timeout: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceKernelWaitThreadEndCB")

@kotlin.wasm.WasmImport("libc", "libcPspSceKernelDelayThread")
private external fun wasiLibcPspSceKernelDelayThread(delay: Int): Int

public actual fun sceKernelDelayThread(delay: UInt): Int =
    wasiLibcPspSceKernelDelayThread(delay.toInt())

@kotlin.wasm.WasmImport("libc", "libcPspSceKernelDelayThreadCB")
private external fun wasiLibcPspSceKernelDelayThreadCB(delay: Int): Int

public actual fun sceKernelDelayThreadCB(delay: UInt): Int =
    wasiLibcPspSceKernelDelayThreadCB(delay.toInt())

public actual fun sceKernelDelaySysClockThread(delay: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceKernelDelaySysClockThread")

public actual fun sceKernelDelaySysClockThreadCB(delay: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceKernelDelaySysClockThreadCB")

@kotlin.wasm.WasmImport("libc", "libcPspSceKernelChangeCurrentThreadAttr")
private external fun wasiLibcPspSceKernelChangeCurrentThreadAttr(unknown: Int, attr: Int): Int

public actual fun sceKernelChangeCurrentThreadAttr(unknown: Int, attr: Int): Int =
    wasiLibcPspSceKernelChangeCurrentThreadAttr(unknown, attr)

public actual fun sceKernelChangeThreadPriority(thid: SceUid, priority: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceKernelChangeThreadPriority")

@kotlin.wasm.WasmImport("libc", "libcPspSceKernelRotateThreadReadyQueue")
private external fun wasiLibcPspSceKernelRotateThreadReadyQueue(priority: Int): Int

public actual fun sceKernelRotateThreadReadyQueue(priority: Int): Int =
    wasiLibcPspSceKernelRotateThreadReadyQueue(priority)

public actual fun sceKernelReleaseWaitThread(thid: SceUid): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceKernelReleaseWaitThread")

@kotlin.wasm.WasmImport("libc", "libcPspSceKernelGetThreadId")
private external fun wasiLibcPspSceKernelGetThreadId(): Int

public actual fun sceKernelGetThreadId(): Int =
    wasiLibcPspSceKernelGetThreadId()

@kotlin.wasm.WasmImport("libc", "libcPspSceKernelGetThreadCurrentPriority")
private external fun wasiLibcPspSceKernelGetThreadCurrentPriority(): Int

public actual fun sceKernelGetThreadCurrentPriority(): Int =
    wasiLibcPspSceKernelGetThreadCurrentPriority()

public actual fun sceKernelGetThreadExitStatus(thid: SceUid): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceKernelGetThreadExitStatus")

@kotlin.wasm.WasmImport("libc", "libcPspSceKernelCheckThreadStack")
private external fun wasiLibcPspSceKernelCheckThreadStack(): Int

public actual fun sceKernelCheckThreadStack(): Int =
    wasiLibcPspSceKernelCheckThreadStack()

public actual fun sceKernelGetThreadStackFreeSize(thid: SceUid): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceKernelGetThreadStackFreeSize")

public actual fun sceKernelReferThreadStatus(thid: SceUid, info: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceKernelReferThreadStatus")

public actual fun sceKernelReferThreadRunStatus(thid: SceUid, status: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceKernelReferThreadRunStatus")

public actual fun sceKernelCreateSema(name: ConstPtr, attr: UInt, initVal: Int, maxVal: Int, option: MutPtr): SceUid =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceKernelCreateSema")

public actual fun sceKernelDeleteSema(semaId: SceUid): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceKernelDeleteSema")

public actual fun sceKernelSignalSema(semaId: SceUid, signal: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceKernelSignalSema")

public actual fun sceKernelWaitSema(semaId: SceUid, signal: Int, timeout: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceKernelWaitSema")

public actual fun sceKernelWaitSemaCB(semaId: SceUid, signal: Int, timeout: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceKernelWaitSemaCB")

public actual fun sceKernelPollSema(semaId: SceUid, signal: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceKernelPollSema")

public actual fun sceKernelReferSemaStatus(semaId: SceUid, info: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceKernelReferSemaStatus")

public actual fun sceKernelCreateEventFlag(name: ConstPtr, attr: Int, bits: Int, opt: MutPtr): SceUid =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceKernelCreateEventFlag")

public actual fun sceKernelSetEventFlag(evId: SceUid, bits: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceKernelSetEventFlag")

public actual fun sceKernelClearEventFlag(evId: SceUid, bits: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceKernelClearEventFlag")

public actual fun sceKernelPollEventFlag(evId: SceUid, bits: UInt, wait: Int, outBits: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceKernelPollEventFlag")

public actual fun sceKernelWaitEventFlag(evId: SceUid, bits: UInt, wait: Int, outBits: MutPtr, timeout: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceKernelWaitEventFlag")

public actual fun sceKernelWaitEventFlagCB(evId: SceUid, bits: UInt, wait: Int, outBits: MutPtr, timeout: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceKernelWaitEventFlagCB")

public actual fun sceKernelDeleteEventFlag(evId: SceUid): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceKernelDeleteEventFlag")

public actual fun sceKernelReferEventFlagStatus(event: SceUid, status: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceKernelReferEventFlagStatus")

public actual fun sceKernelCreateMbx(name: ConstPtr, attr: UInt, option: MutPtr): SceUid =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceKernelCreateMbx")

public actual fun sceKernelDeleteMbx(mbxId: SceUid): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceKernelDeleteMbx")

public actual fun sceKernelSendMbx(mbxId: SceUid, message: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceKernelSendMbx")

public actual fun sceKernelReceiveMbx(mbxId: SceUid, message: MutPtr, timeout: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceKernelReceiveMbx")

public actual fun sceKernelReceiveMbxCB(mbxId: SceUid, message: MutPtr, timeout: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceKernelReceiveMbxCB")

public actual fun sceKernelPollMbx(mbxId: SceUid, pmessage: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceKernelPollMbx")

public actual fun sceKernelCancelReceiveMbx(mbxId: SceUid, num: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceKernelCancelReceiveMbx")

public actual fun sceKernelReferMbxStatus(mbxId: SceUid, info: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceKernelReferMbxStatus")

public actual fun sceKernelSetAlarm(clock: UInt, handler: SceKernelAlarmHandler, common: MutPtr): SceUid =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceKernelSetAlarm")

public actual fun sceKernelSetSysClockAlarm(clock: MutPtr, handler: MutPtr, common: MutPtr): SceUid =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceKernelSetSysClockAlarm")

public actual fun sceKernelCancelAlarm(alarmId: SceUid): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceKernelCancelAlarm")

public actual fun sceKernelReferAlarmStatus(alarmId: SceUid, info: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceKernelReferAlarmStatus")

public actual fun sceKernelCreateCallback(name: ConstPtr, func: SceKernelCallbackFunction, arg: MutPtr): SceUid =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceKernelCreateCallback")

public actual fun sceKernelReferCallbackStatus(cb: SceUid, status: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceKernelReferCallbackStatus")

public actual fun sceKernelDeleteCallback(cb: SceUid): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceKernelDeleteCallback")

public actual fun sceKernelNotifyCallback(cb: SceUid, arg2: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceKernelNotifyCallback")

public actual fun sceKernelCancelCallback(cb: SceUid): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceKernelCancelCallback")

public actual fun sceKernelGetCallbackCount(cb: SceUid): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceKernelGetCallbackCount")

@kotlin.wasm.WasmImport("libc", "libcPspSceKernelCheckCallback")
private external fun wasiLibcPspSceKernelCheckCallback(): Int

public actual fun sceKernelCheckCallback(): Int =
    wasiLibcPspSceKernelCheckCallback()

public actual fun sceKernelGetThreadmanIdList(type: SceKernelIdListType, readBuf: MutPtr, readBufSize: Int, idCount: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceKernelGetThreadmanIdList")

public actual fun sceKernelReferSystemStatus(status: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceKernelReferSystemStatus")

public actual fun sceKernelCreateMsgPipe(name: ConstPtr, part: Int, attr: Int, unk1: MutPtr, opt: MutPtr): SceUid =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceKernelCreateMsgPipe")

public actual fun sceKernelDeleteMsgPipe(uid: SceUid): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceKernelDeleteMsgPipe")

public actual fun sceKernelSendMsgPipe(uid: SceUid, message: MutPtr, size: UInt, unk1: Int, unk2: MutPtr, timeout: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceKernelSendMsgPipe")

public actual fun sceKernelSendMsgPipeCB(uid: SceUid, message: MutPtr, size: UInt, unk1: Int, unk2: MutPtr, timeout: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceKernelSendMsgPipeCB")

public actual fun sceKernelTrySendMsgPipe(uid: SceUid, message: MutPtr, size: UInt, unk1: Int, unk2: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceKernelTrySendMsgPipe")

public actual fun sceKernelReceiveMsgPipe(uid: SceUid, message: MutPtr, size: UInt, unk1: Int, unk2: MutPtr, timeout: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceKernelReceiveMsgPipe")

public actual fun sceKernelReceiveMsgPipeCB(uid: SceUid, message: MutPtr, size: UInt, unk1: Int, unk2: MutPtr, timeout: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceKernelReceiveMsgPipeCB")

public actual fun sceKernelTryReceiveMsgPipe(uid: SceUid, message: MutPtr, size: UInt, unk1: Int, unk2: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceKernelTryReceiveMsgPipe")

public actual fun sceKernelCancelMsgPipe(uid: SceUid, send: MutPtr, recv: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceKernelCancelMsgPipe")

public actual fun sceKernelReferMsgPipeStatus(uid: SceUid, info: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceKernelReferMsgPipeStatus")

public actual fun sceKernelCreateVpl(name: ConstPtr, part: Int, attr: Int, size: UInt, opt: MutPtr): SceUid =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceKernelCreateVpl")

public actual fun sceKernelDeleteVpl(uid: SceUid): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceKernelDeleteVpl")

public actual fun sceKernelAllocateVpl(uid: SceUid, size: UInt, data: MutPtr, timeout: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceKernelAllocateVpl")

public actual fun sceKernelAllocateVplCB(uid: SceUid, size: UInt, data: MutPtr, timeout: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceKernelAllocateVplCB")

public actual fun sceKernelTryAllocateVpl(uid: SceUid, size: UInt, data: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceKernelTryAllocateVpl")

public actual fun sceKernelFreeVpl(uid: SceUid, data: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceKernelFreeVpl")

public actual fun sceKernelCancelVpl(uid: SceUid, num: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceKernelCancelVpl")

public actual fun sceKernelReferVplStatus(uid: SceUid, info: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceKernelReferVplStatus")

public actual fun sceKernelCreateFpl(name: ConstPtr, part: Int, attr: Int, size: UInt, blocks: UInt, opt: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceKernelCreateFpl")

public actual fun sceKernelDeleteFpl(uid: SceUid): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceKernelDeleteFpl")

public actual fun sceKernelAllocateFpl(uid: SceUid, data: MutPtr, timeout: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceKernelAllocateFpl")

public actual fun sceKernelAllocateFplCB(uid: SceUid, data: MutPtr, timeout: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceKernelAllocateFplCB")

public actual fun sceKernelTryAllocateFpl(uid: SceUid, data: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceKernelTryAllocateFpl")

public actual fun sceKernelFreeFpl(uid: SceUid, data: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceKernelFreeFpl")

public actual fun sceKernelCancelFpl(uid: SceUid, pnum: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceKernelCancelFpl")

public actual fun sceKernelReferFplStatus(uid: SceUid, info: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceKernelReferFplStatus")

public actual fun sceKernelUSec2SysClock(usec: UInt, clock: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceKernelUSec2SysClock")

@kotlin.wasm.WasmImport("libc", "libcPspSceKernelUSec2SysClockWide")
private external fun wasiLibcPspSceKernelUSec2SysClockWide(usec: Int): Long

public actual fun sceKernelUSec2SysClockWide(usec: UInt): Long =
    wasiLibcPspSceKernelUSec2SysClockWide(usec.toInt())

public actual fun sceKernelSysClock2USec(clock: MutPtr, low: MutPtr, high: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceKernelSysClock2USec")

public actual fun sceKernelSysClock2USecWide(clock: Long, low: MutPtr, high: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceKernelSysClock2USecWide")

public actual fun sceKernelGetSystemTime(time: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceKernelGetSystemTime")

@kotlin.wasm.WasmImport("libc", "libcPspSceKernelGetSystemTimeWide")
private external fun wasiLibcPspSceKernelGetSystemTimeWide(): Long

public actual fun sceKernelGetSystemTimeWide(): Long =
    wasiLibcPspSceKernelGetSystemTimeWide()

@kotlin.wasm.WasmImport("libc", "libcPspSceKernelGetSystemTimeLow")
private external fun wasiLibcPspSceKernelGetSystemTimeLow(): Int

public actual fun sceKernelGetSystemTimeLow(): UInt =
    wasiLibcPspSceKernelGetSystemTimeLow().toUInt()

public actual fun sceKernelCreateVTimer(name: ConstPtr, opt: MutPtr): SceUid =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceKernelCreateVTimer")

public actual fun sceKernelDeleteVTimer(uid: SceUid): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceKernelDeleteVTimer")

public actual fun sceKernelGetVTimerBase(uid: SceUid, base: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceKernelGetVTimerBase")

public actual fun sceKernelGetVTimerBaseWide(uid: SceUid): Long =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceKernelGetVTimerBaseWide")

public actual fun sceKernelGetVTimerTime(uid: SceUid, time: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceKernelGetVTimerTime")

public actual fun sceKernelGetVTimerTimeWide(uid: SceUid): Long =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceKernelGetVTimerTimeWide")

public actual fun sceKernelSetVTimerTime(uid: SceUid, time: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceKernelSetVTimerTime")

public actual fun sceKernelSetVTimerTimeWide(uid: SceUid, time: Long): Long =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceKernelSetVTimerTimeWide")

public actual fun sceKernelStartVTimer(uid: SceUid): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceKernelStartVTimer")

public actual fun sceKernelStopVTimer(uid: SceUid): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceKernelStopVTimer")

public actual fun sceKernelSetVTimerHandler(uid: SceUid, time: MutPtr, handler: SceKernelVTimerHandler, common: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceKernelSetVTimerHandler")

public actual fun sceKernelSetVTimerHandlerWide(uid: SceUid, time: Long, handler: SceKernelVTimerHandlerWide, common: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceKernelSetVTimerHandlerWide")

public actual fun sceKernelCancelVTimerHandler(uid: SceUid): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceKernelCancelVTimerHandler")

public actual fun sceKernelReferVTimerStatus(uid: SceUid, info: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceKernelReferVTimerStatus")

public actual fun sceKernelRegisterThreadEventHandler(name: ConstPtr, threadId: SceUid, mask: Int, handler: SceKernelThreadEventHandler, common: MutPtr): SceUid =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceKernelRegisterThreadEventHandler")

public actual fun sceKernelReleaseThreadEventHandler(uid: SceUid): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceKernelReleaseThreadEventHandler")

public actual fun sceKernelReferThreadEventHandlerStatus(uid: SceUid, info: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceKernelReferThreadEventHandlerStatus")

public actual fun sceKernelReferThreadProfiler(): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceKernelReferThreadProfiler")

public actual fun sceKernelReferGlobalProfiler(): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceKernelReferGlobalProfiler")

public actual fun sceUsbStart(driverName: ConstPtr, size: Int, args: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceUsbStart")

public actual fun sceUsbStop(driverName: ConstPtr, size: Int, args: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceUsbStop")

@kotlin.wasm.WasmImport("libc", "libcPspSceUsbActivate")
private external fun wasiLibcPspSceUsbActivate(pid: Int): Int

public actual fun sceUsbActivate(pid: UInt): Int =
    wasiLibcPspSceUsbActivate(pid.toInt())

@kotlin.wasm.WasmImport("libc", "libcPspSceUsbDeactivate")
private external fun wasiLibcPspSceUsbDeactivate(pid: Int): Int

public actual fun sceUsbDeactivate(pid: UInt): Int =
    wasiLibcPspSceUsbDeactivate(pid.toInt())

@kotlin.wasm.WasmImport("libc", "libcPspSceUsbGetState")
private external fun wasiLibcPspSceUsbGetState(): Int

public actual fun sceUsbGetState(): Int =
    wasiLibcPspSceUsbGetState()

public actual fun sceUsbGetDrvState(driverName: ConstPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceUsbGetDrvState")

public actual fun sceUsbCamSetupStill(param: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceUsbCamSetupStill")

public actual fun sceUsbCamSetupStillEx(param: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceUsbCamSetupStillEx")

public actual fun sceUsbCamStillInputBlocking(buf: MutPtr, size: ULong): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceUsbCamStillInputBlocking")

public actual fun sceUsbCamStillInput(buf: MutPtr, size: ULong): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceUsbCamStillInput")

@kotlin.wasm.WasmImport("libc", "libcPspSceUsbCamStillWaitInputEnd")
private external fun wasiLibcPspSceUsbCamStillWaitInputEnd(): Int

public actual fun sceUsbCamStillWaitInputEnd(): Int =
    wasiLibcPspSceUsbCamStillWaitInputEnd()

@kotlin.wasm.WasmImport("libc", "libcPspSceUsbCamStillPollInputEnd")
private external fun wasiLibcPspSceUsbCamStillPollInputEnd(): Int

public actual fun sceUsbCamStillPollInputEnd(): Int =
    wasiLibcPspSceUsbCamStillPollInputEnd()

@kotlin.wasm.WasmImport("libc", "libcPspSceUsbCamStillCancelInput")
private external fun wasiLibcPspSceUsbCamStillCancelInput(): Int

public actual fun sceUsbCamStillCancelInput(): Int =
    wasiLibcPspSceUsbCamStillCancelInput()

@kotlin.wasm.WasmImport("libc", "libcPspSceUsbCamStillGetInputLength")
private external fun wasiLibcPspSceUsbCamStillGetInputLength(): Int

public actual fun sceUsbCamStillGetInputLength(): Int =
    wasiLibcPspSceUsbCamStillGetInputLength()

public actual fun sceUsbCamSetupVideo(param: MutPtr, workArea: MutPtr, workAreaSize: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceUsbCamSetupVideo")

public actual fun sceUsbCamSetupVideoEx(param: MutPtr, workArea: MutPtr, workAreaSize: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceUsbCamSetupVideoEx")

@kotlin.wasm.WasmImport("libc", "libcPspSceUsbCamStartVideo")
private external fun wasiLibcPspSceUsbCamStartVideo(): Int

public actual fun sceUsbCamStartVideo(): Int =
    wasiLibcPspSceUsbCamStartVideo()

@kotlin.wasm.WasmImport("libc", "libcPspSceUsbCamStopVideo")
private external fun wasiLibcPspSceUsbCamStopVideo(): Int

public actual fun sceUsbCamStopVideo(): Int =
    wasiLibcPspSceUsbCamStopVideo()

public actual fun sceUsbCamReadVideoFrameBlocking(buf: MutPtr, size: ULong): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceUsbCamReadVideoFrameBlocking")

public actual fun sceUsbCamReadVideoFrame(buf: MutPtr, size: ULong): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceUsbCamReadVideoFrame")

@kotlin.wasm.WasmImport("libc", "libcPspSceUsbCamWaitReadVideoFrameEnd")
private external fun wasiLibcPspSceUsbCamWaitReadVideoFrameEnd(): Int

public actual fun sceUsbCamWaitReadVideoFrameEnd(): Int =
    wasiLibcPspSceUsbCamWaitReadVideoFrameEnd()

@kotlin.wasm.WasmImport("libc", "libcPspSceUsbCamPollReadVideoFrameEnd")
private external fun wasiLibcPspSceUsbCamPollReadVideoFrameEnd(): Int

public actual fun sceUsbCamPollReadVideoFrameEnd(): Int =
    wasiLibcPspSceUsbCamPollReadVideoFrameEnd()

@kotlin.wasm.WasmImport("libc", "libcPspSceUsbCamGetReadVideoFrameSize")
private external fun wasiLibcPspSceUsbCamGetReadVideoFrameSize(): Int

public actual fun sceUsbCamGetReadVideoFrameSize(): Int =
    wasiLibcPspSceUsbCamGetReadVideoFrameSize()

@kotlin.wasm.WasmImport("libc", "libcPspSceUsbCamSetSaturation")
private external fun wasiLibcPspSceUsbCamSetSaturation(saturation: Int): Int

public actual fun sceUsbCamSetSaturation(saturation: Int): Int =
    wasiLibcPspSceUsbCamSetSaturation(saturation)

@kotlin.wasm.WasmImport("libc", "libcPspSceUsbCamSetBrightness")
private external fun wasiLibcPspSceUsbCamSetBrightness(brightness: Int): Int

public actual fun sceUsbCamSetBrightness(brightness: Int): Int =
    wasiLibcPspSceUsbCamSetBrightness(brightness)

@kotlin.wasm.WasmImport("libc", "libcPspSceUsbCamSetContrast")
private external fun wasiLibcPspSceUsbCamSetContrast(contrast: Int): Int

public actual fun sceUsbCamSetContrast(contrast: Int): Int =
    wasiLibcPspSceUsbCamSetContrast(contrast)

@kotlin.wasm.WasmImport("libc", "libcPspSceUsbCamSetSharpness")
private external fun wasiLibcPspSceUsbCamSetSharpness(sharpness: Int): Int

public actual fun sceUsbCamSetSharpness(sharpness: Int): Int =
    wasiLibcPspSceUsbCamSetSharpness(sharpness)

public actual fun sceUsbCamSetImageEffectMode(effectMode: UsbCamEffectMode): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceUsbCamSetImageEffectMode")

public actual fun sceUsbCamSetEvLevel(exposureLevel: UsbCamEvLevel): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceUsbCamSetEvLevel")

@kotlin.wasm.WasmImport("libc", "libcPspSceUsbCamSetReverseMode")
private external fun wasiLibcPspSceUsbCamSetReverseMode(reverseFlags: Int): Int

public actual fun sceUsbCamSetReverseMode(reverseFlags: Int): Int =
    wasiLibcPspSceUsbCamSetReverseMode(reverseFlags)

@kotlin.wasm.WasmImport("libc", "libcPspSceUsbCamSetZoom")
private external fun wasiLibcPspSceUsbCamSetZoom(zoom: Int): Int

public actual fun sceUsbCamSetZoom(zoom: Int): Int =
    wasiLibcPspSceUsbCamSetZoom(zoom)

public actual fun sceUsbCamGetSaturation(saturation: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceUsbCamGetSaturation")

public actual fun sceUsbCamGetBrightness(brightness: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceUsbCamGetBrightness")

public actual fun sceUsbCamGetContrast(contrast: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceUsbCamGetContrast")

public actual fun sceUsbCamGetSharpness(sharpness: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceUsbCamGetSharpness")

public actual fun sceUsbCamGetImageEffectMode(effectMode: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceUsbCamGetImageEffectMode")

public actual fun sceUsbCamGetEvLevel(exposureLevel: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceUsbCamGetEvLevel")

public actual fun sceUsbCamGetReverseMode(reverseFlags: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceUsbCamGetReverseMode")

public actual fun sceUsbCamGetZoom(zoom: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceUsbCamGetZoom")

@kotlin.wasm.WasmImport("libc", "libcPspSceUsbCamAutoImageReverseSW")
private external fun wasiLibcPspSceUsbCamAutoImageReverseSW(on: Int): Int

public actual fun sceUsbCamAutoImageReverseSW(on: Int): Int =
    wasiLibcPspSceUsbCamAutoImageReverseSW(on)

@kotlin.wasm.WasmImport("libc", "libcPspSceUsbCamGetAutoImageReverseState")
private external fun wasiLibcPspSceUsbCamGetAutoImageReverseState(): Int

public actual fun sceUsbCamGetAutoImageReverseState(): Int =
    wasiLibcPspSceUsbCamGetAutoImageReverseState()

@kotlin.wasm.WasmImport("libc", "libcPspSceUsbCamGetLensDirection")
private external fun wasiLibcPspSceUsbCamGetLensDirection(): Int

public actual fun sceUsbCamGetLensDirection(): Int =
    wasiLibcPspSceUsbCamGetLensDirection()

public actual fun sceUsbstorBootRegisterNotify(eventFlag: SceUid): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceUsbstorBootRegisterNotify")

@kotlin.wasm.WasmImport("libc", "libcPspSceUsbstorBootUnregisterNotify")
private external fun wasiLibcPspSceUsbstorBootUnregisterNotify(eventFlag: Int): Int

public actual fun sceUsbstorBootUnregisterNotify(eventFlag: UInt): Int =
    wasiLibcPspSceUsbstorBootUnregisterNotify(eventFlag.toInt())

@kotlin.wasm.WasmImport("libc", "libcPspSceUsbstorBootSetCapacity")
private external fun wasiLibcPspSceUsbstorBootSetCapacity(size: Int): Int

public actual fun sceUsbstorBootSetCapacity(size: UInt): Int =
    wasiLibcPspSceUsbstorBootSetCapacity(size.toInt())

public actual fun scePowerRegisterCallback(slot: Int, cbid: SceUid): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspScePowerRegisterCallback")

@kotlin.wasm.WasmImport("libc", "libcPspScePowerUnregisterCallback")
private external fun wasiLibcPspScePowerUnregisterCallback(slot: Int): Int

public actual fun scePowerUnregisterCallback(slot: Int): Int =
    wasiLibcPspScePowerUnregisterCallback(slot)

@kotlin.wasm.WasmImport("libc", "libcPspScePowerIsPowerOnline")
private external fun wasiLibcPspScePowerIsPowerOnline(): Int

public actual fun scePowerIsPowerOnline(): Int =
    wasiLibcPspScePowerIsPowerOnline()

@kotlin.wasm.WasmImport("libc", "libcPspScePowerIsBatteryExist")
private external fun wasiLibcPspScePowerIsBatteryExist(): Int

public actual fun scePowerIsBatteryExist(): Int =
    wasiLibcPspScePowerIsBatteryExist()

@kotlin.wasm.WasmImport("libc", "libcPspScePowerIsBatteryCharging")
private external fun wasiLibcPspScePowerIsBatteryCharging(): Int

public actual fun scePowerIsBatteryCharging(): Int =
    wasiLibcPspScePowerIsBatteryCharging()

@kotlin.wasm.WasmImport("libc", "libcPspScePowerGetBatteryChargingStatus")
private external fun wasiLibcPspScePowerGetBatteryChargingStatus(): Int

public actual fun scePowerGetBatteryChargingStatus(): Int =
    wasiLibcPspScePowerGetBatteryChargingStatus()

@kotlin.wasm.WasmImport("libc", "libcPspScePowerIsLowBattery")
private external fun wasiLibcPspScePowerIsLowBattery(): Int

public actual fun scePowerIsLowBattery(): Int =
    wasiLibcPspScePowerIsLowBattery()

@kotlin.wasm.WasmImport("libc", "libcPspScePowerGetBatteryLifePercent")
private external fun wasiLibcPspScePowerGetBatteryLifePercent(): Int

public actual fun scePowerGetBatteryLifePercent(): Int =
    wasiLibcPspScePowerGetBatteryLifePercent()

@kotlin.wasm.WasmImport("libc", "libcPspScePowerGetBatteryLifeTime")
private external fun wasiLibcPspScePowerGetBatteryLifeTime(): Int

public actual fun scePowerGetBatteryLifeTime(): Int =
    wasiLibcPspScePowerGetBatteryLifeTime()

@kotlin.wasm.WasmImport("libc", "libcPspScePowerGetBatteryTemp")
private external fun wasiLibcPspScePowerGetBatteryTemp(): Int

public actual fun scePowerGetBatteryTemp(): Int =
    wasiLibcPspScePowerGetBatteryTemp()

@kotlin.wasm.WasmImport("libc", "libcPspScePowerGetBatteryElec")
private external fun wasiLibcPspScePowerGetBatteryElec(): Int

public actual fun scePowerGetBatteryElec(): Int =
    wasiLibcPspScePowerGetBatteryElec()

@kotlin.wasm.WasmImport("libc", "libcPspScePowerGetBatteryVolt")
private external fun wasiLibcPspScePowerGetBatteryVolt(): Int

public actual fun scePowerGetBatteryVolt(): Int =
    wasiLibcPspScePowerGetBatteryVolt()

@kotlin.wasm.WasmImport("libc", "libcPspScePowerSetCpuClockFrequency")
private external fun wasiLibcPspScePowerSetCpuClockFrequency(cpufreq: Int): Int

public actual fun scePowerSetCpuClockFrequency(cpufreq: Int): Int =
    wasiLibcPspScePowerSetCpuClockFrequency(cpufreq)

@kotlin.wasm.WasmImport("libc", "libcPspScePowerSetBusClockFrequency")
private external fun wasiLibcPspScePowerSetBusClockFrequency(busfreq: Int): Int

public actual fun scePowerSetBusClockFrequency(busfreq: Int): Int =
    wasiLibcPspScePowerSetBusClockFrequency(busfreq)

@kotlin.wasm.WasmImport("libc", "libcPspScePowerGetCpuClockFrequency")
private external fun wasiLibcPspScePowerGetCpuClockFrequency(): Int

public actual fun scePowerGetCpuClockFrequency(): Int =
    wasiLibcPspScePowerGetCpuClockFrequency()

@kotlin.wasm.WasmImport("libc", "libcPspScePowerGetCpuClockFrequencyInt")
private external fun wasiLibcPspScePowerGetCpuClockFrequencyInt(): Int

public actual fun scePowerGetCpuClockFrequencyInt(): Int =
    wasiLibcPspScePowerGetCpuClockFrequencyInt()

@kotlin.wasm.WasmImport("libc", "libcPspScePowerGetCpuClockFrequencyFloat")
private external fun wasiLibcPspScePowerGetCpuClockFrequencyFloat(): Float

public actual fun scePowerGetCpuClockFrequencyFloat(): Float =
    wasiLibcPspScePowerGetCpuClockFrequencyFloat()

@kotlin.wasm.WasmImport("libc", "libcPspScePowerGetBusClockFrequency")
private external fun wasiLibcPspScePowerGetBusClockFrequency(): Int

public actual fun scePowerGetBusClockFrequency(): Int =
    wasiLibcPspScePowerGetBusClockFrequency()

@kotlin.wasm.WasmImport("libc", "libcPspScePowerGetBusClockFrequencyInt")
private external fun wasiLibcPspScePowerGetBusClockFrequencyInt(): Int

public actual fun scePowerGetBusClockFrequencyInt(): Int =
    wasiLibcPspScePowerGetBusClockFrequencyInt()

@kotlin.wasm.WasmImport("libc", "libcPspScePowerGetBusClockFrequencyFloat")
private external fun wasiLibcPspScePowerGetBusClockFrequencyFloat(): Float

public actual fun scePowerGetBusClockFrequencyFloat(): Float =
    wasiLibcPspScePowerGetBusClockFrequencyFloat()

@kotlin.wasm.WasmImport("libc", "libcPspScePowerSetClockFrequency")
private external fun wasiLibcPspScePowerSetClockFrequency(pllfreq: Int, cpufreq: Int, busfreq: Int): Int

public actual fun scePowerSetClockFrequency(pllfreq: Int, cpufreq: Int, busfreq: Int): Int =
    wasiLibcPspScePowerSetClockFrequency(pllfreq, cpufreq, busfreq)

@kotlin.wasm.WasmImport("libc", "libcPspScePowerLock")
private external fun wasiLibcPspScePowerLock(unknown: Int): Int

public actual fun scePowerLock(unknown: Int): Int =
    wasiLibcPspScePowerLock(unknown)

@kotlin.wasm.WasmImport("libc", "libcPspScePowerUnlock")
private external fun wasiLibcPspScePowerUnlock(unknown: Int): Int

public actual fun scePowerUnlock(unknown: Int): Int =
    wasiLibcPspScePowerUnlock(unknown)

public actual fun scePowerTick(t: PowerTick): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspScePowerTick")

@kotlin.wasm.WasmImport("libc", "libcPspScePowerGetIdleTimer")
private external fun wasiLibcPspScePowerGetIdleTimer(): Int

public actual fun scePowerGetIdleTimer(): Int =
    wasiLibcPspScePowerGetIdleTimer()

@kotlin.wasm.WasmImport("libc", "libcPspScePowerIdleTimerEnable")
private external fun wasiLibcPspScePowerIdleTimerEnable(unknown: Int): Int

public actual fun scePowerIdleTimerEnable(unknown: Int): Int =
    wasiLibcPspScePowerIdleTimerEnable(unknown)

@kotlin.wasm.WasmImport("libc", "libcPspScePowerIdleTimerDisable")
private external fun wasiLibcPspScePowerIdleTimerDisable(unknown: Int): Int

public actual fun scePowerIdleTimerDisable(unknown: Int): Int =
    wasiLibcPspScePowerIdleTimerDisable(unknown)

@kotlin.wasm.WasmImport("libc", "libcPspScePowerRequestStandby")
private external fun wasiLibcPspScePowerRequestStandby(): Int

public actual fun scePowerRequestStandby(): Int =
    wasiLibcPspScePowerRequestStandby()

@kotlin.wasm.WasmImport("libc", "libcPspScePowerRequestSuspend")
private external fun wasiLibcPspScePowerRequestSuspend(): Int

public actual fun scePowerRequestSuspend(): Int =
    wasiLibcPspScePowerRequestSuspend()

@kotlin.wasm.WasmImport("libc", "libcPspSceWlanDevIsPowerOn")
private external fun wasiLibcPspSceWlanDevIsPowerOn(): Int

public actual fun sceWlanDevIsPowerOn(): Int =
    wasiLibcPspSceWlanDevIsPowerOn()

@kotlin.wasm.WasmImport("libc", "libcPspSceWlanGetSwitchState")
private external fun wasiLibcPspSceWlanGetSwitchState(): Int

public actual fun sceWlanGetSwitchState(): Int =
    wasiLibcPspSceWlanGetSwitchState()

public actual fun sceWlanGetEtherAddr(etherAddr: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceWlanGetEtherAddr")

@kotlin.wasm.WasmImport("libc", "libcPspSceWlanDevAttach")
private external fun wasiLibcPspSceWlanDevAttach(): Int

public actual fun sceWlanDevAttach(): Int =
    wasiLibcPspSceWlanDevAttach()

@kotlin.wasm.WasmImport("libc", "libcPspSceWlanDevDetach")
private external fun wasiLibcPspSceWlanDevDetach(): Int

public actual fun sceWlanDevDetach(): Int =
    wasiLibcPspSceWlanDevDetach()

@kotlin.wasm.WasmImport("libc", "libcPspSceRtcGetTickResolution")
private external fun wasiLibcPspSceRtcGetTickResolution(): Int

public actual fun sceRtcGetTickResolution(): UInt =
    wasiLibcPspSceRtcGetTickResolution().toUInt()

public actual fun sceRtcGetCurrentTick(tick: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceRtcGetCurrentTick")

public actual fun sceRtcGetCurrentClock(tm: MutPtr, tz: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceRtcGetCurrentClock")

public actual fun sceRtcGetCurrentClockLocalTime(tm: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceRtcGetCurrentClockLocalTime")

public actual fun sceRtcConvertUtcToLocalTime(tickUtc: ConstPtr, tickLocal: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceRtcConvertUtcToLocalTime")

public actual fun sceRtcConvertLocalTimeToUTC(tickLocal: ConstPtr, tickUtc: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceRtcConvertLocalTimeToUTC")

@kotlin.wasm.WasmImport("libc", "libcPspSceRtcIsLeapYear")
private external fun wasiLibcPspSceRtcIsLeapYear(year: Int): Int

public actual fun sceRtcIsLeapYear(year: Int): Int =
    wasiLibcPspSceRtcIsLeapYear(year)

@kotlin.wasm.WasmImport("libc", "libcPspSceRtcGetDaysInMonth")
private external fun wasiLibcPspSceRtcGetDaysInMonth(year: Int, month: Int): Int

public actual fun sceRtcGetDaysInMonth(year: Int, month: Int): Int =
    wasiLibcPspSceRtcGetDaysInMonth(year, month)

@kotlin.wasm.WasmImport("libc", "libcPspSceRtcGetDayOfWeek")
private external fun wasiLibcPspSceRtcGetDayOfWeek(year: Int, month: Int, day: Int): Int

public actual fun sceRtcGetDayOfWeek(year: Int, month: Int, day: Int): Int =
    wasiLibcPspSceRtcGetDayOfWeek(year, month, day)

public actual fun sceRtcCheckValid(date: ConstPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceRtcCheckValid")

public actual fun sceRtcSetTick(date: MutPtr, tick: ConstPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceRtcSetTick")

public actual fun sceRtcGetTick(date: ConstPtr, tick: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceRtcGetTick")

public actual fun sceRtcCompareTick(tick1: ConstPtr, tick2: ConstPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceRtcCompareTick")

public actual fun sceRtcTickAddTicks(destTick: MutPtr, srcTick: ConstPtr, numTicks: ULong): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceRtcTickAddTicks")

public actual fun sceRtcTickAddMicroseconds(destTick: MutPtr, srcTick: ConstPtr, numMs: ULong): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceRtcTickAddMicroseconds")

public actual fun sceRtcTickAddSeconds(destTick: MutPtr, srcTick: ConstPtr, numSeconds: ULong): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceRtcTickAddSeconds")

public actual fun sceRtcTickAddMinutes(destTick: MutPtr, srcTick: ConstPtr, numMinutes: ULong): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceRtcTickAddMinutes")

public actual fun sceRtcTickAddHours(destTick: MutPtr, srcTick: ConstPtr, numHours: ULong): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceRtcTickAddHours")

public actual fun sceRtcTickAddDays(destTick: MutPtr, srcTick: ConstPtr, numDays: ULong): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceRtcTickAddDays")

public actual fun sceRtcTickAddWeeks(destTick: MutPtr, srcTick: ConstPtr, numWeeks: ULong): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceRtcTickAddWeeks")

public actual fun sceRtcTickAddMonths(destTick: MutPtr, srcTick: ConstPtr, numMonths: ULong): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceRtcTickAddMonths")

public actual fun sceRtcTickAddYears(destTick: MutPtr, srcTick: ConstPtr, numYears: ULong): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceRtcTickAddYears")

public actual fun sceRtcSetTimeT(date: MutPtr, time: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceRtcSetTimeT")

public actual fun sceRtcGetTimeT(date: ConstPtr, time: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceRtcGetTimeT")

public actual fun sceRtcSetTime64T(date: MutPtr, time: ULong): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceRtcSetTime64T")

public actual fun sceRtcGetTime64T(date: ConstPtr, time: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceRtcGetTime64T")

public actual fun sceRtcSetDosTime(date: MutPtr, dosTime: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceRtcSetDosTime")

public actual fun sceRtcGetDosTime(date: MutPtr, dosTime: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceRtcGetDosTime")

public actual fun sceRtcSetWin32FileTime(date: MutPtr, time: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceRtcSetWin32FileTime")

public actual fun sceRtcGetWin32FileTime(date: MutPtr, time: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceRtcGetWin32FileTime")

public actual fun sceRtcParseDateTime(destTick: MutPtr, dateString: ConstPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceRtcParseDateTime")

public actual fun sceRtcFormatRFC3339(pszDateTime: MutPtr, pUtc: ConstPtr, timeZoneMinutes: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceRtcFormatRFC3339")

public actual fun sceRtcFormatRFC3339LocalTime(pszDateTime: MutPtr, pUtc: ConstPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceRtcFormatRFC3339LocalTime")

public actual fun sceRtcParseRFC3339(pUtc: MutPtr, pszDateTime: ConstPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceRtcParseRFC3339")

public actual fun sceRtcFormatRFC2822(pszDateTime: MutPtr, pUtc: ConstPtr, timeZoneMinutes: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceRtcFormatRFC2822")

public actual fun sceRtcFormatRFC2822LocalTime(pszDateTime: MutPtr, pUtc: ConstPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceRtcFormatRFC2822LocalTime")

public actual fun sceIoOpen(file: ConstPtr, flags: Int, permissions: IoPermissions): SceUid =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceIoOpen")

public actual fun sceIoOpenAsync(file: ConstPtr, flags: Int, permissions: IoPermissions): SceUid =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceIoOpenAsync")

public actual fun sceIoClose(fd: SceUid): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceIoClose")

public actual fun sceIoCloseAsync(fd: SceUid): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceIoCloseAsync")

public actual fun sceIoRead(fd: SceUid, data: MutPtr, size: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceIoRead")

public actual fun sceIoReadAsync(fd: SceUid, data: MutPtr, size: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceIoReadAsync")

public actual fun sceIoWrite(fd: SceUid, data: ConstPtr, size: ULong): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceIoWrite")

public actual fun sceIoWriteAsync(fd: SceUid, data: ConstPtr, size: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceIoWriteAsync")

public actual fun sceIoLseek(fd: SceUid, offset: Long, whence: IoWhence): Long =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceIoLseek")

public actual fun sceIoLseekAsync(fd: SceUid, offset: Long, whence: IoWhence): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceIoLseekAsync")

public actual fun sceIoLseek32(fd: SceUid, offset: Int, whence: IoWhence): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceIoLseek32")

public actual fun sceIoLseek32Async(fd: SceUid, offset: Int, whence: IoWhence): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceIoLseek32Async")

public actual fun sceIoRemove(file: ConstPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceIoRemove")

public actual fun sceIoMkdir(dir: ConstPtr, mode: IoPermissions): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceIoMkdir")

public actual fun sceIoRmdir(path: ConstPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceIoRmdir")

public actual fun sceIoChdir(path: ConstPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceIoChdir")

public actual fun sceIoRename(oldname: ConstPtr, newname: ConstPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceIoRename")

public actual fun sceIoDopen(dirname: ConstPtr): SceUid =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceIoDopen")

public actual fun sceIoDread(fd: SceUid, dir: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceIoDread")

public actual fun sceIoDclose(fd: SceUid): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceIoDclose")

public actual fun sceIoDevctl(dev: ConstPtr, cmd: UInt, indata: MutPtr, inlen: Int, outdata: MutPtr, outlen: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceIoDevctl")

public actual fun sceIoAssign(dev1: ConstPtr, dev2: ConstPtr, dev3: ConstPtr, mode: IoAssignPerms, unk1: MutPtr, unk2: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceIoAssign")

public actual fun sceIoUnassign(dev: ConstPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceIoUnassign")

public actual fun sceIoGetstat(file: ConstPtr, stat: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceIoGetstat")

public actual fun sceIoChstat(file: ConstPtr, stat: MutPtr, bits: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceIoChstat")

public actual fun sceIoIoctl(fd: SceUid, cmd: UInt, indata: MutPtr, inlen: Int, outdata: MutPtr, outlen: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceIoIoctl")

public actual fun sceIoIoctlAsync(fd: SceUid, cmd: UInt, indata: MutPtr, inlen: Int, outdata: MutPtr, outlen: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceIoIoctlAsync")

public actual fun sceIoSync(device: ConstPtr, unk: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceIoSync")

public actual fun sceIoWaitAsync(fd: SceUid, res: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceIoWaitAsync")

public actual fun sceIoWaitAsyncCB(fd: SceUid, res: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceIoWaitAsyncCB")

public actual fun sceIoPollAsync(fd: SceUid, res: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceIoPollAsync")

public actual fun sceIoGetAsyncStat(fd: SceUid, poll: Int, res: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceIoGetAsyncStat")

public actual fun sceIoCancel(fd: SceUid): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceIoCancel")

public actual fun sceIoGetDevType(fd: SceUid): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceIoGetDevType")

public actual fun sceIoChangeAsyncPriority(fd: SceUid, pri: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceIoChangeAsyncPriority")

public actual fun sceIoSetAsyncCallback(fd: SceUid, cb: SceUid, argp: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceIoSetAsyncCallback")

@kotlin.wasm.WasmImport("libc", "libcPspSceJpegInitMJpeg")
private external fun wasiLibcPspSceJpegInitMJpeg(): Int

public actual fun sceJpegInitMJpeg(): Int =
    wasiLibcPspSceJpegInitMJpeg()

@kotlin.wasm.WasmImport("libc", "libcPspSceJpegFinishMJpeg")
private external fun wasiLibcPspSceJpegFinishMJpeg(): Int

public actual fun sceJpegFinishMJpeg(): Int =
    wasiLibcPspSceJpegFinishMJpeg()

@kotlin.wasm.WasmImport("libc", "libcPspSceJpegCreateMJpeg")
private external fun wasiLibcPspSceJpegCreateMJpeg(width: Int, height: Int): Int

public actual fun sceJpegCreateMJpeg(width: Int, height: Int): Int =
    wasiLibcPspSceJpegCreateMJpeg(width, height)

@kotlin.wasm.WasmImport("libc", "libcPspSceJpegDeleteMJpeg")
private external fun wasiLibcPspSceJpegDeleteMJpeg(): Int

public actual fun sceJpegDeleteMJpeg(): Int =
    wasiLibcPspSceJpegDeleteMJpeg()

public actual fun sceJpegDecodeMJpeg(jpegBuf: MutPtr, size: ULong, rgba: MutPtr, unk: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceJpegDecodeMJpeg")

@kotlin.wasm.WasmImport("libc", "libcPspSceUmdCheckMedium")
private external fun wasiLibcPspSceUmdCheckMedium(): Int

public actual fun sceUmdCheckMedium(): Int =
    wasiLibcPspSceUmdCheckMedium()

public actual fun sceUmdGetDiscInfo(info: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceUmdGetDiscInfo")

public actual fun sceUmdActivate(unit: Int, drive: ConstPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceUmdActivate")

public actual fun sceUmdDeactivate(unit: Int, drive: ConstPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceUmdDeactivate")

@kotlin.wasm.WasmImport("libc", "libcPspSceUmdWaitDriveStat")
private external fun wasiLibcPspSceUmdWaitDriveStat(state: Int): Int

public actual fun sceUmdWaitDriveStat(state: Int): Int =
    wasiLibcPspSceUmdWaitDriveStat(state)

@kotlin.wasm.WasmImport("libc", "libcPspSceUmdWaitDriveStatWithTimer")
private external fun wasiLibcPspSceUmdWaitDriveStatWithTimer(state: Int, timeout: Int): Int

public actual fun sceUmdWaitDriveStatWithTimer(state: Int, timeout: UInt): Int =
    wasiLibcPspSceUmdWaitDriveStatWithTimer(state, timeout.toInt())

@kotlin.wasm.WasmImport("libc", "libcPspSceUmdWaitDriveStatCB")
private external fun wasiLibcPspSceUmdWaitDriveStatCB(state: Int, timeout: Int): Int

public actual fun sceUmdWaitDriveStatCB(state: Int, timeout: UInt): Int =
    wasiLibcPspSceUmdWaitDriveStatCB(state, timeout.toInt())

@kotlin.wasm.WasmImport("libc", "libcPspSceUmdCancelWaitDriveStat")
private external fun wasiLibcPspSceUmdCancelWaitDriveStat(): Int

public actual fun sceUmdCancelWaitDriveStat(): Int =
    wasiLibcPspSceUmdCancelWaitDriveStat()

@kotlin.wasm.WasmImport("libc", "libcPspSceUmdGetDriveStat")
private external fun wasiLibcPspSceUmdGetDriveStat(): Int

public actual fun sceUmdGetDriveStat(): Int =
    wasiLibcPspSceUmdGetDriveStat()

@kotlin.wasm.WasmImport("libc", "libcPspSceUmdGetErrorStat")
private external fun wasiLibcPspSceUmdGetErrorStat(): Int

public actual fun sceUmdGetErrorStat(): Int =
    wasiLibcPspSceUmdGetErrorStat()

@kotlin.wasm.WasmImport("libc", "libcPspSceUmdRegisterUMDCallBack")
private external fun wasiLibcPspSceUmdRegisterUMDCallBack(cbid: Int): Int

public actual fun sceUmdRegisterUMDCallBack(cbid: Int): Int =
    wasiLibcPspSceUmdRegisterUMDCallBack(cbid)

@kotlin.wasm.WasmImport("libc", "libcPspSceUmdUnRegisterUMDCallBack")
private external fun wasiLibcPspSceUmdUnRegisterUMDCallBack(cbid: Int): Int

public actual fun sceUmdUnRegisterUMDCallBack(cbid: Int): Int =
    wasiLibcPspSceUmdUnRegisterUMDCallBack(cbid)

@kotlin.wasm.WasmImport("libc", "libcPspSceUmdReplacePermit")
private external fun wasiLibcPspSceUmdReplacePermit(): Int

public actual fun sceUmdReplacePermit(): Int =
    wasiLibcPspSceUmdReplacePermit()

@kotlin.wasm.WasmImport("libc", "libcPspSceUmdReplaceProhibit")
private external fun wasiLibcPspSceUmdReplaceProhibit(): Int

public actual fun sceUmdReplaceProhibit(): Int =
    wasiLibcPspSceUmdReplaceProhibit()

@kotlin.wasm.WasmImport("libc", "libcPspSceMpegInit")
private external fun wasiLibcPspSceMpegInit(): Int

public actual fun sceMpegInit(): Int =
    wasiLibcPspSceMpegInit()

@kotlin.wasm.WasmImport("libc", "libcPspSceMpegFinish")
private external fun wasiLibcPspSceMpegFinish(): Unit

public actual fun sceMpegFinish(): Unit =
    wasiLibcPspSceMpegFinish()

@kotlin.wasm.WasmImport("libc", "libcPspSceMpegRingbufferQueryMemSize")
private external fun wasiLibcPspSceMpegRingbufferQueryMemSize(packets: Int): Int

public actual fun sceMpegRingbufferQueryMemSize(packets: Int): Int =
    wasiLibcPspSceMpegRingbufferQueryMemSize(packets)

public actual fun sceMpegRingbufferConstruct(ringbuffer: MutPtr, packets: Int, data: MutPtr, size: Int, callback: SceMpegRingbufferCb, cbParam: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceMpegRingbufferConstruct")

public actual fun sceMpegRingbufferDestruct(ringbuffer: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceMpegRingbufferDestruct")

public actual fun sceMpegRingbufferAvailableSize(ringbuffer: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceMpegRingbufferAvailableSize")

public actual fun sceMpegRingbufferPut(ringbuffer: MutPtr, numPackets: Int, available: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceMpegRingbufferPut")

@kotlin.wasm.WasmImport("libc", "libcPspSceMpegQueryMemSize")
private external fun wasiLibcPspSceMpegQueryMemSize(unk: Int): Int

public actual fun sceMpegQueryMemSize(unk: Int): Int =
    wasiLibcPspSceMpegQueryMemSize(unk)

public actual fun sceMpegCreate(handle: SceMpeg, data: MutPtr, size: Int, ringbuffer: MutPtr, frameWidth: Int, unk1: Int, unk2: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceMpegCreate")

public actual fun sceMpegDelete(handle: SceMpeg): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceMpegDelete")

public actual fun sceMpegQueryStreamOffset(handle: SceMpeg, buffer: MutPtr, offset: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceMpegQueryStreamOffset")

public actual fun sceMpegQueryStreamSize(buffer: MutPtr, size: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceMpegQueryStreamSize")

public actual fun sceMpegRegistStream(handle: SceMpeg, streamId: Int, unk: Int): SceMpegStream =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceMpegRegistStream")

public actual fun sceMpegUnRegistStream(handle: SceMpeg, stream: SceMpegStream): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceMpegUnRegistStream")

public actual fun sceMpegFlushAllStream(handle: SceMpeg): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceMpegFlushAllStream")

public actual fun sceMpegMallocAvcEsBuf(handle: SceMpeg): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceMpegMallocAvcEsBuf")

public actual fun sceMpegFreeAvcEsBuf(handle: SceMpeg, buf: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceMpegFreeAvcEsBuf")

public actual fun sceMpegQueryAtracEsSize(handle: SceMpeg, esSize: MutPtr, outSize: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceMpegQueryAtracEsSize")

public actual fun sceMpegInitAu(handle: SceMpeg, esBuffer: MutPtr, au: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceMpegInitAu")

public actual fun sceMpegGetAvcAu(handle: SceMpeg, stream: SceMpegStream, au: MutPtr, unk: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceMpegGetAvcAu")

public actual fun sceMpegAvcDecodeMode(handle: SceMpeg, mode: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceMpegAvcDecodeMode")

public actual fun sceMpegAvcDecode(handle: SceMpeg, au: MutPtr, iframeWidth: Int, buffer: MutPtr, init: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceMpegAvcDecode")

public actual fun sceMpegAvcDecodeStop(handle: SceMpeg, frameWidth: Int, buffer: MutPtr, status: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceMpegAvcDecodeStop")

public actual fun sceMpegGetAtracAu(handle: SceMpeg, stream: SceMpegStream, au: MutPtr, unk: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceMpegGetAtracAu")

public actual fun sceMpegAtracDecode(handle: SceMpeg, au: MutPtr, buffer: MutPtr, init: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceMpegAtracDecode")

public actual fun sceMpegBaseYCrCbCopyVme(yuvBuffer: MutPtr, buffer: MutPtr, type: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceMpegBaseYCrCbCopyVme")

@kotlin.wasm.WasmImport("libc", "libcPspSceMpegBaseCscInit")
private external fun wasiLibcPspSceMpegBaseCscInit(width: Int): Int

public actual fun sceMpegBaseCscInit(width: Int): Int =
    wasiLibcPspSceMpegBaseCscInit(width)

public actual fun sceMpegBaseCscVme(rgbBuffer: MutPtr, rgbBuffer2: MutPtr, width: Int, yCrCbBuffer: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceMpegBaseCscVme")

public actual fun sceMpegbaseBea18f91(lli: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceMpegbaseBea18f91")

public actual fun sceHprmPeekCurrentKey(key: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceHprmPeekCurrentKey")

public actual fun sceHprmPeekLatch(latch: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceHprmPeekLatch")

public actual fun sceHprmReadLatch(latch: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceHprmReadLatch")

@kotlin.wasm.WasmImport("libc", "libcPspSceHprmIsHeadphoneExist")
private external fun wasiLibcPspSceHprmIsHeadphoneExist(): Int

public actual fun sceHprmIsHeadphoneExist(): Int =
    wasiLibcPspSceHprmIsHeadphoneExist()

@kotlin.wasm.WasmImport("libc", "libcPspSceHprmIsRemoteExist")
private external fun wasiLibcPspSceHprmIsRemoteExist(): Int

public actual fun sceHprmIsRemoteExist(): Int =
    wasiLibcPspSceHprmIsRemoteExist()

@kotlin.wasm.WasmImport("libc", "libcPspSceHprmIsMicrophoneExist")
private external fun wasiLibcPspSceHprmIsMicrophoneExist(): Int

public actual fun sceHprmIsMicrophoneExist(): Int =
    wasiLibcPspSceHprmIsMicrophoneExist()

public actual fun sceGuDepthBuffer(zbp: MutPtr, zbw: Int): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceGuDepthBuffer")

public actual fun sceGuDispBuffer(width: Int, height: Int, dispbp: MutPtr, dispbw: Int): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceGuDispBuffer")

public actual fun sceGuDrawBuffer(psm: DisplayPixelFormat, fbp: MutPtr, fbw: Int): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceGuDrawBuffer")

public actual fun sceGuDrawBufferList(psm: DisplayPixelFormat, fbp: MutPtr, fbw: Int): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceGuDrawBufferList")

@kotlin.wasm.WasmImport("libc", "libcPspSceGuDisplay")
private external fun wasiLibcPspSceGuDisplay(state: Int): Int

public actual fun sceGuDisplay(state: Boolean): Boolean =
    (wasiLibcPspSceGuDisplay(if (state) 1 else 0) != 0)

public actual fun sceGuDepthFunc(function: DepthFunc): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceGuDepthFunc")

@kotlin.wasm.WasmImport("libc", "libcPspSceGuDepthMask")
private external fun wasiLibcPspSceGuDepthMask(mask: Int): Unit

public actual fun sceGuDepthMask(mask: Int): Unit =
    wasiLibcPspSceGuDepthMask(mask)

@kotlin.wasm.WasmImport("libc", "libcPspSceGuDepthOffset")
private external fun wasiLibcPspSceGuDepthOffset(offset: Int): Unit

public actual fun sceGuDepthOffset(offset: Int): Unit =
    wasiLibcPspSceGuDepthOffset(offset)

@kotlin.wasm.WasmImport("libc", "libcPspSceGuDepthRange")
private external fun wasiLibcPspSceGuDepthRange(near: Int, far: Int): Unit

public actual fun sceGuDepthRange(near: Int, far: Int): Unit =
    wasiLibcPspSceGuDepthRange(near, far)

@kotlin.wasm.WasmImport("libc", "libcPspSceGuFog")
private external fun wasiLibcPspSceGuFog(near: Float, far: Float, color: Int): Unit

public actual fun sceGuFog(near: Float, far: Float, color: UInt): Unit =
    wasiLibcPspSceGuFog(near, far, color.toInt())

@kotlin.wasm.WasmImport("libc", "libcPspSceGuInit")
private external fun wasiLibcPspSceGuInit(): Unit

public actual fun sceGuInit(): Unit =
    wasiLibcPspSceGuInit()

@kotlin.wasm.WasmImport("libc", "libcPspSceGuTerm")
private external fun wasiLibcPspSceGuTerm(): Unit

public actual fun sceGuTerm(): Unit =
    wasiLibcPspSceGuTerm()

@kotlin.wasm.WasmImport("libc", "libcPspSceGuBreak")
private external fun wasiLibcPspSceGuBreak(mode: Int): Unit

public actual fun sceGuBreak(mode: Int): Unit =
    wasiLibcPspSceGuBreak(mode)

@kotlin.wasm.WasmImport("libc", "libcPspSceGuContinue")
private external fun wasiLibcPspSceGuContinue(): Unit

public actual fun sceGuContinue(): Unit =
    wasiLibcPspSceGuContinue()

public actual fun sceGuSetCallback(signal: GuCallbackId, callback: GuCallback): GuCallback =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceGuSetCallback")

public actual fun sceGuSignal(behavior: SignalBehavior, signal: Int): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceGuSignal")

public actual fun sceGuSendCommandf(cmd: GeCommand, argument: Float): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceGuSendCommandf")

public actual fun sceGuSendCommandi(cmd: GeCommand, argument: Int): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceGuSendCommandi")

public actual fun sceGuGetMemory(size: Int): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceGuGetMemory")

public actual fun sceGuStart(contextType: GuContextType, list: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceGuStart")

@kotlin.wasm.WasmImport("libc", "libcPspSceGuFinish")
private external fun wasiLibcPspSceGuFinish(): Int

public actual fun sceGuFinish(): Int =
    wasiLibcPspSceGuFinish()

@kotlin.wasm.WasmImport("libc", "libcPspSceGuFinishId")
private external fun wasiLibcPspSceGuFinishId(id: Int): Int

public actual fun sceGuFinishId(id: UInt): Int =
    wasiLibcPspSceGuFinishId(id.toInt())

public actual fun sceGuCallList(list: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceGuCallList")

@kotlin.wasm.WasmImport("libc", "libcPspSceGuCallMode")
private external fun wasiLibcPspSceGuCallMode(mode: Int): Unit

public actual fun sceGuCallMode(mode: Int): Unit =
    wasiLibcPspSceGuCallMode(mode)

@kotlin.wasm.WasmImport("libc", "libcPspSceGuCheckList")
private external fun wasiLibcPspSceGuCheckList(): Int

public actual fun sceGuCheckList(): Int =
    wasiLibcPspSceGuCheckList()

public actual fun sceGuSendList(mode: GuQueueMode, list: ConstPtr, context: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceGuSendList")

public actual fun sceGuSwapBuffers(): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceGuSwapBuffers")

public actual fun sceGuSync(mode: GuSyncMode, behavior: GuSyncBehavior): GeListState =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceGuSync")

public actual fun sceGuDrawArray(prim: GuPrimitive, vtype: Int, count: Int, indices: ConstPtr, vertices: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceGuDrawArray")

public actual fun sceGuBeginObject(vtype: Int, count: Int, indices: ConstPtr, vertices: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceGuBeginObject")

@kotlin.wasm.WasmImport("libc", "libcPspSceGuEndObject")
private external fun wasiLibcPspSceGuEndObject(): Unit

public actual fun sceGuEndObject(): Unit =
    wasiLibcPspSceGuEndObject()

public actual fun sceGuSetStatus(state: GuState, status: Int): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceGuSetStatus")

public actual fun sceGuGetStatus(state: GuState): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceGuGetStatus")

@kotlin.wasm.WasmImport("libc", "libcPspSceGuSetAllStatus")
private external fun wasiLibcPspSceGuSetAllStatus(status: Int): Unit

public actual fun sceGuSetAllStatus(status: Int): Unit =
    wasiLibcPspSceGuSetAllStatus(status)

@kotlin.wasm.WasmImport("libc", "libcPspSceGuGetAllStatus")
private external fun wasiLibcPspSceGuGetAllStatus(): Int

public actual fun sceGuGetAllStatus(): Int =
    wasiLibcPspSceGuGetAllStatus()

public actual fun sceGuEnable(state: GuState): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceGuEnable")

public actual fun sceGuDisable(state: GuState): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceGuDisable")

public actual fun sceGuLight(light: Int, type: LightType, components: Int, position: ScePspFVector3): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceGuLight")

@kotlin.wasm.WasmImport("libc", "libcPspSceGuLightAtt")
private external fun wasiLibcPspSceGuLightAtt(light: Int, atten0: Float, atten1: Float, atten2: Float): Unit

public actual fun sceGuLightAtt(light: Int, atten0: Float, atten1: Float, atten2: Float): Unit =
    wasiLibcPspSceGuLightAtt(light, atten0, atten1, atten2)

@kotlin.wasm.WasmImport("libc", "libcPspSceGuLightColor")
private external fun wasiLibcPspSceGuLightColor(light: Int, component: Int, color: Int): Unit

public actual fun sceGuLightColor(light: Int, component: Int, color: UInt): Unit =
    wasiLibcPspSceGuLightColor(light, component, color.toInt())

public actual fun sceGuLightMode(mode: LightMode): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceGuLightMode")

public actual fun sceGuLightSpot(light: Int, direction: ScePspFVector3, exponent: Float, cutoff: Float): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceGuLightSpot")

@kotlin.wasm.WasmImport("libc", "libcPspSceGuClear")
private external fun wasiLibcPspSceGuClear(flags: Int): Unit

public actual fun sceGuClear(flags: Int): Unit =
    wasiLibcPspSceGuClear(flags)

@kotlin.wasm.WasmImport("libc", "libcPspSceGuClearColor")
private external fun wasiLibcPspSceGuClearColor(color: Int): Unit

public actual fun sceGuClearColor(color: UInt): Unit =
    wasiLibcPspSceGuClearColor(color.toInt())

@kotlin.wasm.WasmImport("libc", "libcPspSceGuClearDepth")
private external fun wasiLibcPspSceGuClearDepth(depth: Int): Unit

public actual fun sceGuClearDepth(depth: UInt): Unit =
    wasiLibcPspSceGuClearDepth(depth.toInt())

@kotlin.wasm.WasmImport("libc", "libcPspSceGuClearStencil")
private external fun wasiLibcPspSceGuClearStencil(stencil: Int): Unit

public actual fun sceGuClearStencil(stencil: UInt): Unit =
    wasiLibcPspSceGuClearStencil(stencil.toInt())

@kotlin.wasm.WasmImport("libc", "libcPspSceGuPixelMask")
private external fun wasiLibcPspSceGuPixelMask(mask: Int): Unit

public actual fun sceGuPixelMask(mask: UInt): Unit =
    wasiLibcPspSceGuPixelMask(mask.toInt())

@kotlin.wasm.WasmImport("libc", "libcPspSceGuColor")
private external fun wasiLibcPspSceGuColor(color: Int): Unit

public actual fun sceGuColor(color: UInt): Unit =
    wasiLibcPspSceGuColor(color.toInt())

public actual fun sceGuColorFunc(func: ColorFunc, color: UInt, mask: UInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceGuColorFunc")

@kotlin.wasm.WasmImport("libc", "libcPspSceGuColorMaterial")
private external fun wasiLibcPspSceGuColorMaterial(components: Int): Unit

public actual fun sceGuColorMaterial(components: Int): Unit =
    wasiLibcPspSceGuColorMaterial(components)

public actual fun sceGuAlphaFunc(func: AlphaFunc, value: Int, mask: Int): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceGuAlphaFunc")

@kotlin.wasm.WasmImport("libc", "libcPspSceGuAmbient")
private external fun wasiLibcPspSceGuAmbient(color: Int): Unit

public actual fun sceGuAmbient(color: UInt): Unit =
    wasiLibcPspSceGuAmbient(color.toInt())

@kotlin.wasm.WasmImport("libc", "libcPspSceGuAmbientColor")
private external fun wasiLibcPspSceGuAmbientColor(color: Int): Unit

public actual fun sceGuAmbientColor(color: UInt): Unit =
    wasiLibcPspSceGuAmbientColor(color.toInt())

public actual fun sceGuBlendFunc(op: BlendOp, src: BlendSrc, dest: BlendDst, srcFix: UInt, destFix: UInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceGuBlendFunc")

@kotlin.wasm.WasmImport("libc", "libcPspSceGuMaterial")
private external fun wasiLibcPspSceGuMaterial(components: Int, color: Int): Unit

public actual fun sceGuMaterial(components: Int, color: UInt): Unit =
    wasiLibcPspSceGuMaterial(components, color.toInt())

@kotlin.wasm.WasmImport("libc", "libcPspSceGuModelColor")
private external fun wasiLibcPspSceGuModelColor(emissive: Int, ambient: Int, diffuse: Int, specular: Int): Unit

public actual fun sceGuModelColor(emissive: UInt, ambient: UInt, diffuse: UInt, specular: UInt): Unit =
    wasiLibcPspSceGuModelColor(emissive.toInt(), ambient.toInt(), diffuse.toInt(), specular.toInt())

public actual fun sceGuStencilFunc(func: StencilFunc, ref: Int, mask: Int): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceGuStencilFunc")

public actual fun sceGuStencilOp(fail: StencilOperation, zfail: StencilOperation, zpass: StencilOperation): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceGuStencilOp")

@kotlin.wasm.WasmImport("libc", "libcPspSceGuSpecular")
private external fun wasiLibcPspSceGuSpecular(power: Float): Unit

public actual fun sceGuSpecular(power: Float): Unit =
    wasiLibcPspSceGuSpecular(power)

public actual fun sceGuFrontFace(order: FrontFaceDirection): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceGuFrontFace")

public actual fun sceGuLogicalOp(op: LogicalOperation): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceGuLogicalOp")

public actual fun sceGuSetDither(matrix: ScePspIMatrix4): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceGuSetDither")

public actual fun sceGuShadeModel(mode: ShadingModel): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceGuShadeModel")

public actual fun sceGuCopyImage(psm: DisplayPixelFormat, sx: Int, sy: Int, width: Int, height: Int, srcw: Int, src: MutPtr, dx: Int, dy: Int, destw: Int, dest: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceGuCopyImage")

@kotlin.wasm.WasmImport("libc", "libcPspSceGuTexEnvColor")
private external fun wasiLibcPspSceGuTexEnvColor(color: Int): Unit

public actual fun sceGuTexEnvColor(color: UInt): Unit =
    wasiLibcPspSceGuTexEnvColor(color.toInt())

public actual fun sceGuTexFilter(min: TextureFilter, mag: TextureFilter): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceGuTexFilter")

@kotlin.wasm.WasmImport("libc", "libcPspSceGuTexFlush")
private external fun wasiLibcPspSceGuTexFlush(): Unit

public actual fun sceGuTexFlush(): Unit =
    wasiLibcPspSceGuTexFlush()

public actual fun sceGuTexFunc(tfx: TextureEffect, tcc: TextureColorComponent): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceGuTexFunc")

public actual fun sceGuTexImage(mipmap: MipmapLevel, width: Int, height: Int, tbw: Int, tbp: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceGuTexImage")

public actual fun sceGuTexLevelMode(mode: TextureLevelMode, bias: Float): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceGuTexLevelMode")

public actual fun sceGuTexMapMode(mode: TextureMapMode, a1: UInt, a2: UInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceGuTexMapMode")

public actual fun sceGuTexMode(tpsm: TexturePixelFormat, maxmips: Int, a2: Int, swizzle: Int): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceGuTexMode")

@kotlin.wasm.WasmImport("libc", "libcPspSceGuTexOffset")
private external fun wasiLibcPspSceGuTexOffset(u: Float, v: Float): Unit

public actual fun sceGuTexOffset(u: Float, v: Float): Unit =
    wasiLibcPspSceGuTexOffset(u, v)

public actual fun sceGuTexProjMapMode(mode: TextureProjectionMapMode): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceGuTexProjMapMode")

@kotlin.wasm.WasmImport("libc", "libcPspSceGuTexScale")
private external fun wasiLibcPspSceGuTexScale(u: Float, v: Float): Unit

public actual fun sceGuTexScale(u: Float, v: Float): Unit =
    wasiLibcPspSceGuTexScale(u, v)

@kotlin.wasm.WasmImport("libc", "libcPspSceGuTexSlope")
private external fun wasiLibcPspSceGuTexSlope(slope: Float): Unit

public actual fun sceGuTexSlope(slope: Float): Unit =
    wasiLibcPspSceGuTexSlope(slope)

@kotlin.wasm.WasmImport("libc", "libcPspSceGuTexSync")
private external fun wasiLibcPspSceGuTexSync(): Unit

public actual fun sceGuTexSync(): Unit =
    wasiLibcPspSceGuTexSync()

public actual fun sceGuTexWrap(u: GuTexWrapMode, v: GuTexWrapMode): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceGuTexWrap")

public actual fun sceGuClutLoad(numBlocks: Int, cbp: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceGuClutLoad")

public actual fun sceGuClutMode(cpsm: ClutPixelFormat, shift: UInt, mask: UInt, a3: UInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceGuClutMode")

@kotlin.wasm.WasmImport("libc", "libcPspSceGuOffset")
private external fun wasiLibcPspSceGuOffset(x: Int, y: Int): Unit

public actual fun sceGuOffset(x: UInt, y: UInt): Unit =
    wasiLibcPspSceGuOffset(x.toInt(), y.toInt())

@kotlin.wasm.WasmImport("libc", "libcPspSceGuScissor")
private external fun wasiLibcPspSceGuScissor(x: Int, y: Int, w: Int, h: Int): Unit

public actual fun sceGuScissor(x: Int, y: Int, w: Int, h: Int): Unit =
    wasiLibcPspSceGuScissor(x, y, w, h)

@kotlin.wasm.WasmImport("libc", "libcPspSceGuViewport")
private external fun wasiLibcPspSceGuViewport(cx: Int, cy: Int, width: Int, height: Int): Unit

public actual fun sceGuViewport(cx: Int, cy: Int, width: Int, height: Int): Unit =
    wasiLibcPspSceGuViewport(cx, cy, width, height)

public actual fun sceGuDrawBezier(vType: Int, uCount: Int, vCount: Int, indices: ConstPtr, vertices: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceGuDrawBezier")

@kotlin.wasm.WasmImport("libc", "libcPspSceGuPatchDivide")
private external fun wasiLibcPspSceGuPatchDivide(ulevel: Int, vlevel: Int): Unit

public actual fun sceGuPatchDivide(ulevel: UInt, vlevel: UInt): Unit =
    wasiLibcPspSceGuPatchDivide(ulevel.toInt(), vlevel.toInt())

@kotlin.wasm.WasmImport("libc", "libcPspSceGuPatchFrontFace")
private external fun wasiLibcPspSceGuPatchFrontFace(a0: Int): Unit

public actual fun sceGuPatchFrontFace(a0: UInt): Unit =
    wasiLibcPspSceGuPatchFrontFace(a0.toInt())

public actual fun sceGuPatchPrim(prim: PatchPrimitive): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceGuPatchPrim")

public actual fun sceGuDrawSpline(vType: Int, uCount: Int, vCount: Int, uEdge: Int, vEdge: Int, indices: ConstPtr, vertices: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceGuDrawSpline")

public actual fun sceGuSetMatrix(type: MatrixMode, matrix: ScePspFMatrix4): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceGuSetMatrix")

public actual fun sceGuBoneMatrix(index: UInt, matrix: ScePspFMatrix4): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceGuBoneMatrix")

@kotlin.wasm.WasmImport("libc", "libcPspSceGuMorphWeight")
private external fun wasiLibcPspSceGuMorphWeight(index: Int, weight: Float): Unit

public actual fun sceGuMorphWeight(index: Int, weight: Float): Unit =
    wasiLibcPspSceGuMorphWeight(index, weight)

public actual fun sceGuDrawArrayN(primitiveType: GuPrimitive, vType: Int, count: Int, a3: Int, indices: ConstPtr, vertices: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceGuDrawArrayN")

public actual fun sceGumDrawArray(prim: GuPrimitive, vType: Int, count: Int, indices: ConstPtr, vertices: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceGumDrawArray")

public actual fun sceGumDrawArrayN(prim: GuPrimitive, vType: Int, count: Int, a3: Int, indices: ConstPtr, vertices: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceGumDrawArrayN")

public actual fun sceGumDrawBezier(vType: Int, uCount: Int, vCount: Int, indices: ConstPtr, vertices: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceGumDrawBezier")

public actual fun sceGumDrawSpline(vType: Int, uCount: Int, vCount: Int, uEdge: Int, vEdge: Int, indices: ConstPtr, vertices: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceGumDrawSpline")

@kotlin.wasm.WasmImport("libc", "libcPspSceGumFastInverse")
private external fun wasiLibcPspSceGumFastInverse(): Unit

public actual fun sceGumFastInverse(): Unit =
    wasiLibcPspSceGumFastInverse()

@kotlin.wasm.WasmImport("libc", "libcPspSceGumFullInverse")
private external fun wasiLibcPspSceGumFullInverse(): Unit

public actual fun sceGumFullInverse(): Unit =
    wasiLibcPspSceGumFullInverse()

@kotlin.wasm.WasmImport("libc", "libcPspSceGumLoadIdentity")
private external fun wasiLibcPspSceGumLoadIdentity(): Unit

public actual fun sceGumLoadIdentity(): Unit =
    wasiLibcPspSceGumLoadIdentity()

public actual fun sceGumLoadMatrix(m: ScePspFMatrix4): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceGumLoadMatrix")

public actual fun sceGumLookAt(eye: ScePspFVector3, center: ScePspFVector3, up: ScePspFVector3): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceGumLookAt")

public actual fun sceGumMatrixMode(mode: MatrixMode): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceGumMatrixMode")

public actual fun sceGumMultMatrix(m: ScePspFMatrix4): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceGumMultMatrix")

@kotlin.wasm.WasmImport("libc", "libcPspSceGumOrtho")
private external fun wasiLibcPspSceGumOrtho(left: Float, right: Float, bottom: Float, top: Float, near: Float, far: Float): Unit

public actual fun sceGumOrtho(left: Float, right: Float, bottom: Float, top: Float, near: Float, far: Float): Unit =
    wasiLibcPspSceGumOrtho(left, right, bottom, top, near, far)

@kotlin.wasm.WasmImport("libc", "libcPspSceGumPerspective")
private external fun wasiLibcPspSceGumPerspective(fovy: Float, aspect: Float, near: Float, far: Float): Unit

public actual fun sceGumPerspective(fovy: Float, aspect: Float, near: Float, far: Float): Unit =
    wasiLibcPspSceGumPerspective(fovy, aspect, near, far)

@kotlin.wasm.WasmImport("libc", "libcPspSceGumPopMatrix")
private external fun wasiLibcPspSceGumPopMatrix(): Unit

public actual fun sceGumPopMatrix(): Unit =
    wasiLibcPspSceGumPopMatrix()

@kotlin.wasm.WasmImport("libc", "libcPspSceGumPushMatrix")
private external fun wasiLibcPspSceGumPushMatrix(): Unit

public actual fun sceGumPushMatrix(): Unit =
    wasiLibcPspSceGumPushMatrix()

@kotlin.wasm.WasmImport("libc", "libcPspSceGumRotateX")
private external fun wasiLibcPspSceGumRotateX(angle: Float): Unit

public actual fun sceGumRotateX(angle: Float): Unit =
    wasiLibcPspSceGumRotateX(angle)

@kotlin.wasm.WasmImport("libc", "libcPspSceGumRotateY")
private external fun wasiLibcPspSceGumRotateY(angle: Float): Unit

public actual fun sceGumRotateY(angle: Float): Unit =
    wasiLibcPspSceGumRotateY(angle)

@kotlin.wasm.WasmImport("libc", "libcPspSceGumRotateZ")
private external fun wasiLibcPspSceGumRotateZ(angle: Float): Unit

public actual fun sceGumRotateZ(angle: Float): Unit =
    wasiLibcPspSceGumRotateZ(angle)

public actual fun sceGumRotateXYZ(v: ScePspFVector3): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceGumRotateXYZ")

public actual fun sceGumRotateZYX(v: ScePspFVector3): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceGumRotateZYX")

public actual fun sceGumScale(v: ScePspFVector3): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceGumScale")

public actual fun sceGumStoreMatrix(m: ScePspFMatrix4): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceGumStoreMatrix")

public actual fun sceGumTranslate(v: ScePspFVector3): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceGumTranslate")

@kotlin.wasm.WasmImport("libc", "libcPspSceGumUpdateMatrix")
private external fun wasiLibcPspSceGumUpdateMatrix(): Unit

public actual fun sceGumUpdateMatrix(): Unit =
    wasiLibcPspSceGumUpdateMatrix()

public actual fun sceMp3ReserveMp3Handle(args: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceMp3ReserveMp3Handle")

public actual fun sceMp3ReleaseMp3Handle(handle: Mp3Handle): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceMp3ReleaseMp3Handle")

@kotlin.wasm.WasmImport("libc", "libcPspSceMp3InitResource")
private external fun wasiLibcPspSceMp3InitResource(): Int

public actual fun sceMp3InitResource(): Int =
    wasiLibcPspSceMp3InitResource()

@kotlin.wasm.WasmImport("libc", "libcPspSceMp3TermResource")
private external fun wasiLibcPspSceMp3TermResource(): Int

public actual fun sceMp3TermResource(): Int =
    wasiLibcPspSceMp3TermResource()

public actual fun sceMp3Init(handle: Mp3Handle): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceMp3Init")

public actual fun sceMp3Decode(handle: Mp3Handle, dst: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceMp3Decode")

public actual fun sceMp3GetInfoToAddStreamData(handle: Mp3Handle, dst: MutPtr, toWrite: MutPtr, srcPos: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceMp3GetInfoToAddStreamData")

public actual fun sceMp3NotifyAddStreamData(handle: Mp3Handle, size: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceMp3NotifyAddStreamData")

public actual fun sceMp3CheckStreamDataNeeded(handle: Mp3Handle): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceMp3CheckStreamDataNeeded")

public actual fun sceMp3SetLoopNum(handle: Mp3Handle, loop: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceMp3SetLoopNum")

public actual fun sceMp3GetLoopNum(handle: Mp3Handle): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceMp3GetLoopNum")

public actual fun sceMp3GetSumDecodedSample(handle: Mp3Handle): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceMp3GetSumDecodedSample")

public actual fun sceMp3GetMaxOutputSample(handle: Mp3Handle): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceMp3GetMaxOutputSample")

public actual fun sceMp3GetSamplingRate(handle: Mp3Handle): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceMp3GetSamplingRate")

public actual fun sceMp3GetBitRate(handle: Mp3Handle): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceMp3GetBitRate")

public actual fun sceMp3GetMp3ChannelNum(handle: Mp3Handle): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceMp3GetMp3ChannelNum")

public actual fun sceMp3ResetPlayPosition(handle: Mp3Handle): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceMp3ResetPlayPosition")

public actual fun sceRegOpenRegistry(reg: MutPtr, mode: Int, handle: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceRegOpenRegistry")

public actual fun sceRegFlushRegistry(handle: RegHandle): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceRegFlushRegistry")

public actual fun sceRegCloseRegistry(handle: RegHandle): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceRegCloseRegistry")

public actual fun sceRegOpenCategory(handle: RegHandle, name: ConstPtr, mode: Int, dirHandle: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceRegOpenCategory")

public actual fun sceRegRemoveCategory(handle: RegHandle, name: ConstPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceRegRemoveCategory")

public actual fun sceRegCloseCategory(dirHandle: RegHandle): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceRegCloseCategory")

public actual fun sceRegFlushCategory(dirHandle: RegHandle): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceRegFlushCategory")

public actual fun sceRegGetKeyInfo(dirHandle: RegHandle, name: ConstPtr, keyHandle: MutPtr, type: MutPtr, size: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceRegGetKeyInfo")

public actual fun sceRegGetKeyInfoByName(dirHandle: RegHandle, name: ConstPtr, type: MutPtr, size: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceRegGetKeyInfoByName")

public actual fun sceRegGetKeyValue(dirHandle: RegHandle, keyHandle: RegHandle, buf: MutPtr, size: ULong): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceRegGetKeyValue")

public actual fun sceRegGetKeyValueByName(dirHandle: RegHandle, name: ConstPtr, buf: MutPtr, size: ULong): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceRegGetKeyValueByName")

public actual fun sceRegSetKeyValue(dirHandle: RegHandle, name: ConstPtr, buf: ConstPtr, size: ULong): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceRegSetKeyValue")

public actual fun sceRegGetKeysNum(dirHandle: RegHandle, num: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceRegGetKeysNum")

public actual fun sceRegGetKeys(dirHandle: RegHandle, buf: MutPtr, num: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceRegGetKeys")

public actual fun sceRegCreateKey(dirHandle: RegHandle, name: ConstPtr, type: Int, size: ULong): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceRegCreateKey")

public actual fun sceRegRemoveRegistry(key: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceRegRemoveRegistry")

public actual fun sceOpenPSIDGetOpenPSID(openpsid: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceOpenPSIDGetOpenPSID")

public actual fun sceUtilityMsgDialogInitStart(params: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceUtilityMsgDialogInitStart")

@kotlin.wasm.WasmImport("libc", "libcPspSceUtilityMsgDialogShutdownStart")
private external fun wasiLibcPspSceUtilityMsgDialogShutdownStart(): Unit

public actual fun sceUtilityMsgDialogShutdownStart(): Unit =
    wasiLibcPspSceUtilityMsgDialogShutdownStart()

@kotlin.wasm.WasmImport("libc", "libcPspSceUtilityMsgDialogGetStatus")
private external fun wasiLibcPspSceUtilityMsgDialogGetStatus(): Int

public actual fun sceUtilityMsgDialogGetStatus(): Int =
    wasiLibcPspSceUtilityMsgDialogGetStatus()

@kotlin.wasm.WasmImport("libc", "libcPspSceUtilityMsgDialogUpdate")
private external fun wasiLibcPspSceUtilityMsgDialogUpdate(n: Int): Unit

public actual fun sceUtilityMsgDialogUpdate(n: Int): Unit =
    wasiLibcPspSceUtilityMsgDialogUpdate(n)

@kotlin.wasm.WasmImport("libc", "libcPspSceUtilityMsgDialogAbort")
private external fun wasiLibcPspSceUtilityMsgDialogAbort(): Int

public actual fun sceUtilityMsgDialogAbort(): Int =
    wasiLibcPspSceUtilityMsgDialogAbort()

public actual fun sceUtilityNetconfInitStart(data: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceUtilityNetconfInitStart")

@kotlin.wasm.WasmImport("libc", "libcPspSceUtilityNetconfShutdownStart")
private external fun wasiLibcPspSceUtilityNetconfShutdownStart(): Int

public actual fun sceUtilityNetconfShutdownStart(): Int =
    wasiLibcPspSceUtilityNetconfShutdownStart()

@kotlin.wasm.WasmImport("libc", "libcPspSceUtilityNetconfUpdate")
private external fun wasiLibcPspSceUtilityNetconfUpdate(unknown: Int): Int

public actual fun sceUtilityNetconfUpdate(unknown: Int): Int =
    wasiLibcPspSceUtilityNetconfUpdate(unknown)

@kotlin.wasm.WasmImport("libc", "libcPspSceUtilityNetconfGetStatus")
private external fun wasiLibcPspSceUtilityNetconfGetStatus(): Int

public actual fun sceUtilityNetconfGetStatus(): Int =
    wasiLibcPspSceUtilityNetconfGetStatus()

@kotlin.wasm.WasmImport("libc", "libcPspSceUtilityCheckNetParam")
private external fun wasiLibcPspSceUtilityCheckNetParam(id: Int): Int

public actual fun sceUtilityCheckNetParam(id: Int): Int =
    wasiLibcPspSceUtilityCheckNetParam(id)

public actual fun sceUtilityGetNetParam(conf: Int, param: NetParam, data: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceUtilityGetNetParam")

public actual fun sceUtilitySavedataInitStart(params: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceUtilitySavedataInitStart")

@kotlin.wasm.WasmImport("libc", "libcPspSceUtilitySavedataGetStatus")
private external fun wasiLibcPspSceUtilitySavedataGetStatus(): Int

public actual fun sceUtilitySavedataGetStatus(): Int =
    wasiLibcPspSceUtilitySavedataGetStatus()

@kotlin.wasm.WasmImport("libc", "libcPspSceUtilitySavedataShutdownStart")
private external fun wasiLibcPspSceUtilitySavedataShutdownStart(): Int

public actual fun sceUtilitySavedataShutdownStart(): Int =
    wasiLibcPspSceUtilitySavedataShutdownStart()

@kotlin.wasm.WasmImport("libc", "libcPspSceUtilitySavedataUpdate")
private external fun wasiLibcPspSceUtilitySavedataUpdate(unknown: Int): Unit

public actual fun sceUtilitySavedataUpdate(unknown: Int): Unit =
    wasiLibcPspSceUtilitySavedataUpdate(unknown)

public actual fun sceUtilityGameSharingInitStart(params: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceUtilityGameSharingInitStart")

@kotlin.wasm.WasmImport("libc", "libcPspSceUtilityGameSharingShutdownStart")
private external fun wasiLibcPspSceUtilityGameSharingShutdownStart(): Unit

public actual fun sceUtilityGameSharingShutdownStart(): Unit =
    wasiLibcPspSceUtilityGameSharingShutdownStart()

@kotlin.wasm.WasmImport("libc", "libcPspSceUtilityGameSharingGetStatus")
private external fun wasiLibcPspSceUtilityGameSharingGetStatus(): Int

public actual fun sceUtilityGameSharingGetStatus(): Int =
    wasiLibcPspSceUtilityGameSharingGetStatus()

@kotlin.wasm.WasmImport("libc", "libcPspSceUtilityGameSharingUpdate")
private external fun wasiLibcPspSceUtilityGameSharingUpdate(n: Int): Unit

public actual fun sceUtilityGameSharingUpdate(n: Int): Unit =
    wasiLibcPspSceUtilityGameSharingUpdate(n)

public actual fun sceUtilityHtmlViewerInitStart(params: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceUtilityHtmlViewerInitStart")

@kotlin.wasm.WasmImport("libc", "libcPspSceUtilityHtmlViewerShutdownStart")
private external fun wasiLibcPspSceUtilityHtmlViewerShutdownStart(): Int

public actual fun sceUtilityHtmlViewerShutdownStart(): Int =
    wasiLibcPspSceUtilityHtmlViewerShutdownStart()

@kotlin.wasm.WasmImport("libc", "libcPspSceUtilityHtmlViewerUpdate")
private external fun wasiLibcPspSceUtilityHtmlViewerUpdate(n: Int): Int

public actual fun sceUtilityHtmlViewerUpdate(n: Int): Int =
    wasiLibcPspSceUtilityHtmlViewerUpdate(n)

@kotlin.wasm.WasmImport("libc", "libcPspSceUtilityHtmlViewerGetStatus")
private external fun wasiLibcPspSceUtilityHtmlViewerGetStatus(): Int

public actual fun sceUtilityHtmlViewerGetStatus(): Int =
    wasiLibcPspSceUtilityHtmlViewerGetStatus()

public actual fun sceUtilitySetSystemParamInt(id: SystemParamId, value: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceUtilitySetSystemParamInt")

public actual fun sceUtilitySetSystemParamString(id: SystemParamId, str: ConstPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceUtilitySetSystemParamString")

public actual fun sceUtilityGetSystemParamInt(id: SystemParamId, value: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceUtilityGetSystemParamInt")

public actual fun sceUtilityGetSystemParamString(id: SystemParamId, str: MutPtr, len: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceUtilityGetSystemParamString")

public actual fun sceUtilityOskInitStart(params: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceUtilityOskInitStart")

@kotlin.wasm.WasmImport("libc", "libcPspSceUtilityOskShutdownStart")
private external fun wasiLibcPspSceUtilityOskShutdownStart(): Int

public actual fun sceUtilityOskShutdownStart(): Int =
    wasiLibcPspSceUtilityOskShutdownStart()

@kotlin.wasm.WasmImport("libc", "libcPspSceUtilityOskUpdate")
private external fun wasiLibcPspSceUtilityOskUpdate(n: Int): Int

public actual fun sceUtilityOskUpdate(n: Int): Int =
    wasiLibcPspSceUtilityOskUpdate(n)

@kotlin.wasm.WasmImport("libc", "libcPspSceUtilityOskGetStatus")
private external fun wasiLibcPspSceUtilityOskGetStatus(): Int

public actual fun sceUtilityOskGetStatus(): Int =
    wasiLibcPspSceUtilityOskGetStatus()

public actual fun sceUtilityLoadNetModule(module: NetModule): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceUtilityLoadNetModule")

public actual fun sceUtilityUnloadNetModule(module: NetModule): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceUtilityUnloadNetModule")

public actual fun sceUtilityLoadAvModule(module: AvModule): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceUtilityLoadAvModule")

public actual fun sceUtilityUnloadAvModule(module: AvModule): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceUtilityUnloadAvModule")

public actual fun sceUtilityLoadUsbModule(module: UsbModule): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceUtilityLoadUsbModule")

public actual fun sceUtilityUnloadUsbModule(module: UsbModule): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceUtilityUnloadUsbModule")

public actual fun sceUtilityLoadModule(module: Module): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceUtilityLoadModule")

public actual fun sceUtilityUnloadModule(module: Module): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceUtilityUnloadModule")

@kotlin.wasm.WasmImport("libc", "libcPspSceUtilityCreateNetParam")
private external fun wasiLibcPspSceUtilityCreateNetParam(conf: Int): Int

public actual fun sceUtilityCreateNetParam(conf: Int): Int =
    wasiLibcPspSceUtilityCreateNetParam(conf)

public actual fun sceUtilitySetNetParam(param: NetParam, value: ConstPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceUtilitySetNetParam")

@kotlin.wasm.WasmImport("libc", "libcPspSceUtilityCopyNetParam")
private external fun wasiLibcPspSceUtilityCopyNetParam(src: Int, dest: Int): Int

public actual fun sceUtilityCopyNetParam(src: Int, dest: Int): Int =
    wasiLibcPspSceUtilityCopyNetParam(src, dest)

@kotlin.wasm.WasmImport("libc", "libcPspSceUtilityDeleteNetParam")
private external fun wasiLibcPspSceUtilityDeleteNetParam(conf: Int): Int

public actual fun sceUtilityDeleteNetParam(conf: Int): Int =
    wasiLibcPspSceUtilityDeleteNetParam(conf)

@kotlin.wasm.WasmImport("libc", "libcPspSceNetInit")
private external fun wasiLibcPspSceNetInit(poolsize: Int, calloutprio: Int, calloutstack: Int, netintrprio: Int, netintrstack: Int): Int

public actual fun sceNetInit(poolsize: Int, calloutprio: Int, calloutstack: Int, netintrprio: Int, netintrstack: Int): Int =
    wasiLibcPspSceNetInit(poolsize, calloutprio, calloutstack, netintrprio, netintrstack)

@kotlin.wasm.WasmImport("libc", "libcPspSceNetTerm")
private external fun wasiLibcPspSceNetTerm(): Int

public actual fun sceNetTerm(): Int =
    wasiLibcPspSceNetTerm()

@kotlin.wasm.WasmImport("libc", "libcPspSceNetFreeThreadinfo")
private external fun wasiLibcPspSceNetFreeThreadinfo(thid: Int): Int

public actual fun sceNetFreeThreadinfo(thid: Int): Int =
    wasiLibcPspSceNetFreeThreadinfo(thid)

@kotlin.wasm.WasmImport("libc", "libcPspSceNetThreadAbort")
private external fun wasiLibcPspSceNetThreadAbort(thid: Int): Int

public actual fun sceNetThreadAbort(thid: Int): Int =
    wasiLibcPspSceNetThreadAbort(thid)

public actual fun sceNetEtherStrton(name: MutPtr, mac: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceNetEtherStrton")

public actual fun sceNetEtherNtostr(mac: MutPtr, name: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceNetEtherNtostr")

public actual fun sceNetGetLocalEtherAddr(mac: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceNetGetLocalEtherAddr")

public actual fun sceNetGetMallocStat(stat: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceNetGetMallocStat")

public actual fun sceNetAdhocctlInit(stacksize: Int, priority: Int, adhocId: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceNetAdhocctlInit")

@kotlin.wasm.WasmImport("libc", "libcPspSceNetAdhocctlTerm")
private external fun wasiLibcPspSceNetAdhocctlTerm(): Int

public actual fun sceNetAdhocctlTerm(): Int =
    wasiLibcPspSceNetAdhocctlTerm()

public actual fun sceNetAdhocctlConnect(name: ConstPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceNetAdhocctlConnect")

@kotlin.wasm.WasmImport("libc", "libcPspSceNetAdhocctlDisconnect")
private external fun wasiLibcPspSceNetAdhocctlDisconnect(): Int

public actual fun sceNetAdhocctlDisconnect(): Int =
    wasiLibcPspSceNetAdhocctlDisconnect()

public actual fun sceNetAdhocctlGetState(event: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceNetAdhocctlGetState")

public actual fun sceNetAdhocctlCreate(name: ConstPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceNetAdhocctlCreate")

public actual fun sceNetAdhocctlJoin(scaninfo: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceNetAdhocctlJoin")

public actual fun sceNetAdhocctlGetAdhocId(id: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceNetAdhocctlGetAdhocId")

public actual fun sceNetAdhocctlCreateEnterGameMode(name: ConstPtr, unknown: Int, num: Int, macs: MutPtr, timeout: UInt, unknown2: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceNetAdhocctlCreateEnterGameMode")

public actual fun sceNetAdhocctlJoinEnterGameMode(name: ConstPtr, hostmac: MutPtr, timeout: UInt, unknown: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceNetAdhocctlJoinEnterGameMode")

public actual fun sceNetAdhocctlGetGameModeInfo(gamemodeinfo: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceNetAdhocctlGetGameModeInfo")

@kotlin.wasm.WasmImport("libc", "libcPspSceNetAdhocctlExitGameMode")
private external fun wasiLibcPspSceNetAdhocctlExitGameMode(): Int

public actual fun sceNetAdhocctlExitGameMode(): Int =
    wasiLibcPspSceNetAdhocctlExitGameMode()

public actual fun sceNetAdhocctlGetPeerList(length: MutPtr, buf: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceNetAdhocctlGetPeerList")

public actual fun sceNetAdhocctlGetPeerInfo(mac: MutPtr, size: Int, peerinfo: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceNetAdhocctlGetPeerInfo")

@kotlin.wasm.WasmImport("libc", "libcPspSceNetAdhocctlScan")
private external fun wasiLibcPspSceNetAdhocctlScan(): Int

public actual fun sceNetAdhocctlScan(): Int =
    wasiLibcPspSceNetAdhocctlScan()

public actual fun sceNetAdhocctlGetScanInfo(length: MutPtr, buf: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceNetAdhocctlGetScanInfo")

public actual fun sceNetAdhocctlAddHandler(handler: SceNetAdhocctlHandler, unknown: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceNetAdhocctlAddHandler")

@kotlin.wasm.WasmImport("libc", "libcPspSceNetAdhocctlDelHandler")
private external fun wasiLibcPspSceNetAdhocctlDelHandler(id: Int): Int

public actual fun sceNetAdhocctlDelHandler(id: Int): Int =
    wasiLibcPspSceNetAdhocctlDelHandler(id)

public actual fun sceNetAdhocctlGetNameByAddr(mac: MutPtr, nickname: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceNetAdhocctlGetNameByAddr")

public actual fun sceNetAdhocctlGetAddrByName(nickname: MutPtr, length: MutPtr, buf: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceNetAdhocctlGetAddrByName")

public actual fun sceNetAdhocctlGetParameter(params: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceNetAdhocctlGetParameter")

@kotlin.wasm.WasmImport("libc", "libcPspSceNetAdhocInit")
private external fun wasiLibcPspSceNetAdhocInit(): Int

public actual fun sceNetAdhocInit(): Int =
    wasiLibcPspSceNetAdhocInit()

@kotlin.wasm.WasmImport("libc", "libcPspSceNetAdhocTerm")
private external fun wasiLibcPspSceNetAdhocTerm(): Int

public actual fun sceNetAdhocTerm(): Int =
    wasiLibcPspSceNetAdhocTerm()

public actual fun sceNetAdhocPdpCreate(mac: MutPtr, port: UShort, bufSize: UInt, unk1: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceNetAdhocPdpCreate")

@kotlin.wasm.WasmImport("libc", "libcPspSceNetAdhocPdpDelete")
private external fun wasiLibcPspSceNetAdhocPdpDelete(id: Int, unk1: Int): Int

public actual fun sceNetAdhocPdpDelete(id: Int, unk1: Int): Int =
    wasiLibcPspSceNetAdhocPdpDelete(id, unk1)

public actual fun sceNetAdhocPdpSend(id: Int, destMacAddr: MutPtr, port: UShort, data: MutPtr, len: UInt, timeout: UInt, nonblock: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceNetAdhocPdpSend")

public actual fun sceNetAdhocPdpRecv(id: Int, srcMacAddr: MutPtr, port: MutPtr, data: MutPtr, dataLength: MutPtr, timeout: UInt, nonblock: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceNetAdhocPdpRecv")

public actual fun sceNetAdhocGetPdpStat(size: MutPtr, stat: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceNetAdhocGetPdpStat")

public actual fun sceNetAdhocGameModeCreateMaster(data: MutPtr, size: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceNetAdhocGameModeCreateMaster")

public actual fun sceNetAdhocGameModeCreateReplica(mac: MutPtr, data: MutPtr, size: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceNetAdhocGameModeCreateReplica")

@kotlin.wasm.WasmImport("libc", "libcPspSceNetAdhocGameModeUpdateMaster")
private external fun wasiLibcPspSceNetAdhocGameModeUpdateMaster(): Int

public actual fun sceNetAdhocGameModeUpdateMaster(): Int =
    wasiLibcPspSceNetAdhocGameModeUpdateMaster()

@kotlin.wasm.WasmImport("libc", "libcPspSceNetAdhocGameModeUpdateReplica")
private external fun wasiLibcPspSceNetAdhocGameModeUpdateReplica(id: Int, unk1: Int): Int

public actual fun sceNetAdhocGameModeUpdateReplica(id: Int, unk1: Int): Int =
    wasiLibcPspSceNetAdhocGameModeUpdateReplica(id, unk1)

@kotlin.wasm.WasmImport("libc", "libcPspSceNetAdhocGameModeDeleteMaster")
private external fun wasiLibcPspSceNetAdhocGameModeDeleteMaster(): Int

public actual fun sceNetAdhocGameModeDeleteMaster(): Int =
    wasiLibcPspSceNetAdhocGameModeDeleteMaster()

@kotlin.wasm.WasmImport("libc", "libcPspSceNetAdhocGameModeDeleteReplica")
private external fun wasiLibcPspSceNetAdhocGameModeDeleteReplica(id: Int): Int

public actual fun sceNetAdhocGameModeDeleteReplica(id: Int): Int =
    wasiLibcPspSceNetAdhocGameModeDeleteReplica(id)

public actual fun sceNetAdhocPtpOpen(srcmac: MutPtr, srcport: UShort, destmac: MutPtr, destport: UShort, bufSize: UInt, delay: UInt, count: Int, unk1: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceNetAdhocPtpOpen")

@kotlin.wasm.WasmImport("libc", "libcPspSceNetAdhocPtpConnect")
private external fun wasiLibcPspSceNetAdhocPtpConnect(id: Int, timeout: Int, nonblock: Int): Int

public actual fun sceNetAdhocPtpConnect(id: Int, timeout: UInt, nonblock: Int): Int =
    wasiLibcPspSceNetAdhocPtpConnect(id, timeout.toInt(), nonblock)

public actual fun sceNetAdhocPtpListen(srcmac: MutPtr, srcport: UShort, bufSize: UInt, delay: UInt, count: Int, queue: Int, unk1: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceNetAdhocPtpListen")

public actual fun sceNetAdhocPtpAccept(id: Int, mac: MutPtr, port: MutPtr, timeout: UInt, nonblock: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceNetAdhocPtpAccept")

public actual fun sceNetAdhocPtpSend(id: Int, data: MutPtr, dataSize: MutPtr, timeout: UInt, nonblock: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceNetAdhocPtpSend")

public actual fun sceNetAdhocPtpRecv(id: Int, data: MutPtr, dataSize: MutPtr, timeout: UInt, nonblock: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceNetAdhocPtpRecv")

@kotlin.wasm.WasmImport("libc", "libcPspSceNetAdhocPtpFlush")
private external fun wasiLibcPspSceNetAdhocPtpFlush(id: Int, timeout: Int, nonblock: Int): Int

public actual fun sceNetAdhocPtpFlush(id: Int, timeout: UInt, nonblock: Int): Int =
    wasiLibcPspSceNetAdhocPtpFlush(id, timeout.toInt(), nonblock)

@kotlin.wasm.WasmImport("libc", "libcPspSceNetAdhocPtpClose")
private external fun wasiLibcPspSceNetAdhocPtpClose(id: Int, unk1: Int): Int

public actual fun sceNetAdhocPtpClose(id: Int, unk1: Int): Int =
    wasiLibcPspSceNetAdhocPtpClose(id, unk1)

public actual fun sceNetAdhocGetPtpStat(size: MutPtr, stat: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceNetAdhocGetPtpStat")

@kotlin.wasm.WasmImport("libc", "libcPspSceNetAdhocMatchingInit")
private external fun wasiLibcPspSceNetAdhocMatchingInit(memsize: Int): Int

public actual fun sceNetAdhocMatchingInit(memsize: Int): Int =
    wasiLibcPspSceNetAdhocMatchingInit(memsize)

@kotlin.wasm.WasmImport("libc", "libcPspSceNetAdhocMatchingTerm")
private external fun wasiLibcPspSceNetAdhocMatchingTerm(): Int

public actual fun sceNetAdhocMatchingTerm(): Int =
    wasiLibcPspSceNetAdhocMatchingTerm()

public actual fun sceNetAdhocMatchingCreate(mode: AdhocMatchingMode, maxPeers: Int, port: UShort, bufSize: Int, helloDelay: UInt, pingDelay: UInt, initCount: Int, msgDelay: UInt, callback: AdhocMatchingCallback): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceNetAdhocMatchingCreate")

@kotlin.wasm.WasmImport("libc", "libcPspSceNetAdhocMatchingDelete")
private external fun wasiLibcPspSceNetAdhocMatchingDelete(matchingId: Int): Int

public actual fun sceNetAdhocMatchingDelete(matchingId: Int): Int =
    wasiLibcPspSceNetAdhocMatchingDelete(matchingId)

public actual fun sceNetAdhocMatchingStart(matchingId: Int, evthPri: Int, evthStack: Int, inthPri: Int, inthStack: Int, optLen: Int, optData: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceNetAdhocMatchingStart")

@kotlin.wasm.WasmImport("libc", "libcPspSceNetAdhocMatchingStop")
private external fun wasiLibcPspSceNetAdhocMatchingStop(matchingId: Int): Int

public actual fun sceNetAdhocMatchingStop(matchingId: Int): Int =
    wasiLibcPspSceNetAdhocMatchingStop(matchingId)

public actual fun sceNetAdhocMatchingSelectTarget(matchingId: Int, mac: MutPtr, optLen: Int, optData: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceNetAdhocMatchingSelectTarget")

public actual fun sceNetAdhocMatchingCancelTarget(matchingId: Int, mac: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceNetAdhocMatchingCancelTarget")

public actual fun sceNetAdhocMatchingCancelTargetWithOpt(matchingId: Int, mac: MutPtr, optLen: Int, optData: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceNetAdhocMatchingCancelTargetWithOpt")

public actual fun sceNetAdhocMatchingSendData(matchingId: Int, mac: MutPtr, dataLen: Int, data: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceNetAdhocMatchingSendData")

public actual fun sceNetAdhocMatchingAbortSendData(matchingId: Int, mac: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceNetAdhocMatchingAbortSendData")

public actual fun sceNetAdhocMatchingSetHelloOpt(matchingId: Int, optLen: Int, optData: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceNetAdhocMatchingSetHelloOpt")

public actual fun sceNetAdhocMatchingGetHelloOpt(matchingId: Int, optLen: MutPtr, optData: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceNetAdhocMatchingGetHelloOpt")

public actual fun sceNetAdhocMatchingGetMembers(matchingId: Int, length: MutPtr, buf: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceNetAdhocMatchingGetMembers")

@kotlin.wasm.WasmImport("libc", "libcPspSceNetAdhocMatchingGetPoolMaxAlloc")
private external fun wasiLibcPspSceNetAdhocMatchingGetPoolMaxAlloc(): Int

public actual fun sceNetAdhocMatchingGetPoolMaxAlloc(): Int =
    wasiLibcPspSceNetAdhocMatchingGetPoolMaxAlloc()

public actual fun sceNetAdhocMatchingGetPoolStat(poolstat: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceNetAdhocMatchingGetPoolStat")

@kotlin.wasm.WasmImport("libc", "libcPspSceNetApctlInit")
private external fun wasiLibcPspSceNetApctlInit(stackSize: Int, initPriority: Int): Int

public actual fun sceNetApctlInit(stackSize: Int, initPriority: Int): Int =
    wasiLibcPspSceNetApctlInit(stackSize, initPriority)

@kotlin.wasm.WasmImport("libc", "libcPspSceNetApctlTerm")
private external fun wasiLibcPspSceNetApctlTerm(): Int

public actual fun sceNetApctlTerm(): Int =
    wasiLibcPspSceNetApctlTerm()

public actual fun sceNetApctlGetInfo(code: ApctlInfo, pinfo: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceNetApctlGetInfo")

public actual fun sceNetApctlAddHandler(handler: SceNetApctlHandler, parg: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceNetApctlAddHandler")

@kotlin.wasm.WasmImport("libc", "libcPspSceNetApctlDelHandler")
private external fun wasiLibcPspSceNetApctlDelHandler(handlerId: Int): Int

public actual fun sceNetApctlDelHandler(handlerId: Int): Int =
    wasiLibcPspSceNetApctlDelHandler(handlerId)

@kotlin.wasm.WasmImport("libc", "libcPspSceNetApctlConnect")
private external fun wasiLibcPspSceNetApctlConnect(connIndex: Int): Int

public actual fun sceNetApctlConnect(connIndex: Int): Int =
    wasiLibcPspSceNetApctlConnect(connIndex)

@kotlin.wasm.WasmImport("libc", "libcPspSceNetApctlDisconnect")
private external fun wasiLibcPspSceNetApctlDisconnect(): Int

public actual fun sceNetApctlDisconnect(): Int =
    wasiLibcPspSceNetApctlDisconnect()

public actual fun sceNetApctlGetState(pstate: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceNetApctlGetState")

@kotlin.wasm.WasmImport("libc", "libcPspSceNetInetInit")
private external fun wasiLibcPspSceNetInetInit(): Int

public actual fun sceNetInetInit(): Int =
    wasiLibcPspSceNetInetInit()

@kotlin.wasm.WasmImport("libc", "libcPspSceNetInetTerm")
private external fun wasiLibcPspSceNetInetTerm(): Int

public actual fun sceNetInetTerm(): Int =
    wasiLibcPspSceNetInetTerm()

public actual fun sceNetInetAccept(s: Int, addr: MutPtr, addrLen: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceNetInetAccept")

public actual fun sceNetInetBind(s: Int, myAddr: ConstPtr, addrLen: SocklenT): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceNetInetBind")

public actual fun sceNetInetConnect(s: Int, servAddr: ConstPtr, addrLen: SocklenT): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceNetInetConnect")

public actual fun sceNetInetGetsockopt(s: Int, level: Int, optName: Int, optVal: MutPtr, optlEn: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceNetInetGetsockopt")

@kotlin.wasm.WasmImport("libc", "libcPspSceNetInetListen")
private external fun wasiLibcPspSceNetInetListen(s: Int, backlog: Int): Int

public actual fun sceNetInetListen(s: Int, backlog: Int): Int =
    wasiLibcPspSceNetInetListen(s, backlog)

public actual fun sceNetInetRecv(s: Int, buf: MutPtr, len: ULong, flags: Int): ULong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceNetInetRecv")

public actual fun sceNetInetRecvfrom(s: Int, buf: MutPtr, flags: ULong, arg1: Int, from: MutPtr, fromLen: MutPtr): ULong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceNetInetRecvfrom")

public actual fun sceNetInetSend(s: Int, buf: ConstPtr, len: ULong, flags: Int): ULong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceNetInetSend")

public actual fun sceNetInetSendto(s: Int, buf: ConstPtr, len: ULong, flags: Int, to: ConstPtr, toLen: SocklenT): ULong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceNetInetSendto")

public actual fun sceNetInetSetsockopt(s: Int, level: Int, optName: Int, optVal: ConstPtr, optLen: SocklenT): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceNetInetSetsockopt")

@kotlin.wasm.WasmImport("libc", "libcPspSceNetInetShutdown")
private external fun wasiLibcPspSceNetInetShutdown(s: Int, how: Int): Int

public actual fun sceNetInetShutdown(s: Int, how: Int): Int =
    wasiLibcPspSceNetInetShutdown(s, how)

@kotlin.wasm.WasmImport("libc", "libcPspSceNetInetSocket")
private external fun wasiLibcPspSceNetInetSocket(domain: Int, type: Int, protocol: Int): Int

public actual fun sceNetInetSocket(domain: Int, type: Int, protocol: Int): Int =
    wasiLibcPspSceNetInetSocket(domain, type, protocol)

@kotlin.wasm.WasmImport("libc", "libcPspSceNetInetClose")
private external fun wasiLibcPspSceNetInetClose(s: Int): Int

public actual fun sceNetInetClose(s: Int): Int =
    wasiLibcPspSceNetInetClose(s)

@kotlin.wasm.WasmImport("libc", "libcPspSceNetInetGetErrno")
private external fun wasiLibcPspSceNetInetGetErrno(): Int

public actual fun sceNetInetGetErrno(): Int =
    wasiLibcPspSceNetInetGetErrno()

@kotlin.wasm.WasmImport("libc", "libcPspSceSslInit")
private external fun wasiLibcPspSceSslInit(unknown1: Int): Int

public actual fun sceSslInit(unknown1: Int): Int =
    wasiLibcPspSceSslInit(unknown1)

@kotlin.wasm.WasmImport("libc", "libcPspSceSslEnd")
private external fun wasiLibcPspSceSslEnd(): Int

public actual fun sceSslEnd(): Int =
    wasiLibcPspSceSslEnd()

public actual fun sceSslGetUsedMemoryMax(memory: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceSslGetUsedMemoryMax")

public actual fun sceSslGetUsedMemoryCurrent(memory: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceSslGetUsedMemoryCurrent")

@kotlin.wasm.WasmImport("libc", "libcPspSceHttpInit")
private external fun wasiLibcPspSceHttpInit(unknown1: Int): Int

public actual fun sceHttpInit(unknown1: UInt): Int =
    wasiLibcPspSceHttpInit(unknown1.toInt())

@kotlin.wasm.WasmImport("libc", "libcPspSceHttpEnd")
private external fun wasiLibcPspSceHttpEnd(): Int

public actual fun sceHttpEnd(): Int =
    wasiLibcPspSceHttpEnd()

public actual fun sceHttpCreateTemplate(agent: MutPtr, unknown1: Int, unknown2: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceHttpCreateTemplate")

@kotlin.wasm.WasmImport("libc", "libcPspSceHttpDeleteTemplate")
private external fun wasiLibcPspSceHttpDeleteTemplate(templateid: Int): Int

public actual fun sceHttpDeleteTemplate(templateid: Int): Int =
    wasiLibcPspSceHttpDeleteTemplate(templateid)

public actual fun sceHttpCreateConnection(templateid: Int, host: MutPtr, unknown1: MutPtr, port: UShort, unknown2: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceHttpCreateConnection")

public actual fun sceHttpCreateConnectionWithURL(templateid: Int, url: ConstPtr, unknown1: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceHttpCreateConnectionWithURL")

@kotlin.wasm.WasmImport("libc", "libcPspSceHttpDeleteConnection")
private external fun wasiLibcPspSceHttpDeleteConnection(connectionId: Int): Int

public actual fun sceHttpDeleteConnection(connectionId: Int): Int =
    wasiLibcPspSceHttpDeleteConnection(connectionId)

public actual fun sceHttpCreateRequest(connectionId: Int, method: HttpMethod, path: MutPtr, contentLength: ULong): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceHttpCreateRequest")

public actual fun sceHttpCreateRequestWithURL(connectionId: Int, method: HttpMethod, url: MutPtr, contentLength: ULong): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceHttpCreateRequestWithURL")

@kotlin.wasm.WasmImport("libc", "libcPspSceHttpDeleteRequest")
private external fun wasiLibcPspSceHttpDeleteRequest(requestId: Int): Int

public actual fun sceHttpDeleteRequest(requestId: Int): Int =
    wasiLibcPspSceHttpDeleteRequest(requestId)

public actual fun sceHttpSendRequest(requestId: Int, data: MutPtr, dataSize: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceHttpSendRequest")

@kotlin.wasm.WasmImport("libc", "libcPspSceHttpAbortRequest")
private external fun wasiLibcPspSceHttpAbortRequest(requestId: Int): Int

public actual fun sceHttpAbortRequest(requestId: Int): Int =
    wasiLibcPspSceHttpAbortRequest(requestId)

public actual fun sceHttpReadData(requestId: Int, data: MutPtr, dataSize: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceHttpReadData")

public actual fun sceHttpGetContentLength(requestId: Int, contentLength: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceHttpGetContentLength")

public actual fun sceHttpGetStatusCode(requestId: Int, statusCode: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceHttpGetStatusCode")

@kotlin.wasm.WasmImport("libc", "libcPspSceHttpSetResolveTimeOut")
private external fun wasiLibcPspSceHttpSetResolveTimeOut(id: Int, timeout: Int): Int

public actual fun sceHttpSetResolveTimeOut(id: Int, timeout: UInt): Int =
    wasiLibcPspSceHttpSetResolveTimeOut(id, timeout.toInt())

@kotlin.wasm.WasmImport("libc", "libcPspSceHttpSetResolveRetry")
private external fun wasiLibcPspSceHttpSetResolveRetry(id: Int, count: Int): Int

public actual fun sceHttpSetResolveRetry(id: Int, count: Int): Int =
    wasiLibcPspSceHttpSetResolveRetry(id, count)

@kotlin.wasm.WasmImport("libc", "libcPspSceHttpSetConnectTimeOut")
private external fun wasiLibcPspSceHttpSetConnectTimeOut(id: Int, timeout: Int): Int

public actual fun sceHttpSetConnectTimeOut(id: Int, timeout: UInt): Int =
    wasiLibcPspSceHttpSetConnectTimeOut(id, timeout.toInt())

@kotlin.wasm.WasmImport("libc", "libcPspSceHttpSetSendTimeOut")
private external fun wasiLibcPspSceHttpSetSendTimeOut(id: Int, timeout: Int): Int

public actual fun sceHttpSetSendTimeOut(id: Int, timeout: UInt): Int =
    wasiLibcPspSceHttpSetSendTimeOut(id, timeout.toInt())

@kotlin.wasm.WasmImport("libc", "libcPspSceHttpSetRecvTimeOut")
private external fun wasiLibcPspSceHttpSetRecvTimeOut(id: Int, timeout: Int): Int

public actual fun sceHttpSetRecvTimeOut(id: Int, timeout: UInt): Int =
    wasiLibcPspSceHttpSetRecvTimeOut(id, timeout.toInt())

@kotlin.wasm.WasmImport("libc", "libcPspSceHttpEnableKeepAlive")
private external fun wasiLibcPspSceHttpEnableKeepAlive(id: Int): Int

public actual fun sceHttpEnableKeepAlive(id: Int): Int =
    wasiLibcPspSceHttpEnableKeepAlive(id)

@kotlin.wasm.WasmImport("libc", "libcPspSceHttpDisableKeepAlive")
private external fun wasiLibcPspSceHttpDisableKeepAlive(id: Int): Int

public actual fun sceHttpDisableKeepAlive(id: Int): Int =
    wasiLibcPspSceHttpDisableKeepAlive(id)

@kotlin.wasm.WasmImport("libc", "libcPspSceHttpEnableRedirect")
private external fun wasiLibcPspSceHttpEnableRedirect(id: Int): Int

public actual fun sceHttpEnableRedirect(id: Int): Int =
    wasiLibcPspSceHttpEnableRedirect(id)

@kotlin.wasm.WasmImport("libc", "libcPspSceHttpDisableRedirect")
private external fun wasiLibcPspSceHttpDisableRedirect(id: Int): Int

public actual fun sceHttpDisableRedirect(id: Int): Int =
    wasiLibcPspSceHttpDisableRedirect(id)

@kotlin.wasm.WasmImport("libc", "libcPspSceHttpEnableCookie")
private external fun wasiLibcPspSceHttpEnableCookie(id: Int): Int

public actual fun sceHttpEnableCookie(id: Int): Int =
    wasiLibcPspSceHttpEnableCookie(id)

@kotlin.wasm.WasmImport("libc", "libcPspSceHttpDisableCookie")
private external fun wasiLibcPspSceHttpDisableCookie(id: Int): Int

public actual fun sceHttpDisableCookie(id: Int): Int =
    wasiLibcPspSceHttpDisableCookie(id)

@kotlin.wasm.WasmImport("libc", "libcPspSceHttpSaveSystemCookie")
private external fun wasiLibcPspSceHttpSaveSystemCookie(): Int

public actual fun sceHttpSaveSystemCookie(): Int =
    wasiLibcPspSceHttpSaveSystemCookie()

@kotlin.wasm.WasmImport("libc", "libcPspSceHttpLoadSystemCookie")
private external fun wasiLibcPspSceHttpLoadSystemCookie(): Int

public actual fun sceHttpLoadSystemCookie(): Int =
    wasiLibcPspSceHttpLoadSystemCookie()

public actual fun sceHttpAddExtraHeader(id: Int, name: MutPtr, value: MutPtr, unknown1: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceHttpAddExtraHeader")

public actual fun sceHttpDeleteHeader(id: Int, name: ConstPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceHttpDeleteHeader")

@kotlin.wasm.WasmImport("libc", "libcPspSceHttpsInit")
private external fun wasiLibcPspSceHttpsInit(unknown1: Int, unknown2: Int, unknown3: Int, unknown4: Int): Int

public actual fun sceHttpsInit(unknown1: Int, unknown2: Int, unknown3: Int, unknown4: Int): Int =
    wasiLibcPspSceHttpsInit(unknown1, unknown2, unknown3, unknown4)

@kotlin.wasm.WasmImport("libc", "libcPspSceHttpsEnd")
private external fun wasiLibcPspSceHttpsEnd(): Int

public actual fun sceHttpsEnd(): Int =
    wasiLibcPspSceHttpsEnd()

@kotlin.wasm.WasmImport("libc", "libcPspSceHttpsLoadDefaultCert")
private external fun wasiLibcPspSceHttpsLoadDefaultCert(unknown1: Int, unknown2: Int): Int

public actual fun sceHttpsLoadDefaultCert(unknown1: Int, unknown2: Int): Int =
    wasiLibcPspSceHttpsLoadDefaultCert(unknown1, unknown2)

@kotlin.wasm.WasmImport("libc", "libcPspSceHttpDisableAuth")
private external fun wasiLibcPspSceHttpDisableAuth(id: Int): Int

public actual fun sceHttpDisableAuth(id: Int): Int =
    wasiLibcPspSceHttpDisableAuth(id)

@kotlin.wasm.WasmImport("libc", "libcPspSceHttpDisableCache")
private external fun wasiLibcPspSceHttpDisableCache(id: Int): Int

public actual fun sceHttpDisableCache(id: Int): Int =
    wasiLibcPspSceHttpDisableCache(id)

@kotlin.wasm.WasmImport("libc", "libcPspSceHttpEnableAuth")
private external fun wasiLibcPspSceHttpEnableAuth(id: Int): Int

public actual fun sceHttpEnableAuth(id: Int): Int =
    wasiLibcPspSceHttpEnableAuth(id)

@kotlin.wasm.WasmImport("libc", "libcPspSceHttpEnableCache")
private external fun wasiLibcPspSceHttpEnableCache(id: Int): Int

public actual fun sceHttpEnableCache(id: Int): Int =
    wasiLibcPspSceHttpEnableCache(id)

@kotlin.wasm.WasmImport("libc", "libcPspSceHttpEndCache")
private external fun wasiLibcPspSceHttpEndCache(): Int

public actual fun sceHttpEndCache(): Int =
    wasiLibcPspSceHttpEndCache()

public actual fun sceHttpGetAllHeader(request: Int, header: MutPtr, headerSize: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceHttpGetAllHeader")

public actual fun sceHttpGetNetworkErrno(request: Int, errNum: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceHttpGetNetworkErrno")

public actual fun sceHttpGetProxy(id: Int, activateFlag: MutPtr, mode: MutPtr, proxyHost: MutPtr, len: ULong, proxyPort: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceHttpGetProxy")

@kotlin.wasm.WasmImport("libc", "libcPspSceHttpInitCache")
private external fun wasiLibcPspSceHttpInitCache(maxSize: Long): Int

public actual fun sceHttpInitCache(maxSize: ULong): Int =
    wasiLibcPspSceHttpInitCache(maxSize.toLong())

public actual fun sceHttpSetAuthInfoCB(id: Int, cbfunc: HttpPasswordCB): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceHttpSetAuthInfoCB")

public actual fun sceHttpSetProxy(id: Int, activateFlag: Int, mode: Int, newProxyHost: ConstPtr, newProxyPort: UShort): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceHttpSetProxy")

@kotlin.wasm.WasmImport("libc", "libcPspSceHttpSetResHeaderMaxSize")
private external fun wasiLibcPspSceHttpSetResHeaderMaxSize(id: Int, headerSize: Int): Int

public actual fun sceHttpSetResHeaderMaxSize(id: Int, headerSize: UInt): Int =
    wasiLibcPspSceHttpSetResHeaderMaxSize(id, headerSize.toInt())

public actual fun sceHttpSetMallocFunction(mallocFunc: HttpMallocFunction, freeFunc: HttpFreeFunction, reallocFunc: HttpReallocFunction): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceHttpSetMallocFunction")

@kotlin.wasm.WasmImport("libc", "libcPspSceNetResolverInit")
private external fun wasiLibcPspSceNetResolverInit(): Int

public actual fun sceNetResolverInit(): Int =
    wasiLibcPspSceNetResolverInit()

public actual fun sceNetResolverCreate(rid: MutPtr, buf: MutPtr, bufLength: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceNetResolverCreate")

@kotlin.wasm.WasmImport("libc", "libcPspSceNetResolverDelete")
private external fun wasiLibcPspSceNetResolverDelete(rid: Int): Int

public actual fun sceNetResolverDelete(rid: Int): Int =
    wasiLibcPspSceNetResolverDelete(rid)

public actual fun sceNetResolverStartNtoA(rid: Int, hostname: ConstPtr, addr: MutPtr, timeout: UInt, retry: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceNetResolverStartNtoA")

public actual fun sceNetResolverStartAtoN(rid: Int, addr: ConstPtr, hostname: MutPtr, hostnameLen: UInt, timeout: UInt, retry: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcPspSceNetResolverStartAtoN")

@kotlin.wasm.WasmImport("libc", "libcPspSceNetResolverStop")
private external fun wasiLibcPspSceNetResolverStop(rid: Int): Int

public actual fun sceNetResolverStop(rid: Int): Int =
    wasiLibcPspSceNetResolverStop(rid)

@kotlin.wasm.WasmImport("libc", "libcPspSceNetResolverTerm")
private external fun wasiLibcPspSceNetResolverTerm(): Int

public actual fun sceNetResolverTerm(): Int =
    wasiLibcPspSceNetResolverTerm()
