@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.psp

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.COpaquePointer

private val _pspNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/libc-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = null; return null; })()")

public actual fun sceAudioChReserve(channel: Int, sampleCount: Int, format: AudioFormat): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceAudioChRelease(channel: Int): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceAudioChRelease(channel) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceAudioOutput(channel: Int, vol: Int, buf: COpaquePointer?): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceAudioOutput(channel, vol, (buf?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceAudioOutputBlocking(channel: Int, vol: Int, buf: COpaquePointer?): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceAudioOutputBlocking(channel, vol, (buf?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceAudioOutputPanned(channel: Int, leftVol: Int, rightVol: Int, buf: COpaquePointer?): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceAudioOutputPanned(channel, leftVol, rightVol, (buf?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceAudioOutputPannedBlocking(channel: Int, leftVol: Int, rightVol: Int, buf: COpaquePointer?): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceAudioOutputPannedBlocking(channel, leftVol, rightVol, (buf?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceAudioGetChannelRestLen(channel: Int): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceAudioGetChannelRestLen(channel) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceAudioGetChannelRestLength(channel: Int): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceAudioGetChannelRestLength(channel) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceAudioSetChannelDataLen(channel: Int, sampleCount: Int): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceAudioSetChannelDataLen(channel, sampleCount) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceAudioChangeChannelConfig(channel: Int, format: AudioFormat): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceAudioChangeChannelVolume(channel: Int, leftVol: Int, rightVol: Int): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceAudioChangeChannelVolume(channel, leftVol, rightVol) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceAudioOutput2Reserve(sampleCount: Int): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceAudioOutput2Reserve(sampleCount) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceAudioOutput2Release(): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceAudioOutput2Release() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceAudioOutput2ChangeLength(sampleCount: Int): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceAudioOutput2ChangeLength(sampleCount) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceAudioOutput2OutputBlocking(vol: Int, buf: COpaquePointer?): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceAudioOutput2OutputBlocking(vol, (buf?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceAudioOutput2GetRestSample(): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceAudioOutput2GetRestSample() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceAudioSRCChReserve(sampleCount: Int, freq: AudioOutputFrequency, channels: Int): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceAudioSRCChRelease(): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceAudioSRCChRelease() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceAudioSRCOutputBlocking(vol: Int, buf: COpaquePointer?): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceAudioSRCOutputBlocking(vol, (buf?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceAudioInputInit(unknown1: Int, gain: Int, unknown2: Int): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceAudioInputInit(unknown1, gain, unknown2) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceAudioInputInitEx(params: COpaquePointer?): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceAudioInputInitEx((params?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceAudioInputBlocking(sampleCount: Int, freq: AudioInputFrequency, buf: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI addon is not available")
}

public actual fun sceAudioInput(sampleCount: Int, freq: AudioInputFrequency, buf: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI addon is not available")
}

public actual fun sceAudioGetInputLength(): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceAudioGetInputLength() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceAudioWaitInputEnd(): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceAudioWaitInputEnd() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceAudioPollInputEnd(): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceAudioPollInputEnd() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceAtracGetAtracID(uiCodecType: UInt): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceAtracGetAtracID(uiCodecType.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceAtracSetDataAndGetID(buf: COpaquePointer?, bufsize: ULong): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceAtracSetDataAndGetID((buf?.value ?: 0L).toString(), bufsize.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceAtracDecodeData(atracId: Int, outSamples: COpaquePointer?, outN: COpaquePointer?, outEnd: COpaquePointer?, outRemainFrame: COpaquePointer?): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceAtracDecodeData(atracId, (outSamples?.value ?: 0L).toString(), (outN?.value ?: 0L).toString(), (outEnd?.value ?: 0L).toString(), (outRemainFrame?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceAtracGetRemainFrame(atracId: Int, outRemainFrame: COpaquePointer?): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceAtracGetRemainFrame(atracId, (outRemainFrame?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceAtracGetStreamDataInfo(atracId: Int, writePointer: COpaquePointer?, availableBytes: COpaquePointer?, readOffset: COpaquePointer?): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceAtracGetStreamDataInfo(atracId, (writePointer?.value ?: 0L).toString(), (availableBytes?.value ?: 0L).toString(), (readOffset?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceAtracAddStreamData(atracId: Int, bytesToAdd: UInt): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceAtracAddStreamData(atracId, bytesToAdd.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceAtracGetBitrate(atracId: Int, outBitrate: COpaquePointer?): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceAtracGetBitrate(atracId, (outBitrate?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceAtracSetLoopNum(atracId: Int, nloops: Int): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceAtracSetLoopNum(atracId, nloops) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceAtracReleaseAtracID(atracId: Int): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceAtracReleaseAtracID(atracId) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceAtracGetNextSample(atracId: Int, outN: COpaquePointer?): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceAtracGetNextSample(atracId, (outN?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceAtracGetMaxSample(atracId: Int, outMax: COpaquePointer?): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceAtracGetMaxSample(atracId, (outMax?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceAtracGetBufferInfoForReseting(atracId: Int, uiSample: UInt, pbufferInfo: COpaquePointer?): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceAtracGetBufferInfoForReseting(atracId, uiSample.toInt(), (pbufferInfo?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceAtracGetChannel(atracId: Int, puiChannel: COpaquePointer?): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceAtracGetChannel(atracId, (puiChannel?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceAtracGetInternalErrorInfo(atracId: Int, piResult: COpaquePointer?): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceAtracGetInternalErrorInfo(atracId, (piResult?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceAtracGetLoopStatus(atracId: Int, piLoopNum: COpaquePointer?, puiLoopStatus: COpaquePointer?): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceAtracGetLoopStatus(atracId, (piLoopNum?.value ?: 0L).toString(), (puiLoopStatus?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceAtracGetNextDecodePosition(atracId: Int, puiSamplePosition: COpaquePointer?): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceAtracGetNextDecodePosition(atracId, (puiSamplePosition?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceAtracGetSecondBufferInfo(atracId: Int, puiPosition: COpaquePointer?, puiDataByte: COpaquePointer?): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceAtracGetSecondBufferInfo(atracId, (puiPosition?.value ?: 0L).toString(), (puiDataByte?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceAtracGetSoundSample(atracId: Int, piEndSample: COpaquePointer?, piLoopStartSample: COpaquePointer?, piLoopEndSample: COpaquePointer?): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceAtracGetSoundSample(atracId, (piEndSample?.value ?: 0L).toString(), (piLoopStartSample?.value ?: 0L).toString(), (piLoopEndSample?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceAtracResetPlayPosition(atracId: Int, uiSample: UInt, uiWriteByteFirstBuf: UInt, uiWriteByteSecondBuf: UInt): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceAtracResetPlayPosition(atracId, uiSample.toInt(), uiWriteByteFirstBuf.toInt(), uiWriteByteSecondBuf.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceAtracSetData(atracId: Int, pucBufferAddr: COpaquePointer?, uiBufferByte: UInt): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceAtracSetData(atracId, (pucBufferAddr?.value ?: 0L).toString(), uiBufferByte.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceAtracSetHalfwayBuffer(atracId: Int, pucBufferAddr: COpaquePointer?, uiReadByte: UInt, uiBufferByte: UInt): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceAtracSetHalfwayBuffer(atracId, (pucBufferAddr?.value ?: 0L).toString(), uiReadByte.toInt(), uiBufferByte.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceAtracSetHalfwayBufferAndGetID(pucBufferAddr: COpaquePointer?, uiReadByte: UInt, uiBufferByte: UInt): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceAtracSetHalfwayBufferAndGetID((pucBufferAddr?.value ?: 0L).toString(), uiReadByte.toInt(), uiBufferByte.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceAtracSetSecondBuffer(atracId: Int, pucSecondBufferAddr: COpaquePointer?, uiSecondBufferByte: UInt): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceAtracSetSecondBuffer(atracId, (pucSecondBufferAddr?.value ?: 0L).toString(), uiSecondBufferByte.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceCtrlSetSamplingCycle(cycle: Int): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceCtrlSetSamplingCycle(cycle) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceCtrlGetSamplingCycle(pcycle: COpaquePointer?): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceCtrlGetSamplingCycle((pcycle?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceCtrlSetSamplingMode(mode: CtrlMode): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceCtrlGetSamplingMode(pmode: COpaquePointer?): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceCtrlGetSamplingMode((pmode?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceCtrlPeekBufferPositive(padData: COpaquePointer?, count: Int): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceCtrlPeekBufferPositive((padData?.value ?: 0L).toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceCtrlPeekBufferNegative(padData: COpaquePointer?, count: Int): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceCtrlPeekBufferNegative((padData?.value ?: 0L).toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceCtrlReadBufferPositive(padData: COpaquePointer?, count: Int): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceCtrlReadBufferPositive((padData?.value ?: 0L).toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceCtrlReadBufferNegative(padData: COpaquePointer?, count: Int): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceCtrlReadBufferNegative((padData?.value ?: 0L).toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceCtrlPeekLatch(latchData: COpaquePointer?): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceCtrlPeekLatch((latchData?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceCtrlReadLatch(latchData: COpaquePointer?): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceCtrlReadLatch((latchData?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceCtrlSetIdleCancelThreshold(idlereset: Int, idleback: Int): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceCtrlSetIdleCancelThreshold(idlereset, idleback) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceCtrlGetIdleCancelThreshold(idlereset: COpaquePointer?, idleback: COpaquePointer?): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceCtrlGetIdleCancelThreshold((idlereset?.value ?: 0L).toString(), (idleback?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceDisplaySetMode(mode: DisplayMode, width: ULong, height: ULong): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceDisplayGetMode(pmode: COpaquePointer?, pwidth: COpaquePointer?, pheight: COpaquePointer?): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceDisplayGetMode((pmode?.value ?: 0L).toString(), (pwidth?.value ?: 0L).toString(), (pheight?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceDisplaySetFrameBuf(topAddr: COpaquePointer?, bufferWidth: ULong, pixelFormat: DisplayPixelFormat, sync: DisplaySetBufSync): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceDisplayGetFrameBuf(topAddr: COpaquePointer?, bufferWidth: COpaquePointer?, pixelFormat: COpaquePointer?, sync: DisplaySetBufSync): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceDisplayGetVcount(): UInt =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceDisplayGetVcount() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceDisplayWaitVblank(): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceDisplayWaitVblank() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceDisplayWaitVblankCB(): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceDisplayWaitVblankCB() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceDisplayWaitVblankStart(): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceDisplayWaitVblankStart() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceDisplayWaitVblankStartCB(): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceDisplayWaitVblankStartCB() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceDisplayGetAccumulatedHcount(): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceDisplayGetAccumulatedHcount() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceDisplayGetCurrentHcount(): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceDisplayGetCurrentHcount() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceDisplayGetFramePerSec(): Float =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceDisplayGetFramePerSec() as Double).toFloat() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceDisplayIsForeground(): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceDisplayIsForeground() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceDisplayIsVblank(): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceDisplayIsVblank() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGeEdramGetSize(): UInt =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceGeEdramGetSize() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGeEdramGetAddr(): COpaquePointer? =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceGeEdramGetAddr() as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGeEdramSetAddrTranslation(width: Int): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceGeEdramSetAddrTranslation(width) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGeGetCmd(cmd: Int): UInt =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceGeGetCmd(cmd) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGeGetMtx(type: GeMatrixType, matrix: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGeGetStack(stackId: Int, stack: COpaquePointer?): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceGeGetStack(stackId, (stack?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGeSaveContext(context: COpaquePointer?): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceGeSaveContext((context?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGeRestoreContext(context: COpaquePointer?): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceGeRestoreContext((context?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGeListEnQueue(list: COpaquePointer?, stall: COpaquePointer?, cbid: Int, arg: COpaquePointer?): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceGeListEnQueue((list?.value ?: 0L).toString(), (stall?.value ?: 0L).toString(), cbid, (arg?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGeListEnQueueHead(list: COpaquePointer?, stall: COpaquePointer?, cbid: Int, arg: COpaquePointer?): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceGeListEnQueueHead((list?.value ?: 0L).toString(), (stall?.value ?: 0L).toString(), cbid, (arg?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGeListDeQueue(qid: Int): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceGeListDeQueue(qid) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGeListUpdateStallAddr(qid: Int, stall: COpaquePointer?): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceGeListUpdateStallAddr(qid, (stall?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGeListSync(qid: Int, syncType: Int): GeListState =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGeDrawSync(syncType: Int): GeListState =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGeBreak(mode: Int, pParam: COpaquePointer?): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceGeBreak(mode, (pParam?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGeContinue(): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceGeContinue() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGeSetCallback(cb: COpaquePointer?): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceGeSetCallback((cb?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGeUnsetCallback(cbid: Int): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceGeUnsetCallback(cbid) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelExitGame() {
    if (_pspNapiAddon != null) {
        _pspNapiAddon.libc_psp_sceKernelExitGame()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceKernelRegisterExitCallback(id: SceUid): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelLoadExec(file: COpaquePointer?, param: COpaquePointer?): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceKernelLoadExec((file?.value ?: 0L).toString(), (param?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelAllocPartitionMemory(partition: SceSysMemPartitionId, name: COpaquePointer?, type: SceSysMemBlockTypes, size: UInt, addr: COpaquePointer?): SceUid =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelGetBlockHeadAddr(blockid: SceUid): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelFreePartitionMemory(blockid: SceUid): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelTotalFreeMemSize(): ULong =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceKernelTotalFreeMemSize() as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelMaxFreeMemSize(): ULong =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceKernelMaxFreeMemSize() as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelDevkitVersion(): UInt =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceKernelDevkitVersion() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelSetCompiledSdkVersion(version: UInt): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceKernelSetCompiledSdkVersion(version.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelGetCompiledSdkVersion(): UInt =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceKernelGetCompiledSdkVersion() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelLibcTime(t: COpaquePointer?): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceKernelLibcTime((t?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelLibcClock(): UInt =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceKernelLibcClock() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelLibcGettimeofday(tp: COpaquePointer?, tzp: COpaquePointer?): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceKernelLibcGettimeofday((tp?.value ?: 0L).toString(), (tzp?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelDcacheWritebackAll() {
    if (_pspNapiAddon != null) {
        _pspNapiAddon.libc_psp_sceKernelDcacheWritebackAll()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceKernelDcacheWritebackInvalidateAll() {
    if (_pspNapiAddon != null) {
        _pspNapiAddon.libc_psp_sceKernelDcacheWritebackInvalidateAll()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceKernelDcacheWritebackRange(p: COpaquePointer?, size: UInt) {
    if (_pspNapiAddon != null) {
        _pspNapiAddon.libc_psp_sceKernelDcacheWritebackRange((p?.value ?: 0L).toString(), size.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceKernelDcacheWritebackInvalidateRange(p: COpaquePointer?, size: UInt) {
    if (_pspNapiAddon != null) {
        _pspNapiAddon.libc_psp_sceKernelDcacheWritebackInvalidateRange((p?.value ?: 0L).toString(), size.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceKernelDcacheInvalidateRange(p: COpaquePointer?, size: UInt) {
    if (_pspNapiAddon != null) {
        _pspNapiAddon.libc_psp_sceKernelDcacheInvalidateRange((p?.value ?: 0L).toString(), size.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceKernelIcacheInvalidateAll() {
    if (_pspNapiAddon != null) {
        _pspNapiAddon.libc_psp_sceKernelIcacheInvalidateAll()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceKernelIcacheInvalidateRange(p: COpaquePointer?, size: UInt) {
    if (_pspNapiAddon != null) {
        _pspNapiAddon.libc_psp_sceKernelIcacheInvalidateRange((p?.value ?: 0L).toString(), size.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceKernelUtilsMt19937Init(ctx: COpaquePointer?, seed: UInt): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceKernelUtilsMt19937Init((ctx?.value ?: 0L).toString(), seed.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelUtilsMt19937UInt(ctx: COpaquePointer?): UInt =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceKernelUtilsMt19937UInt((ctx?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelUtilsMd5Digest(data: COpaquePointer?, size: UInt, digest: COpaquePointer?): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceKernelUtilsMd5Digest((data?.value ?: 0L).toString(), size.toInt(), (digest?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelUtilsMd5BlockInit(ctx: COpaquePointer?): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceKernelUtilsMd5BlockInit((ctx?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelUtilsMd5BlockUpdate(ctx: COpaquePointer?, data: COpaquePointer?, size: UInt): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceKernelUtilsMd5BlockUpdate((ctx?.value ?: 0L).toString(), (data?.value ?: 0L).toString(), size.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelUtilsMd5BlockResult(ctx: COpaquePointer?, digest: COpaquePointer?): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceKernelUtilsMd5BlockResult((ctx?.value ?: 0L).toString(), (digest?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelUtilsSha1Digest(data: COpaquePointer?, size: UInt, digest: COpaquePointer?): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceKernelUtilsSha1Digest((data?.value ?: 0L).toString(), size.toInt(), (digest?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelUtilsSha1BlockInit(ctx: COpaquePointer?): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceKernelUtilsSha1BlockInit((ctx?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelUtilsSha1BlockUpdate(ctx: COpaquePointer?, data: COpaquePointer?, size: UInt): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceKernelUtilsSha1BlockUpdate((ctx?.value ?: 0L).toString(), (data?.value ?: 0L).toString(), size.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelUtilsSha1BlockResult(ctx: COpaquePointer?, digest: COpaquePointer?): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceKernelUtilsSha1BlockResult((ctx?.value ?: 0L).toString(), (digest?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelRegisterSubIntrHandler(intNo: Int, no: Int, handler: COpaquePointer?, arg: COpaquePointer?): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceKernelRegisterSubIntrHandler(intNo, no, (handler?.value ?: 0L).toString(), (arg?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelReleaseSubIntrHandler(intNo: Int, no: Int): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceKernelReleaseSubIntrHandler(intNo, no) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelEnableSubIntr(intNo: Int, no: Int): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceKernelEnableSubIntr(intNo, no) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelDisableSubIntr(intNo: Int, no: Int): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceKernelDisableSubIntr(intNo, no) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryIntrHandlerInfo(intrCode: SceUid, subIntrCode: SceUid, data: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelCpuSuspendIntr(): UInt =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceKernelCpuSuspendIntr() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelCpuResumeIntr(flags: UInt) {
    if (_pspNapiAddon != null) {
        _pspNapiAddon.libc_psp_sceKernelCpuResumeIntr(flags.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceKernelCpuResumeIntrWithSync(flags: UInt) {
    if (_pspNapiAddon != null) {
        _pspNapiAddon.libc_psp_sceKernelCpuResumeIntrWithSync(flags.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceKernelIsCpuIntrSuspended(flags: UInt): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceKernelIsCpuIntrSuspended(flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelIsCpuIntrEnable(): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceKernelIsCpuIntrEnable() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelLoadModule(path: COpaquePointer?, flags: Int, option: COpaquePointer?): SceUid =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelLoadModuleMs(path: COpaquePointer?, flags: Int, option: COpaquePointer?): SceUid =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelLoadModuleByID(fid: SceUid, flags: Int, option: COpaquePointer?): SceUid =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelLoadModuleBufferUsbWlan(bufSize: ULong, buf: COpaquePointer?, flags: Int, option: COpaquePointer?): SceUid =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelStartModule(modId: SceUid, argSize: ULong, argp: COpaquePointer?, status: COpaquePointer?, option: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelStopModule(modId: SceUid, argSize: ULong, argp: COpaquePointer?, status: COpaquePointer?, option: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelUnloadModule(modId: SceUid): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelSelfStopUnloadModule(unknown: Int, argSize: ULong, argp: COpaquePointer?): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceKernelSelfStopUnloadModule(unknown, argSize.toString(), (argp?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelStopUnloadSelfModule(argSize: ULong, argp: COpaquePointer?, status: COpaquePointer?, option: COpaquePointer?): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceKernelStopUnloadSelfModule(argSize.toString(), (argp?.value ?: 0L).toString(), (status?.value ?: 0L).toString(), (option?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelQueryModuleInfo(modId: SceUid, info: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelGetModuleIdList(readBuf: COpaquePointer?, readBufSize: Int, idCount: COpaquePointer?): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceKernelGetModuleIdList((readBuf?.value ?: 0L).toString(), readBufSize, (idCount?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelVolatileMemLock(unk: Int, ptr: COpaquePointer?, size: COpaquePointer?): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceKernelVolatileMemLock(unk, (ptr?.value ?: 0L).toString(), (size?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelVolatileMemTryLock(unk: Int, ptr: COpaquePointer?, size: COpaquePointer?): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceKernelVolatileMemTryLock(unk, (ptr?.value ?: 0L).toString(), (size?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelVolatileMemUnlock(unk: Int): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceKernelVolatileMemUnlock(unk) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelStdin(): SceUid =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelStdout(): SceUid =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelStderr(): SceUid =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelGetThreadmanIdType(uid: SceUid): SceKernelIdListType =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelCreateThread(name: COpaquePointer?, entry: SceKernelThreadEntry, initPriority: Int, stackSize: Int, attr: Int, option: COpaquePointer?): SceUid =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelDeleteThread(thid: SceUid): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelStartThread(id: SceUid, argLen: ULong, argP: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelExitThread(status: Int): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceKernelExitThread(status) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelExitDeleteThread(status: Int): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceKernelExitDeleteThread(status) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelTerminateThread(thid: SceUid): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelTerminateDeleteThread(thid: SceUid): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelSuspendDispatchThread(): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceKernelSuspendDispatchThread() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelResumeDispatchThread(state: Int): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceKernelResumeDispatchThread(state) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelSleepThread(): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceKernelSleepThread() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelSleepThreadCB(): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceKernelSleepThreadCB() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelWakeupThread(thid: SceUid): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelCancelWakeupThread(thid: SceUid): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelSuspendThread(thid: SceUid): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelResumeThread(thid: SceUid): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelWaitThreadEnd(thid: SceUid, timeout: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelWaitThreadEndCB(thid: SceUid, timeout: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelDelayThread(delay: UInt): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceKernelDelayThread(delay.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelDelayThreadCB(delay: UInt): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceKernelDelayThreadCB(delay.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelDelaySysClockThread(delay: COpaquePointer?): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceKernelDelaySysClockThread((delay?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelDelaySysClockThreadCB(delay: COpaquePointer?): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceKernelDelaySysClockThreadCB((delay?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelChangeCurrentThreadAttr(unknown: Int, attr: Int): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceKernelChangeCurrentThreadAttr(unknown, attr) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelChangeThreadPriority(thid: SceUid, priority: Int): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelRotateThreadReadyQueue(priority: Int): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceKernelRotateThreadReadyQueue(priority) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelReleaseWaitThread(thid: SceUid): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelGetThreadId(): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceKernelGetThreadId() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelGetThreadCurrentPriority(): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceKernelGetThreadCurrentPriority() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelGetThreadExitStatus(thid: SceUid): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelCheckThreadStack(): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceKernelCheckThreadStack() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelGetThreadStackFreeSize(thid: SceUid): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelReferThreadStatus(thid: SceUid, info: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelReferThreadRunStatus(thid: SceUid, status: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelCreateSema(name: COpaquePointer?, attr: UInt, initVal: Int, maxVal: Int, option: COpaquePointer?): SceUid =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelDeleteSema(semaId: SceUid): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelSignalSema(semaId: SceUid, signal: Int): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelWaitSema(semaId: SceUid, signal: Int, timeout: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelWaitSemaCB(semaId: SceUid, signal: Int, timeout: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelPollSema(semaId: SceUid, signal: Int): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelReferSemaStatus(semaId: SceUid, info: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelCreateEventFlag(name: COpaquePointer?, attr: Int, bits: Int, opt: COpaquePointer?): SceUid =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelSetEventFlag(evId: SceUid, bits: UInt): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelClearEventFlag(evId: SceUid, bits: UInt): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelPollEventFlag(evId: SceUid, bits: UInt, wait: Int, outBits: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelWaitEventFlag(evId: SceUid, bits: UInt, wait: Int, outBits: COpaquePointer?, timeout: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelWaitEventFlagCB(evId: SceUid, bits: UInt, wait: Int, outBits: COpaquePointer?, timeout: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelDeleteEventFlag(evId: SceUid): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelReferEventFlagStatus(event: SceUid, status: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelCreateMbx(name: COpaquePointer?, attr: UInt, option: COpaquePointer?): SceUid =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelDeleteMbx(mbxId: SceUid): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelSendMbx(mbxId: SceUid, message: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelReceiveMbx(mbxId: SceUid, message: COpaquePointer?, timeout: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelReceiveMbxCB(mbxId: SceUid, message: COpaquePointer?, timeout: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelPollMbx(mbxId: SceUid, pmessage: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelCancelReceiveMbx(mbxId: SceUid, num: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelReferMbxStatus(mbxId: SceUid, info: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelSetAlarm(clock: UInt, handler: SceKernelAlarmHandler, common: COpaquePointer?): SceUid =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelSetSysClockAlarm(clock: COpaquePointer?, handler: COpaquePointer?, common: COpaquePointer?): SceUid =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelCancelAlarm(alarmId: SceUid): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelReferAlarmStatus(alarmId: SceUid, info: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelCreateCallback(name: COpaquePointer?, func: SceKernelCallbackFunction, arg: COpaquePointer?): SceUid =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelReferCallbackStatus(cb: SceUid, status: COpaquePointer?): Int =
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
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceKernelCheckCallback() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelGetThreadmanIdList(type: SceKernelIdListType, readBuf: COpaquePointer?, readBufSize: Int, idCount: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelReferSystemStatus(status: COpaquePointer?): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceKernelReferSystemStatus((status?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelCreateMsgPipe(name: COpaquePointer?, part: Int, attr: Int, unk1: COpaquePointer?, opt: COpaquePointer?): SceUid =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelDeleteMsgPipe(uid: SceUid): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelSendMsgPipe(uid: SceUid, message: COpaquePointer?, size: UInt, unk1: Int, unk2: COpaquePointer?, timeout: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelSendMsgPipeCB(uid: SceUid, message: COpaquePointer?, size: UInt, unk1: Int, unk2: COpaquePointer?, timeout: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelTrySendMsgPipe(uid: SceUid, message: COpaquePointer?, size: UInt, unk1: Int, unk2: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelReceiveMsgPipe(uid: SceUid, message: COpaquePointer?, size: UInt, unk1: Int, unk2: COpaquePointer?, timeout: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelReceiveMsgPipeCB(uid: SceUid, message: COpaquePointer?, size: UInt, unk1: Int, unk2: COpaquePointer?, timeout: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelTryReceiveMsgPipe(uid: SceUid, message: COpaquePointer?, size: UInt, unk1: Int, unk2: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelCancelMsgPipe(uid: SceUid, send: COpaquePointer?, recv: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelReferMsgPipeStatus(uid: SceUid, info: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelCreateVpl(name: COpaquePointer?, part: Int, attr: Int, size: UInt, opt: COpaquePointer?): SceUid =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelDeleteVpl(uid: SceUid): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelAllocateVpl(uid: SceUid, size: UInt, data: COpaquePointer?, timeout: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelAllocateVplCB(uid: SceUid, size: UInt, data: COpaquePointer?, timeout: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelTryAllocateVpl(uid: SceUid, size: UInt, data: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelFreeVpl(uid: SceUid, data: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelCancelVpl(uid: SceUid, num: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelReferVplStatus(uid: SceUid, info: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelCreateFpl(name: COpaquePointer?, part: Int, attr: Int, size: UInt, blocks: UInt, opt: COpaquePointer?): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceKernelCreateFpl((name?.value ?: 0L).toString(), part, attr, size.toInt(), blocks.toInt(), (opt?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelDeleteFpl(uid: SceUid): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelAllocateFpl(uid: SceUid, data: COpaquePointer?, timeout: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelAllocateFplCB(uid: SceUid, data: COpaquePointer?, timeout: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelTryAllocateFpl(uid: SceUid, data: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelFreeFpl(uid: SceUid, data: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelCancelFpl(uid: SceUid, pnum: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelReferFplStatus(uid: SceUid, info: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelUSec2SysClock(usec: UInt, clock: COpaquePointer?): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceKernelUSec2SysClock(usec.toInt(), (clock?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelUSec2SysClockWide(usec: UInt): Long =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceKernelUSec2SysClockWide(usec.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelSysClock2USec(clock: COpaquePointer?, low: COpaquePointer?, high: COpaquePointer?): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceKernelSysClock2USec((clock?.value ?: 0L).toString(), (low?.value ?: 0L).toString(), (high?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelSysClock2USecWide(clock: Long, low: COpaquePointer?, high: COpaquePointer?): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceKernelSysClock2USecWide(clock.toString(), (low?.value ?: 0L).toString(), (high?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelGetSystemTime(time: COpaquePointer?): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceKernelGetSystemTime((time?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelGetSystemTimeWide(): Long =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceKernelGetSystemTimeWide() as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelGetSystemTimeLow(): UInt =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceKernelGetSystemTimeLow() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelCreateVTimer(name: COpaquePointer?, opt: COpaquePointer?): SceUid =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelDeleteVTimer(uid: SceUid): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelGetVTimerBase(uid: SceUid, base: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelGetVTimerBaseWide(uid: SceUid): Long =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelGetVTimerTime(uid: SceUid, time: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelGetVTimerTimeWide(uid: SceUid): Long =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelSetVTimerTime(uid: SceUid, time: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelSetVTimerTimeWide(uid: SceUid, time: Long): Long =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelStartVTimer(uid: SceUid): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelStopVTimer(uid: SceUid): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelSetVTimerHandler(uid: SceUid, time: COpaquePointer?, handler: SceKernelVTimerHandler, common: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelSetVTimerHandlerWide(uid: SceUid, time: Long, handler: SceKernelVTimerHandlerWide, common: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelCancelVTimerHandler(uid: SceUid): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelReferVTimerStatus(uid: SceUid, info: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelRegisterThreadEventHandler(name: COpaquePointer?, threadId: SceUid, mask: Int, handler: SceKernelThreadEventHandler, common: COpaquePointer?): SceUid =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelReleaseThreadEventHandler(uid: SceUid): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelReferThreadEventHandlerStatus(uid: SceUid, info: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelReferThreadProfiler(): COpaquePointer? =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceKernelReferThreadProfiler() as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelReferGlobalProfiler(): COpaquePointer? =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceKernelReferGlobalProfiler() as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUsbStart(driverName: COpaquePointer?, size: Int, args: COpaquePointer?): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceUsbStart((driverName?.value ?: 0L).toString(), size, (args?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUsbStop(driverName: COpaquePointer?, size: Int, args: COpaquePointer?): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceUsbStop((driverName?.value ?: 0L).toString(), size, (args?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUsbActivate(pid: UInt): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceUsbActivate(pid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUsbDeactivate(pid: UInt): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceUsbDeactivate(pid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUsbGetState(): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceUsbGetState() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUsbGetDrvState(driverName: COpaquePointer?): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceUsbGetDrvState((driverName?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUsbCamSetupStill(param: COpaquePointer?): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceUsbCamSetupStill((param?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUsbCamSetupStillEx(param: COpaquePointer?): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceUsbCamSetupStillEx((param?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUsbCamStillInputBlocking(buf: COpaquePointer?, size: ULong): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceUsbCamStillInputBlocking((buf?.value ?: 0L).toString(), size.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUsbCamStillInput(buf: COpaquePointer?, size: ULong): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceUsbCamStillInput((buf?.value ?: 0L).toString(), size.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUsbCamStillWaitInputEnd(): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceUsbCamStillWaitInputEnd() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUsbCamStillPollInputEnd(): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceUsbCamStillPollInputEnd() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUsbCamStillCancelInput(): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceUsbCamStillCancelInput() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUsbCamStillGetInputLength(): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceUsbCamStillGetInputLength() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUsbCamSetupVideo(param: COpaquePointer?, workArea: COpaquePointer?, workAreaSize: Int): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceUsbCamSetupVideo((param?.value ?: 0L).toString(), (workArea?.value ?: 0L).toString(), workAreaSize) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUsbCamSetupVideoEx(param: COpaquePointer?, workArea: COpaquePointer?, workAreaSize: Int): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceUsbCamSetupVideoEx((param?.value ?: 0L).toString(), (workArea?.value ?: 0L).toString(), workAreaSize) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUsbCamStartVideo(): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceUsbCamStartVideo() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUsbCamStopVideo(): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceUsbCamStopVideo() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUsbCamReadVideoFrameBlocking(buf: COpaquePointer?, size: ULong): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceUsbCamReadVideoFrameBlocking((buf?.value ?: 0L).toString(), size.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUsbCamReadVideoFrame(buf: COpaquePointer?, size: ULong): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceUsbCamReadVideoFrame((buf?.value ?: 0L).toString(), size.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUsbCamWaitReadVideoFrameEnd(): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceUsbCamWaitReadVideoFrameEnd() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUsbCamPollReadVideoFrameEnd(): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceUsbCamPollReadVideoFrameEnd() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUsbCamGetReadVideoFrameSize(): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceUsbCamGetReadVideoFrameSize() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUsbCamSetSaturation(saturation: Int): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceUsbCamSetSaturation(saturation) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUsbCamSetBrightness(brightness: Int): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceUsbCamSetBrightness(brightness) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUsbCamSetContrast(contrast: Int): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceUsbCamSetContrast(contrast) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUsbCamSetSharpness(sharpness: Int): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceUsbCamSetSharpness(sharpness) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUsbCamSetImageEffectMode(effectMode: UsbCamEffectMode): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUsbCamSetEvLevel(exposureLevel: UsbCamEvLevel): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUsbCamSetReverseMode(reverseFlags: Int): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceUsbCamSetReverseMode(reverseFlags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUsbCamSetZoom(zoom: Int): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceUsbCamSetZoom(zoom) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUsbCamGetSaturation(saturation: COpaquePointer?): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceUsbCamGetSaturation((saturation?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUsbCamGetBrightness(brightness: COpaquePointer?): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceUsbCamGetBrightness((brightness?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUsbCamGetContrast(contrast: COpaquePointer?): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceUsbCamGetContrast((contrast?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUsbCamGetSharpness(sharpness: COpaquePointer?): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceUsbCamGetSharpness((sharpness?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUsbCamGetImageEffectMode(effectMode: COpaquePointer?): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceUsbCamGetImageEffectMode((effectMode?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUsbCamGetEvLevel(exposureLevel: COpaquePointer?): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceUsbCamGetEvLevel((exposureLevel?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUsbCamGetReverseMode(reverseFlags: COpaquePointer?): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceUsbCamGetReverseMode((reverseFlags?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUsbCamGetZoom(zoom: COpaquePointer?): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceUsbCamGetZoom((zoom?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUsbCamAutoImageReverseSW(on: Int): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceUsbCamAutoImageReverseSW(on) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUsbCamGetAutoImageReverseState(): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceUsbCamGetAutoImageReverseState() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUsbCamGetLensDirection(): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceUsbCamGetLensDirection() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUsbstorBootRegisterNotify(eventFlag: SceUid): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUsbstorBootUnregisterNotify(eventFlag: UInt): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceUsbstorBootUnregisterNotify(eventFlag.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUsbstorBootSetCapacity(size: UInt): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceUsbstorBootSetCapacity(size.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scePowerRegisterCallback(slot: Int, cbid: SceUid): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scePowerUnregisterCallback(slot: Int): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_scePowerUnregisterCallback(slot) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scePowerIsPowerOnline(): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_scePowerIsPowerOnline() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scePowerIsBatteryExist(): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_scePowerIsBatteryExist() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scePowerIsBatteryCharging(): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_scePowerIsBatteryCharging() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scePowerGetBatteryChargingStatus(): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_scePowerGetBatteryChargingStatus() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scePowerIsLowBattery(): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_scePowerIsLowBattery() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scePowerGetBatteryLifePercent(): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_scePowerGetBatteryLifePercent() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scePowerGetBatteryLifeTime(): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_scePowerGetBatteryLifeTime() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scePowerGetBatteryTemp(): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_scePowerGetBatteryTemp() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scePowerGetBatteryElec(): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_scePowerGetBatteryElec() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scePowerGetBatteryVolt(): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_scePowerGetBatteryVolt() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scePowerSetCpuClockFrequency(cpufreq: Int): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_scePowerSetCpuClockFrequency(cpufreq) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scePowerSetBusClockFrequency(busfreq: Int): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_scePowerSetBusClockFrequency(busfreq) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scePowerGetCpuClockFrequency(): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_scePowerGetCpuClockFrequency() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scePowerGetCpuClockFrequencyInt(): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_scePowerGetCpuClockFrequencyInt() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scePowerGetCpuClockFrequencyFloat(): Float =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_scePowerGetCpuClockFrequencyFloat() as Double).toFloat() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scePowerGetBusClockFrequency(): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_scePowerGetBusClockFrequency() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scePowerGetBusClockFrequencyInt(): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_scePowerGetBusClockFrequencyInt() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scePowerGetBusClockFrequencyFloat(): Float =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_scePowerGetBusClockFrequencyFloat() as Double).toFloat() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scePowerSetClockFrequency(pllfreq: Int, cpufreq: Int, busfreq: Int): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_scePowerSetClockFrequency(pllfreq, cpufreq, busfreq) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scePowerLock(unknown: Int): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_scePowerLock(unknown) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scePowerUnlock(unknown: Int): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_scePowerUnlock(unknown) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scePowerTick(t: PowerTick): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scePowerGetIdleTimer(): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_scePowerGetIdleTimer() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scePowerIdleTimerEnable(unknown: Int): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_scePowerIdleTimerEnable(unknown) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scePowerIdleTimerDisable(unknown: Int): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_scePowerIdleTimerDisable(unknown) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scePowerRequestStandby(): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_scePowerRequestStandby() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scePowerRequestSuspend(): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_scePowerRequestSuspend() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceWlanDevIsPowerOn(): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceWlanDevIsPowerOn() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceWlanGetSwitchState(): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceWlanGetSwitchState() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceWlanGetEtherAddr(etherAddr: COpaquePointer?): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceWlanGetEtherAddr((etherAddr?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceWlanDevAttach(): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceWlanDevAttach() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceWlanDevDetach(): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceWlanDevDetach() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceRtcGetTickResolution(): UInt =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceRtcGetTickResolution() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceRtcGetCurrentTick(tick: COpaquePointer?): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceRtcGetCurrentTick((tick?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceRtcGetCurrentClock(tm: COpaquePointer?, tz: Int): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceRtcGetCurrentClock((tm?.value ?: 0L).toString(), tz) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceRtcGetCurrentClockLocalTime(tm: COpaquePointer?): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceRtcGetCurrentClockLocalTime((tm?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceRtcConvertUtcToLocalTime(tickUtc: COpaquePointer?, tickLocal: COpaquePointer?): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceRtcConvertUtcToLocalTime((tickUtc?.value ?: 0L).toString(), (tickLocal?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceRtcConvertLocalTimeToUTC(tickLocal: COpaquePointer?, tickUtc: COpaquePointer?): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceRtcConvertLocalTimeToUTC((tickLocal?.value ?: 0L).toString(), (tickUtc?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceRtcIsLeapYear(year: Int): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceRtcIsLeapYear(year) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceRtcGetDaysInMonth(year: Int, month: Int): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceRtcGetDaysInMonth(year, month) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceRtcGetDayOfWeek(year: Int, month: Int, day: Int): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceRtcGetDayOfWeek(year, month, day) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceRtcCheckValid(date: COpaquePointer?): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceRtcCheckValid((date?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceRtcSetTick(date: COpaquePointer?, tick: COpaquePointer?): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceRtcSetTick((date?.value ?: 0L).toString(), (tick?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceRtcGetTick(date: COpaquePointer?, tick: COpaquePointer?): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceRtcGetTick((date?.value ?: 0L).toString(), (tick?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceRtcCompareTick(tick1: COpaquePointer?, tick2: COpaquePointer?): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceRtcCompareTick((tick1?.value ?: 0L).toString(), (tick2?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceRtcTickAddTicks(destTick: COpaquePointer?, srcTick: COpaquePointer?, numTicks: ULong): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceRtcTickAddTicks((destTick?.value ?: 0L).toString(), (srcTick?.value ?: 0L).toString(), numTicks.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceRtcTickAddMicroseconds(destTick: COpaquePointer?, srcTick: COpaquePointer?, numMs: ULong): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceRtcTickAddMicroseconds((destTick?.value ?: 0L).toString(), (srcTick?.value ?: 0L).toString(), numMs.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceRtcTickAddSeconds(destTick: COpaquePointer?, srcTick: COpaquePointer?, numSeconds: ULong): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceRtcTickAddSeconds((destTick?.value ?: 0L).toString(), (srcTick?.value ?: 0L).toString(), numSeconds.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceRtcTickAddMinutes(destTick: COpaquePointer?, srcTick: COpaquePointer?, numMinutes: ULong): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceRtcTickAddMinutes((destTick?.value ?: 0L).toString(), (srcTick?.value ?: 0L).toString(), numMinutes.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceRtcTickAddHours(destTick: COpaquePointer?, srcTick: COpaquePointer?, numHours: ULong): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceRtcTickAddHours((destTick?.value ?: 0L).toString(), (srcTick?.value ?: 0L).toString(), numHours.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceRtcTickAddDays(destTick: COpaquePointer?, srcTick: COpaquePointer?, numDays: ULong): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceRtcTickAddDays((destTick?.value ?: 0L).toString(), (srcTick?.value ?: 0L).toString(), numDays.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceRtcTickAddWeeks(destTick: COpaquePointer?, srcTick: COpaquePointer?, numWeeks: ULong): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceRtcTickAddWeeks((destTick?.value ?: 0L).toString(), (srcTick?.value ?: 0L).toString(), numWeeks.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceRtcTickAddMonths(destTick: COpaquePointer?, srcTick: COpaquePointer?, numMonths: ULong): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceRtcTickAddMonths((destTick?.value ?: 0L).toString(), (srcTick?.value ?: 0L).toString(), numMonths.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceRtcTickAddYears(destTick: COpaquePointer?, srcTick: COpaquePointer?, numYears: ULong): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceRtcTickAddYears((destTick?.value ?: 0L).toString(), (srcTick?.value ?: 0L).toString(), numYears.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceRtcSetTimeT(date: COpaquePointer?, time: UInt): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceRtcSetTimeT((date?.value ?: 0L).toString(), time.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceRtcGetTimeT(date: COpaquePointer?, time: COpaquePointer?): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceRtcGetTimeT((date?.value ?: 0L).toString(), (time?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceRtcSetTime64T(date: COpaquePointer?, time: ULong): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceRtcSetTime64T((date?.value ?: 0L).toString(), time.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceRtcGetTime64T(date: COpaquePointer?, time: COpaquePointer?): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceRtcGetTime64T((date?.value ?: 0L).toString(), (time?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceRtcSetDosTime(date: COpaquePointer?, dosTime: UInt): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceRtcSetDosTime((date?.value ?: 0L).toString(), dosTime.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceRtcGetDosTime(date: COpaquePointer?, dosTime: UInt): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceRtcGetDosTime((date?.value ?: 0L).toString(), dosTime.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceRtcSetWin32FileTime(date: COpaquePointer?, time: COpaquePointer?): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceRtcSetWin32FileTime((date?.value ?: 0L).toString(), (time?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceRtcGetWin32FileTime(date: COpaquePointer?, time: COpaquePointer?): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceRtcGetWin32FileTime((date?.value ?: 0L).toString(), (time?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceRtcParseDateTime(destTick: COpaquePointer?, dateString: COpaquePointer?): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceRtcParseDateTime((destTick?.value ?: 0L).toString(), (dateString?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceRtcFormatRFC3339(pszDateTime: COpaquePointer?, pUtc: COpaquePointer?, timeZoneMinutes: Int): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceRtcFormatRFC3339((pszDateTime?.value ?: 0L).toString(), (pUtc?.value ?: 0L).toString(), timeZoneMinutes) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceRtcFormatRFC3339LocalTime(pszDateTime: COpaquePointer?, pUtc: COpaquePointer?): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceRtcFormatRFC3339LocalTime((pszDateTime?.value ?: 0L).toString(), (pUtc?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceRtcParseRFC3339(pUtc: COpaquePointer?, pszDateTime: COpaquePointer?): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceRtcParseRFC3339((pUtc?.value ?: 0L).toString(), (pszDateTime?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceRtcFormatRFC2822(pszDateTime: COpaquePointer?, pUtc: COpaquePointer?, timeZoneMinutes: Int): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceRtcFormatRFC2822((pszDateTime?.value ?: 0L).toString(), (pUtc?.value ?: 0L).toString(), timeZoneMinutes) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceRtcFormatRFC2822LocalTime(pszDateTime: COpaquePointer?, pUtc: COpaquePointer?): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceRtcFormatRFC2822LocalTime((pszDateTime?.value ?: 0L).toString(), (pUtc?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceIoOpen(file: COpaquePointer?, flags: Int, permissions: IoPermissions): SceUid =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceIoOpenAsync(file: COpaquePointer?, flags: Int, permissions: IoPermissions): SceUid =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceIoClose(fd: SceUid): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceIoCloseAsync(fd: SceUid): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceIoRead(fd: SceUid, data: COpaquePointer?, size: UInt): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceIoReadAsync(fd: SceUid, data: COpaquePointer?, size: UInt): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceIoWrite(fd: SceUid, data: COpaquePointer?, size: ULong): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceIoWriteAsync(fd: SceUid, data: COpaquePointer?, size: UInt): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceIoLseek(fd: SceUid, offset: Long, whence: IoWhence): Long =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceIoLseekAsync(fd: SceUid, offset: Long, whence: IoWhence): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceIoLseek32(fd: SceUid, offset: Int, whence: IoWhence): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceIoLseek32Async(fd: SceUid, offset: Int, whence: IoWhence): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceIoRemove(file: COpaquePointer?): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceIoRemove((file?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceIoMkdir(dir: COpaquePointer?, mode: IoPermissions): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceIoMkdir((dir?.value ?: 0L).toString(), mode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceIoRmdir(path: COpaquePointer?): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceIoRmdir((path?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceIoChdir(path: COpaquePointer?): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceIoChdir((path?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceIoRename(oldname: COpaquePointer?, newname: COpaquePointer?): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceIoRename((oldname?.value ?: 0L).toString(), (newname?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceIoDopen(dirname: COpaquePointer?): SceUid =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceIoDread(fd: SceUid, dir: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceIoDclose(fd: SceUid): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceIoDevctl(dev: COpaquePointer?, cmd: UInt, indata: COpaquePointer?, inlen: Int, outdata: COpaquePointer?, outlen: Int): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceIoDevctl((dev?.value ?: 0L).toString(), cmd.toInt(), (indata?.value ?: 0L).toString(), inlen, (outdata?.value ?: 0L).toString(), outlen) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceIoAssign(dev1: COpaquePointer?, dev2: COpaquePointer?, dev3: COpaquePointer?, mode: IoAssignPerms, unk1: COpaquePointer?, unk2: Int): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceIoUnassign(dev: COpaquePointer?): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceIoUnassign((dev?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceIoGetstat(file: COpaquePointer?, stat: COpaquePointer?): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceIoGetstat((file?.value ?: 0L).toString(), (stat?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceIoChstat(file: COpaquePointer?, stat: COpaquePointer?, bits: Int): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceIoChstat((file?.value ?: 0L).toString(), (stat?.value ?: 0L).toString(), bits) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceIoIoctl(fd: SceUid, cmd: UInt, indata: COpaquePointer?, inlen: Int, outdata: COpaquePointer?, outlen: Int): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceIoIoctlAsync(fd: SceUid, cmd: UInt, indata: COpaquePointer?, inlen: Int, outdata: COpaquePointer?, outlen: Int): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceIoSync(device: COpaquePointer?, unk: UInt): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceIoSync((device?.value ?: 0L).toString(), unk.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceIoWaitAsync(fd: SceUid, res: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceIoWaitAsyncCB(fd: SceUid, res: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceIoPollAsync(fd: SceUid, res: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceIoGetAsyncStat(fd: SceUid, poll: Int, res: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceIoCancel(fd: SceUid): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceIoGetDevType(fd: SceUid): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceIoChangeAsyncPriority(fd: SceUid, pri: Int): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceIoSetAsyncCallback(fd: SceUid, cb: SceUid, argp: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceJpegInitMJpeg(): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceJpegInitMJpeg() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceJpegFinishMJpeg(): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceJpegFinishMJpeg() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceJpegCreateMJpeg(width: Int, height: Int): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceJpegCreateMJpeg(width, height) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceJpegDeleteMJpeg(): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceJpegDeleteMJpeg() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceJpegDecodeMJpeg(jpegBuf: COpaquePointer?, size: ULong, rgba: COpaquePointer?, unk: UInt): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceJpegDecodeMJpeg((jpegBuf?.value ?: 0L).toString(), size.toString(), (rgba?.value ?: 0L).toString(), unk.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUmdCheckMedium(): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceUmdCheckMedium() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUmdGetDiscInfo(info: COpaquePointer?): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceUmdGetDiscInfo((info?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUmdActivate(unit: Int, drive: COpaquePointer?): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceUmdActivate(unit, (drive?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUmdDeactivate(unit: Int, drive: COpaquePointer?): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceUmdDeactivate(unit, (drive?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUmdWaitDriveStat(state: Int): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceUmdWaitDriveStat(state) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUmdWaitDriveStatWithTimer(state: Int, timeout: UInt): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceUmdWaitDriveStatWithTimer(state, timeout.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUmdWaitDriveStatCB(state: Int, timeout: UInt): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceUmdWaitDriveStatCB(state, timeout.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUmdCancelWaitDriveStat(): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceUmdCancelWaitDriveStat() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUmdGetDriveStat(): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceUmdGetDriveStat() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUmdGetErrorStat(): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceUmdGetErrorStat() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUmdRegisterUMDCallBack(cbid: Int): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceUmdRegisterUMDCallBack(cbid) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUmdUnRegisterUMDCallBack(cbid: Int): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceUmdUnRegisterUMDCallBack(cbid) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUmdReplacePermit(): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceUmdReplacePermit() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUmdReplaceProhibit(): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceUmdReplaceProhibit() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceMpegInit(): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceMpegInit() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceMpegFinish() {
    if (_pspNapiAddon != null) {
        _pspNapiAddon.libc_psp_sceMpegFinish()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceMpegRingbufferQueryMemSize(packets: Int): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceMpegRingbufferQueryMemSize(packets) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceMpegRingbufferConstruct(ringbuffer: COpaquePointer?, packets: Int, data: COpaquePointer?, size: Int, callback: SceMpegRingbufferCb, cbParam: COpaquePointer?): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceMpegRingbufferConstruct((ringbuffer?.value ?: 0L).toString(), packets, (data?.value ?: 0L).toString(), size, 0L.toString(), (cbParam?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceMpegRingbufferDestruct(ringbuffer: COpaquePointer?) {
    if (_pspNapiAddon != null) {
        _pspNapiAddon.libc_psp_sceMpegRingbufferDestruct((ringbuffer?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceMpegRingbufferAvailableSize(ringbuffer: COpaquePointer?): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceMpegRingbufferAvailableSize((ringbuffer?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceMpegRingbufferPut(ringbuffer: COpaquePointer?, numPackets: Int, available: Int): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceMpegRingbufferPut((ringbuffer?.value ?: 0L).toString(), numPackets, available) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceMpegQueryMemSize(unk: Int): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceMpegQueryMemSize(unk) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceMpegCreate(handle: SceMpeg, data: COpaquePointer?, size: Int, ringbuffer: COpaquePointer?, frameWidth: Int, unk1: Int, unk2: Int): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceMpegDelete(handle: SceMpeg) {
    throw UnsupportedOperationException("Native FFI addon is not available")
}

public actual fun sceMpegQueryStreamOffset(handle: SceMpeg, buffer: COpaquePointer?, offset: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceMpegQueryStreamSize(buffer: COpaquePointer?, size: COpaquePointer?): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceMpegQueryStreamSize((buffer?.value ?: 0L).toString(), (size?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceMpegRegistStream(handle: SceMpeg, streamId: Int, unk: Int): SceMpegStream =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceMpegUnRegistStream(handle: SceMpeg, stream: SceMpegStream) {
    throw UnsupportedOperationException("Native FFI addon is not available")
}

public actual fun sceMpegFlushAllStream(handle: SceMpeg): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceMpegMallocAvcEsBuf(handle: SceMpeg): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceMpegFreeAvcEsBuf(handle: SceMpeg, buf: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI addon is not available")
}

public actual fun sceMpegQueryAtracEsSize(handle: SceMpeg, esSize: COpaquePointer?, outSize: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceMpegInitAu(handle: SceMpeg, esBuffer: COpaquePointer?, au: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceMpegGetAvcAu(handle: SceMpeg, stream: SceMpegStream, au: COpaquePointer?, unk: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceMpegAvcDecodeMode(handle: SceMpeg, mode: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceMpegAvcDecode(handle: SceMpeg, au: COpaquePointer?, iframeWidth: Int, buffer: COpaquePointer?, init: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceMpegAvcDecodeStop(handle: SceMpeg, frameWidth: Int, buffer: COpaquePointer?, status: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceMpegGetAtracAu(handle: SceMpeg, stream: SceMpegStream, au: COpaquePointer?, unk: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceMpegAtracDecode(handle: SceMpeg, au: COpaquePointer?, buffer: COpaquePointer?, init: Int): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceMpegBaseYCrCbCopyVme(yuvBuffer: COpaquePointer?, buffer: COpaquePointer?, type: Int): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceMpegBaseYCrCbCopyVme((yuvBuffer?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), type) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceMpegBaseCscInit(width: Int): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceMpegBaseCscInit(width) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceMpegBaseCscVme(rgbBuffer: COpaquePointer?, rgbBuffer2: COpaquePointer?, width: Int, yCrCbBuffer: COpaquePointer?): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceMpegBaseCscVme((rgbBuffer?.value ?: 0L).toString(), (rgbBuffer2?.value ?: 0L).toString(), width, (yCrCbBuffer?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceMpegbaseBea18f91(lli: COpaquePointer?): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceMpegbaseBea18f91((lli?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceHprmPeekCurrentKey(key: COpaquePointer?): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceHprmPeekCurrentKey((key?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceHprmPeekLatch(latch: COpaquePointer?): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceHprmPeekLatch((latch?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceHprmReadLatch(latch: COpaquePointer?): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceHprmReadLatch((latch?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceHprmIsHeadphoneExist(): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceHprmIsHeadphoneExist() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceHprmIsRemoteExist(): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceHprmIsRemoteExist() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceHprmIsMicrophoneExist(): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceHprmIsMicrophoneExist() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGuDepthBuffer(zbp: COpaquePointer?, zbw: Int) {
    if (_pspNapiAddon != null) {
        _pspNapiAddon.libc_psp_sceGuDepthBuffer((zbp?.value ?: 0L).toString(), zbw)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGuDispBuffer(width: Int, height: Int, dispbp: COpaquePointer?, dispbw: Int) {
    if (_pspNapiAddon != null) {
        _pspNapiAddon.libc_psp_sceGuDispBuffer(width, height, (dispbp?.value ?: 0L).toString(), dispbw)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGuDrawBuffer(psm: DisplayPixelFormat, fbp: COpaquePointer?, fbw: Int) {
    throw UnsupportedOperationException("Native FFI addon is not available")
}

public actual fun sceGuDrawBufferList(psm: DisplayPixelFormat, fbp: COpaquePointer?, fbw: Int) {
    throw UnsupportedOperationException("Native FFI addon is not available")
}

public actual fun sceGuDisplay(state: Boolean): Boolean =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceGuDisplay(state) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGuDepthFunc(function: DepthFunc) {
    throw UnsupportedOperationException("Native FFI addon is not available")
}

public actual fun sceGuDepthMask(mask: Int) {
    if (_pspNapiAddon != null) {
        _pspNapiAddon.libc_psp_sceGuDepthMask(mask)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGuDepthOffset(offset: Int) {
    if (_pspNapiAddon != null) {
        _pspNapiAddon.libc_psp_sceGuDepthOffset(offset)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGuDepthRange(near: Int, far: Int) {
    if (_pspNapiAddon != null) {
        _pspNapiAddon.libc_psp_sceGuDepthRange(near, far)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGuFog(near: Float, far: Float, color: UInt) {
    if (_pspNapiAddon != null) {
        _pspNapiAddon.libc_psp_sceGuFog(near.toDouble(), far.toDouble(), color.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGuInit() {
    if (_pspNapiAddon != null) {
        _pspNapiAddon.libc_psp_sceGuInit()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGuTerm() {
    if (_pspNapiAddon != null) {
        _pspNapiAddon.libc_psp_sceGuTerm()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGuBreak(mode: Int) {
    if (_pspNapiAddon != null) {
        _pspNapiAddon.libc_psp_sceGuBreak(mode)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGuContinue() {
    if (_pspNapiAddon != null) {
        _pspNapiAddon.libc_psp_sceGuContinue()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGuSetCallback(signal: GuCallbackId, callback: GuCallback): GuCallback =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGuSignal(behavior: SignalBehavior, signal: Int) {
    throw UnsupportedOperationException("Native FFI addon is not available")
}

public actual fun sceGuSendCommandf(cmd: GeCommand, argument: Float) {
    throw UnsupportedOperationException("Native FFI addon is not available")
}

public actual fun sceGuSendCommandi(cmd: GeCommand, argument: Int) {
    throw UnsupportedOperationException("Native FFI addon is not available")
}

public actual fun sceGuGetMemory(size: Int): COpaquePointer? =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceGuGetMemory(size) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGuStart(contextType: GuContextType, list: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI addon is not available")
}

public actual fun sceGuFinish(): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceGuFinish() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGuFinishId(id: UInt): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceGuFinishId(id.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGuCallList(list: COpaquePointer?) {
    if (_pspNapiAddon != null) {
        _pspNapiAddon.libc_psp_sceGuCallList((list?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGuCallMode(mode: Int) {
    if (_pspNapiAddon != null) {
        _pspNapiAddon.libc_psp_sceGuCallMode(mode)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGuCheckList(): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceGuCheckList() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGuSendList(mode: GuQueueMode, list: COpaquePointer?, context: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI addon is not available")
}

public actual fun sceGuSwapBuffers(): COpaquePointer? =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceGuSwapBuffers() as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGuSync(mode: GuSyncMode, behavior: GuSyncBehavior): GeListState =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGuDrawArray(prim: GuPrimitive, vtype: Int, count: Int, indices: COpaquePointer?, vertices: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI addon is not available")
}

public actual fun sceGuBeginObject(vtype: Int, count: Int, indices: COpaquePointer?, vertices: COpaquePointer?) {
    if (_pspNapiAddon != null) {
        _pspNapiAddon.libc_psp_sceGuBeginObject(vtype, count, (indices?.value ?: 0L).toString(), (vertices?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGuEndObject() {
    if (_pspNapiAddon != null) {
        _pspNapiAddon.libc_psp_sceGuEndObject()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGuSetStatus(state: GuState, status: Int) {
    throw UnsupportedOperationException("Native FFI addon is not available")
}

public actual fun sceGuGetStatus(state: GuState): Boolean =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGuSetAllStatus(status: Int) {
    if (_pspNapiAddon != null) {
        _pspNapiAddon.libc_psp_sceGuSetAllStatus(status)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGuGetAllStatus(): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceGuGetAllStatus() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGuEnable(state: GuState) {
    throw UnsupportedOperationException("Native FFI addon is not available")
}

public actual fun sceGuDisable(state: GuState) {
    throw UnsupportedOperationException("Native FFI addon is not available")
}

public actual fun sceGuLight(light: Int, type: LightType, components: Int, position: ScePspFVector3) {
    throw UnsupportedOperationException("Native FFI addon is not available")
}

public actual fun sceGuLightAtt(light: Int, atten0: Float, atten1: Float, atten2: Float) {
    if (_pspNapiAddon != null) {
        _pspNapiAddon.libc_psp_sceGuLightAtt(light, atten0.toDouble(), atten1.toDouble(), atten2.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGuLightColor(light: Int, component: Int, color: UInt) {
    if (_pspNapiAddon != null) {
        _pspNapiAddon.libc_psp_sceGuLightColor(light, component, color.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGuLightMode(mode: LightMode) {
    throw UnsupportedOperationException("Native FFI addon is not available")
}

public actual fun sceGuLightSpot(light: Int, direction: ScePspFVector3, exponent: Float, cutoff: Float) {
    throw UnsupportedOperationException("Native FFI addon is not available")
}

public actual fun sceGuClear(flags: Int) {
    if (_pspNapiAddon != null) {
        _pspNapiAddon.libc_psp_sceGuClear(flags)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGuClearColor(color: UInt) {
    if (_pspNapiAddon != null) {
        _pspNapiAddon.libc_psp_sceGuClearColor(color.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGuClearDepth(depth: UInt) {
    if (_pspNapiAddon != null) {
        _pspNapiAddon.libc_psp_sceGuClearDepth(depth.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGuClearStencil(stencil: UInt) {
    if (_pspNapiAddon != null) {
        _pspNapiAddon.libc_psp_sceGuClearStencil(stencil.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGuPixelMask(mask: UInt) {
    if (_pspNapiAddon != null) {
        _pspNapiAddon.libc_psp_sceGuPixelMask(mask.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGuColor(color: UInt) {
    if (_pspNapiAddon != null) {
        _pspNapiAddon.libc_psp_sceGuColor(color.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGuColorFunc(func: ColorFunc, color: UInt, mask: UInt) {
    throw UnsupportedOperationException("Native FFI addon is not available")
}

public actual fun sceGuColorMaterial(components: Int) {
    if (_pspNapiAddon != null) {
        _pspNapiAddon.libc_psp_sceGuColorMaterial(components)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGuAlphaFunc(func: AlphaFunc, value: Int, mask: Int) {
    throw UnsupportedOperationException("Native FFI addon is not available")
}

public actual fun sceGuAmbient(color: UInt) {
    if (_pspNapiAddon != null) {
        _pspNapiAddon.libc_psp_sceGuAmbient(color.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGuAmbientColor(color: UInt) {
    if (_pspNapiAddon != null) {
        _pspNapiAddon.libc_psp_sceGuAmbientColor(color.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGuBlendFunc(op: BlendOp, src: BlendSrc, dest: BlendDst, srcFix: UInt, destFix: UInt) {
    throw UnsupportedOperationException("Native FFI addon is not available")
}

public actual fun sceGuMaterial(components: Int, color: UInt) {
    if (_pspNapiAddon != null) {
        _pspNapiAddon.libc_psp_sceGuMaterial(components, color.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGuModelColor(emissive: UInt, ambient: UInt, diffuse: UInt, specular: UInt) {
    if (_pspNapiAddon != null) {
        _pspNapiAddon.libc_psp_sceGuModelColor(emissive.toInt(), ambient.toInt(), diffuse.toInt(), specular.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGuStencilFunc(func: StencilFunc, ref: Int, mask: Int) {
    throw UnsupportedOperationException("Native FFI addon is not available")
}

public actual fun sceGuStencilOp(fail: StencilOperation, zfail: StencilOperation, zpass: StencilOperation) {
    throw UnsupportedOperationException("Native FFI addon is not available")
}

public actual fun sceGuSpecular(power: Float) {
    if (_pspNapiAddon != null) {
        _pspNapiAddon.libc_psp_sceGuSpecular(power.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGuFrontFace(order: FrontFaceDirection) {
    throw UnsupportedOperationException("Native FFI addon is not available")
}

public actual fun sceGuLogicalOp(op: LogicalOperation) {
    throw UnsupportedOperationException("Native FFI addon is not available")
}

public actual fun sceGuSetDither(matrix: ScePspIMatrix4) {
    throw UnsupportedOperationException("Native FFI addon is not available")
}

public actual fun sceGuShadeModel(mode: ShadingModel) {
    throw UnsupportedOperationException("Native FFI addon is not available")
}

public actual fun sceGuCopyImage(psm: DisplayPixelFormat, sx: Int, sy: Int, width: Int, height: Int, srcw: Int, src: COpaquePointer?, dx: Int, dy: Int, destw: Int, dest: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI addon is not available")
}

public actual fun sceGuTexEnvColor(color: UInt) {
    if (_pspNapiAddon != null) {
        _pspNapiAddon.libc_psp_sceGuTexEnvColor(color.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGuTexFilter(min: TextureFilter, mag: TextureFilter) {
    throw UnsupportedOperationException("Native FFI addon is not available")
}

public actual fun sceGuTexFlush() {
    if (_pspNapiAddon != null) {
        _pspNapiAddon.libc_psp_sceGuTexFlush()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGuTexFunc(tfx: TextureEffect, tcc: TextureColorComponent) {
    throw UnsupportedOperationException("Native FFI addon is not available")
}

public actual fun sceGuTexImage(mipmap: MipmapLevel, width: Int, height: Int, tbw: Int, tbp: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI addon is not available")
}

public actual fun sceGuTexLevelMode(mode: TextureLevelMode, bias: Float) {
    throw UnsupportedOperationException("Native FFI addon is not available")
}

public actual fun sceGuTexMapMode(mode: TextureMapMode, a1: UInt, a2: UInt) {
    throw UnsupportedOperationException("Native FFI addon is not available")
}

public actual fun sceGuTexMode(tpsm: TexturePixelFormat, maxmips: Int, a2: Int, swizzle: Int) {
    throw UnsupportedOperationException("Native FFI addon is not available")
}

public actual fun sceGuTexOffset(u: Float, v: Float) {
    if (_pspNapiAddon != null) {
        _pspNapiAddon.libc_psp_sceGuTexOffset(u.toDouble(), v.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGuTexProjMapMode(mode: TextureProjectionMapMode) {
    throw UnsupportedOperationException("Native FFI addon is not available")
}

public actual fun sceGuTexScale(u: Float, v: Float) {
    if (_pspNapiAddon != null) {
        _pspNapiAddon.libc_psp_sceGuTexScale(u.toDouble(), v.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGuTexSlope(slope: Float) {
    if (_pspNapiAddon != null) {
        _pspNapiAddon.libc_psp_sceGuTexSlope(slope.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGuTexSync() {
    if (_pspNapiAddon != null) {
        _pspNapiAddon.libc_psp_sceGuTexSync()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGuTexWrap(u: GuTexWrapMode, v: GuTexWrapMode) {
    throw UnsupportedOperationException("Native FFI addon is not available")
}

public actual fun sceGuClutLoad(numBlocks: Int, cbp: COpaquePointer?) {
    if (_pspNapiAddon != null) {
        _pspNapiAddon.libc_psp_sceGuClutLoad(numBlocks, (cbp?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGuClutMode(cpsm: ClutPixelFormat, shift: UInt, mask: UInt, a3: UInt) {
    throw UnsupportedOperationException("Native FFI addon is not available")
}

public actual fun sceGuOffset(x: UInt, y: UInt) {
    if (_pspNapiAddon != null) {
        _pspNapiAddon.libc_psp_sceGuOffset(x.toInt(), y.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGuScissor(x: Int, y: Int, w: Int, h: Int) {
    if (_pspNapiAddon != null) {
        _pspNapiAddon.libc_psp_sceGuScissor(x, y, w, h)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGuViewport(cx: Int, cy: Int, width: Int, height: Int) {
    if (_pspNapiAddon != null) {
        _pspNapiAddon.libc_psp_sceGuViewport(cx, cy, width, height)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGuDrawBezier(vType: Int, uCount: Int, vCount: Int, indices: COpaquePointer?, vertices: COpaquePointer?) {
    if (_pspNapiAddon != null) {
        _pspNapiAddon.libc_psp_sceGuDrawBezier(vType, uCount, vCount, (indices?.value ?: 0L).toString(), (vertices?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGuPatchDivide(ulevel: UInt, vlevel: UInt) {
    if (_pspNapiAddon != null) {
        _pspNapiAddon.libc_psp_sceGuPatchDivide(ulevel.toInt(), vlevel.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGuPatchFrontFace(a0: UInt) {
    if (_pspNapiAddon != null) {
        _pspNapiAddon.libc_psp_sceGuPatchFrontFace(a0.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGuPatchPrim(prim: PatchPrimitive) {
    throw UnsupportedOperationException("Native FFI addon is not available")
}

public actual fun sceGuDrawSpline(vType: Int, uCount: Int, vCount: Int, uEdge: Int, vEdge: Int, indices: COpaquePointer?, vertices: COpaquePointer?) {
    if (_pspNapiAddon != null) {
        _pspNapiAddon.libc_psp_sceGuDrawSpline(vType, uCount, vCount, uEdge, vEdge, (indices?.value ?: 0L).toString(), (vertices?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGuSetMatrix(type: MatrixMode, matrix: ScePspFMatrix4) {
    throw UnsupportedOperationException("Native FFI addon is not available")
}

public actual fun sceGuBoneMatrix(index: UInt, matrix: ScePspFMatrix4) {
    throw UnsupportedOperationException("Native FFI addon is not available")
}

public actual fun sceGuMorphWeight(index: Int, weight: Float) {
    if (_pspNapiAddon != null) {
        _pspNapiAddon.libc_psp_sceGuMorphWeight(index, weight.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGuDrawArrayN(primitiveType: GuPrimitive, vType: Int, count: Int, a3: Int, indices: COpaquePointer?, vertices: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI addon is not available")
}

public actual fun sceGumDrawArray(prim: GuPrimitive, vType: Int, count: Int, indices: COpaquePointer?, vertices: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI addon is not available")
}

public actual fun sceGumDrawArrayN(prim: GuPrimitive, vType: Int, count: Int, a3: Int, indices: COpaquePointer?, vertices: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI addon is not available")
}

public actual fun sceGumDrawBezier(vType: Int, uCount: Int, vCount: Int, indices: COpaquePointer?, vertices: COpaquePointer?) {
    if (_pspNapiAddon != null) {
        _pspNapiAddon.libc_psp_sceGumDrawBezier(vType, uCount, vCount, (indices?.value ?: 0L).toString(), (vertices?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGumDrawSpline(vType: Int, uCount: Int, vCount: Int, uEdge: Int, vEdge: Int, indices: COpaquePointer?, vertices: COpaquePointer?) {
    if (_pspNapiAddon != null) {
        _pspNapiAddon.libc_psp_sceGumDrawSpline(vType, uCount, vCount, uEdge, vEdge, (indices?.value ?: 0L).toString(), (vertices?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGumFastInverse() {
    if (_pspNapiAddon != null) {
        _pspNapiAddon.libc_psp_sceGumFastInverse()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGumFullInverse() {
    if (_pspNapiAddon != null) {
        _pspNapiAddon.libc_psp_sceGumFullInverse()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGumLoadIdentity() {
    if (_pspNapiAddon != null) {
        _pspNapiAddon.libc_psp_sceGumLoadIdentity()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGumLoadMatrix(m: ScePspFMatrix4) {
    throw UnsupportedOperationException("Native FFI addon is not available")
}

public actual fun sceGumLookAt(eye: ScePspFVector3, center: ScePspFVector3, up: ScePspFVector3) {
    throw UnsupportedOperationException("Native FFI addon is not available")
}

public actual fun sceGumMatrixMode(mode: MatrixMode) {
    throw UnsupportedOperationException("Native FFI addon is not available")
}

public actual fun sceGumMultMatrix(m: ScePspFMatrix4) {
    throw UnsupportedOperationException("Native FFI addon is not available")
}

public actual fun sceGumOrtho(left: Float, right: Float, bottom: Float, top: Float, near: Float, far: Float) {
    if (_pspNapiAddon != null) {
        _pspNapiAddon.libc_psp_sceGumOrtho(left.toDouble(), right.toDouble(), bottom.toDouble(), top.toDouble(), near.toDouble(), far.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGumPerspective(fovy: Float, aspect: Float, near: Float, far: Float) {
    if (_pspNapiAddon != null) {
        _pspNapiAddon.libc_psp_sceGumPerspective(fovy.toDouble(), aspect.toDouble(), near.toDouble(), far.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGumPopMatrix() {
    if (_pspNapiAddon != null) {
        _pspNapiAddon.libc_psp_sceGumPopMatrix()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGumPushMatrix() {
    if (_pspNapiAddon != null) {
        _pspNapiAddon.libc_psp_sceGumPushMatrix()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGumRotateX(angle: Float) {
    if (_pspNapiAddon != null) {
        _pspNapiAddon.libc_psp_sceGumRotateX(angle.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGumRotateY(angle: Float) {
    if (_pspNapiAddon != null) {
        _pspNapiAddon.libc_psp_sceGumRotateY(angle.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGumRotateZ(angle: Float) {
    if (_pspNapiAddon != null) {
        _pspNapiAddon.libc_psp_sceGumRotateZ(angle.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGumRotateXYZ(v: ScePspFVector3) {
    throw UnsupportedOperationException("Native FFI addon is not available")
}

public actual fun sceGumRotateZYX(v: ScePspFVector3) {
    throw UnsupportedOperationException("Native FFI addon is not available")
}

public actual fun sceGumScale(v: ScePspFVector3) {
    throw UnsupportedOperationException("Native FFI addon is not available")
}

public actual fun sceGumStoreMatrix(m: ScePspFMatrix4) {
    throw UnsupportedOperationException("Native FFI addon is not available")
}

public actual fun sceGumTranslate(v: ScePspFVector3) {
    throw UnsupportedOperationException("Native FFI addon is not available")
}

public actual fun sceGumUpdateMatrix() {
    if (_pspNapiAddon != null) {
        _pspNapiAddon.libc_psp_sceGumUpdateMatrix()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceMp3ReserveMp3Handle(args: COpaquePointer?): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceMp3ReserveMp3Handle((args?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceMp3ReleaseMp3Handle(handle: Mp3Handle): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceMp3InitResource(): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceMp3InitResource() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceMp3TermResource(): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceMp3TermResource() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceMp3Init(handle: Mp3Handle): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceMp3Decode(handle: Mp3Handle, dst: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceMp3GetInfoToAddStreamData(handle: Mp3Handle, dst: COpaquePointer?, toWrite: COpaquePointer?, srcPos: COpaquePointer?): Int =
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

public actual fun sceRegOpenRegistry(reg: COpaquePointer?, mode: Int, handle: COpaquePointer?): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceRegOpenRegistry((reg?.value ?: 0L).toString(), mode, (handle?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceRegFlushRegistry(handle: RegHandle): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceRegCloseRegistry(handle: RegHandle): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceRegOpenCategory(handle: RegHandle, name: COpaquePointer?, mode: Int, dirHandle: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceRegRemoveCategory(handle: RegHandle, name: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceRegCloseCategory(dirHandle: RegHandle): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceRegFlushCategory(dirHandle: RegHandle): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceRegGetKeyInfo(dirHandle: RegHandle, name: COpaquePointer?, keyHandle: COpaquePointer?, type: COpaquePointer?, size: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceRegGetKeyInfoByName(dirHandle: RegHandle, name: COpaquePointer?, type: COpaquePointer?, size: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceRegGetKeyValue(dirHandle: RegHandle, keyHandle: RegHandle, buf: COpaquePointer?, size: ULong): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceRegGetKeyValueByName(dirHandle: RegHandle, name: COpaquePointer?, buf: COpaquePointer?, size: ULong): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceRegSetKeyValue(dirHandle: RegHandle, name: COpaquePointer?, buf: COpaquePointer?, size: ULong): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceRegGetKeysNum(dirHandle: RegHandle, num: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceRegGetKeys(dirHandle: RegHandle, buf: COpaquePointer?, num: Int): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceRegCreateKey(dirHandle: RegHandle, name: COpaquePointer?, type: Int, size: ULong): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceRegRemoveRegistry(key: COpaquePointer?): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceRegRemoveRegistry((key?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceOpenPSIDGetOpenPSID(openpsid: COpaquePointer?): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceOpenPSIDGetOpenPSID((openpsid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUtilityMsgDialogInitStart(params: COpaquePointer?): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceUtilityMsgDialogInitStart((params?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUtilityMsgDialogShutdownStart() {
    if (_pspNapiAddon != null) {
        _pspNapiAddon.libc_psp_sceUtilityMsgDialogShutdownStart()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceUtilityMsgDialogGetStatus(): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceUtilityMsgDialogGetStatus() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUtilityMsgDialogUpdate(n: Int) {
    if (_pspNapiAddon != null) {
        _pspNapiAddon.libc_psp_sceUtilityMsgDialogUpdate(n)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceUtilityMsgDialogAbort(): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceUtilityMsgDialogAbort() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUtilityNetconfInitStart(data: COpaquePointer?): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceUtilityNetconfInitStart((data?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUtilityNetconfShutdownStart(): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceUtilityNetconfShutdownStart() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUtilityNetconfUpdate(unknown: Int): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceUtilityNetconfUpdate(unknown) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUtilityNetconfGetStatus(): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceUtilityNetconfGetStatus() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUtilityCheckNetParam(id: Int): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceUtilityCheckNetParam(id) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUtilityGetNetParam(conf: Int, param: NetParam, data: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUtilitySavedataInitStart(params: COpaquePointer?): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceUtilitySavedataInitStart((params?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUtilitySavedataGetStatus(): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceUtilitySavedataGetStatus() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUtilitySavedataShutdownStart(): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceUtilitySavedataShutdownStart() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUtilitySavedataUpdate(unknown: Int) {
    if (_pspNapiAddon != null) {
        _pspNapiAddon.libc_psp_sceUtilitySavedataUpdate(unknown)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceUtilityGameSharingInitStart(params: COpaquePointer?): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceUtilityGameSharingInitStart((params?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUtilityGameSharingShutdownStart() {
    if (_pspNapiAddon != null) {
        _pspNapiAddon.libc_psp_sceUtilityGameSharingShutdownStart()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceUtilityGameSharingGetStatus(): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceUtilityGameSharingGetStatus() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUtilityGameSharingUpdate(n: Int) {
    if (_pspNapiAddon != null) {
        _pspNapiAddon.libc_psp_sceUtilityGameSharingUpdate(n)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceUtilityHtmlViewerInitStart(params: COpaquePointer?): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceUtilityHtmlViewerInitStart((params?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUtilityHtmlViewerShutdownStart(): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceUtilityHtmlViewerShutdownStart() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUtilityHtmlViewerUpdate(n: Int): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceUtilityHtmlViewerUpdate(n) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUtilityHtmlViewerGetStatus(): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceUtilityHtmlViewerGetStatus() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUtilitySetSystemParamInt(id: SystemParamId, value: Int): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUtilitySetSystemParamString(id: SystemParamId, str: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUtilityGetSystemParamInt(id: SystemParamId, value: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUtilityGetSystemParamString(id: SystemParamId, str: COpaquePointer?, len: Int): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUtilityOskInitStart(params: COpaquePointer?): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceUtilityOskInitStart((params?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUtilityOskShutdownStart(): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceUtilityOskShutdownStart() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUtilityOskUpdate(n: Int): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceUtilityOskUpdate(n) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUtilityOskGetStatus(): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceUtilityOskGetStatus() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

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
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceUtilityCreateNetParam(conf) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUtilitySetNetParam(param: NetParam, value: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUtilityCopyNetParam(src: Int, dest: Int): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceUtilityCopyNetParam(src, dest) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUtilityDeleteNetParam(conf: Int): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceUtilityDeleteNetParam(conf) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetInit(poolsize: Int, calloutprio: Int, calloutstack: Int, netintrprio: Int, netintrstack: Int): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceNetInit(poolsize, calloutprio, calloutstack, netintrprio, netintrstack) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetTerm(): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceNetTerm() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetFreeThreadinfo(thid: Int): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceNetFreeThreadinfo(thid) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetThreadAbort(thid: Int): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceNetThreadAbort(thid) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetEtherStrton(name: COpaquePointer?, mac: COpaquePointer?) {
    if (_pspNapiAddon != null) {
        _pspNapiAddon.libc_psp_sceNetEtherStrton((name?.value ?: 0L).toString(), (mac?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceNetEtherNtostr(mac: COpaquePointer?, name: COpaquePointer?) {
    if (_pspNapiAddon != null) {
        _pspNapiAddon.libc_psp_sceNetEtherNtostr((mac?.value ?: 0L).toString(), (name?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceNetGetLocalEtherAddr(mac: COpaquePointer?): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceNetGetLocalEtherAddr((mac?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetGetMallocStat(stat: COpaquePointer?): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceNetGetMallocStat((stat?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocctlInit(stacksize: Int, priority: Int, adhocId: COpaquePointer?): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceNetAdhocctlInit(stacksize, priority, (adhocId?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocctlTerm(): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceNetAdhocctlTerm() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocctlConnect(name: COpaquePointer?): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceNetAdhocctlConnect((name?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocctlDisconnect(): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceNetAdhocctlDisconnect() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocctlGetState(event: COpaquePointer?): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceNetAdhocctlGetState((event?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocctlCreate(name: COpaquePointer?): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceNetAdhocctlCreate((name?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocctlJoin(scaninfo: COpaquePointer?): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceNetAdhocctlJoin((scaninfo?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocctlGetAdhocId(id: COpaquePointer?): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceNetAdhocctlGetAdhocId((id?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocctlCreateEnterGameMode(name: COpaquePointer?, unknown: Int, num: Int, macs: COpaquePointer?, timeout: UInt, unknown2: Int): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceNetAdhocctlCreateEnterGameMode((name?.value ?: 0L).toString(), unknown, num, (macs?.value ?: 0L).toString(), timeout.toInt(), unknown2) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocctlJoinEnterGameMode(name: COpaquePointer?, hostmac: COpaquePointer?, timeout: UInt, unknown: Int): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceNetAdhocctlJoinEnterGameMode((name?.value ?: 0L).toString(), (hostmac?.value ?: 0L).toString(), timeout.toInt(), unknown) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocctlGetGameModeInfo(gamemodeinfo: COpaquePointer?): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceNetAdhocctlGetGameModeInfo((gamemodeinfo?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocctlExitGameMode(): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceNetAdhocctlExitGameMode() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocctlGetPeerList(length: COpaquePointer?, buf: COpaquePointer?): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceNetAdhocctlGetPeerList((length?.value ?: 0L).toString(), (buf?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocctlGetPeerInfo(mac: COpaquePointer?, size: Int, peerinfo: COpaquePointer?): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceNetAdhocctlGetPeerInfo((mac?.value ?: 0L).toString(), size, (peerinfo?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocctlScan(): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceNetAdhocctlScan() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocctlGetScanInfo(length: COpaquePointer?, buf: COpaquePointer?): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceNetAdhocctlGetScanInfo((length?.value ?: 0L).toString(), (buf?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocctlAddHandler(handler: SceNetAdhocctlHandler, unknown: COpaquePointer?): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceNetAdhocctlAddHandler(0L.toString(), (unknown?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocctlDelHandler(id: Int): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceNetAdhocctlDelHandler(id) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocctlGetNameByAddr(mac: COpaquePointer?, nickname: COpaquePointer?): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceNetAdhocctlGetNameByAddr((mac?.value ?: 0L).toString(), (nickname?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocctlGetAddrByName(nickname: COpaquePointer?, length: COpaquePointer?, buf: COpaquePointer?): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceNetAdhocctlGetAddrByName((nickname?.value ?: 0L).toString(), (length?.value ?: 0L).toString(), (buf?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocctlGetParameter(params: COpaquePointer?): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceNetAdhocctlGetParameter((params?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocInit(): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceNetAdhocInit() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocTerm(): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceNetAdhocTerm() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocPdpCreate(mac: COpaquePointer?, port: UShort, bufSize: UInt, unk1: Int): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceNetAdhocPdpCreate((mac?.value ?: 0L).toString(), port.toInt(), bufSize.toInt(), unk1) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocPdpDelete(id: Int, unk1: Int): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceNetAdhocPdpDelete(id, unk1) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocPdpSend(id: Int, destMacAddr: COpaquePointer?, port: UShort, data: COpaquePointer?, len: UInt, timeout: UInt, nonblock: Int): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceNetAdhocPdpSend(id, (destMacAddr?.value ?: 0L).toString(), port.toInt(), (data?.value ?: 0L).toString(), len.toInt(), timeout.toInt(), nonblock) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocPdpRecv(id: Int, srcMacAddr: COpaquePointer?, port: COpaquePointer?, data: COpaquePointer?, dataLength: COpaquePointer?, timeout: UInt, nonblock: Int): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceNetAdhocPdpRecv(id, (srcMacAddr?.value ?: 0L).toString(), (port?.value ?: 0L).toString(), (data?.value ?: 0L).toString(), (dataLength?.value ?: 0L).toString(), timeout.toInt(), nonblock) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocGetPdpStat(size: COpaquePointer?, stat: COpaquePointer?): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceNetAdhocGetPdpStat((size?.value ?: 0L).toString(), (stat?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocGameModeCreateMaster(data: COpaquePointer?, size: Int): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceNetAdhocGameModeCreateMaster((data?.value ?: 0L).toString(), size) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocGameModeCreateReplica(mac: COpaquePointer?, data: COpaquePointer?, size: Int): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceNetAdhocGameModeCreateReplica((mac?.value ?: 0L).toString(), (data?.value ?: 0L).toString(), size) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocGameModeUpdateMaster(): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceNetAdhocGameModeUpdateMaster() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocGameModeUpdateReplica(id: Int, unk1: Int): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceNetAdhocGameModeUpdateReplica(id, unk1) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocGameModeDeleteMaster(): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceNetAdhocGameModeDeleteMaster() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocGameModeDeleteReplica(id: Int): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceNetAdhocGameModeDeleteReplica(id) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocPtpOpen(srcmac: COpaquePointer?, srcport: UShort, destmac: COpaquePointer?, destport: UShort, bufSize: UInt, delay: UInt, count: Int, unk1: Int): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceNetAdhocPtpOpen((srcmac?.value ?: 0L).toString(), srcport.toInt(), (destmac?.value ?: 0L).toString(), destport.toInt(), bufSize.toInt(), delay.toInt(), count, unk1) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocPtpConnect(id: Int, timeout: UInt, nonblock: Int): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceNetAdhocPtpConnect(id, timeout.toInt(), nonblock) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocPtpListen(srcmac: COpaquePointer?, srcport: UShort, bufSize: UInt, delay: UInt, count: Int, queue: Int, unk1: Int): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceNetAdhocPtpListen((srcmac?.value ?: 0L).toString(), srcport.toInt(), bufSize.toInt(), delay.toInt(), count, queue, unk1) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocPtpAccept(id: Int, mac: COpaquePointer?, port: COpaquePointer?, timeout: UInt, nonblock: Int): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceNetAdhocPtpAccept(id, (mac?.value ?: 0L).toString(), (port?.value ?: 0L).toString(), timeout.toInt(), nonblock) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocPtpSend(id: Int, data: COpaquePointer?, dataSize: COpaquePointer?, timeout: UInt, nonblock: Int): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceNetAdhocPtpSend(id, (data?.value ?: 0L).toString(), (dataSize?.value ?: 0L).toString(), timeout.toInt(), nonblock) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocPtpRecv(id: Int, data: COpaquePointer?, dataSize: COpaquePointer?, timeout: UInt, nonblock: Int): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceNetAdhocPtpRecv(id, (data?.value ?: 0L).toString(), (dataSize?.value ?: 0L).toString(), timeout.toInt(), nonblock) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocPtpFlush(id: Int, timeout: UInt, nonblock: Int): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceNetAdhocPtpFlush(id, timeout.toInt(), nonblock) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocPtpClose(id: Int, unk1: Int): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceNetAdhocPtpClose(id, unk1) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocGetPtpStat(size: COpaquePointer?, stat: COpaquePointer?): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceNetAdhocGetPtpStat((size?.value ?: 0L).toString(), (stat?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocMatchingInit(memsize: Int): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceNetAdhocMatchingInit(memsize) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocMatchingTerm(): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceNetAdhocMatchingTerm() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocMatchingCreate(mode: AdhocMatchingMode, maxPeers: Int, port: UShort, bufSize: Int, helloDelay: UInt, pingDelay: UInt, initCount: Int, msgDelay: UInt, callback: AdhocMatchingCallback): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocMatchingDelete(matchingId: Int): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceNetAdhocMatchingDelete(matchingId) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocMatchingStart(matchingId: Int, evthPri: Int, evthStack: Int, inthPri: Int, inthStack: Int, optLen: Int, optData: COpaquePointer?): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceNetAdhocMatchingStart(matchingId, evthPri, evthStack, inthPri, inthStack, optLen, (optData?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocMatchingStop(matchingId: Int): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceNetAdhocMatchingStop(matchingId) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocMatchingSelectTarget(matchingId: Int, mac: COpaquePointer?, optLen: Int, optData: COpaquePointer?): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceNetAdhocMatchingSelectTarget(matchingId, (mac?.value ?: 0L).toString(), optLen, (optData?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocMatchingCancelTarget(matchingId: Int, mac: COpaquePointer?): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceNetAdhocMatchingCancelTarget(matchingId, (mac?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocMatchingCancelTargetWithOpt(matchingId: Int, mac: COpaquePointer?, optLen: Int, optData: COpaquePointer?): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceNetAdhocMatchingCancelTargetWithOpt(matchingId, (mac?.value ?: 0L).toString(), optLen, (optData?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocMatchingSendData(matchingId: Int, mac: COpaquePointer?, dataLen: Int, data: COpaquePointer?): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceNetAdhocMatchingSendData(matchingId, (mac?.value ?: 0L).toString(), dataLen, (data?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocMatchingAbortSendData(matchingId: Int, mac: COpaquePointer?): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceNetAdhocMatchingAbortSendData(matchingId, (mac?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocMatchingSetHelloOpt(matchingId: Int, optLen: Int, optData: COpaquePointer?): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceNetAdhocMatchingSetHelloOpt(matchingId, optLen, (optData?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocMatchingGetHelloOpt(matchingId: Int, optLen: COpaquePointer?, optData: COpaquePointer?): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceNetAdhocMatchingGetHelloOpt(matchingId, (optLen?.value ?: 0L).toString(), (optData?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocMatchingGetMembers(matchingId: Int, length: COpaquePointer?, buf: COpaquePointer?): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceNetAdhocMatchingGetMembers(matchingId, (length?.value ?: 0L).toString(), (buf?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocMatchingGetPoolMaxAlloc(): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceNetAdhocMatchingGetPoolMaxAlloc() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocMatchingGetPoolStat(poolstat: COpaquePointer?): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceNetAdhocMatchingGetPoolStat((poolstat?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetApctlInit(stackSize: Int, initPriority: Int): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceNetApctlInit(stackSize, initPriority) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetApctlTerm(): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceNetApctlTerm() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetApctlGetInfo(code: ApctlInfo, pinfo: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetApctlAddHandler(handler: SceNetApctlHandler, parg: COpaquePointer?): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceNetApctlAddHandler(0L.toString(), (parg?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetApctlDelHandler(handlerId: Int): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceNetApctlDelHandler(handlerId) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetApctlConnect(connIndex: Int): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceNetApctlConnect(connIndex) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetApctlDisconnect(): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceNetApctlDisconnect() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetApctlGetState(pstate: COpaquePointer?): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceNetApctlGetState((pstate?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetInetInit(): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceNetInetInit() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetInetTerm(): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceNetInetTerm() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetInetAccept(s: Int, addr: COpaquePointer?, addrLen: COpaquePointer?): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceNetInetAccept(s, (addr?.value ?: 0L).toString(), (addrLen?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetInetBind(s: Int, myAddr: COpaquePointer?, addrLen: SocklenT): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceNetInetBind(s, (myAddr?.value ?: 0L).toString(), addrLen.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetInetConnect(s: Int, servAddr: COpaquePointer?, addrLen: SocklenT): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceNetInetConnect(s, (servAddr?.value ?: 0L).toString(), addrLen.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetInetGetsockopt(s: Int, level: Int, optName: Int, optVal: COpaquePointer?, optlEn: COpaquePointer?): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceNetInetGetsockopt(s, level, optName, (optVal?.value ?: 0L).toString(), (optlEn?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetInetListen(s: Int, backlog: Int): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceNetInetListen(s, backlog) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetInetRecv(s: Int, buf: COpaquePointer?, len: ULong, flags: Int): ULong =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceNetInetRecv(s, (buf?.value ?: 0L).toString(), len.toString(), flags) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetInetRecvfrom(s: Int, buf: COpaquePointer?, flags: ULong, arg1: Int, from: COpaquePointer?, fromLen: COpaquePointer?): ULong =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceNetInetRecvfrom(s, (buf?.value ?: 0L).toString(), flags.toString(), arg1, (from?.value ?: 0L).toString(), (fromLen?.value ?: 0L).toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetInetSend(s: Int, buf: COpaquePointer?, len: ULong, flags: Int): ULong =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceNetInetSend(s, (buf?.value ?: 0L).toString(), len.toString(), flags) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetInetSendto(s: Int, buf: COpaquePointer?, len: ULong, flags: Int, to: COpaquePointer?, toLen: SocklenT): ULong =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceNetInetSendto(s, (buf?.value ?: 0L).toString(), len.toString(), flags, (to?.value ?: 0L).toString(), toLen.toInt()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetInetSetsockopt(s: Int, level: Int, optName: Int, optVal: COpaquePointer?, optLen: SocklenT): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceNetInetSetsockopt(s, level, optName, (optVal?.value ?: 0L).toString(), optLen.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetInetShutdown(s: Int, how: Int): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceNetInetShutdown(s, how) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetInetSocket(domain: Int, type: Int, protocol: Int): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceNetInetSocket(domain, type, protocol) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetInetClose(s: Int): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceNetInetClose(s) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetInetGetErrno(): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceNetInetGetErrno() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceSslInit(unknown1: Int): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceSslInit(unknown1) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceSslEnd(): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceSslEnd() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceSslGetUsedMemoryMax(memory: COpaquePointer?): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceSslGetUsedMemoryMax((memory?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceSslGetUsedMemoryCurrent(memory: COpaquePointer?): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceSslGetUsedMemoryCurrent((memory?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceHttpInit(unknown1: UInt): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceHttpInit(unknown1.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceHttpEnd(): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceHttpEnd() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceHttpCreateTemplate(agent: COpaquePointer?, unknown1: Int, unknown2: Int): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceHttpCreateTemplate((agent?.value ?: 0L).toString(), unknown1, unknown2) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceHttpDeleteTemplate(templateid: Int): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceHttpDeleteTemplate(templateid) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceHttpCreateConnection(templateid: Int, host: COpaquePointer?, unknown1: COpaquePointer?, port: UShort, unknown2: Int): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceHttpCreateConnection(templateid, (host?.value ?: 0L).toString(), (unknown1?.value ?: 0L).toString(), port.toInt(), unknown2) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceHttpCreateConnectionWithURL(templateid: Int, url: COpaquePointer?, unknown1: Int): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceHttpCreateConnectionWithURL(templateid, (url?.value ?: 0L).toString(), unknown1) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceHttpDeleteConnection(connectionId: Int): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceHttpDeleteConnection(connectionId) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceHttpCreateRequest(connectionId: Int, method: HttpMethod, path: COpaquePointer?, contentLength: ULong): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceHttpCreateRequestWithURL(connectionId: Int, method: HttpMethod, url: COpaquePointer?, contentLength: ULong): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceHttpDeleteRequest(requestId: Int): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceHttpDeleteRequest(requestId) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceHttpSendRequest(requestId: Int, data: COpaquePointer?, dataSize: UInt): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceHttpSendRequest(requestId, (data?.value ?: 0L).toString(), dataSize.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceHttpAbortRequest(requestId: Int): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceHttpAbortRequest(requestId) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceHttpReadData(requestId: Int, data: COpaquePointer?, dataSize: UInt): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceHttpReadData(requestId, (data?.value ?: 0L).toString(), dataSize.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceHttpGetContentLength(requestId: Int, contentLength: COpaquePointer?): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceHttpGetContentLength(requestId, (contentLength?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceHttpGetStatusCode(requestId: Int, statusCode: COpaquePointer?): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceHttpGetStatusCode(requestId, (statusCode?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceHttpSetResolveTimeOut(id: Int, timeout: UInt): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceHttpSetResolveTimeOut(id, timeout.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceHttpSetResolveRetry(id: Int, count: Int): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceHttpSetResolveRetry(id, count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceHttpSetConnectTimeOut(id: Int, timeout: UInt): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceHttpSetConnectTimeOut(id, timeout.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceHttpSetSendTimeOut(id: Int, timeout: UInt): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceHttpSetSendTimeOut(id, timeout.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceHttpSetRecvTimeOut(id: Int, timeout: UInt): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceHttpSetRecvTimeOut(id, timeout.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceHttpEnableKeepAlive(id: Int): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceHttpEnableKeepAlive(id) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceHttpDisableKeepAlive(id: Int): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceHttpDisableKeepAlive(id) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceHttpEnableRedirect(id: Int): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceHttpEnableRedirect(id) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceHttpDisableRedirect(id: Int): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceHttpDisableRedirect(id) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceHttpEnableCookie(id: Int): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceHttpEnableCookie(id) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceHttpDisableCookie(id: Int): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceHttpDisableCookie(id) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceHttpSaveSystemCookie(): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceHttpSaveSystemCookie() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceHttpLoadSystemCookie(): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceHttpLoadSystemCookie() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceHttpAddExtraHeader(id: Int, name: COpaquePointer?, value: COpaquePointer?, unknown1: Int): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceHttpAddExtraHeader(id, (name?.value ?: 0L).toString(), (value?.value ?: 0L).toString(), unknown1) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceHttpDeleteHeader(id: Int, name: COpaquePointer?): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceHttpDeleteHeader(id, (name?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceHttpsInit(unknown1: Int, unknown2: Int, unknown3: Int, unknown4: Int): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceHttpsInit(unknown1, unknown2, unknown3, unknown4) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceHttpsEnd(): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceHttpsEnd() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceHttpsLoadDefaultCert(unknown1: Int, unknown2: Int): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceHttpsLoadDefaultCert(unknown1, unknown2) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceHttpDisableAuth(id: Int): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceHttpDisableAuth(id) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceHttpDisableCache(id: Int): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceHttpDisableCache(id) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceHttpEnableAuth(id: Int): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceHttpEnableAuth(id) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceHttpEnableCache(id: Int): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceHttpEnableCache(id) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceHttpEndCache(): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceHttpEndCache() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceHttpGetAllHeader(request: Int, header: COpaquePointer?, headerSize: COpaquePointer?): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceHttpGetAllHeader(request, (header?.value ?: 0L).toString(), (headerSize?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceHttpGetNetworkErrno(request: Int, errNum: COpaquePointer?): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceHttpGetNetworkErrno(request, (errNum?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceHttpGetProxy(id: Int, activateFlag: COpaquePointer?, mode: COpaquePointer?, proxyHost: COpaquePointer?, len: ULong, proxyPort: COpaquePointer?): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceHttpGetProxy(id, (activateFlag?.value ?: 0L).toString(), (mode?.value ?: 0L).toString(), (proxyHost?.value ?: 0L).toString(), len.toString(), (proxyPort?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceHttpInitCache(maxSize: ULong): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceHttpInitCache(maxSize.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceHttpSetAuthInfoCB(id: Int, cbfunc: HttpPasswordCB): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceHttpSetAuthInfoCB(id, 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceHttpSetProxy(id: Int, activateFlag: Int, mode: Int, newProxyHost: COpaquePointer?, newProxyPort: UShort): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceHttpSetProxy(id, activateFlag, mode, (newProxyHost?.value ?: 0L).toString(), newProxyPort.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceHttpSetResHeaderMaxSize(id: Int, headerSize: UInt): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceHttpSetResHeaderMaxSize(id, headerSize.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceHttpSetMallocFunction(mallocFunc: HttpMallocFunction, freeFunc: HttpFreeFunction, reallocFunc: HttpReallocFunction): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceHttpSetMallocFunction(0L.toString(), 0L.toString(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetResolverInit(): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceNetResolverInit() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetResolverCreate(rid: COpaquePointer?, buf: COpaquePointer?, bufLength: UInt): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceNetResolverCreate((rid?.value ?: 0L).toString(), (buf?.value ?: 0L).toString(), bufLength.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetResolverDelete(rid: Int): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceNetResolverDelete(rid) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetResolverStartNtoA(rid: Int, hostname: COpaquePointer?, addr: COpaquePointer?, timeout: UInt, retry: Int): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceNetResolverStartNtoA(rid, (hostname?.value ?: 0L).toString(), (addr?.value ?: 0L).toString(), timeout.toInt(), retry) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetResolverStartAtoN(rid: Int, addr: COpaquePointer?, hostname: COpaquePointer?, hostnameLen: UInt, timeout: UInt, retry: Int): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceNetResolverStartAtoN(rid, (addr?.value ?: 0L).toString(), (hostname?.value ?: 0L).toString(), hostnameLen.toInt(), timeout.toInt(), retry) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetResolverStop(rid: Int): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceNetResolverStop(rid) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetResolverTerm(): Int =
    if (_pspNapiAddon != null) (_pspNapiAddon.libc_psp_sceNetResolverTerm() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
