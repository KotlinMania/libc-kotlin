@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.psp

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private val pspNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/libc-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = null; return null; })()")

public actual fun sceAudioChReserve(channel: Int, sampleCount: Int, format: AudioFormat): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceAudioChRelease(channel: Int): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceAudioChRelease(channel) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceAudioOutput(channel: Int, vol: Int, buf: MutPtr): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceAudioOutput(channel, vol, buf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceAudioOutputBlocking(channel: Int, vol: Int, buf: MutPtr): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceAudioOutputBlocking(channel, vol, buf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceAudioOutputPanned(channel: Int, leftVol: Int, rightVol: Int, buf: MutPtr): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceAudioOutputPanned(channel, leftVol, rightVol, buf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceAudioOutputPannedBlocking(channel: Int, leftVol: Int, rightVol: Int, buf: MutPtr): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceAudioOutputPannedBlocking(channel, leftVol, rightVol, buf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceAudioGetChannelRestLen(channel: Int): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceAudioGetChannelRestLen(channel) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceAudioGetChannelRestLength(channel: Int): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceAudioGetChannelRestLength(channel) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceAudioSetChannelDataLen(channel: Int, sampleCount: Int): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceAudioSetChannelDataLen(channel, sampleCount) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceAudioChangeChannelConfig(channel: Int, format: AudioFormat): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceAudioChangeChannelVolume(channel: Int, leftVol: Int, rightVol: Int): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceAudioChangeChannelVolume(channel, leftVol, rightVol) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceAudioOutput2Reserve(sampleCount: Int): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceAudioOutput2Reserve(sampleCount) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceAudioOutput2Release(): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceAudioOutput2Release() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceAudioOutput2ChangeLength(sampleCount: Int): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceAudioOutput2ChangeLength(sampleCount) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceAudioOutput2OutputBlocking(vol: Int, buf: MutPtr): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceAudioOutput2OutputBlocking(vol, buf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceAudioOutput2GetRestSample(): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceAudioOutput2GetRestSample() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceAudioSRCChReserve(sampleCount: Int, freq: AudioOutputFrequency, channels: Int): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceAudioSRCChRelease(): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceAudioSRCChRelease() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceAudioSRCOutputBlocking(vol: Int, buf: MutPtr): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceAudioSRCOutputBlocking(vol, buf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceAudioInputInit(unknown1: Int, gain: Int, unknown2: Int): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceAudioInputInit(unknown1, gain, unknown2) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceAudioInputInitEx(params: MutPtr): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceAudioInputInitEx(params.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceAudioInputBlocking(sampleCount: Int, freq: AudioInputFrequency, buf: MutPtr): Unit = throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceAudioInput(sampleCount: Int, freq: AudioInputFrequency, buf: MutPtr): Unit = throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceAudioGetInputLength(): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceAudioGetInputLength() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceAudioWaitInputEnd(): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceAudioWaitInputEnd() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceAudioPollInputEnd(): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceAudioPollInputEnd() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceAtracGetAtracID(uiCodecType: UInt): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceAtracGetAtracID(uiCodecType.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceAtracSetDataAndGetID(buf: MutPtr, bufsize: ULong): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceAtracSetDataAndGetID(buf.rawAddress.toString(), bufsize.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceAtracDecodeData(atracId: Int, outSamples: MutPtr, outN: MutPtr, outEnd: MutPtr, outRemainFrame: MutPtr): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceAtracDecodeData(atracId, outSamples.rawAddress.toString(), outN.rawAddress.toString(), outEnd.rawAddress.toString(), outRemainFrame.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceAtracGetRemainFrame(atracId: Int, outRemainFrame: MutPtr): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceAtracGetRemainFrame(atracId, outRemainFrame.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceAtracGetStreamDataInfo(atracId: Int, writePointer: MutPtr, availableBytes: MutPtr, readOffset: MutPtr): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceAtracGetStreamDataInfo(atracId, writePointer.rawAddress.toString(), availableBytes.rawAddress.toString(), readOffset.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceAtracAddStreamData(atracId: Int, bytesToAdd: UInt): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceAtracAddStreamData(atracId, bytesToAdd.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceAtracGetBitrate(atracId: Int, outBitrate: MutPtr): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceAtracGetBitrate(atracId, outBitrate.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceAtracSetLoopNum(atracId: Int, nloops: Int): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceAtracSetLoopNum(atracId, nloops) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceAtracReleaseAtracID(atracId: Int): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceAtracReleaseAtracID(atracId) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceAtracGetNextSample(atracId: Int, outN: MutPtr): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceAtracGetNextSample(atracId, outN.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceAtracGetMaxSample(atracId: Int, outMax: MutPtr): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceAtracGetMaxSample(atracId, outMax.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceAtracGetBufferInfoForReseting(atracId: Int, uiSample: UInt, pbufferInfo: MutPtr): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceAtracGetBufferInfoForReseting(atracId, uiSample.toInt(), pbufferInfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceAtracGetChannel(atracId: Int, puiChannel: MutPtr): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceAtracGetChannel(atracId, puiChannel.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceAtracGetInternalErrorInfo(atracId: Int, piResult: MutPtr): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceAtracGetInternalErrorInfo(atracId, piResult.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceAtracGetLoopStatus(atracId: Int, piLoopNum: MutPtr, puiLoopStatus: MutPtr): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceAtracGetLoopStatus(atracId, piLoopNum.rawAddress.toString(), puiLoopStatus.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceAtracGetNextDecodePosition(atracId: Int, puiSamplePosition: MutPtr): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceAtracGetNextDecodePosition(atracId, puiSamplePosition.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceAtracGetSecondBufferInfo(atracId: Int, puiPosition: MutPtr, puiDataByte: MutPtr): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceAtracGetSecondBufferInfo(atracId, puiPosition.rawAddress.toString(), puiDataByte.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceAtracGetSoundSample(atracId: Int, piEndSample: MutPtr, piLoopStartSample: MutPtr, piLoopEndSample: MutPtr): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceAtracGetSoundSample(atracId, piEndSample.rawAddress.toString(), piLoopStartSample.rawAddress.toString(), piLoopEndSample.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceAtracResetPlayPosition(atracId: Int, uiSample: UInt, uiWriteByteFirstBuf: UInt, uiWriteByteSecondBuf: UInt): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceAtracResetPlayPosition(atracId, uiSample.toInt(), uiWriteByteFirstBuf.toInt(), uiWriteByteSecondBuf.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceAtracSetData(atracId: Int, pucBufferAddr: MutPtr, uiBufferByte: UInt): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceAtracSetData(atracId, pucBufferAddr.rawAddress.toString(), uiBufferByte.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceAtracSetHalfwayBuffer(atracId: Int, pucBufferAddr: MutPtr, uiReadByte: UInt, uiBufferByte: UInt): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceAtracSetHalfwayBuffer(atracId, pucBufferAddr.rawAddress.toString(), uiReadByte.toInt(), uiBufferByte.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceAtracSetHalfwayBufferAndGetID(pucBufferAddr: MutPtr, uiReadByte: UInt, uiBufferByte: UInt): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceAtracSetHalfwayBufferAndGetID(pucBufferAddr.rawAddress.toString(), uiReadByte.toInt(), uiBufferByte.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceAtracSetSecondBuffer(atracId: Int, pucSecondBufferAddr: MutPtr, uiSecondBufferByte: UInt): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceAtracSetSecondBuffer(atracId, pucSecondBufferAddr.rawAddress.toString(), uiSecondBufferByte.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceCtrlSetSamplingCycle(cycle: Int): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceCtrlSetSamplingCycle(cycle) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceCtrlGetSamplingCycle(pcycle: MutPtr): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceCtrlGetSamplingCycle(pcycle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceCtrlSetSamplingMode(mode: CtrlMode): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceCtrlGetSamplingMode(pmode: MutPtr): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceCtrlGetSamplingMode(pmode.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceCtrlPeekBufferPositive(padData: MutPtr, count: Int): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceCtrlPeekBufferPositive(padData.rawAddress.toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceCtrlPeekBufferNegative(padData: MutPtr, count: Int): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceCtrlPeekBufferNegative(padData.rawAddress.toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceCtrlReadBufferPositive(padData: MutPtr, count: Int): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceCtrlReadBufferPositive(padData.rawAddress.toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceCtrlReadBufferNegative(padData: MutPtr, count: Int): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceCtrlReadBufferNegative(padData.rawAddress.toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceCtrlPeekLatch(latchData: MutPtr): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceCtrlPeekLatch(latchData.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceCtrlReadLatch(latchData: MutPtr): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceCtrlReadLatch(latchData.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceCtrlSetIdleCancelThreshold(idlereset: Int, idleback: Int): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceCtrlSetIdleCancelThreshold(idlereset, idleback) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceCtrlGetIdleCancelThreshold(idlereset: MutPtr, idleback: MutPtr): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceCtrlGetIdleCancelThreshold(idlereset.rawAddress.toString(), idleback.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceDisplaySetMode(mode: DisplayMode, width: ULong, height: ULong): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceDisplayGetMode(pmode: MutPtr, pwidth: MutPtr, pheight: MutPtr): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceDisplayGetMode(pmode.rawAddress.toString(), pwidth.rawAddress.toString(), pheight.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceDisplaySetFrameBuf(topAddr: ConstPtr, bufferWidth: ULong, pixelFormat: DisplayPixelFormat, sync: DisplaySetBufSync): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceDisplayGetFrameBuf(topAddr: MutPtr, bufferWidth: MutPtr, pixelFormat: MutPtr, sync: DisplaySetBufSync): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceDisplayGetVcount(): UInt =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceDisplayGetVcount() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceDisplayWaitVblank(): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceDisplayWaitVblank() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceDisplayWaitVblankCB(): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceDisplayWaitVblankCB() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceDisplayWaitVblankStart(): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceDisplayWaitVblankStart() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceDisplayWaitVblankStartCB(): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceDisplayWaitVblankStartCB() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceDisplayGetAccumulatedHcount(): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceDisplayGetAccumulatedHcount() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceDisplayGetCurrentHcount(): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceDisplayGetCurrentHcount() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceDisplayGetFramePerSec(): Float =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceDisplayGetFramePerSec() as Double).toFloat() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceDisplayIsForeground(): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceDisplayIsForeground() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceDisplayIsVblank(): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceDisplayIsVblank() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGeEdramGetSize(): UInt =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceGeEdramGetSize() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGeEdramGetAddr(): MutPtr =
    if (pspNapiAddon != null) MutPtr((pspNapiAddon.libcPspSceGeEdramGetAddr() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGeEdramSetAddrTranslation(width: Int): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceGeEdramSetAddrTranslation(width) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGeGetCmd(cmd: Int): UInt =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceGeGetCmd(cmd) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGeGetMtx(type: GeMatrixType, matrix: MutPtr): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGeGetStack(stackId: Int, stack: MutPtr): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceGeGetStack(stackId, stack.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGeSaveContext(context: MutPtr): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceGeSaveContext(context.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGeRestoreContext(context: ConstPtr): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceGeRestoreContext(context.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGeListEnQueue(list: ConstPtr, stall: MutPtr, cbid: Int, arg: MutPtr): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceGeListEnQueue(list.rawAddress.toString(), stall.rawAddress.toString(), cbid, arg.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGeListEnQueueHead(list: ConstPtr, stall: MutPtr, cbid: Int, arg: MutPtr): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceGeListEnQueueHead(list.rawAddress.toString(), stall.rawAddress.toString(), cbid, arg.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGeListDeQueue(qid: Int): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceGeListDeQueue(qid) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGeListUpdateStallAddr(qid: Int, stall: MutPtr): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceGeListUpdateStallAddr(qid, stall.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGeListSync(qid: Int, syncType: Int): GeListState =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGeDrawSync(syncType: Int): GeListState =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGeBreak(mode: Int, pParam: MutPtr): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceGeBreak(mode, pParam.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGeContinue(): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceGeContinue() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGeSetCallback(cb: MutPtr): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceGeSetCallback(cb.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGeUnsetCallback(cbid: Int): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceGeUnsetCallback(cbid) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelExitGame() {
    if (pspNapiAddon != null) {
        pspNapiAddon.libcPspSceKernelExitGame()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceKernelRegisterExitCallback(id: SceUid): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelLoadExec(file: ConstPtr, param: MutPtr): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceKernelLoadExec(file.rawAddress.toString(), param.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelAllocPartitionMemory(partition: SceSysMemPartitionId, name: ConstPtr, type: SceSysMemBlockTypes, size: UInt, addr: MutPtr): SceUid =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelGetBlockHeadAddr(blockid: SceUid): MutPtr =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelFreePartitionMemory(blockid: SceUid): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelTotalFreeMemSize(): ULong =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceKernelTotalFreeMemSize() as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelMaxFreeMemSize(): ULong =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceKernelMaxFreeMemSize() as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelDevkitVersion(): UInt =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceKernelDevkitVersion() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelSetCompiledSdkVersion(version: UInt): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceKernelSetCompiledSdkVersion(version.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelGetCompiledSdkVersion(): UInt =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceKernelGetCompiledSdkVersion() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelLibcTime(t: MutPtr): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceKernelLibcTime(t.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelLibcClock(): UInt =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceKernelLibcClock() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelLibcGettimeofday(tp: MutPtr, tzp: MutPtr): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceKernelLibcGettimeofday(tp.rawAddress.toString(), tzp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelDcacheWritebackAll() {
    if (pspNapiAddon != null) {
        pspNapiAddon.libcPspSceKernelDcacheWritebackAll()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceKernelDcacheWritebackInvalidateAll() {
    if (pspNapiAddon != null) {
        pspNapiAddon.libcPspSceKernelDcacheWritebackInvalidateAll()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceKernelDcacheWritebackRange(p: ConstPtr, size: UInt) {
    if (pspNapiAddon != null) {
        pspNapiAddon.libcPspSceKernelDcacheWritebackRange(p.rawAddress.toString(), size.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceKernelDcacheWritebackInvalidateRange(p: ConstPtr, size: UInt) {
    if (pspNapiAddon != null) {
        pspNapiAddon.libcPspSceKernelDcacheWritebackInvalidateRange(p.rawAddress.toString(), size.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceKernelDcacheInvalidateRange(p: ConstPtr, size: UInt) {
    if (pspNapiAddon != null) {
        pspNapiAddon.libcPspSceKernelDcacheInvalidateRange(p.rawAddress.toString(), size.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceKernelIcacheInvalidateAll() {
    if (pspNapiAddon != null) {
        pspNapiAddon.libcPspSceKernelIcacheInvalidateAll()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceKernelIcacheInvalidateRange(p: ConstPtr, size: UInt) {
    if (pspNapiAddon != null) {
        pspNapiAddon.libcPspSceKernelIcacheInvalidateRange(p.rawAddress.toString(), size.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceKernelUtilsMt19937Init(ctx: MutPtr, seed: UInt): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceKernelUtilsMt19937Init(ctx.rawAddress.toString(), seed.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelUtilsMt19937UInt(ctx: MutPtr): UInt =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceKernelUtilsMt19937UInt(ctx.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelUtilsMd5Digest(data: MutPtr, size: UInt, digest: MutPtr): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceKernelUtilsMd5Digest(data.rawAddress.toString(), size.toInt(), digest.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelUtilsMd5BlockInit(ctx: MutPtr): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceKernelUtilsMd5BlockInit(ctx.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelUtilsMd5BlockUpdate(ctx: MutPtr, data: MutPtr, size: UInt): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceKernelUtilsMd5BlockUpdate(ctx.rawAddress.toString(), data.rawAddress.toString(), size.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelUtilsMd5BlockResult(ctx: MutPtr, digest: MutPtr): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceKernelUtilsMd5BlockResult(ctx.rawAddress.toString(), digest.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelUtilsSha1Digest(data: MutPtr, size: UInt, digest: MutPtr): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceKernelUtilsSha1Digest(data.rawAddress.toString(), size.toInt(), digest.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelUtilsSha1BlockInit(ctx: MutPtr): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceKernelUtilsSha1BlockInit(ctx.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelUtilsSha1BlockUpdate(ctx: MutPtr, data: MutPtr, size: UInt): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceKernelUtilsSha1BlockUpdate(ctx.rawAddress.toString(), data.rawAddress.toString(), size.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelUtilsSha1BlockResult(ctx: MutPtr, digest: MutPtr): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceKernelUtilsSha1BlockResult(ctx.rawAddress.toString(), digest.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelRegisterSubIntrHandler(intNo: Int, no: Int, handler: MutPtr, arg: MutPtr): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceKernelRegisterSubIntrHandler(intNo, no, handler.rawAddress.toString(), arg.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelReleaseSubIntrHandler(intNo: Int, no: Int): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceKernelReleaseSubIntrHandler(intNo, no) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelEnableSubIntr(intNo: Int, no: Int): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceKernelEnableSubIntr(intNo, no) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelDisableSubIntr(intNo: Int, no: Int): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceKernelDisableSubIntr(intNo, no) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryIntrHandlerInfo(intrCode: SceUid, subIntrCode: SceUid, data: MutPtr): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelCpuSuspendIntr(): UInt =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceKernelCpuSuspendIntr() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelCpuResumeIntr(flags: UInt) {
    if (pspNapiAddon != null) {
        pspNapiAddon.libcPspSceKernelCpuResumeIntr(flags.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceKernelCpuResumeIntrWithSync(flags: UInt) {
    if (pspNapiAddon != null) {
        pspNapiAddon.libcPspSceKernelCpuResumeIntrWithSync(flags.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceKernelIsCpuIntrSuspended(flags: UInt): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceKernelIsCpuIntrSuspended(flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelIsCpuIntrEnable(): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceKernelIsCpuIntrEnable() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelLoadModule(path: ConstPtr, flags: Int, option: MutPtr): SceUid =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelLoadModuleMs(path: ConstPtr, flags: Int, option: MutPtr): SceUid =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelLoadModuleByID(fid: SceUid, flags: Int, option: MutPtr): SceUid =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelLoadModuleBufferUsbWlan(bufSize: ULong, buf: MutPtr, flags: Int, option: MutPtr): SceUid =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelStartModule(modId: SceUid, argSize: ULong, argp: MutPtr, status: MutPtr, option: MutPtr): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelStopModule(modId: SceUid, argSize: ULong, argp: MutPtr, status: MutPtr, option: MutPtr): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelUnloadModule(modId: SceUid): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelSelfStopUnloadModule(unknown: Int, argSize: ULong, argp: MutPtr): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceKernelSelfStopUnloadModule(unknown, argSize.toString(), argp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelStopUnloadSelfModule(argSize: ULong, argp: MutPtr, status: MutPtr, option: MutPtr): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceKernelStopUnloadSelfModule(argSize.toString(), argp.rawAddress.toString(), status.rawAddress.toString(), option.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelQueryModuleInfo(modId: SceUid, info: MutPtr): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelGetModuleIdList(readBuf: MutPtr, readBufSize: Int, idCount: MutPtr): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceKernelGetModuleIdList(readBuf.rawAddress.toString(), readBufSize, idCount.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelVolatileMemLock(unk: Int, ptr: MutPtr, size: MutPtr): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceKernelVolatileMemLock(unk, ptr.rawAddress.toString(), size.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelVolatileMemTryLock(unk: Int, ptr: MutPtr, size: MutPtr): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceKernelVolatileMemTryLock(unk, ptr.rawAddress.toString(), size.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelVolatileMemUnlock(unk: Int): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceKernelVolatileMemUnlock(unk) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelStdin(): SceUid =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelStdout(): SceUid =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelStderr(): SceUid =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelGetThreadmanIdType(uid: SceUid): SceKernelIdListType =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelCreateThread(name: ConstPtr, entry: SceKernelThreadEntry, initPriority: Int, stackSize: Int, attr: Int, option: MutPtr): SceUid =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelDeleteThread(thid: SceUid): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelStartThread(id: SceUid, argLen: ULong, argP: MutPtr): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelExitThread(status: Int): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceKernelExitThread(status) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelExitDeleteThread(status: Int): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceKernelExitDeleteThread(status) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelTerminateThread(thid: SceUid): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelTerminateDeleteThread(thid: SceUid): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelSuspendDispatchThread(): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceKernelSuspendDispatchThread() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelResumeDispatchThread(state: Int): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceKernelResumeDispatchThread(state) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelSleepThread(): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceKernelSleepThread() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelSleepThreadCB(): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceKernelSleepThreadCB() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelWakeupThread(thid: SceUid): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelCancelWakeupThread(thid: SceUid): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelSuspendThread(thid: SceUid): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelResumeThread(thid: SceUid): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelWaitThreadEnd(thid: SceUid, timeout: MutPtr): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelWaitThreadEndCB(thid: SceUid, timeout: MutPtr): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelDelayThread(delay: UInt): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceKernelDelayThread(delay.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelDelayThreadCB(delay: UInt): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceKernelDelayThreadCB(delay.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelDelaySysClockThread(delay: MutPtr): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceKernelDelaySysClockThread(delay.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelDelaySysClockThreadCB(delay: MutPtr): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceKernelDelaySysClockThreadCB(delay.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelChangeCurrentThreadAttr(unknown: Int, attr: Int): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceKernelChangeCurrentThreadAttr(unknown, attr) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelChangeThreadPriority(thid: SceUid, priority: Int): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelRotateThreadReadyQueue(priority: Int): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceKernelRotateThreadReadyQueue(priority) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelReleaseWaitThread(thid: SceUid): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelGetThreadId(): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceKernelGetThreadId() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelGetThreadCurrentPriority(): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceKernelGetThreadCurrentPriority() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelGetThreadExitStatus(thid: SceUid): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelCheckThreadStack(): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceKernelCheckThreadStack() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelGetThreadStackFreeSize(thid: SceUid): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelReferThreadStatus(thid: SceUid, info: MutPtr): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelReferThreadRunStatus(thid: SceUid, status: MutPtr): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelCreateSema(name: ConstPtr, attr: UInt, initVal: Int, maxVal: Int, option: MutPtr): SceUid =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelDeleteSema(semaId: SceUid): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelSignalSema(semaId: SceUid, signal: Int): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelWaitSema(semaId: SceUid, signal: Int, timeout: MutPtr): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelWaitSemaCB(semaId: SceUid, signal: Int, timeout: MutPtr): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelPollSema(semaId: SceUid, signal: Int): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelReferSemaStatus(semaId: SceUid, info: MutPtr): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelCreateEventFlag(name: ConstPtr, attr: Int, bits: Int, opt: MutPtr): SceUid =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelSetEventFlag(evId: SceUid, bits: UInt): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelClearEventFlag(evId: SceUid, bits: UInt): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelPollEventFlag(evId: SceUid, bits: UInt, wait: Int, outBits: MutPtr): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelWaitEventFlag(evId: SceUid, bits: UInt, wait: Int, outBits: MutPtr, timeout: MutPtr): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelWaitEventFlagCB(evId: SceUid, bits: UInt, wait: Int, outBits: MutPtr, timeout: MutPtr): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelDeleteEventFlag(evId: SceUid): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelReferEventFlagStatus(event: SceUid, status: MutPtr): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelCreateMbx(name: ConstPtr, attr: UInt, option: MutPtr): SceUid =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelDeleteMbx(mbxId: SceUid): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelSendMbx(mbxId: SceUid, message: MutPtr): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelReceiveMbx(mbxId: SceUid, message: MutPtr, timeout: MutPtr): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelReceiveMbxCB(mbxId: SceUid, message: MutPtr, timeout: MutPtr): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelPollMbx(mbxId: SceUid, pmessage: MutPtr): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelCancelReceiveMbx(mbxId: SceUid, num: MutPtr): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelReferMbxStatus(mbxId: SceUid, info: MutPtr): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelSetAlarm(clock: UInt, handler: SceKernelAlarmHandler, common: MutPtr): SceUid =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelSetSysClockAlarm(clock: MutPtr, handler: MutPtr, common: MutPtr): SceUid =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelCancelAlarm(alarmId: SceUid): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelReferAlarmStatus(alarmId: SceUid, info: MutPtr): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelCreateCallback(name: ConstPtr, func: SceKernelCallbackFunction, arg: MutPtr): SceUid =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelReferCallbackStatus(cb: SceUid, status: MutPtr): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelDeleteCallback(cb: SceUid): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelNotifyCallback(cb: SceUid, arg2: Int): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelCancelCallback(cb: SceUid): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelGetCallbackCount(cb: SceUid): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelCheckCallback(): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceKernelCheckCallback() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelGetThreadmanIdList(type: SceKernelIdListType, readBuf: MutPtr, readBufSize: Int, idCount: MutPtr): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelReferSystemStatus(status: MutPtr): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceKernelReferSystemStatus(status.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelCreateMsgPipe(name: ConstPtr, part: Int, attr: Int, unk1: MutPtr, opt: MutPtr): SceUid =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelDeleteMsgPipe(uid: SceUid): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelSendMsgPipe(uid: SceUid, message: MutPtr, size: UInt, unk1: Int, unk2: MutPtr, timeout: MutPtr): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelSendMsgPipeCB(uid: SceUid, message: MutPtr, size: UInt, unk1: Int, unk2: MutPtr, timeout: MutPtr): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelTrySendMsgPipe(uid: SceUid, message: MutPtr, size: UInt, unk1: Int, unk2: MutPtr): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelReceiveMsgPipe(uid: SceUid, message: MutPtr, size: UInt, unk1: Int, unk2: MutPtr, timeout: MutPtr): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelReceiveMsgPipeCB(uid: SceUid, message: MutPtr, size: UInt, unk1: Int, unk2: MutPtr, timeout: MutPtr): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelTryReceiveMsgPipe(uid: SceUid, message: MutPtr, size: UInt, unk1: Int, unk2: MutPtr): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelCancelMsgPipe(uid: SceUid, send: MutPtr, recv: MutPtr): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelReferMsgPipeStatus(uid: SceUid, info: MutPtr): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelCreateVpl(name: ConstPtr, part: Int, attr: Int, size: UInt, opt: MutPtr): SceUid =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelDeleteVpl(uid: SceUid): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelAllocateVpl(uid: SceUid, size: UInt, data: MutPtr, timeout: MutPtr): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelAllocateVplCB(uid: SceUid, size: UInt, data: MutPtr, timeout: MutPtr): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelTryAllocateVpl(uid: SceUid, size: UInt, data: MutPtr): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelFreeVpl(uid: SceUid, data: MutPtr): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelCancelVpl(uid: SceUid, num: MutPtr): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelReferVplStatus(uid: SceUid, info: MutPtr): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelCreateFpl(name: ConstPtr, part: Int, attr: Int, size: UInt, blocks: UInt, opt: MutPtr): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceKernelCreateFpl(name.rawAddress.toString(), part, attr, size.toInt(), blocks.toInt(), opt.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelDeleteFpl(uid: SceUid): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelAllocateFpl(uid: SceUid, data: MutPtr, timeout: MutPtr): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelAllocateFplCB(uid: SceUid, data: MutPtr, timeout: MutPtr): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelTryAllocateFpl(uid: SceUid, data: MutPtr): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelFreeFpl(uid: SceUid, data: MutPtr): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelCancelFpl(uid: SceUid, pnum: MutPtr): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelReferFplStatus(uid: SceUid, info: MutPtr): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelUSec2SysClock(usec: UInt, clock: MutPtr): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceKernelUSec2SysClock(usec.toInt(), clock.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelUSec2SysClockWide(usec: UInt): Long =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceKernelUSec2SysClockWide(usec.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelSysClock2USec(clock: MutPtr, low: MutPtr, high: MutPtr): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceKernelSysClock2USec(clock.rawAddress.toString(), low.rawAddress.toString(), high.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelSysClock2USecWide(clock: Long, low: MutPtr, high: MutPtr): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceKernelSysClock2USecWide(clock.toString(), low.rawAddress.toString(), high.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelGetSystemTime(time: MutPtr): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceKernelGetSystemTime(time.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelGetSystemTimeWide(): Long =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceKernelGetSystemTimeWide() as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelGetSystemTimeLow(): UInt =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceKernelGetSystemTimeLow() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelCreateVTimer(name: ConstPtr, opt: MutPtr): SceUid =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelDeleteVTimer(uid: SceUid): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelGetVTimerBase(uid: SceUid, base: MutPtr): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelGetVTimerBaseWide(uid: SceUid): Long =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelGetVTimerTime(uid: SceUid, time: MutPtr): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelGetVTimerTimeWide(uid: SceUid): Long =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelSetVTimerTime(uid: SceUid, time: MutPtr): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelSetVTimerTimeWide(uid: SceUid, time: Long): Long =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelStartVTimer(uid: SceUid): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelStopVTimer(uid: SceUid): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelSetVTimerHandler(uid: SceUid, time: MutPtr, handler: SceKernelVTimerHandler, common: MutPtr): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelSetVTimerHandlerWide(uid: SceUid, time: Long, handler: SceKernelVTimerHandlerWide, common: MutPtr): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelCancelVTimerHandler(uid: SceUid): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelReferVTimerStatus(uid: SceUid, info: MutPtr): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelRegisterThreadEventHandler(name: ConstPtr, threadId: SceUid, mask: Int, handler: SceKernelThreadEventHandler, common: MutPtr): SceUid =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelReleaseThreadEventHandler(uid: SceUid): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelReferThreadEventHandlerStatus(uid: SceUid, info: MutPtr): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelReferThreadProfiler(): MutPtr =
    if (pspNapiAddon != null) MutPtr((pspNapiAddon.libcPspSceKernelReferThreadProfiler() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelReferGlobalProfiler(): MutPtr =
    if (pspNapiAddon != null) MutPtr((pspNapiAddon.libcPspSceKernelReferGlobalProfiler() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUsbStart(driverName: ConstPtr, size: Int, args: MutPtr): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceUsbStart(driverName.rawAddress.toString(), size, args.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUsbStop(driverName: ConstPtr, size: Int, args: MutPtr): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceUsbStop(driverName.rawAddress.toString(), size, args.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUsbActivate(pid: UInt): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceUsbActivate(pid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUsbDeactivate(pid: UInt): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceUsbDeactivate(pid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUsbGetState(): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceUsbGetState() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUsbGetDrvState(driverName: ConstPtr): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceUsbGetDrvState(driverName.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUsbCamSetupStill(param: MutPtr): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceUsbCamSetupStill(param.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUsbCamSetupStillEx(param: MutPtr): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceUsbCamSetupStillEx(param.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUsbCamStillInputBlocking(buf: MutPtr, size: ULong): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceUsbCamStillInputBlocking(buf.rawAddress.toString(), size.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUsbCamStillInput(buf: MutPtr, size: ULong): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceUsbCamStillInput(buf.rawAddress.toString(), size.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUsbCamStillWaitInputEnd(): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceUsbCamStillWaitInputEnd() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUsbCamStillPollInputEnd(): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceUsbCamStillPollInputEnd() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUsbCamStillCancelInput(): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceUsbCamStillCancelInput() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUsbCamStillGetInputLength(): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceUsbCamStillGetInputLength() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUsbCamSetupVideo(param: MutPtr, workArea: MutPtr, workAreaSize: Int): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceUsbCamSetupVideo(param.rawAddress.toString(), workArea.rawAddress.toString(), workAreaSize) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUsbCamSetupVideoEx(param: MutPtr, workArea: MutPtr, workAreaSize: Int): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceUsbCamSetupVideoEx(param.rawAddress.toString(), workArea.rawAddress.toString(), workAreaSize) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUsbCamStartVideo(): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceUsbCamStartVideo() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUsbCamStopVideo(): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceUsbCamStopVideo() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUsbCamReadVideoFrameBlocking(buf: MutPtr, size: ULong): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceUsbCamReadVideoFrameBlocking(buf.rawAddress.toString(), size.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUsbCamReadVideoFrame(buf: MutPtr, size: ULong): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceUsbCamReadVideoFrame(buf.rawAddress.toString(), size.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUsbCamWaitReadVideoFrameEnd(): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceUsbCamWaitReadVideoFrameEnd() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUsbCamPollReadVideoFrameEnd(): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceUsbCamPollReadVideoFrameEnd() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUsbCamGetReadVideoFrameSize(): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceUsbCamGetReadVideoFrameSize() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUsbCamSetSaturation(saturation: Int): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceUsbCamSetSaturation(saturation) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUsbCamSetBrightness(brightness: Int): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceUsbCamSetBrightness(brightness) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUsbCamSetContrast(contrast: Int): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceUsbCamSetContrast(contrast) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUsbCamSetSharpness(sharpness: Int): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceUsbCamSetSharpness(sharpness) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUsbCamSetImageEffectMode(effectMode: UsbCamEffectMode): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUsbCamSetEvLevel(exposureLevel: UsbCamEvLevel): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUsbCamSetReverseMode(reverseFlags: Int): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceUsbCamSetReverseMode(reverseFlags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUsbCamSetZoom(zoom: Int): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceUsbCamSetZoom(zoom) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUsbCamGetSaturation(saturation: MutPtr): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceUsbCamGetSaturation(saturation.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUsbCamGetBrightness(brightness: MutPtr): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceUsbCamGetBrightness(brightness.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUsbCamGetContrast(contrast: MutPtr): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceUsbCamGetContrast(contrast.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUsbCamGetSharpness(sharpness: MutPtr): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceUsbCamGetSharpness(sharpness.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUsbCamGetImageEffectMode(effectMode: MutPtr): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceUsbCamGetImageEffectMode(effectMode.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUsbCamGetEvLevel(exposureLevel: MutPtr): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceUsbCamGetEvLevel(exposureLevel.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUsbCamGetReverseMode(reverseFlags: MutPtr): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceUsbCamGetReverseMode(reverseFlags.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUsbCamGetZoom(zoom: MutPtr): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceUsbCamGetZoom(zoom.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUsbCamAutoImageReverseSW(on: Int): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceUsbCamAutoImageReverseSW(on) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUsbCamGetAutoImageReverseState(): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceUsbCamGetAutoImageReverseState() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUsbCamGetLensDirection(): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceUsbCamGetLensDirection() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUsbstorBootRegisterNotify(eventFlag: SceUid): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUsbstorBootUnregisterNotify(eventFlag: UInt): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceUsbstorBootUnregisterNotify(eventFlag.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUsbstorBootSetCapacity(size: UInt): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceUsbstorBootSetCapacity(size.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scePowerRegisterCallback(slot: Int, cbid: SceUid): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scePowerUnregisterCallback(slot: Int): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspScePowerUnregisterCallback(slot) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scePowerIsPowerOnline(): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspScePowerIsPowerOnline() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scePowerIsBatteryExist(): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspScePowerIsBatteryExist() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scePowerIsBatteryCharging(): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspScePowerIsBatteryCharging() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scePowerGetBatteryChargingStatus(): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspScePowerGetBatteryChargingStatus() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scePowerIsLowBattery(): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspScePowerIsLowBattery() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scePowerGetBatteryLifePercent(): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspScePowerGetBatteryLifePercent() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scePowerGetBatteryLifeTime(): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspScePowerGetBatteryLifeTime() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scePowerGetBatteryTemp(): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspScePowerGetBatteryTemp() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scePowerGetBatteryElec(): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspScePowerGetBatteryElec() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scePowerGetBatteryVolt(): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspScePowerGetBatteryVolt() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scePowerSetCpuClockFrequency(cpufreq: Int): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspScePowerSetCpuClockFrequency(cpufreq) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scePowerSetBusClockFrequency(busfreq: Int): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspScePowerSetBusClockFrequency(busfreq) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scePowerGetCpuClockFrequency(): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspScePowerGetCpuClockFrequency() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scePowerGetCpuClockFrequencyInt(): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspScePowerGetCpuClockFrequencyInt() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scePowerGetCpuClockFrequencyFloat(): Float =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspScePowerGetCpuClockFrequencyFloat() as Double).toFloat() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scePowerGetBusClockFrequency(): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspScePowerGetBusClockFrequency() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scePowerGetBusClockFrequencyInt(): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspScePowerGetBusClockFrequencyInt() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scePowerGetBusClockFrequencyFloat(): Float =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspScePowerGetBusClockFrequencyFloat() as Double).toFloat() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scePowerSetClockFrequency(pllfreq: Int, cpufreq: Int, busfreq: Int): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspScePowerSetClockFrequency(pllfreq, cpufreq, busfreq) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scePowerLock(unknown: Int): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspScePowerLock(unknown) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scePowerUnlock(unknown: Int): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspScePowerUnlock(unknown) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scePowerTick(t: PowerTick): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scePowerGetIdleTimer(): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspScePowerGetIdleTimer() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scePowerIdleTimerEnable(unknown: Int): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspScePowerIdleTimerEnable(unknown) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scePowerIdleTimerDisable(unknown: Int): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspScePowerIdleTimerDisable(unknown) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scePowerRequestStandby(): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspScePowerRequestStandby() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scePowerRequestSuspend(): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspScePowerRequestSuspend() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceWlanDevIsPowerOn(): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceWlanDevIsPowerOn() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceWlanGetSwitchState(): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceWlanGetSwitchState() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceWlanGetEtherAddr(etherAddr: MutPtr): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceWlanGetEtherAddr(etherAddr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceWlanDevAttach(): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceWlanDevAttach() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceWlanDevDetach(): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceWlanDevDetach() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceRtcGetTickResolution(): UInt =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceRtcGetTickResolution() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceRtcGetCurrentTick(tick: MutPtr): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceRtcGetCurrentTick(tick.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceRtcGetCurrentClock(tm: MutPtr, tz: Int): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceRtcGetCurrentClock(tm.rawAddress.toString(), tz) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceRtcGetCurrentClockLocalTime(tm: MutPtr): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceRtcGetCurrentClockLocalTime(tm.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceRtcConvertUtcToLocalTime(tickUtc: ConstPtr, tickLocal: MutPtr): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceRtcConvertUtcToLocalTime(tickUtc.rawAddress.toString(), tickLocal.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceRtcConvertLocalTimeToUTC(tickLocal: ConstPtr, tickUtc: MutPtr): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceRtcConvertLocalTimeToUTC(tickLocal.rawAddress.toString(), tickUtc.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceRtcIsLeapYear(year: Int): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceRtcIsLeapYear(year) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceRtcGetDaysInMonth(year: Int, month: Int): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceRtcGetDaysInMonth(year, month) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceRtcGetDayOfWeek(year: Int, month: Int, day: Int): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceRtcGetDayOfWeek(year, month, day) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceRtcCheckValid(date: ConstPtr): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceRtcCheckValid(date.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceRtcSetTick(date: MutPtr, tick: ConstPtr): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceRtcSetTick(date.rawAddress.toString(), tick.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceRtcGetTick(date: ConstPtr, tick: MutPtr): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceRtcGetTick(date.rawAddress.toString(), tick.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceRtcCompareTick(tick1: ConstPtr, tick2: ConstPtr): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceRtcCompareTick(tick1.rawAddress.toString(), tick2.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceRtcTickAddTicks(destTick: MutPtr, srcTick: ConstPtr, numTicks: ULong): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceRtcTickAddTicks(destTick.rawAddress.toString(), srcTick.rawAddress.toString(), numTicks.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceRtcTickAddMicroseconds(destTick: MutPtr, srcTick: ConstPtr, numMs: ULong): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceRtcTickAddMicroseconds(destTick.rawAddress.toString(), srcTick.rawAddress.toString(), numMs.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceRtcTickAddSeconds(destTick: MutPtr, srcTick: ConstPtr, numSeconds: ULong): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceRtcTickAddSeconds(destTick.rawAddress.toString(), srcTick.rawAddress.toString(), numSeconds.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceRtcTickAddMinutes(destTick: MutPtr, srcTick: ConstPtr, numMinutes: ULong): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceRtcTickAddMinutes(destTick.rawAddress.toString(), srcTick.rawAddress.toString(), numMinutes.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceRtcTickAddHours(destTick: MutPtr, srcTick: ConstPtr, numHours: ULong): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceRtcTickAddHours(destTick.rawAddress.toString(), srcTick.rawAddress.toString(), numHours.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceRtcTickAddDays(destTick: MutPtr, srcTick: ConstPtr, numDays: ULong): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceRtcTickAddDays(destTick.rawAddress.toString(), srcTick.rawAddress.toString(), numDays.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceRtcTickAddWeeks(destTick: MutPtr, srcTick: ConstPtr, numWeeks: ULong): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceRtcTickAddWeeks(destTick.rawAddress.toString(), srcTick.rawAddress.toString(), numWeeks.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceRtcTickAddMonths(destTick: MutPtr, srcTick: ConstPtr, numMonths: ULong): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceRtcTickAddMonths(destTick.rawAddress.toString(), srcTick.rawAddress.toString(), numMonths.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceRtcTickAddYears(destTick: MutPtr, srcTick: ConstPtr, numYears: ULong): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceRtcTickAddYears(destTick.rawAddress.toString(), srcTick.rawAddress.toString(), numYears.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceRtcSetTimeT(date: MutPtr, time: UInt): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceRtcSetTimeT(date.rawAddress.toString(), time.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceRtcGetTimeT(date: ConstPtr, time: MutPtr): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceRtcGetTimeT(date.rawAddress.toString(), time.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceRtcSetTime64T(date: MutPtr, time: ULong): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceRtcSetTime64T(date.rawAddress.toString(), time.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceRtcGetTime64T(date: ConstPtr, time: MutPtr): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceRtcGetTime64T(date.rawAddress.toString(), time.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceRtcSetDosTime(date: MutPtr, dosTime: UInt): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceRtcSetDosTime(date.rawAddress.toString(), dosTime.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceRtcGetDosTime(date: MutPtr, dosTime: UInt): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceRtcGetDosTime(date.rawAddress.toString(), dosTime.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceRtcSetWin32FileTime(date: MutPtr, time: MutPtr): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceRtcSetWin32FileTime(date.rawAddress.toString(), time.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceRtcGetWin32FileTime(date: MutPtr, time: MutPtr): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceRtcGetWin32FileTime(date.rawAddress.toString(), time.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceRtcParseDateTime(destTick: MutPtr, dateString: ConstPtr): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceRtcParseDateTime(destTick.rawAddress.toString(), dateString.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceRtcFormatRFC3339(pszDateTime: MutPtr, pUtc: ConstPtr, timeZoneMinutes: Int): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceRtcFormatRFC3339(pszDateTime.rawAddress.toString(), pUtc.rawAddress.toString(), timeZoneMinutes) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceRtcFormatRFC3339LocalTime(pszDateTime: MutPtr, pUtc: ConstPtr): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceRtcFormatRFC3339LocalTime(pszDateTime.rawAddress.toString(), pUtc.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceRtcParseRFC3339(pUtc: MutPtr, pszDateTime: ConstPtr): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceRtcParseRFC3339(pUtc.rawAddress.toString(), pszDateTime.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceRtcFormatRFC2822(pszDateTime: MutPtr, pUtc: ConstPtr, timeZoneMinutes: Int): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceRtcFormatRFC2822(pszDateTime.rawAddress.toString(), pUtc.rawAddress.toString(), timeZoneMinutes) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceRtcFormatRFC2822LocalTime(pszDateTime: MutPtr, pUtc: ConstPtr): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceRtcFormatRFC2822LocalTime(pszDateTime.rawAddress.toString(), pUtc.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceIoOpen(file: ConstPtr, flags: Int, permissions: IoPermissions): SceUid =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceIoOpenAsync(file: ConstPtr, flags: Int, permissions: IoPermissions): SceUid =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceIoClose(fd: SceUid): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceIoCloseAsync(fd: SceUid): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceIoRead(fd: SceUid, data: MutPtr, size: UInt): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceIoReadAsync(fd: SceUid, data: MutPtr, size: UInt): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceIoWrite(fd: SceUid, data: ConstPtr, size: ULong): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceIoWriteAsync(fd: SceUid, data: ConstPtr, size: UInt): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceIoLseek(fd: SceUid, offset: Long, whence: IoWhence): Long =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceIoLseekAsync(fd: SceUid, offset: Long, whence: IoWhence): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceIoLseek32(fd: SceUid, offset: Int, whence: IoWhence): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceIoLseek32Async(fd: SceUid, offset: Int, whence: IoWhence): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceIoRemove(file: ConstPtr): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceIoRemove(file.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceIoMkdir(dir: ConstPtr, mode: IoPermissions): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceIoMkdir(dir.rawAddress.toString(), mode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceIoRmdir(path: ConstPtr): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceIoRmdir(path.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceIoChdir(path: ConstPtr): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceIoChdir(path.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceIoRename(oldname: ConstPtr, newname: ConstPtr): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceIoRename(oldname.rawAddress.toString(), newname.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceIoDopen(dirname: ConstPtr): SceUid =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceIoDread(fd: SceUid, dir: MutPtr): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceIoDclose(fd: SceUid): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceIoDevctl(dev: ConstPtr, cmd: UInt, indata: MutPtr, inlen: Int, outdata: MutPtr, outlen: Int): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceIoDevctl(dev.rawAddress.toString(), cmd.toInt(), indata.rawAddress.toString(), inlen, outdata.rawAddress.toString(), outlen) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceIoAssign(dev1: ConstPtr, dev2: ConstPtr, dev3: ConstPtr, mode: IoAssignPerms, unk1: MutPtr, unk2: Int): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceIoUnassign(dev: ConstPtr): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceIoUnassign(dev.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceIoGetstat(file: ConstPtr, stat: MutPtr): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceIoGetstat(file.rawAddress.toString(), stat.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceIoChstat(file: ConstPtr, stat: MutPtr, bits: Int): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceIoChstat(file.rawAddress.toString(), stat.rawAddress.toString(), bits) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceIoIoctl(fd: SceUid, cmd: UInt, indata: MutPtr, inlen: Int, outdata: MutPtr, outlen: Int): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceIoIoctlAsync(fd: SceUid, cmd: UInt, indata: MutPtr, inlen: Int, outdata: MutPtr, outlen: Int): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceIoSync(device: ConstPtr, unk: UInt): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceIoSync(device.rawAddress.toString(), unk.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceIoWaitAsync(fd: SceUid, res: MutPtr): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceIoWaitAsyncCB(fd: SceUid, res: MutPtr): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceIoPollAsync(fd: SceUid, res: MutPtr): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceIoGetAsyncStat(fd: SceUid, poll: Int, res: MutPtr): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceIoCancel(fd: SceUid): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceIoGetDevType(fd: SceUid): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceIoChangeAsyncPriority(fd: SceUid, pri: Int): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceIoSetAsyncCallback(fd: SceUid, cb: SceUid, argp: MutPtr): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceJpegInitMJpeg(): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceJpegInitMJpeg() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceJpegFinishMJpeg(): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceJpegFinishMJpeg() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceJpegCreateMJpeg(width: Int, height: Int): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceJpegCreateMJpeg(width, height) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceJpegDeleteMJpeg(): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceJpegDeleteMJpeg() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceJpegDecodeMJpeg(jpegBuf: MutPtr, size: ULong, rgba: MutPtr, unk: UInt): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceJpegDecodeMJpeg(jpegBuf.rawAddress.toString(), size.toString(), rgba.rawAddress.toString(), unk.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUmdCheckMedium(): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceUmdCheckMedium() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUmdGetDiscInfo(info: MutPtr): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceUmdGetDiscInfo(info.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUmdActivate(unit: Int, drive: ConstPtr): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceUmdActivate(unit, drive.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUmdDeactivate(unit: Int, drive: ConstPtr): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceUmdDeactivate(unit, drive.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUmdWaitDriveStat(state: Int): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceUmdWaitDriveStat(state) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUmdWaitDriveStatWithTimer(state: Int, timeout: UInt): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceUmdWaitDriveStatWithTimer(state, timeout.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUmdWaitDriveStatCB(state: Int, timeout: UInt): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceUmdWaitDriveStatCB(state, timeout.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUmdCancelWaitDriveStat(): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceUmdCancelWaitDriveStat() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUmdGetDriveStat(): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceUmdGetDriveStat() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUmdGetErrorStat(): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceUmdGetErrorStat() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUmdRegisterUMDCallBack(cbid: Int): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceUmdRegisterUMDCallBack(cbid) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUmdUnRegisterUMDCallBack(cbid: Int): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceUmdUnRegisterUMDCallBack(cbid) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUmdReplacePermit(): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceUmdReplacePermit() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUmdReplaceProhibit(): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceUmdReplaceProhibit() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceMpegInit(): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceMpegInit() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceMpegFinish() {
    if (pspNapiAddon != null) {
        pspNapiAddon.libcPspSceMpegFinish()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceMpegRingbufferQueryMemSize(packets: Int): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceMpegRingbufferQueryMemSize(packets) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceMpegRingbufferConstruct(ringbuffer: MutPtr, packets: Int, data: MutPtr, size: Int, callback: SceMpegRingbufferCb, cbParam: MutPtr): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceMpegRingbufferConstruct(ringbuffer.rawAddress.toString(), packets, data.rawAddress.toString(), size, 0L.toString(), cbParam.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceMpegRingbufferDestruct(ringbuffer: MutPtr) {
    if (pspNapiAddon != null) {
        pspNapiAddon.libcPspSceMpegRingbufferDestruct(ringbuffer.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceMpegRingbufferAvailableSize(ringbuffer: MutPtr): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceMpegRingbufferAvailableSize(ringbuffer.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceMpegRingbufferPut(ringbuffer: MutPtr, numPackets: Int, available: Int): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceMpegRingbufferPut(ringbuffer.rawAddress.toString(), numPackets, available) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceMpegQueryMemSize(unk: Int): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceMpegQueryMemSize(unk) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceMpegCreate(handle: SceMpeg, data: MutPtr, size: Int, ringbuffer: MutPtr, frameWidth: Int, unk1: Int, unk2: Int): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceMpegDelete(handle: SceMpeg): Unit = throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceMpegQueryStreamOffset(handle: SceMpeg, buffer: MutPtr, offset: MutPtr): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceMpegQueryStreamSize(buffer: MutPtr, size: MutPtr): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceMpegQueryStreamSize(buffer.rawAddress.toString(), size.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceMpegRegistStream(handle: SceMpeg, streamId: Int, unk: Int): SceMpegStream =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceMpegUnRegistStream(handle: SceMpeg, stream: SceMpegStream): Unit = throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceMpegFlushAllStream(handle: SceMpeg): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceMpegMallocAvcEsBuf(handle: SceMpeg): MutPtr =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceMpegFreeAvcEsBuf(handle: SceMpeg, buf: MutPtr): Unit = throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceMpegQueryAtracEsSize(handle: SceMpeg, esSize: MutPtr, outSize: MutPtr): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceMpegInitAu(handle: SceMpeg, esBuffer: MutPtr, au: MutPtr): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceMpegGetAvcAu(handle: SceMpeg, stream: SceMpegStream, au: MutPtr, unk: MutPtr): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceMpegAvcDecodeMode(handle: SceMpeg, mode: MutPtr): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceMpegAvcDecode(handle: SceMpeg, au: MutPtr, iframeWidth: Int, buffer: MutPtr, init: MutPtr): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceMpegAvcDecodeStop(handle: SceMpeg, frameWidth: Int, buffer: MutPtr, status: MutPtr): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceMpegGetAtracAu(handle: SceMpeg, stream: SceMpegStream, au: MutPtr, unk: MutPtr): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceMpegAtracDecode(handle: SceMpeg, au: MutPtr, buffer: MutPtr, init: Int): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceMpegBaseYCrCbCopyVme(yuvBuffer: MutPtr, buffer: MutPtr, type: Int): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceMpegBaseYCrCbCopyVme(yuvBuffer.rawAddress.toString(), buffer.rawAddress.toString(), type) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceMpegBaseCscInit(width: Int): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceMpegBaseCscInit(width) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceMpegBaseCscVme(rgbBuffer: MutPtr, rgbBuffer2: MutPtr, width: Int, yCrCbBuffer: MutPtr): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceMpegBaseCscVme(rgbBuffer.rawAddress.toString(), rgbBuffer2.rawAddress.toString(), width, yCrCbBuffer.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceMpegbaseBea18f91(lli: MutPtr): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceMpegbaseBea18f91(lli.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceHprmPeekCurrentKey(key: MutPtr): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceHprmPeekCurrentKey(key.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceHprmPeekLatch(latch: MutPtr): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceHprmPeekLatch(latch.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceHprmReadLatch(latch: MutPtr): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceHprmReadLatch(latch.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceHprmIsHeadphoneExist(): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceHprmIsHeadphoneExist() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceHprmIsRemoteExist(): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceHprmIsRemoteExist() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceHprmIsMicrophoneExist(): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceHprmIsMicrophoneExist() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGuDepthBuffer(zbp: MutPtr, zbw: Int) {
    if (pspNapiAddon != null) {
        pspNapiAddon.libcPspSceGuDepthBuffer(zbp.rawAddress.toString(), zbw)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGuDispBuffer(width: Int, height: Int, dispbp: MutPtr, dispbw: Int) {
    if (pspNapiAddon != null) {
        pspNapiAddon.libcPspSceGuDispBuffer(width, height, dispbp.rawAddress.toString(), dispbw)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGuDrawBuffer(psm: DisplayPixelFormat, fbp: MutPtr, fbw: Int): Unit = throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGuDrawBufferList(psm: DisplayPixelFormat, fbp: MutPtr, fbw: Int): Unit = throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGuDisplay(state: Boolean): Boolean =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceGuDisplay(state) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGuDepthFunc(function: DepthFunc): Unit = throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGuDepthMask(mask: Int) {
    if (pspNapiAddon != null) {
        pspNapiAddon.libcPspSceGuDepthMask(mask)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGuDepthOffset(offset: Int) {
    if (pspNapiAddon != null) {
        pspNapiAddon.libcPspSceGuDepthOffset(offset)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGuDepthRange(near: Int, far: Int) {
    if (pspNapiAddon != null) {
        pspNapiAddon.libcPspSceGuDepthRange(near, far)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGuFog(near: Float, far: Float, color: UInt) {
    if (pspNapiAddon != null) {
        pspNapiAddon.libcPspSceGuFog(near.toDouble(), far.toDouble(), color.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGuInit() {
    if (pspNapiAddon != null) {
        pspNapiAddon.libcPspSceGuInit()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGuTerm() {
    if (pspNapiAddon != null) {
        pspNapiAddon.libcPspSceGuTerm()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGuBreak(mode: Int) {
    if (pspNapiAddon != null) {
        pspNapiAddon.libcPspSceGuBreak(mode)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGuContinue() {
    if (pspNapiAddon != null) {
        pspNapiAddon.libcPspSceGuContinue()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGuSetCallback(signal: GuCallbackId, callback: GuCallback): GuCallback =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGuSignal(behavior: SignalBehavior, signal: Int): Unit = throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGuSendCommandf(cmd: GeCommand, argument: Float): Unit = throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGuSendCommandi(cmd: GeCommand, argument: Int): Unit = throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGuGetMemory(size: Int): MutPtr =
    if (pspNapiAddon != null) MutPtr((pspNapiAddon.libcPspSceGuGetMemory(size) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGuStart(contextType: GuContextType, list: MutPtr): Unit = throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGuFinish(): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceGuFinish() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGuFinishId(id: UInt): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceGuFinishId(id.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGuCallList(list: ConstPtr) {
    if (pspNapiAddon != null) {
        pspNapiAddon.libcPspSceGuCallList(list.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGuCallMode(mode: Int) {
    if (pspNapiAddon != null) {
        pspNapiAddon.libcPspSceGuCallMode(mode)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGuCheckList(): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceGuCheckList() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGuSendList(mode: GuQueueMode, list: ConstPtr, context: MutPtr): Unit = throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGuSwapBuffers(): MutPtr =
    if (pspNapiAddon != null) MutPtr((pspNapiAddon.libcPspSceGuSwapBuffers() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGuSync(mode: GuSyncMode, behavior: GuSyncBehavior): GeListState =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGuDrawArray(prim: GuPrimitive, vtype: Int, count: Int, indices: ConstPtr, vertices: ConstPtr): Unit = throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGuBeginObject(vtype: Int, count: Int, indices: ConstPtr, vertices: ConstPtr) {
    if (pspNapiAddon != null) {
        pspNapiAddon.libcPspSceGuBeginObject(vtype, count, indices.rawAddress.toString(), vertices.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGuEndObject() {
    if (pspNapiAddon != null) {
        pspNapiAddon.libcPspSceGuEndObject()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGuSetStatus(state: GuState, status: Int): Unit = throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGuGetStatus(state: GuState): Boolean =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGuSetAllStatus(status: Int) {
    if (pspNapiAddon != null) {
        pspNapiAddon.libcPspSceGuSetAllStatus(status)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGuGetAllStatus(): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceGuGetAllStatus() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGuEnable(state: GuState): Unit = throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGuDisable(state: GuState): Unit = throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGuLight(light: Int, type: LightType, components: Int, position: ScePspFVector3): Unit = throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGuLightAtt(light: Int, atten0: Float, atten1: Float, atten2: Float) {
    if (pspNapiAddon != null) {
        pspNapiAddon.libcPspSceGuLightAtt(light, atten0.toDouble(), atten1.toDouble(), atten2.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGuLightColor(light: Int, component: Int, color: UInt) {
    if (pspNapiAddon != null) {
        pspNapiAddon.libcPspSceGuLightColor(light, component, color.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGuLightMode(mode: LightMode): Unit = throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGuLightSpot(light: Int, direction: ScePspFVector3, exponent: Float, cutoff: Float): Unit = throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGuClear(flags: Int) {
    if (pspNapiAddon != null) {
        pspNapiAddon.libcPspSceGuClear(flags)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGuClearColor(color: UInt) {
    if (pspNapiAddon != null) {
        pspNapiAddon.libcPspSceGuClearColor(color.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGuClearDepth(depth: UInt) {
    if (pspNapiAddon != null) {
        pspNapiAddon.libcPspSceGuClearDepth(depth.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGuClearStencil(stencil: UInt) {
    if (pspNapiAddon != null) {
        pspNapiAddon.libcPspSceGuClearStencil(stencil.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGuPixelMask(mask: UInt) {
    if (pspNapiAddon != null) {
        pspNapiAddon.libcPspSceGuPixelMask(mask.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGuColor(color: UInt) {
    if (pspNapiAddon != null) {
        pspNapiAddon.libcPspSceGuColor(color.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGuColorFunc(func: ColorFunc, color: UInt, mask: UInt): Unit = throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGuColorMaterial(components: Int) {
    if (pspNapiAddon != null) {
        pspNapiAddon.libcPspSceGuColorMaterial(components)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGuAlphaFunc(func: AlphaFunc, value: Int, mask: Int): Unit = throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGuAmbient(color: UInt) {
    if (pspNapiAddon != null) {
        pspNapiAddon.libcPspSceGuAmbient(color.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGuAmbientColor(color: UInt) {
    if (pspNapiAddon != null) {
        pspNapiAddon.libcPspSceGuAmbientColor(color.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGuBlendFunc(op: BlendOp, src: BlendSrc, dest: BlendDst, srcFix: UInt, destFix: UInt): Unit = throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGuMaterial(components: Int, color: UInt) {
    if (pspNapiAddon != null) {
        pspNapiAddon.libcPspSceGuMaterial(components, color.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGuModelColor(emissive: UInt, ambient: UInt, diffuse: UInt, specular: UInt) {
    if (pspNapiAddon != null) {
        pspNapiAddon.libcPspSceGuModelColor(emissive.toInt(), ambient.toInt(), diffuse.toInt(), specular.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGuStencilFunc(func: StencilFunc, ref: Int, mask: Int): Unit = throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGuStencilOp(fail: StencilOperation, zfail: StencilOperation, zpass: StencilOperation): Unit = throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGuSpecular(power: Float) {
    if (pspNapiAddon != null) {
        pspNapiAddon.libcPspSceGuSpecular(power.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGuFrontFace(order: FrontFaceDirection): Unit = throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGuLogicalOp(op: LogicalOperation): Unit = throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGuSetDither(matrix: ScePspIMatrix4): Unit = throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGuShadeModel(mode: ShadingModel): Unit = throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGuCopyImage(psm: DisplayPixelFormat, sx: Int, sy: Int, width: Int, height: Int, srcw: Int, src: MutPtr, dx: Int, dy: Int, destw: Int, dest: MutPtr): Unit = throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGuTexEnvColor(color: UInt) {
    if (pspNapiAddon != null) {
        pspNapiAddon.libcPspSceGuTexEnvColor(color.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGuTexFilter(min: TextureFilter, mag: TextureFilter): Unit = throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGuTexFlush() {
    if (pspNapiAddon != null) {
        pspNapiAddon.libcPspSceGuTexFlush()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGuTexFunc(tfx: TextureEffect, tcc: TextureColorComponent): Unit = throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGuTexImage(mipmap: MipmapLevel, width: Int, height: Int, tbw: Int, tbp: ConstPtr): Unit = throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGuTexLevelMode(mode: TextureLevelMode, bias: Float): Unit = throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGuTexMapMode(mode: TextureMapMode, a1: UInt, a2: UInt): Unit = throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGuTexMode(tpsm: TexturePixelFormat, maxmips: Int, a2: Int, swizzle: Int): Unit = throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGuTexOffset(u: Float, v: Float) {
    if (pspNapiAddon != null) {
        pspNapiAddon.libcPspSceGuTexOffset(u.toDouble(), v.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGuTexProjMapMode(mode: TextureProjectionMapMode): Unit = throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGuTexScale(u: Float, v: Float) {
    if (pspNapiAddon != null) {
        pspNapiAddon.libcPspSceGuTexScale(u.toDouble(), v.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGuTexSlope(slope: Float) {
    if (pspNapiAddon != null) {
        pspNapiAddon.libcPspSceGuTexSlope(slope.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGuTexSync() {
    if (pspNapiAddon != null) {
        pspNapiAddon.libcPspSceGuTexSync()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGuTexWrap(u: GuTexWrapMode, v: GuTexWrapMode): Unit = throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGuClutLoad(numBlocks: Int, cbp: ConstPtr) {
    if (pspNapiAddon != null) {
        pspNapiAddon.libcPspSceGuClutLoad(numBlocks, cbp.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGuClutMode(cpsm: ClutPixelFormat, shift: UInt, mask: UInt, a3: UInt): Unit = throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGuOffset(x: UInt, y: UInt) {
    if (pspNapiAddon != null) {
        pspNapiAddon.libcPspSceGuOffset(x.toInt(), y.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGuScissor(x: Int, y: Int, w: Int, h: Int) {
    if (pspNapiAddon != null) {
        pspNapiAddon.libcPspSceGuScissor(x, y, w, h)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGuViewport(cx: Int, cy: Int, width: Int, height: Int) {
    if (pspNapiAddon != null) {
        pspNapiAddon.libcPspSceGuViewport(cx, cy, width, height)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGuDrawBezier(vType: Int, uCount: Int, vCount: Int, indices: ConstPtr, vertices: ConstPtr) {
    if (pspNapiAddon != null) {
        pspNapiAddon.libcPspSceGuDrawBezier(vType, uCount, vCount, indices.rawAddress.toString(), vertices.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGuPatchDivide(ulevel: UInt, vlevel: UInt) {
    if (pspNapiAddon != null) {
        pspNapiAddon.libcPspSceGuPatchDivide(ulevel.toInt(), vlevel.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGuPatchFrontFace(a0: UInt) {
    if (pspNapiAddon != null) {
        pspNapiAddon.libcPspSceGuPatchFrontFace(a0.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGuPatchPrim(prim: PatchPrimitive): Unit = throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGuDrawSpline(vType: Int, uCount: Int, vCount: Int, uEdge: Int, vEdge: Int, indices: ConstPtr, vertices: ConstPtr) {
    if (pspNapiAddon != null) {
        pspNapiAddon.libcPspSceGuDrawSpline(vType, uCount, vCount, uEdge, vEdge, indices.rawAddress.toString(), vertices.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGuSetMatrix(type: MatrixMode, matrix: ScePspFMatrix4): Unit = throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGuBoneMatrix(index: UInt, matrix: ScePspFMatrix4): Unit = throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGuMorphWeight(index: Int, weight: Float) {
    if (pspNapiAddon != null) {
        pspNapiAddon.libcPspSceGuMorphWeight(index, weight.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGuDrawArrayN(primitiveType: GuPrimitive, vType: Int, count: Int, a3: Int, indices: ConstPtr, vertices: ConstPtr): Unit = throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGumDrawArray(prim: GuPrimitive, vType: Int, count: Int, indices: ConstPtr, vertices: ConstPtr): Unit = throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGumDrawArrayN(prim: GuPrimitive, vType: Int, count: Int, a3: Int, indices: ConstPtr, vertices: ConstPtr): Unit = throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGumDrawBezier(vType: Int, uCount: Int, vCount: Int, indices: ConstPtr, vertices: ConstPtr) {
    if (pspNapiAddon != null) {
        pspNapiAddon.libcPspSceGumDrawBezier(vType, uCount, vCount, indices.rawAddress.toString(), vertices.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGumDrawSpline(vType: Int, uCount: Int, vCount: Int, uEdge: Int, vEdge: Int, indices: ConstPtr, vertices: ConstPtr) {
    if (pspNapiAddon != null) {
        pspNapiAddon.libcPspSceGumDrawSpline(vType, uCount, vCount, uEdge, vEdge, indices.rawAddress.toString(), vertices.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGumFastInverse() {
    if (pspNapiAddon != null) {
        pspNapiAddon.libcPspSceGumFastInverse()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGumFullInverse() {
    if (pspNapiAddon != null) {
        pspNapiAddon.libcPspSceGumFullInverse()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGumLoadIdentity() {
    if (pspNapiAddon != null) {
        pspNapiAddon.libcPspSceGumLoadIdentity()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGumLoadMatrix(m: ScePspFMatrix4): Unit = throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGumLookAt(eye: ScePspFVector3, center: ScePspFVector3, up: ScePspFVector3): Unit = throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGumMatrixMode(mode: MatrixMode): Unit = throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGumMultMatrix(m: ScePspFMatrix4): Unit = throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGumOrtho(left: Float, right: Float, bottom: Float, top: Float, near: Float, far: Float) {
    if (pspNapiAddon != null) {
        pspNapiAddon.libcPspSceGumOrtho(left.toDouble(), right.toDouble(), bottom.toDouble(), top.toDouble(), near.toDouble(), far.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGumPerspective(fovy: Float, aspect: Float, near: Float, far: Float) {
    if (pspNapiAddon != null) {
        pspNapiAddon.libcPspSceGumPerspective(fovy.toDouble(), aspect.toDouble(), near.toDouble(), far.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGumPopMatrix() {
    if (pspNapiAddon != null) {
        pspNapiAddon.libcPspSceGumPopMatrix()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGumPushMatrix() {
    if (pspNapiAddon != null) {
        pspNapiAddon.libcPspSceGumPushMatrix()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGumRotateX(angle: Float) {
    if (pspNapiAddon != null) {
        pspNapiAddon.libcPspSceGumRotateX(angle.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGumRotateY(angle: Float) {
    if (pspNapiAddon != null) {
        pspNapiAddon.libcPspSceGumRotateY(angle.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGumRotateZ(angle: Float) {
    if (pspNapiAddon != null) {
        pspNapiAddon.libcPspSceGumRotateZ(angle.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGumRotateXYZ(v: ScePspFVector3): Unit = throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGumRotateZYX(v: ScePspFVector3): Unit = throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGumScale(v: ScePspFVector3): Unit = throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGumStoreMatrix(m: ScePspFMatrix4): Unit = throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGumTranslate(v: ScePspFVector3): Unit = throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGumUpdateMatrix() {
    if (pspNapiAddon != null) {
        pspNapiAddon.libcPspSceGumUpdateMatrix()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceMp3ReserveMp3Handle(args: MutPtr): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceMp3ReserveMp3Handle(args.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceMp3ReleaseMp3Handle(handle: Mp3Handle): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceMp3InitResource(): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceMp3InitResource() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceMp3TermResource(): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceMp3TermResource() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceMp3Init(handle: Mp3Handle): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceMp3Decode(handle: Mp3Handle, dst: MutPtr): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceMp3GetInfoToAddStreamData(handle: Mp3Handle, dst: MutPtr, toWrite: MutPtr, srcPos: MutPtr): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceMp3NotifyAddStreamData(handle: Mp3Handle, size: Int): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceMp3CheckStreamDataNeeded(handle: Mp3Handle): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceMp3SetLoopNum(handle: Mp3Handle, loop: Int): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceMp3GetLoopNum(handle: Mp3Handle): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceMp3GetSumDecodedSample(handle: Mp3Handle): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceMp3GetMaxOutputSample(handle: Mp3Handle): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceMp3GetSamplingRate(handle: Mp3Handle): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceMp3GetBitRate(handle: Mp3Handle): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceMp3GetMp3ChannelNum(handle: Mp3Handle): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceMp3ResetPlayPosition(handle: Mp3Handle): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceRegOpenRegistry(reg: MutPtr, mode: Int, handle: MutPtr): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceRegOpenRegistry(reg.rawAddress.toString(), mode, handle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceRegFlushRegistry(handle: RegHandle): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceRegCloseRegistry(handle: RegHandle): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceRegOpenCategory(handle: RegHandle, name: ConstPtr, mode: Int, dirHandle: MutPtr): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceRegRemoveCategory(handle: RegHandle, name: ConstPtr): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceRegCloseCategory(dirHandle: RegHandle): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceRegFlushCategory(dirHandle: RegHandle): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceRegGetKeyInfo(dirHandle: RegHandle, name: ConstPtr, keyHandle: MutPtr, type: MutPtr, size: MutPtr): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceRegGetKeyInfoByName(dirHandle: RegHandle, name: ConstPtr, type: MutPtr, size: MutPtr): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceRegGetKeyValue(dirHandle: RegHandle, keyHandle: RegHandle, buf: MutPtr, size: ULong): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceRegGetKeyValueByName(dirHandle: RegHandle, name: ConstPtr, buf: MutPtr, size: ULong): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceRegSetKeyValue(dirHandle: RegHandle, name: ConstPtr, buf: ConstPtr, size: ULong): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceRegGetKeysNum(dirHandle: RegHandle, num: MutPtr): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceRegGetKeys(dirHandle: RegHandle, buf: MutPtr, num: Int): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceRegCreateKey(dirHandle: RegHandle, name: ConstPtr, type: Int, size: ULong): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceRegRemoveRegistry(key: MutPtr): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceRegRemoveRegistry(key.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceOpenPSIDGetOpenPSID(openpsid: MutPtr): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceOpenPSIDGetOpenPSID(openpsid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUtilityMsgDialogInitStart(params: MutPtr): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceUtilityMsgDialogInitStart(params.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUtilityMsgDialogShutdownStart() {
    if (pspNapiAddon != null) {
        pspNapiAddon.libcPspSceUtilityMsgDialogShutdownStart()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceUtilityMsgDialogGetStatus(): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceUtilityMsgDialogGetStatus() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUtilityMsgDialogUpdate(n: Int) {
    if (pspNapiAddon != null) {
        pspNapiAddon.libcPspSceUtilityMsgDialogUpdate(n)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceUtilityMsgDialogAbort(): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceUtilityMsgDialogAbort() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUtilityNetconfInitStart(data: MutPtr): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceUtilityNetconfInitStart(data.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUtilityNetconfShutdownStart(): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceUtilityNetconfShutdownStart() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUtilityNetconfUpdate(unknown: Int): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceUtilityNetconfUpdate(unknown) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUtilityNetconfGetStatus(): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceUtilityNetconfGetStatus() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUtilityCheckNetParam(id: Int): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceUtilityCheckNetParam(id) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUtilityGetNetParam(conf: Int, param: NetParam, data: MutPtr): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUtilitySavedataInitStart(params: MutPtr): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceUtilitySavedataInitStart(params.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUtilitySavedataGetStatus(): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceUtilitySavedataGetStatus() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUtilitySavedataShutdownStart(): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceUtilitySavedataShutdownStart() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUtilitySavedataUpdate(unknown: Int) {
    if (pspNapiAddon != null) {
        pspNapiAddon.libcPspSceUtilitySavedataUpdate(unknown)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceUtilityGameSharingInitStart(params: MutPtr): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceUtilityGameSharingInitStart(params.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUtilityGameSharingShutdownStart() {
    if (pspNapiAddon != null) {
        pspNapiAddon.libcPspSceUtilityGameSharingShutdownStart()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceUtilityGameSharingGetStatus(): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceUtilityGameSharingGetStatus() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUtilityGameSharingUpdate(n: Int) {
    if (pspNapiAddon != null) {
        pspNapiAddon.libcPspSceUtilityGameSharingUpdate(n)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceUtilityHtmlViewerInitStart(params: MutPtr): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceUtilityHtmlViewerInitStart(params.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUtilityHtmlViewerShutdownStart(): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceUtilityHtmlViewerShutdownStart() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUtilityHtmlViewerUpdate(n: Int): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceUtilityHtmlViewerUpdate(n) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUtilityHtmlViewerGetStatus(): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceUtilityHtmlViewerGetStatus() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUtilitySetSystemParamInt(id: SystemParamId, value: Int): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUtilitySetSystemParamString(id: SystemParamId, str: ConstPtr): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUtilityGetSystemParamInt(id: SystemParamId, value: MutPtr): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUtilityGetSystemParamString(id: SystemParamId, str: MutPtr, len: Int): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUtilityOskInitStart(params: MutPtr): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceUtilityOskInitStart(params.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUtilityOskShutdownStart(): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceUtilityOskShutdownStart() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUtilityOskUpdate(n: Int): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceUtilityOskUpdate(n) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUtilityOskGetStatus(): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceUtilityOskGetStatus() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUtilityLoadNetModule(module: NetModule): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUtilityUnloadNetModule(module: NetModule): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUtilityLoadAvModule(module: AvModule): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUtilityUnloadAvModule(module: AvModule): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUtilityLoadUsbModule(module: UsbModule): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUtilityUnloadUsbModule(module: UsbModule): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUtilityLoadModule(module: Module): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUtilityUnloadModule(module: Module): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUtilityCreateNetParam(conf: Int): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceUtilityCreateNetParam(conf) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUtilitySetNetParam(param: NetParam, value: ConstPtr): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUtilityCopyNetParam(src: Int, dest: Int): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceUtilityCopyNetParam(src, dest) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUtilityDeleteNetParam(conf: Int): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceUtilityDeleteNetParam(conf) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetInit(poolsize: Int, calloutprio: Int, calloutstack: Int, netintrprio: Int, netintrstack: Int): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceNetInit(poolsize, calloutprio, calloutstack, netintrprio, netintrstack) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetTerm(): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceNetTerm() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetFreeThreadinfo(thid: Int): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceNetFreeThreadinfo(thid) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetThreadAbort(thid: Int): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceNetThreadAbort(thid) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetEtherStrton(name: MutPtr, mac: MutPtr) {
    if (pspNapiAddon != null) {
        pspNapiAddon.libcPspSceNetEtherStrton(name.rawAddress.toString(), mac.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceNetEtherNtostr(mac: MutPtr, name: MutPtr) {
    if (pspNapiAddon != null) {
        pspNapiAddon.libcPspSceNetEtherNtostr(mac.rawAddress.toString(), name.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceNetGetLocalEtherAddr(mac: MutPtr): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceNetGetLocalEtherAddr(mac.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetGetMallocStat(stat: MutPtr): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceNetGetMallocStat(stat.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocctlInit(stacksize: Int, priority: Int, adhocId: MutPtr): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceNetAdhocctlInit(stacksize, priority, adhocId.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocctlTerm(): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceNetAdhocctlTerm() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocctlConnect(name: ConstPtr): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceNetAdhocctlConnect(name.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocctlDisconnect(): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceNetAdhocctlDisconnect() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocctlGetState(event: MutPtr): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceNetAdhocctlGetState(event.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocctlCreate(name: ConstPtr): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceNetAdhocctlCreate(name.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocctlJoin(scaninfo: MutPtr): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceNetAdhocctlJoin(scaninfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocctlGetAdhocId(id: MutPtr): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceNetAdhocctlGetAdhocId(id.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocctlCreateEnterGameMode(name: ConstPtr, unknown: Int, num: Int, macs: MutPtr, timeout: UInt, unknown2: Int): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceNetAdhocctlCreateEnterGameMode(name.rawAddress.toString(), unknown, num, macs.rawAddress.toString(), timeout.toInt(), unknown2) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocctlJoinEnterGameMode(name: ConstPtr, hostmac: MutPtr, timeout: UInt, unknown: Int): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceNetAdhocctlJoinEnterGameMode(name.rawAddress.toString(), hostmac.rawAddress.toString(), timeout.toInt(), unknown) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocctlGetGameModeInfo(gamemodeinfo: MutPtr): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceNetAdhocctlGetGameModeInfo(gamemodeinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocctlExitGameMode(): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceNetAdhocctlExitGameMode() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocctlGetPeerList(length: MutPtr, buf: MutPtr): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceNetAdhocctlGetPeerList(length.rawAddress.toString(), buf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocctlGetPeerInfo(mac: MutPtr, size: Int, peerinfo: MutPtr): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceNetAdhocctlGetPeerInfo(mac.rawAddress.toString(), size, peerinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocctlScan(): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceNetAdhocctlScan() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocctlGetScanInfo(length: MutPtr, buf: MutPtr): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceNetAdhocctlGetScanInfo(length.rawAddress.toString(), buf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocctlAddHandler(handler: SceNetAdhocctlHandler, unknown: MutPtr): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceNetAdhocctlAddHandler(0L.toString(), unknown.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocctlDelHandler(id: Int): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceNetAdhocctlDelHandler(id) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocctlGetNameByAddr(mac: MutPtr, nickname: MutPtr): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceNetAdhocctlGetNameByAddr(mac.rawAddress.toString(), nickname.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocctlGetAddrByName(nickname: MutPtr, length: MutPtr, buf: MutPtr): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceNetAdhocctlGetAddrByName(nickname.rawAddress.toString(), length.rawAddress.toString(), buf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocctlGetParameter(params: MutPtr): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceNetAdhocctlGetParameter(params.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocInit(): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceNetAdhocInit() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocTerm(): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceNetAdhocTerm() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocPdpCreate(mac: MutPtr, port: UShort, bufSize: UInt, unk1: Int): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceNetAdhocPdpCreate(mac.rawAddress.toString(), port.toInt(), bufSize.toInt(), unk1) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocPdpDelete(id: Int, unk1: Int): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceNetAdhocPdpDelete(id, unk1) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocPdpSend(id: Int, destMacAddr: MutPtr, port: UShort, data: MutPtr, len: UInt, timeout: UInt, nonblock: Int): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceNetAdhocPdpSend(id, destMacAddr.rawAddress.toString(), port.toInt(), data.rawAddress.toString(), len.toInt(), timeout.toInt(), nonblock) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocPdpRecv(id: Int, srcMacAddr: MutPtr, port: MutPtr, data: MutPtr, dataLength: MutPtr, timeout: UInt, nonblock: Int): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceNetAdhocPdpRecv(id, srcMacAddr.rawAddress.toString(), port.rawAddress.toString(), data.rawAddress.toString(), dataLength.rawAddress.toString(), timeout.toInt(), nonblock) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocGetPdpStat(size: MutPtr, stat: MutPtr): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceNetAdhocGetPdpStat(size.rawAddress.toString(), stat.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocGameModeCreateMaster(data: MutPtr, size: Int): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceNetAdhocGameModeCreateMaster(data.rawAddress.toString(), size) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocGameModeCreateReplica(mac: MutPtr, data: MutPtr, size: Int): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceNetAdhocGameModeCreateReplica(mac.rawAddress.toString(), data.rawAddress.toString(), size) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocGameModeUpdateMaster(): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceNetAdhocGameModeUpdateMaster() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocGameModeUpdateReplica(id: Int, unk1: Int): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceNetAdhocGameModeUpdateReplica(id, unk1) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocGameModeDeleteMaster(): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceNetAdhocGameModeDeleteMaster() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocGameModeDeleteReplica(id: Int): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceNetAdhocGameModeDeleteReplica(id) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocPtpOpen(srcmac: MutPtr, srcport: UShort, destmac: MutPtr, destport: UShort, bufSize: UInt, delay: UInt, count: Int, unk1: Int): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceNetAdhocPtpOpen(srcmac.rawAddress.toString(), srcport.toInt(), destmac.rawAddress.toString(), destport.toInt(), bufSize.toInt(), delay.toInt(), count, unk1) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocPtpConnect(id: Int, timeout: UInt, nonblock: Int): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceNetAdhocPtpConnect(id, timeout.toInt(), nonblock) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocPtpListen(srcmac: MutPtr, srcport: UShort, bufSize: UInt, delay: UInt, count: Int, queue: Int, unk1: Int): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceNetAdhocPtpListen(srcmac.rawAddress.toString(), srcport.toInt(), bufSize.toInt(), delay.toInt(), count, queue, unk1) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocPtpAccept(id: Int, mac: MutPtr, port: MutPtr, timeout: UInt, nonblock: Int): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceNetAdhocPtpAccept(id, mac.rawAddress.toString(), port.rawAddress.toString(), timeout.toInt(), nonblock) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocPtpSend(id: Int, data: MutPtr, dataSize: MutPtr, timeout: UInt, nonblock: Int): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceNetAdhocPtpSend(id, data.rawAddress.toString(), dataSize.rawAddress.toString(), timeout.toInt(), nonblock) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocPtpRecv(id: Int, data: MutPtr, dataSize: MutPtr, timeout: UInt, nonblock: Int): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceNetAdhocPtpRecv(id, data.rawAddress.toString(), dataSize.rawAddress.toString(), timeout.toInt(), nonblock) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocPtpFlush(id: Int, timeout: UInt, nonblock: Int): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceNetAdhocPtpFlush(id, timeout.toInt(), nonblock) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocPtpClose(id: Int, unk1: Int): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceNetAdhocPtpClose(id, unk1) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocGetPtpStat(size: MutPtr, stat: MutPtr): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceNetAdhocGetPtpStat(size.rawAddress.toString(), stat.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocMatchingInit(memsize: Int): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceNetAdhocMatchingInit(memsize) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocMatchingTerm(): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceNetAdhocMatchingTerm() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocMatchingCreate(mode: AdhocMatchingMode, maxPeers: Int, port: UShort, bufSize: Int, helloDelay: UInt, pingDelay: UInt, initCount: Int, msgDelay: UInt, callback: AdhocMatchingCallback): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocMatchingDelete(matchingId: Int): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceNetAdhocMatchingDelete(matchingId) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocMatchingStart(matchingId: Int, evthPri: Int, evthStack: Int, inthPri: Int, inthStack: Int, optLen: Int, optData: MutPtr): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceNetAdhocMatchingStart(matchingId, evthPri, evthStack, inthPri, inthStack, optLen, optData.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocMatchingStop(matchingId: Int): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceNetAdhocMatchingStop(matchingId) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocMatchingSelectTarget(matchingId: Int, mac: MutPtr, optLen: Int, optData: MutPtr): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceNetAdhocMatchingSelectTarget(matchingId, mac.rawAddress.toString(), optLen, optData.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocMatchingCancelTarget(matchingId: Int, mac: MutPtr): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceNetAdhocMatchingCancelTarget(matchingId, mac.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocMatchingCancelTargetWithOpt(matchingId: Int, mac: MutPtr, optLen: Int, optData: MutPtr): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceNetAdhocMatchingCancelTargetWithOpt(matchingId, mac.rawAddress.toString(), optLen, optData.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocMatchingSendData(matchingId: Int, mac: MutPtr, dataLen: Int, data: MutPtr): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceNetAdhocMatchingSendData(matchingId, mac.rawAddress.toString(), dataLen, data.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocMatchingAbortSendData(matchingId: Int, mac: MutPtr): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceNetAdhocMatchingAbortSendData(matchingId, mac.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocMatchingSetHelloOpt(matchingId: Int, optLen: Int, optData: MutPtr): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceNetAdhocMatchingSetHelloOpt(matchingId, optLen, optData.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocMatchingGetHelloOpt(matchingId: Int, optLen: MutPtr, optData: MutPtr): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceNetAdhocMatchingGetHelloOpt(matchingId, optLen.rawAddress.toString(), optData.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocMatchingGetMembers(matchingId: Int, length: MutPtr, buf: MutPtr): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceNetAdhocMatchingGetMembers(matchingId, length.rawAddress.toString(), buf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocMatchingGetPoolMaxAlloc(): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceNetAdhocMatchingGetPoolMaxAlloc() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocMatchingGetPoolStat(poolstat: MutPtr): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceNetAdhocMatchingGetPoolStat(poolstat.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetApctlInit(stackSize: Int, initPriority: Int): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceNetApctlInit(stackSize, initPriority) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetApctlTerm(): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceNetApctlTerm() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetApctlGetInfo(code: ApctlInfo, pinfo: MutPtr): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetApctlAddHandler(handler: SceNetApctlHandler, parg: MutPtr): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceNetApctlAddHandler(0L.toString(), parg.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetApctlDelHandler(handlerId: Int): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceNetApctlDelHandler(handlerId) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetApctlConnect(connIndex: Int): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceNetApctlConnect(connIndex) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetApctlDisconnect(): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceNetApctlDisconnect() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetApctlGetState(pstate: MutPtr): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceNetApctlGetState(pstate.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetInetInit(): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceNetInetInit() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetInetTerm(): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceNetInetTerm() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetInetAccept(s: Int, addr: MutPtr, addrLen: MutPtr): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceNetInetAccept(s, addr.rawAddress.toString(), addrLen.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetInetBind(s: Int, myAddr: ConstPtr, addrLen: SocklenT): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceNetInetBind(s, myAddr.rawAddress.toString(), addrLen.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetInetConnect(s: Int, servAddr: ConstPtr, addrLen: SocklenT): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceNetInetConnect(s, servAddr.rawAddress.toString(), addrLen.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetInetGetsockopt(s: Int, level: Int, optName: Int, optVal: MutPtr, optlEn: MutPtr): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceNetInetGetsockopt(s, level, optName, optVal.rawAddress.toString(), optlEn.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetInetListen(s: Int, backlog: Int): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceNetInetListen(s, backlog) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetInetRecv(s: Int, buf: MutPtr, len: ULong, flags: Int): ULong =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceNetInetRecv(s, buf.rawAddress.toString(), len.toString(), flags) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetInetRecvfrom(s: Int, buf: MutPtr, flags: ULong, arg1: Int, from: MutPtr, fromLen: MutPtr): ULong =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceNetInetRecvfrom(s, buf.rawAddress.toString(), flags.toString(), arg1, from.rawAddress.toString(), fromLen.rawAddress.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetInetSend(s: Int, buf: ConstPtr, len: ULong, flags: Int): ULong =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceNetInetSend(s, buf.rawAddress.toString(), len.toString(), flags) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetInetSendto(s: Int, buf: ConstPtr, len: ULong, flags: Int, to: ConstPtr, toLen: SocklenT): ULong =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceNetInetSendto(s, buf.rawAddress.toString(), len.toString(), flags, to.rawAddress.toString(), toLen.toInt()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetInetSetsockopt(s: Int, level: Int, optName: Int, optVal: ConstPtr, optLen: SocklenT): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceNetInetSetsockopt(s, level, optName, optVal.rawAddress.toString(), optLen.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetInetShutdown(s: Int, how: Int): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceNetInetShutdown(s, how) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetInetSocket(domain: Int, type: Int, protocol: Int): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceNetInetSocket(domain, type, protocol) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetInetClose(s: Int): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceNetInetClose(s) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetInetGetErrno(): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceNetInetGetErrno() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceSslInit(unknown1: Int): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceSslInit(unknown1) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceSslEnd(): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceSslEnd() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceSslGetUsedMemoryMax(memory: MutPtr): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceSslGetUsedMemoryMax(memory.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceSslGetUsedMemoryCurrent(memory: MutPtr): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceSslGetUsedMemoryCurrent(memory.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceHttpInit(unknown1: UInt): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceHttpInit(unknown1.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceHttpEnd(): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceHttpEnd() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceHttpCreateTemplate(agent: MutPtr, unknown1: Int, unknown2: Int): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceHttpCreateTemplate(agent.rawAddress.toString(), unknown1, unknown2) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceHttpDeleteTemplate(templateid: Int): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceHttpDeleteTemplate(templateid) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceHttpCreateConnection(templateid: Int, host: MutPtr, unknown1: MutPtr, port: UShort, unknown2: Int): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceHttpCreateConnection(templateid, host.rawAddress.toString(), unknown1.rawAddress.toString(), port.toInt(), unknown2) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceHttpCreateConnectionWithURL(templateid: Int, url: ConstPtr, unknown1: Int): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceHttpCreateConnectionWithURL(templateid, url.rawAddress.toString(), unknown1) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceHttpDeleteConnection(connectionId: Int): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceHttpDeleteConnection(connectionId) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceHttpCreateRequest(connectionId: Int, method: HttpMethod, path: MutPtr, contentLength: ULong): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceHttpCreateRequestWithURL(connectionId: Int, method: HttpMethod, url: MutPtr, contentLength: ULong): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceHttpDeleteRequest(requestId: Int): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceHttpDeleteRequest(requestId) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceHttpSendRequest(requestId: Int, data: MutPtr, dataSize: UInt): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceHttpSendRequest(requestId, data.rawAddress.toString(), dataSize.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceHttpAbortRequest(requestId: Int): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceHttpAbortRequest(requestId) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceHttpReadData(requestId: Int, data: MutPtr, dataSize: UInt): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceHttpReadData(requestId, data.rawAddress.toString(), dataSize.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceHttpGetContentLength(requestId: Int, contentLength: MutPtr): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceHttpGetContentLength(requestId, contentLength.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceHttpGetStatusCode(requestId: Int, statusCode: MutPtr): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceHttpGetStatusCode(requestId, statusCode.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceHttpSetResolveTimeOut(id: Int, timeout: UInt): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceHttpSetResolveTimeOut(id, timeout.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceHttpSetResolveRetry(id: Int, count: Int): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceHttpSetResolveRetry(id, count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceHttpSetConnectTimeOut(id: Int, timeout: UInt): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceHttpSetConnectTimeOut(id, timeout.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceHttpSetSendTimeOut(id: Int, timeout: UInt): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceHttpSetSendTimeOut(id, timeout.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceHttpSetRecvTimeOut(id: Int, timeout: UInt): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceHttpSetRecvTimeOut(id, timeout.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceHttpEnableKeepAlive(id: Int): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceHttpEnableKeepAlive(id) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceHttpDisableKeepAlive(id: Int): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceHttpDisableKeepAlive(id) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceHttpEnableRedirect(id: Int): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceHttpEnableRedirect(id) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceHttpDisableRedirect(id: Int): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceHttpDisableRedirect(id) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceHttpEnableCookie(id: Int): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceHttpEnableCookie(id) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceHttpDisableCookie(id: Int): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceHttpDisableCookie(id) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceHttpSaveSystemCookie(): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceHttpSaveSystemCookie() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceHttpLoadSystemCookie(): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceHttpLoadSystemCookie() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceHttpAddExtraHeader(id: Int, name: MutPtr, value: MutPtr, unknown1: Int): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceHttpAddExtraHeader(id, name.rawAddress.toString(), value.rawAddress.toString(), unknown1) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceHttpDeleteHeader(id: Int, name: ConstPtr): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceHttpDeleteHeader(id, name.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceHttpsInit(unknown1: Int, unknown2: Int, unknown3: Int, unknown4: Int): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceHttpsInit(unknown1, unknown2, unknown3, unknown4) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceHttpsEnd(): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceHttpsEnd() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceHttpsLoadDefaultCert(unknown1: Int, unknown2: Int): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceHttpsLoadDefaultCert(unknown1, unknown2) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceHttpDisableAuth(id: Int): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceHttpDisableAuth(id) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceHttpDisableCache(id: Int): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceHttpDisableCache(id) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceHttpEnableAuth(id: Int): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceHttpEnableAuth(id) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceHttpEnableCache(id: Int): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceHttpEnableCache(id) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceHttpEndCache(): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceHttpEndCache() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceHttpGetAllHeader(request: Int, header: MutPtr, headerSize: MutPtr): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceHttpGetAllHeader(request, header.rawAddress.toString(), headerSize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceHttpGetNetworkErrno(request: Int, errNum: MutPtr): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceHttpGetNetworkErrno(request, errNum.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceHttpGetProxy(id: Int, activateFlag: MutPtr, mode: MutPtr, proxyHost: MutPtr, len: ULong, proxyPort: MutPtr): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceHttpGetProxy(id, activateFlag.rawAddress.toString(), mode.rawAddress.toString(), proxyHost.rawAddress.toString(), len.toString(), proxyPort.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceHttpInitCache(maxSize: ULong): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceHttpInitCache(maxSize.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceHttpSetAuthInfoCB(id: Int, cbfunc: HttpPasswordCB): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceHttpSetAuthInfoCB(id, 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceHttpSetProxy(id: Int, activateFlag: Int, mode: Int, newProxyHost: ConstPtr, newProxyPort: UShort): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceHttpSetProxy(id, activateFlag, mode, newProxyHost.rawAddress.toString(), newProxyPort.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceHttpSetResHeaderMaxSize(id: Int, headerSize: UInt): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceHttpSetResHeaderMaxSize(id, headerSize.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceHttpSetMallocFunction(mallocFunc: HttpMallocFunction, freeFunc: HttpFreeFunction, reallocFunc: HttpReallocFunction): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceHttpSetMallocFunction(0L.toString(), 0L.toString(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetResolverInit(): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceNetResolverInit() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetResolverCreate(rid: MutPtr, buf: MutPtr, bufLength: UInt): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceNetResolverCreate(rid.rawAddress.toString(), buf.rawAddress.toString(), bufLength.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetResolverDelete(rid: Int): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceNetResolverDelete(rid) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetResolverStartNtoA(rid: Int, hostname: ConstPtr, addr: MutPtr, timeout: UInt, retry: Int): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceNetResolverStartNtoA(rid, hostname.rawAddress.toString(), addr.rawAddress.toString(), timeout.toInt(), retry) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetResolverStartAtoN(rid: Int, addr: ConstPtr, hostname: MutPtr, hostnameLen: UInt, timeout: UInt, retry: Int): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceNetResolverStartAtoN(rid, addr.rawAddress.toString(), hostname.rawAddress.toString(), hostnameLen.toInt(), timeout.toInt(), retry) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetResolverStop(rid: Int): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceNetResolverStop(rid) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetResolverTerm(): Int =
    if (pspNapiAddon != null) (pspNapiAddon.libcPspSceNetResolverTerm() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
