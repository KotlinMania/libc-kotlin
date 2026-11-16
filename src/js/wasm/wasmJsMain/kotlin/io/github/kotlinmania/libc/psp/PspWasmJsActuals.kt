@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.libc.psp

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

@JsFun("() => { if (typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_libc = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_libc = null; return false; } try { globalThis.__km_napi_libc = req('@kotlinmania/libc-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_libc = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_libc = null; return false; }")
private external fun initPspNapiAddon(): Boolean

private val pspNapiAvailable: Boolean = initPspNapiAddon()

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceAudioChRelease(p0)")
private external fun wasmLibcPspSceAudioChRelease(p0: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcPspSceAudioOutput(p0, p1, p2)")
private external fun wasmLibcPspSceAudioOutput(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcPspSceAudioOutputBlocking(p0, p1, p2)")
private external fun wasmLibcPspSceAudioOutputBlocking(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcPspSceAudioOutputPanned(p0, p1, p2, p3)")
private external fun wasmLibcPspSceAudioOutputPanned(p0: Int, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcPspSceAudioOutputPannedBlocking(p0, p1, p2, p3)")
private external fun wasmLibcPspSceAudioOutputPannedBlocking(p0: Int, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceAudioGetChannelRestLen(p0)")
private external fun wasmLibcPspSceAudioGetChannelRestLen(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceAudioGetChannelRestLength(p0)")
private external fun wasmLibcPspSceAudioGetChannelRestLength(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcPspSceAudioSetChannelDataLen(p0, p1)")
private external fun wasmLibcPspSceAudioSetChannelDataLen(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcPspSceAudioChangeChannelVolume(p0, p1, p2)")
private external fun wasmLibcPspSceAudioChangeChannelVolume(p0: Int, p1: Int, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceAudioOutput2Reserve(p0)")
private external fun wasmLibcPspSceAudioOutput2Reserve(p0: Int): Int

@JsFun("() => globalThis.__km_napi_libc.libcPspSceAudioOutput2Release()")
private external fun wasmLibcPspSceAudioOutput2Release(): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceAudioOutput2ChangeLength(p0)")
private external fun wasmLibcPspSceAudioOutput2ChangeLength(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcPspSceAudioOutput2OutputBlocking(p0, p1)")
private external fun wasmLibcPspSceAudioOutput2OutputBlocking(p0: Int, p1: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcPspSceAudioOutput2GetRestSample()")
private external fun wasmLibcPspSceAudioOutput2GetRestSample(): Int

@JsFun("() => globalThis.__km_napi_libc.libcPspSceAudioSRCChRelease()")
private external fun wasmLibcPspSceAudioSRCChRelease(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcPspSceAudioSRCOutputBlocking(p0, p1)")
private external fun wasmLibcPspSceAudioSRCOutputBlocking(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcPspSceAudioInputInit(p0, p1, p2)")
private external fun wasmLibcPspSceAudioInputInit(p0: Int, p1: Int, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceAudioInputInitEx(p0)")
private external fun wasmLibcPspSceAudioInputInitEx(p0: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcPspSceAudioGetInputLength()")
private external fun wasmLibcPspSceAudioGetInputLength(): Int

@JsFun("() => globalThis.__km_napi_libc.libcPspSceAudioWaitInputEnd()")
private external fun wasmLibcPspSceAudioWaitInputEnd(): Int

@JsFun("() => globalThis.__km_napi_libc.libcPspSceAudioPollInputEnd()")
private external fun wasmLibcPspSceAudioPollInputEnd(): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceAtracGetAtracID(p0)")
private external fun wasmLibcPspSceAtracGetAtracID(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcPspSceAtracSetDataAndGetID(p0, p1)")
private external fun wasmLibcPspSceAtracSetDataAndGetID(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcPspSceAtracDecodeData(p0, p1, p2, p3, p4)")
private external fun wasmLibcPspSceAtracDecodeData(p0: Int, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcPspSceAtracGetRemainFrame(p0, p1)")
private external fun wasmLibcPspSceAtracGetRemainFrame(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcPspSceAtracGetStreamDataInfo(p0, p1, p2, p3)")
private external fun wasmLibcPspSceAtracGetStreamDataInfo(p0: Int, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcPspSceAtracAddStreamData(p0, p1)")
private external fun wasmLibcPspSceAtracAddStreamData(p0: Int, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcPspSceAtracGetBitrate(p0, p1)")
private external fun wasmLibcPspSceAtracGetBitrate(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcPspSceAtracSetLoopNum(p0, p1)")
private external fun wasmLibcPspSceAtracSetLoopNum(p0: Int, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceAtracReleaseAtracID(p0)")
private external fun wasmLibcPspSceAtracReleaseAtracID(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcPspSceAtracGetNextSample(p0, p1)")
private external fun wasmLibcPspSceAtracGetNextSample(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcPspSceAtracGetMaxSample(p0, p1)")
private external fun wasmLibcPspSceAtracGetMaxSample(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcPspSceAtracGetBufferInfoForReseting(p0, p1, p2)")
private external fun wasmLibcPspSceAtracGetBufferInfoForReseting(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcPspSceAtracGetChannel(p0, p1)")
private external fun wasmLibcPspSceAtracGetChannel(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcPspSceAtracGetInternalErrorInfo(p0, p1)")
private external fun wasmLibcPspSceAtracGetInternalErrorInfo(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcPspSceAtracGetLoopStatus(p0, p1, p2)")
private external fun wasmLibcPspSceAtracGetLoopStatus(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcPspSceAtracGetNextDecodePosition(p0, p1)")
private external fun wasmLibcPspSceAtracGetNextDecodePosition(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcPspSceAtracGetSecondBufferInfo(p0, p1, p2)")
private external fun wasmLibcPspSceAtracGetSecondBufferInfo(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcPspSceAtracGetSoundSample(p0, p1, p2, p3)")
private external fun wasmLibcPspSceAtracGetSoundSample(p0: Int, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcPspSceAtracResetPlayPosition(p0, p1, p2, p3)")
private external fun wasmLibcPspSceAtracResetPlayPosition(p0: Int, p1: Int, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcPspSceAtracSetData(p0, p1, p2)")
private external fun wasmLibcPspSceAtracSetData(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcPspSceAtracSetHalfwayBuffer(p0, p1, p2, p3)")
private external fun wasmLibcPspSceAtracSetHalfwayBuffer(p0: Int, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcPspSceAtracSetHalfwayBufferAndGetID(p0, p1, p2)")
private external fun wasmLibcPspSceAtracSetHalfwayBufferAndGetID(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcPspSceAtracSetSecondBuffer(p0, p1, p2)")
private external fun wasmLibcPspSceAtracSetSecondBuffer(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceCtrlSetSamplingCycle(p0)")
private external fun wasmLibcPspSceCtrlSetSamplingCycle(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceCtrlGetSamplingCycle(p0)")
private external fun wasmLibcPspSceCtrlGetSamplingCycle(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceCtrlGetSamplingMode(p0)")
private external fun wasmLibcPspSceCtrlGetSamplingMode(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcPspSceCtrlPeekBufferPositive(p0, p1)")
private external fun wasmLibcPspSceCtrlPeekBufferPositive(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcPspSceCtrlPeekBufferNegative(p0, p1)")
private external fun wasmLibcPspSceCtrlPeekBufferNegative(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcPspSceCtrlReadBufferPositive(p0, p1)")
private external fun wasmLibcPspSceCtrlReadBufferPositive(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcPspSceCtrlReadBufferNegative(p0, p1)")
private external fun wasmLibcPspSceCtrlReadBufferNegative(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceCtrlPeekLatch(p0)")
private external fun wasmLibcPspSceCtrlPeekLatch(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceCtrlReadLatch(p0)")
private external fun wasmLibcPspSceCtrlReadLatch(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcPspSceCtrlSetIdleCancelThreshold(p0, p1)")
private external fun wasmLibcPspSceCtrlSetIdleCancelThreshold(p0: Int, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcPspSceCtrlGetIdleCancelThreshold(p0, p1)")
private external fun wasmLibcPspSceCtrlGetIdleCancelThreshold(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcPspSceDisplayGetMode(p0, p1, p2)")
private external fun wasmLibcPspSceDisplayGetMode(p0: String, p1: String, p2: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcPspSceDisplayGetVcount()")
private external fun wasmLibcPspSceDisplayGetVcount(): Int

@JsFun("() => globalThis.__km_napi_libc.libcPspSceDisplayWaitVblank()")
private external fun wasmLibcPspSceDisplayWaitVblank(): Int

@JsFun("() => globalThis.__km_napi_libc.libcPspSceDisplayWaitVblankCB()")
private external fun wasmLibcPspSceDisplayWaitVblankCB(): Int

@JsFun("() => globalThis.__km_napi_libc.libcPspSceDisplayWaitVblankStart()")
private external fun wasmLibcPspSceDisplayWaitVblankStart(): Int

@JsFun("() => globalThis.__km_napi_libc.libcPspSceDisplayWaitVblankStartCB()")
private external fun wasmLibcPspSceDisplayWaitVblankStartCB(): Int

@JsFun("() => globalThis.__km_napi_libc.libcPspSceDisplayGetAccumulatedHcount()")
private external fun wasmLibcPspSceDisplayGetAccumulatedHcount(): Int

@JsFun("() => globalThis.__km_napi_libc.libcPspSceDisplayGetCurrentHcount()")
private external fun wasmLibcPspSceDisplayGetCurrentHcount(): Int

@JsFun("() => globalThis.__km_napi_libc.libcPspSceDisplayGetFramePerSec()")
private external fun wasmLibcPspSceDisplayGetFramePerSec(): Double

@JsFun("() => globalThis.__km_napi_libc.libcPspSceDisplayIsForeground()")
private external fun wasmLibcPspSceDisplayIsForeground(): Int

@JsFun("() => globalThis.__km_napi_libc.libcPspSceDisplayIsVblank()")
private external fun wasmLibcPspSceDisplayIsVblank(): Int

@JsFun("() => globalThis.__km_napi_libc.libcPspSceGeEdramGetSize()")
private external fun wasmLibcPspSceGeEdramGetSize(): Int

@JsFun("() => globalThis.__km_napi_libc.libcPspSceGeEdramGetAddr()")
private external fun wasmLibcPspSceGeEdramGetAddr(): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceGeEdramSetAddrTranslation(p0)")
private external fun wasmLibcPspSceGeEdramSetAddrTranslation(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceGeGetCmd(p0)")
private external fun wasmLibcPspSceGeGetCmd(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcPspSceGeGetStack(p0, p1)")
private external fun wasmLibcPspSceGeGetStack(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceGeSaveContext(p0)")
private external fun wasmLibcPspSceGeSaveContext(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceGeRestoreContext(p0)")
private external fun wasmLibcPspSceGeRestoreContext(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcPspSceGeListEnQueue(p0, p1, p2, p3)")
private external fun wasmLibcPspSceGeListEnQueue(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcPspSceGeListEnQueueHead(p0, p1, p2, p3)")
private external fun wasmLibcPspSceGeListEnQueueHead(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceGeListDeQueue(p0)")
private external fun wasmLibcPspSceGeListDeQueue(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcPspSceGeListUpdateStallAddr(p0, p1)")
private external fun wasmLibcPspSceGeListUpdateStallAddr(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcPspSceGeBreak(p0, p1)")
private external fun wasmLibcPspSceGeBreak(p0: Int, p1: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcPspSceGeContinue()")
private external fun wasmLibcPspSceGeContinue(): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceGeSetCallback(p0)")
private external fun wasmLibcPspSceGeSetCallback(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceGeUnsetCallback(p0)")
private external fun wasmLibcPspSceGeUnsetCallback(p0: Int): Int

@JsFun("() => globalThis.__km_napi_libc.libcPspSceKernelExitGame()")
private external fun wasmLibcPspSceKernelExitGame()

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcPspSceKernelLoadExec(p0, p1)")
private external fun wasmLibcPspSceKernelLoadExec(p0: String, p1: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcPspSceKernelTotalFreeMemSize()")
private external fun wasmLibcPspSceKernelTotalFreeMemSize(): String

@JsFun("() => globalThis.__km_napi_libc.libcPspSceKernelMaxFreeMemSize()")
private external fun wasmLibcPspSceKernelMaxFreeMemSize(): String

@JsFun("() => globalThis.__km_napi_libc.libcPspSceKernelDevkitVersion()")
private external fun wasmLibcPspSceKernelDevkitVersion(): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceKernelSetCompiledSdkVersion(p0)")
private external fun wasmLibcPspSceKernelSetCompiledSdkVersion(p0: Int): Int

@JsFun("() => globalThis.__km_napi_libc.libcPspSceKernelGetCompiledSdkVersion()")
private external fun wasmLibcPspSceKernelGetCompiledSdkVersion(): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceKernelLibcTime(p0)")
private external fun wasmLibcPspSceKernelLibcTime(p0: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcPspSceKernelLibcClock()")
private external fun wasmLibcPspSceKernelLibcClock(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcPspSceKernelLibcGettimeofday(p0, p1)")
private external fun wasmLibcPspSceKernelLibcGettimeofday(p0: String, p1: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcPspSceKernelDcacheWritebackAll()")
private external fun wasmLibcPspSceKernelDcacheWritebackAll()

@JsFun("() => globalThis.__km_napi_libc.libcPspSceKernelDcacheWritebackInvalidateAll()")
private external fun wasmLibcPspSceKernelDcacheWritebackInvalidateAll()

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcPspSceKernelDcacheWritebackRange(p0, p1)")
private external fun wasmLibcPspSceKernelDcacheWritebackRange(p0: String, p1: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcPspSceKernelDcacheWritebackInvalidateRange(p0, p1)")
private external fun wasmLibcPspSceKernelDcacheWritebackInvalidateRange(p0: String, p1: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcPspSceKernelDcacheInvalidateRange(p0, p1)")
private external fun wasmLibcPspSceKernelDcacheInvalidateRange(p0: String, p1: Int)

@JsFun("() => globalThis.__km_napi_libc.libcPspSceKernelIcacheInvalidateAll()")
private external fun wasmLibcPspSceKernelIcacheInvalidateAll()

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcPspSceKernelIcacheInvalidateRange(p0, p1)")
private external fun wasmLibcPspSceKernelIcacheInvalidateRange(p0: String, p1: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcPspSceKernelUtilsMt19937Init(p0, p1)")
private external fun wasmLibcPspSceKernelUtilsMt19937Init(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceKernelUtilsMt19937UInt(p0)")
private external fun wasmLibcPspSceKernelUtilsMt19937UInt(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcPspSceKernelUtilsMd5Digest(p0, p1, p2)")
private external fun wasmLibcPspSceKernelUtilsMd5Digest(p0: String, p1: Int, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceKernelUtilsMd5BlockInit(p0)")
private external fun wasmLibcPspSceKernelUtilsMd5BlockInit(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcPspSceKernelUtilsMd5BlockUpdate(p0, p1, p2)")
private external fun wasmLibcPspSceKernelUtilsMd5BlockUpdate(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcPspSceKernelUtilsMd5BlockResult(p0, p1)")
private external fun wasmLibcPspSceKernelUtilsMd5BlockResult(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcPspSceKernelUtilsSha1Digest(p0, p1, p2)")
private external fun wasmLibcPspSceKernelUtilsSha1Digest(p0: String, p1: Int, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceKernelUtilsSha1BlockInit(p0)")
private external fun wasmLibcPspSceKernelUtilsSha1BlockInit(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcPspSceKernelUtilsSha1BlockUpdate(p0, p1, p2)")
private external fun wasmLibcPspSceKernelUtilsSha1BlockUpdate(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcPspSceKernelUtilsSha1BlockResult(p0, p1)")
private external fun wasmLibcPspSceKernelUtilsSha1BlockResult(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcPspSceKernelRegisterSubIntrHandler(p0, p1, p2, p3)")
private external fun wasmLibcPspSceKernelRegisterSubIntrHandler(p0: Int, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcPspSceKernelReleaseSubIntrHandler(p0, p1)")
private external fun wasmLibcPspSceKernelReleaseSubIntrHandler(p0: Int, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcPspSceKernelEnableSubIntr(p0, p1)")
private external fun wasmLibcPspSceKernelEnableSubIntr(p0: Int, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcPspSceKernelDisableSubIntr(p0, p1)")
private external fun wasmLibcPspSceKernelDisableSubIntr(p0: Int, p1: Int): Int

@JsFun("() => globalThis.__km_napi_libc.libcPspSceKernelCpuSuspendIntr()")
private external fun wasmLibcPspSceKernelCpuSuspendIntr(): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceKernelCpuResumeIntr(p0)")
private external fun wasmLibcPspSceKernelCpuResumeIntr(p0: Int)

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceKernelCpuResumeIntrWithSync(p0)")
private external fun wasmLibcPspSceKernelCpuResumeIntrWithSync(p0: Int)

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceKernelIsCpuIntrSuspended(p0)")
private external fun wasmLibcPspSceKernelIsCpuIntrSuspended(p0: Int): Int

@JsFun("() => globalThis.__km_napi_libc.libcPspSceKernelIsCpuIntrEnable()")
private external fun wasmLibcPspSceKernelIsCpuIntrEnable(): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcPspSceKernelSelfStopUnloadModule(p0, p1, p2)")
private external fun wasmLibcPspSceKernelSelfStopUnloadModule(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcPspSceKernelStopUnloadSelfModule(p0, p1, p2, p3)")
private external fun wasmLibcPspSceKernelStopUnloadSelfModule(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcPspSceKernelGetModuleIdList(p0, p1, p2)")
private external fun wasmLibcPspSceKernelGetModuleIdList(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcPspSceKernelVolatileMemLock(p0, p1, p2)")
private external fun wasmLibcPspSceKernelVolatileMemLock(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcPspSceKernelVolatileMemTryLock(p0, p1, p2)")
private external fun wasmLibcPspSceKernelVolatileMemTryLock(p0: Int, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceKernelVolatileMemUnlock(p0)")
private external fun wasmLibcPspSceKernelVolatileMemUnlock(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceKernelExitThread(p0)")
private external fun wasmLibcPspSceKernelExitThread(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceKernelExitDeleteThread(p0)")
private external fun wasmLibcPspSceKernelExitDeleteThread(p0: Int): Int

@JsFun("() => globalThis.__km_napi_libc.libcPspSceKernelSuspendDispatchThread()")
private external fun wasmLibcPspSceKernelSuspendDispatchThread(): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceKernelResumeDispatchThread(p0)")
private external fun wasmLibcPspSceKernelResumeDispatchThread(p0: Int): Int

@JsFun("() => globalThis.__km_napi_libc.libcPspSceKernelSleepThread()")
private external fun wasmLibcPspSceKernelSleepThread(): Int

@JsFun("() => globalThis.__km_napi_libc.libcPspSceKernelSleepThreadCB()")
private external fun wasmLibcPspSceKernelSleepThreadCB(): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceKernelDelayThread(p0)")
private external fun wasmLibcPspSceKernelDelayThread(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceKernelDelayThreadCB(p0)")
private external fun wasmLibcPspSceKernelDelayThreadCB(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceKernelDelaySysClockThread(p0)")
private external fun wasmLibcPspSceKernelDelaySysClockThread(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceKernelDelaySysClockThreadCB(p0)")
private external fun wasmLibcPspSceKernelDelaySysClockThreadCB(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcPspSceKernelChangeCurrentThreadAttr(p0, p1)")
private external fun wasmLibcPspSceKernelChangeCurrentThreadAttr(p0: Int, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceKernelRotateThreadReadyQueue(p0)")
private external fun wasmLibcPspSceKernelRotateThreadReadyQueue(p0: Int): Int

@JsFun("() => globalThis.__km_napi_libc.libcPspSceKernelGetThreadId()")
private external fun wasmLibcPspSceKernelGetThreadId(): Int

@JsFun("() => globalThis.__km_napi_libc.libcPspSceKernelGetThreadCurrentPriority()")
private external fun wasmLibcPspSceKernelGetThreadCurrentPriority(): Int

@JsFun("() => globalThis.__km_napi_libc.libcPspSceKernelCheckThreadStack()")
private external fun wasmLibcPspSceKernelCheckThreadStack(): Int

@JsFun("() => globalThis.__km_napi_libc.libcPspSceKernelCheckCallback()")
private external fun wasmLibcPspSceKernelCheckCallback(): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceKernelReferSystemStatus(p0)")
private external fun wasmLibcPspSceKernelReferSystemStatus(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcPspSceKernelCreateFpl(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcPspSceKernelCreateFpl(p0: String, p1: Int, p2: Int, p3: Int, p4: Int, p5: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcPspSceKernelUSec2SysClock(p0, p1)")
private external fun wasmLibcPspSceKernelUSec2SysClock(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceKernelUSec2SysClockWide(p0)")
private external fun wasmLibcPspSceKernelUSec2SysClockWide(p0: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcPspSceKernelSysClock2USec(p0, p1, p2)")
private external fun wasmLibcPspSceKernelSysClock2USec(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcPspSceKernelSysClock2USecWide(p0, p1, p2)")
private external fun wasmLibcPspSceKernelSysClock2USecWide(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceKernelGetSystemTime(p0)")
private external fun wasmLibcPspSceKernelGetSystemTime(p0: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcPspSceKernelGetSystemTimeWide()")
private external fun wasmLibcPspSceKernelGetSystemTimeWide(): String

@JsFun("() => globalThis.__km_napi_libc.libcPspSceKernelGetSystemTimeLow()")
private external fun wasmLibcPspSceKernelGetSystemTimeLow(): Int

@JsFun("() => globalThis.__km_napi_libc.libcPspSceKernelReferThreadProfiler()")
private external fun wasmLibcPspSceKernelReferThreadProfiler(): String

@JsFun("() => globalThis.__km_napi_libc.libcPspSceKernelReferGlobalProfiler()")
private external fun wasmLibcPspSceKernelReferGlobalProfiler(): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcPspSceUsbStart(p0, p1, p2)")
private external fun wasmLibcPspSceUsbStart(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcPspSceUsbStop(p0, p1, p2)")
private external fun wasmLibcPspSceUsbStop(p0: String, p1: Int, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceUsbActivate(p0)")
private external fun wasmLibcPspSceUsbActivate(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceUsbDeactivate(p0)")
private external fun wasmLibcPspSceUsbDeactivate(p0: Int): Int

@JsFun("() => globalThis.__km_napi_libc.libcPspSceUsbGetState()")
private external fun wasmLibcPspSceUsbGetState(): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceUsbGetDrvState(p0)")
private external fun wasmLibcPspSceUsbGetDrvState(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceUsbCamSetupStill(p0)")
private external fun wasmLibcPspSceUsbCamSetupStill(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceUsbCamSetupStillEx(p0)")
private external fun wasmLibcPspSceUsbCamSetupStillEx(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcPspSceUsbCamStillInputBlocking(p0, p1)")
private external fun wasmLibcPspSceUsbCamStillInputBlocking(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcPspSceUsbCamStillInput(p0, p1)")
private external fun wasmLibcPspSceUsbCamStillInput(p0: String, p1: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcPspSceUsbCamStillWaitInputEnd()")
private external fun wasmLibcPspSceUsbCamStillWaitInputEnd(): Int

@JsFun("() => globalThis.__km_napi_libc.libcPspSceUsbCamStillPollInputEnd()")
private external fun wasmLibcPspSceUsbCamStillPollInputEnd(): Int

@JsFun("() => globalThis.__km_napi_libc.libcPspSceUsbCamStillCancelInput()")
private external fun wasmLibcPspSceUsbCamStillCancelInput(): Int

@JsFun("() => globalThis.__km_napi_libc.libcPspSceUsbCamStillGetInputLength()")
private external fun wasmLibcPspSceUsbCamStillGetInputLength(): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcPspSceUsbCamSetupVideo(p0, p1, p2)")
private external fun wasmLibcPspSceUsbCamSetupVideo(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcPspSceUsbCamSetupVideoEx(p0, p1, p2)")
private external fun wasmLibcPspSceUsbCamSetupVideoEx(p0: String, p1: String, p2: Int): Int

@JsFun("() => globalThis.__km_napi_libc.libcPspSceUsbCamStartVideo()")
private external fun wasmLibcPspSceUsbCamStartVideo(): Int

@JsFun("() => globalThis.__km_napi_libc.libcPspSceUsbCamStopVideo()")
private external fun wasmLibcPspSceUsbCamStopVideo(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcPspSceUsbCamReadVideoFrameBlocking(p0, p1)")
private external fun wasmLibcPspSceUsbCamReadVideoFrameBlocking(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcPspSceUsbCamReadVideoFrame(p0, p1)")
private external fun wasmLibcPspSceUsbCamReadVideoFrame(p0: String, p1: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcPspSceUsbCamWaitReadVideoFrameEnd()")
private external fun wasmLibcPspSceUsbCamWaitReadVideoFrameEnd(): Int

@JsFun("() => globalThis.__km_napi_libc.libcPspSceUsbCamPollReadVideoFrameEnd()")
private external fun wasmLibcPspSceUsbCamPollReadVideoFrameEnd(): Int

@JsFun("() => globalThis.__km_napi_libc.libcPspSceUsbCamGetReadVideoFrameSize()")
private external fun wasmLibcPspSceUsbCamGetReadVideoFrameSize(): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceUsbCamSetSaturation(p0)")
private external fun wasmLibcPspSceUsbCamSetSaturation(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceUsbCamSetBrightness(p0)")
private external fun wasmLibcPspSceUsbCamSetBrightness(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceUsbCamSetContrast(p0)")
private external fun wasmLibcPspSceUsbCamSetContrast(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceUsbCamSetSharpness(p0)")
private external fun wasmLibcPspSceUsbCamSetSharpness(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceUsbCamSetReverseMode(p0)")
private external fun wasmLibcPspSceUsbCamSetReverseMode(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceUsbCamSetZoom(p0)")
private external fun wasmLibcPspSceUsbCamSetZoom(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceUsbCamGetSaturation(p0)")
private external fun wasmLibcPspSceUsbCamGetSaturation(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceUsbCamGetBrightness(p0)")
private external fun wasmLibcPspSceUsbCamGetBrightness(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceUsbCamGetContrast(p0)")
private external fun wasmLibcPspSceUsbCamGetContrast(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceUsbCamGetSharpness(p0)")
private external fun wasmLibcPspSceUsbCamGetSharpness(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceUsbCamGetImageEffectMode(p0)")
private external fun wasmLibcPspSceUsbCamGetImageEffectMode(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceUsbCamGetEvLevel(p0)")
private external fun wasmLibcPspSceUsbCamGetEvLevel(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceUsbCamGetReverseMode(p0)")
private external fun wasmLibcPspSceUsbCamGetReverseMode(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceUsbCamGetZoom(p0)")
private external fun wasmLibcPspSceUsbCamGetZoom(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceUsbCamAutoImageReverseSW(p0)")
private external fun wasmLibcPspSceUsbCamAutoImageReverseSW(p0: Int): Int

@JsFun("() => globalThis.__km_napi_libc.libcPspSceUsbCamGetAutoImageReverseState()")
private external fun wasmLibcPspSceUsbCamGetAutoImageReverseState(): Int

@JsFun("() => globalThis.__km_napi_libc.libcPspSceUsbCamGetLensDirection()")
private external fun wasmLibcPspSceUsbCamGetLensDirection(): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceUsbstorBootUnregisterNotify(p0)")
private external fun wasmLibcPspSceUsbstorBootUnregisterNotify(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceUsbstorBootSetCapacity(p0)")
private external fun wasmLibcPspSceUsbstorBootSetCapacity(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspScePowerUnregisterCallback(p0)")
private external fun wasmLibcPspScePowerUnregisterCallback(p0: Int): Int

@JsFun("() => globalThis.__km_napi_libc.libcPspScePowerIsPowerOnline()")
private external fun wasmLibcPspScePowerIsPowerOnline(): Int

@JsFun("() => globalThis.__km_napi_libc.libcPspScePowerIsBatteryExist()")
private external fun wasmLibcPspScePowerIsBatteryExist(): Int

@JsFun("() => globalThis.__km_napi_libc.libcPspScePowerIsBatteryCharging()")
private external fun wasmLibcPspScePowerIsBatteryCharging(): Int

@JsFun("() => globalThis.__km_napi_libc.libcPspScePowerGetBatteryChargingStatus()")
private external fun wasmLibcPspScePowerGetBatteryChargingStatus(): Int

@JsFun("() => globalThis.__km_napi_libc.libcPspScePowerIsLowBattery()")
private external fun wasmLibcPspScePowerIsLowBattery(): Int

@JsFun("() => globalThis.__km_napi_libc.libcPspScePowerGetBatteryLifePercent()")
private external fun wasmLibcPspScePowerGetBatteryLifePercent(): Int

@JsFun("() => globalThis.__km_napi_libc.libcPspScePowerGetBatteryLifeTime()")
private external fun wasmLibcPspScePowerGetBatteryLifeTime(): Int

@JsFun("() => globalThis.__km_napi_libc.libcPspScePowerGetBatteryTemp()")
private external fun wasmLibcPspScePowerGetBatteryTemp(): Int

@JsFun("() => globalThis.__km_napi_libc.libcPspScePowerGetBatteryElec()")
private external fun wasmLibcPspScePowerGetBatteryElec(): Int

@JsFun("() => globalThis.__km_napi_libc.libcPspScePowerGetBatteryVolt()")
private external fun wasmLibcPspScePowerGetBatteryVolt(): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspScePowerSetCpuClockFrequency(p0)")
private external fun wasmLibcPspScePowerSetCpuClockFrequency(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspScePowerSetBusClockFrequency(p0)")
private external fun wasmLibcPspScePowerSetBusClockFrequency(p0: Int): Int

@JsFun("() => globalThis.__km_napi_libc.libcPspScePowerGetCpuClockFrequency()")
private external fun wasmLibcPspScePowerGetCpuClockFrequency(): Int

@JsFun("() => globalThis.__km_napi_libc.libcPspScePowerGetCpuClockFrequencyInt()")
private external fun wasmLibcPspScePowerGetCpuClockFrequencyInt(): Int

@JsFun("() => globalThis.__km_napi_libc.libcPspScePowerGetCpuClockFrequencyFloat()")
private external fun wasmLibcPspScePowerGetCpuClockFrequencyFloat(): Double

@JsFun("() => globalThis.__km_napi_libc.libcPspScePowerGetBusClockFrequency()")
private external fun wasmLibcPspScePowerGetBusClockFrequency(): Int

@JsFun("() => globalThis.__km_napi_libc.libcPspScePowerGetBusClockFrequencyInt()")
private external fun wasmLibcPspScePowerGetBusClockFrequencyInt(): Int

@JsFun("() => globalThis.__km_napi_libc.libcPspScePowerGetBusClockFrequencyFloat()")
private external fun wasmLibcPspScePowerGetBusClockFrequencyFloat(): Double

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcPspScePowerSetClockFrequency(p0, p1, p2)")
private external fun wasmLibcPspScePowerSetClockFrequency(p0: Int, p1: Int, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspScePowerLock(p0)")
private external fun wasmLibcPspScePowerLock(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspScePowerUnlock(p0)")
private external fun wasmLibcPspScePowerUnlock(p0: Int): Int

@JsFun("() => globalThis.__km_napi_libc.libcPspScePowerGetIdleTimer()")
private external fun wasmLibcPspScePowerGetIdleTimer(): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspScePowerIdleTimerEnable(p0)")
private external fun wasmLibcPspScePowerIdleTimerEnable(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspScePowerIdleTimerDisable(p0)")
private external fun wasmLibcPspScePowerIdleTimerDisable(p0: Int): Int

@JsFun("() => globalThis.__km_napi_libc.libcPspScePowerRequestStandby()")
private external fun wasmLibcPspScePowerRequestStandby(): Int

@JsFun("() => globalThis.__km_napi_libc.libcPspScePowerRequestSuspend()")
private external fun wasmLibcPspScePowerRequestSuspend(): Int

@JsFun("() => globalThis.__km_napi_libc.libcPspSceWlanDevIsPowerOn()")
private external fun wasmLibcPspSceWlanDevIsPowerOn(): Int

@JsFun("() => globalThis.__km_napi_libc.libcPspSceWlanGetSwitchState()")
private external fun wasmLibcPspSceWlanGetSwitchState(): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceWlanGetEtherAddr(p0)")
private external fun wasmLibcPspSceWlanGetEtherAddr(p0: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcPspSceWlanDevAttach()")
private external fun wasmLibcPspSceWlanDevAttach(): Int

@JsFun("() => globalThis.__km_napi_libc.libcPspSceWlanDevDetach()")
private external fun wasmLibcPspSceWlanDevDetach(): Int

@JsFun("() => globalThis.__km_napi_libc.libcPspSceRtcGetTickResolution()")
private external fun wasmLibcPspSceRtcGetTickResolution(): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceRtcGetCurrentTick(p0)")
private external fun wasmLibcPspSceRtcGetCurrentTick(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcPspSceRtcGetCurrentClock(p0, p1)")
private external fun wasmLibcPspSceRtcGetCurrentClock(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceRtcGetCurrentClockLocalTime(p0)")
private external fun wasmLibcPspSceRtcGetCurrentClockLocalTime(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcPspSceRtcConvertUtcToLocalTime(p0, p1)")
private external fun wasmLibcPspSceRtcConvertUtcToLocalTime(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcPspSceRtcConvertLocalTimeToUTC(p0, p1)")
private external fun wasmLibcPspSceRtcConvertLocalTimeToUTC(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceRtcIsLeapYear(p0)")
private external fun wasmLibcPspSceRtcIsLeapYear(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcPspSceRtcGetDaysInMonth(p0, p1)")
private external fun wasmLibcPspSceRtcGetDaysInMonth(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcPspSceRtcGetDayOfWeek(p0, p1, p2)")
private external fun wasmLibcPspSceRtcGetDayOfWeek(p0: Int, p1: Int, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceRtcCheckValid(p0)")
private external fun wasmLibcPspSceRtcCheckValid(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcPspSceRtcSetTick(p0, p1)")
private external fun wasmLibcPspSceRtcSetTick(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcPspSceRtcGetTick(p0, p1)")
private external fun wasmLibcPspSceRtcGetTick(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcPspSceRtcCompareTick(p0, p1)")
private external fun wasmLibcPspSceRtcCompareTick(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcPspSceRtcTickAddTicks(p0, p1, p2)")
private external fun wasmLibcPspSceRtcTickAddTicks(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcPspSceRtcTickAddMicroseconds(p0, p1, p2)")
private external fun wasmLibcPspSceRtcTickAddMicroseconds(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcPspSceRtcTickAddSeconds(p0, p1, p2)")
private external fun wasmLibcPspSceRtcTickAddSeconds(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcPspSceRtcTickAddMinutes(p0, p1, p2)")
private external fun wasmLibcPspSceRtcTickAddMinutes(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcPspSceRtcTickAddHours(p0, p1, p2)")
private external fun wasmLibcPspSceRtcTickAddHours(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcPspSceRtcTickAddDays(p0, p1, p2)")
private external fun wasmLibcPspSceRtcTickAddDays(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcPspSceRtcTickAddWeeks(p0, p1, p2)")
private external fun wasmLibcPspSceRtcTickAddWeeks(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcPspSceRtcTickAddMonths(p0, p1, p2)")
private external fun wasmLibcPspSceRtcTickAddMonths(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcPspSceRtcTickAddYears(p0, p1, p2)")
private external fun wasmLibcPspSceRtcTickAddYears(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcPspSceRtcSetTimeT(p0, p1)")
private external fun wasmLibcPspSceRtcSetTimeT(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcPspSceRtcGetTimeT(p0, p1)")
private external fun wasmLibcPspSceRtcGetTimeT(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcPspSceRtcSetTime64T(p0, p1)")
private external fun wasmLibcPspSceRtcSetTime64T(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcPspSceRtcGetTime64T(p0, p1)")
private external fun wasmLibcPspSceRtcGetTime64T(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcPspSceRtcSetDosTime(p0, p1)")
private external fun wasmLibcPspSceRtcSetDosTime(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcPspSceRtcGetDosTime(p0, p1)")
private external fun wasmLibcPspSceRtcGetDosTime(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcPspSceRtcSetWin32FileTime(p0, p1)")
private external fun wasmLibcPspSceRtcSetWin32FileTime(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcPspSceRtcGetWin32FileTime(p0, p1)")
private external fun wasmLibcPspSceRtcGetWin32FileTime(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcPspSceRtcParseDateTime(p0, p1)")
private external fun wasmLibcPspSceRtcParseDateTime(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcPspSceRtcFormatRFC3339(p0, p1, p2)")
private external fun wasmLibcPspSceRtcFormatRFC3339(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcPspSceRtcFormatRFC3339LocalTime(p0, p1)")
private external fun wasmLibcPspSceRtcFormatRFC3339LocalTime(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcPspSceRtcParseRFC3339(p0, p1)")
private external fun wasmLibcPspSceRtcParseRFC3339(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcPspSceRtcFormatRFC2822(p0, p1, p2)")
private external fun wasmLibcPspSceRtcFormatRFC2822(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcPspSceRtcFormatRFC2822LocalTime(p0, p1)")
private external fun wasmLibcPspSceRtcFormatRFC2822LocalTime(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceIoRemove(p0)")
private external fun wasmLibcPspSceIoRemove(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcPspSceIoMkdir(p0, p1)")
private external fun wasmLibcPspSceIoMkdir(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceIoRmdir(p0)")
private external fun wasmLibcPspSceIoRmdir(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceIoChdir(p0)")
private external fun wasmLibcPspSceIoChdir(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcPspSceIoRename(p0, p1)")
private external fun wasmLibcPspSceIoRename(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcPspSceIoDevctl(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcPspSceIoDevctl(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceIoUnassign(p0)")
private external fun wasmLibcPspSceIoUnassign(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcPspSceIoGetstat(p0, p1)")
private external fun wasmLibcPspSceIoGetstat(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcPspSceIoChstat(p0, p1, p2)")
private external fun wasmLibcPspSceIoChstat(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcPspSceIoSync(p0, p1)")
private external fun wasmLibcPspSceIoSync(p0: String, p1: Int): Int

@JsFun("() => globalThis.__km_napi_libc.libcPspSceJpegInitMJpeg()")
private external fun wasmLibcPspSceJpegInitMJpeg(): Int

@JsFun("() => globalThis.__km_napi_libc.libcPspSceJpegFinishMJpeg()")
private external fun wasmLibcPspSceJpegFinishMJpeg(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcPspSceJpegCreateMJpeg(p0, p1)")
private external fun wasmLibcPspSceJpegCreateMJpeg(p0: Int, p1: Int): Int

@JsFun("() => globalThis.__km_napi_libc.libcPspSceJpegDeleteMJpeg()")
private external fun wasmLibcPspSceJpegDeleteMJpeg(): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcPspSceJpegDecodeMJpeg(p0, p1, p2, p3)")
private external fun wasmLibcPspSceJpegDecodeMJpeg(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("() => globalThis.__km_napi_libc.libcPspSceUmdCheckMedium()")
private external fun wasmLibcPspSceUmdCheckMedium(): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceUmdGetDiscInfo(p0)")
private external fun wasmLibcPspSceUmdGetDiscInfo(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcPspSceUmdActivate(p0, p1)")
private external fun wasmLibcPspSceUmdActivate(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcPspSceUmdDeactivate(p0, p1)")
private external fun wasmLibcPspSceUmdDeactivate(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceUmdWaitDriveStat(p0)")
private external fun wasmLibcPspSceUmdWaitDriveStat(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcPspSceUmdWaitDriveStatWithTimer(p0, p1)")
private external fun wasmLibcPspSceUmdWaitDriveStatWithTimer(p0: Int, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcPspSceUmdWaitDriveStatCB(p0, p1)")
private external fun wasmLibcPspSceUmdWaitDriveStatCB(p0: Int, p1: Int): Int

@JsFun("() => globalThis.__km_napi_libc.libcPspSceUmdCancelWaitDriveStat()")
private external fun wasmLibcPspSceUmdCancelWaitDriveStat(): Int

@JsFun("() => globalThis.__km_napi_libc.libcPspSceUmdGetDriveStat()")
private external fun wasmLibcPspSceUmdGetDriveStat(): Int

@JsFun("() => globalThis.__km_napi_libc.libcPspSceUmdGetErrorStat()")
private external fun wasmLibcPspSceUmdGetErrorStat(): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceUmdRegisterUMDCallBack(p0)")
private external fun wasmLibcPspSceUmdRegisterUMDCallBack(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceUmdUnRegisterUMDCallBack(p0)")
private external fun wasmLibcPspSceUmdUnRegisterUMDCallBack(p0: Int): Int

@JsFun("() => globalThis.__km_napi_libc.libcPspSceUmdReplacePermit()")
private external fun wasmLibcPspSceUmdReplacePermit(): Int

@JsFun("() => globalThis.__km_napi_libc.libcPspSceUmdReplaceProhibit()")
private external fun wasmLibcPspSceUmdReplaceProhibit(): Int

@JsFun("() => globalThis.__km_napi_libc.libcPspSceMpegInit()")
private external fun wasmLibcPspSceMpegInit(): Int

@JsFun("() => globalThis.__km_napi_libc.libcPspSceMpegFinish()")
private external fun wasmLibcPspSceMpegFinish()

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceMpegRingbufferQueryMemSize(p0)")
private external fun wasmLibcPspSceMpegRingbufferQueryMemSize(p0: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcPspSceMpegRingbufferConstruct(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcPspSceMpegRingbufferConstruct(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceMpegRingbufferDestruct(p0)")
private external fun wasmLibcPspSceMpegRingbufferDestruct(p0: String)

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceMpegRingbufferAvailableSize(p0)")
private external fun wasmLibcPspSceMpegRingbufferAvailableSize(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcPspSceMpegRingbufferPut(p0, p1, p2)")
private external fun wasmLibcPspSceMpegRingbufferPut(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceMpegQueryMemSize(p0)")
private external fun wasmLibcPspSceMpegQueryMemSize(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcPspSceMpegQueryStreamSize(p0, p1)")
private external fun wasmLibcPspSceMpegQueryStreamSize(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcPspSceMpegBaseYCrCbCopyVme(p0, p1, p2)")
private external fun wasmLibcPspSceMpegBaseYCrCbCopyVme(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceMpegBaseCscInit(p0)")
private external fun wasmLibcPspSceMpegBaseCscInit(p0: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcPspSceMpegBaseCscVme(p0, p1, p2, p3)")
private external fun wasmLibcPspSceMpegBaseCscVme(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceMpegbaseBea18f91(p0)")
private external fun wasmLibcPspSceMpegbaseBea18f91(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceHprmPeekCurrentKey(p0)")
private external fun wasmLibcPspSceHprmPeekCurrentKey(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceHprmPeekLatch(p0)")
private external fun wasmLibcPspSceHprmPeekLatch(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceHprmReadLatch(p0)")
private external fun wasmLibcPspSceHprmReadLatch(p0: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcPspSceHprmIsHeadphoneExist()")
private external fun wasmLibcPspSceHprmIsHeadphoneExist(): Int

@JsFun("() => globalThis.__km_napi_libc.libcPspSceHprmIsRemoteExist()")
private external fun wasmLibcPspSceHprmIsRemoteExist(): Int

@JsFun("() => globalThis.__km_napi_libc.libcPspSceHprmIsMicrophoneExist()")
private external fun wasmLibcPspSceHprmIsMicrophoneExist(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcPspSceGuDepthBuffer(p0, p1)")
private external fun wasmLibcPspSceGuDepthBuffer(p0: String, p1: Int)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcPspSceGuDispBuffer(p0, p1, p2, p3)")
private external fun wasmLibcPspSceGuDispBuffer(p0: Int, p1: Int, p2: String, p3: Int)

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceGuDisplay(p0)")
private external fun wasmLibcPspSceGuDisplay(p0: Boolean): Boolean

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceGuDepthMask(p0)")
private external fun wasmLibcPspSceGuDepthMask(p0: Int)

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceGuDepthOffset(p0)")
private external fun wasmLibcPspSceGuDepthOffset(p0: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcPspSceGuDepthRange(p0, p1)")
private external fun wasmLibcPspSceGuDepthRange(p0: Int, p1: Int)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcPspSceGuFog(p0, p1, p2)")
private external fun wasmLibcPspSceGuFog(p0: Double, p1: Double, p2: Int)

@JsFun("() => globalThis.__km_napi_libc.libcPspSceGuInit()")
private external fun wasmLibcPspSceGuInit()

@JsFun("() => globalThis.__km_napi_libc.libcPspSceGuTerm()")
private external fun wasmLibcPspSceGuTerm()

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceGuBreak(p0)")
private external fun wasmLibcPspSceGuBreak(p0: Int)

@JsFun("() => globalThis.__km_napi_libc.libcPspSceGuContinue()")
private external fun wasmLibcPspSceGuContinue()

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceGuGetMemory(p0)")
private external fun wasmLibcPspSceGuGetMemory(p0: Int): String

@JsFun("() => globalThis.__km_napi_libc.libcPspSceGuFinish()")
private external fun wasmLibcPspSceGuFinish(): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceGuFinishId(p0)")
private external fun wasmLibcPspSceGuFinishId(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceGuCallList(p0)")
private external fun wasmLibcPspSceGuCallList(p0: String)

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceGuCallMode(p0)")
private external fun wasmLibcPspSceGuCallMode(p0: Int)

@JsFun("() => globalThis.__km_napi_libc.libcPspSceGuCheckList()")
private external fun wasmLibcPspSceGuCheckList(): Int

@JsFun("() => globalThis.__km_napi_libc.libcPspSceGuSwapBuffers()")
private external fun wasmLibcPspSceGuSwapBuffers(): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcPspSceGuBeginObject(p0, p1, p2, p3)")
private external fun wasmLibcPspSceGuBeginObject(p0: Int, p1: Int, p2: String, p3: String)

@JsFun("() => globalThis.__km_napi_libc.libcPspSceGuEndObject()")
private external fun wasmLibcPspSceGuEndObject()

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceGuSetAllStatus(p0)")
private external fun wasmLibcPspSceGuSetAllStatus(p0: Int)

@JsFun("() => globalThis.__km_napi_libc.libcPspSceGuGetAllStatus()")
private external fun wasmLibcPspSceGuGetAllStatus(): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcPspSceGuLightAtt(p0, p1, p2, p3)")
private external fun wasmLibcPspSceGuLightAtt(p0: Int, p1: Double, p2: Double, p3: Double)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcPspSceGuLightColor(p0, p1, p2)")
private external fun wasmLibcPspSceGuLightColor(p0: Int, p1: Int, p2: Int)

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceGuClear(p0)")
private external fun wasmLibcPspSceGuClear(p0: Int)

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceGuClearColor(p0)")
private external fun wasmLibcPspSceGuClearColor(p0: Int)

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceGuClearDepth(p0)")
private external fun wasmLibcPspSceGuClearDepth(p0: Int)

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceGuClearStencil(p0)")
private external fun wasmLibcPspSceGuClearStencil(p0: Int)

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceGuPixelMask(p0)")
private external fun wasmLibcPspSceGuPixelMask(p0: Int)

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceGuColor(p0)")
private external fun wasmLibcPspSceGuColor(p0: Int)

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceGuColorMaterial(p0)")
private external fun wasmLibcPspSceGuColorMaterial(p0: Int)

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceGuAmbient(p0)")
private external fun wasmLibcPspSceGuAmbient(p0: Int)

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceGuAmbientColor(p0)")
private external fun wasmLibcPspSceGuAmbientColor(p0: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcPspSceGuMaterial(p0, p1)")
private external fun wasmLibcPspSceGuMaterial(p0: Int, p1: Int)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcPspSceGuModelColor(p0, p1, p2, p3)")
private external fun wasmLibcPspSceGuModelColor(p0: Int, p1: Int, p2: Int, p3: Int)

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceGuSpecular(p0)")
private external fun wasmLibcPspSceGuSpecular(p0: Double)

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceGuTexEnvColor(p0)")
private external fun wasmLibcPspSceGuTexEnvColor(p0: Int)

@JsFun("() => globalThis.__km_napi_libc.libcPspSceGuTexFlush()")
private external fun wasmLibcPspSceGuTexFlush()

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcPspSceGuTexOffset(p0, p1)")
private external fun wasmLibcPspSceGuTexOffset(p0: Double, p1: Double)

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcPspSceGuTexScale(p0, p1)")
private external fun wasmLibcPspSceGuTexScale(p0: Double, p1: Double)

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceGuTexSlope(p0)")
private external fun wasmLibcPspSceGuTexSlope(p0: Double)

@JsFun("() => globalThis.__km_napi_libc.libcPspSceGuTexSync()")
private external fun wasmLibcPspSceGuTexSync()

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcPspSceGuClutLoad(p0, p1)")
private external fun wasmLibcPspSceGuClutLoad(p0: Int, p1: String)

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcPspSceGuOffset(p0, p1)")
private external fun wasmLibcPspSceGuOffset(p0: Int, p1: Int)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcPspSceGuScissor(p0, p1, p2, p3)")
private external fun wasmLibcPspSceGuScissor(p0: Int, p1: Int, p2: Int, p3: Int)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcPspSceGuViewport(p0, p1, p2, p3)")
private external fun wasmLibcPspSceGuViewport(p0: Int, p1: Int, p2: Int, p3: Int)

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcPspSceGuDrawBezier(p0, p1, p2, p3, p4)")
private external fun wasmLibcPspSceGuDrawBezier(p0: Int, p1: Int, p2: Int, p3: String, p4: String)

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcPspSceGuPatchDivide(p0, p1)")
private external fun wasmLibcPspSceGuPatchDivide(p0: Int, p1: Int)

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceGuPatchFrontFace(p0)")
private external fun wasmLibcPspSceGuPatchFrontFace(p0: Int)

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libcPspSceGuDrawSpline(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmLibcPspSceGuDrawSpline(p0: Int, p1: Int, p2: Int, p3: Int, p4: Int, p5: String, p6: String)

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcPspSceGuMorphWeight(p0, p1)")
private external fun wasmLibcPspSceGuMorphWeight(p0: Int, p1: Double)

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcPspSceGumDrawBezier(p0, p1, p2, p3, p4)")
private external fun wasmLibcPspSceGumDrawBezier(p0: Int, p1: Int, p2: Int, p3: String, p4: String)

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libcPspSceGumDrawSpline(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmLibcPspSceGumDrawSpline(p0: Int, p1: Int, p2: Int, p3: Int, p4: Int, p5: String, p6: String)

@JsFun("() => globalThis.__km_napi_libc.libcPspSceGumFastInverse()")
private external fun wasmLibcPspSceGumFastInverse()

@JsFun("() => globalThis.__km_napi_libc.libcPspSceGumFullInverse()")
private external fun wasmLibcPspSceGumFullInverse()

@JsFun("() => globalThis.__km_napi_libc.libcPspSceGumLoadIdentity()")
private external fun wasmLibcPspSceGumLoadIdentity()

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcPspSceGumOrtho(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcPspSceGumOrtho(p0: Double, p1: Double, p2: Double, p3: Double, p4: Double, p5: Double)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcPspSceGumPerspective(p0, p1, p2, p3)")
private external fun wasmLibcPspSceGumPerspective(p0: Double, p1: Double, p2: Double, p3: Double)

@JsFun("() => globalThis.__km_napi_libc.libcPspSceGumPopMatrix()")
private external fun wasmLibcPspSceGumPopMatrix()

@JsFun("() => globalThis.__km_napi_libc.libcPspSceGumPushMatrix()")
private external fun wasmLibcPspSceGumPushMatrix()

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceGumRotateX(p0)")
private external fun wasmLibcPspSceGumRotateX(p0: Double)

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceGumRotateY(p0)")
private external fun wasmLibcPspSceGumRotateY(p0: Double)

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceGumRotateZ(p0)")
private external fun wasmLibcPspSceGumRotateZ(p0: Double)

@JsFun("() => globalThis.__km_napi_libc.libcPspSceGumUpdateMatrix()")
private external fun wasmLibcPspSceGumUpdateMatrix()

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceMp3ReserveMp3Handle(p0)")
private external fun wasmLibcPspSceMp3ReserveMp3Handle(p0: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcPspSceMp3InitResource()")
private external fun wasmLibcPspSceMp3InitResource(): Int

@JsFun("() => globalThis.__km_napi_libc.libcPspSceMp3TermResource()")
private external fun wasmLibcPspSceMp3TermResource(): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcPspSceRegOpenRegistry(p0, p1, p2)")
private external fun wasmLibcPspSceRegOpenRegistry(p0: String, p1: Int, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceRegRemoveRegistry(p0)")
private external fun wasmLibcPspSceRegRemoveRegistry(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceOpenPSIDGetOpenPSID(p0)")
private external fun wasmLibcPspSceOpenPSIDGetOpenPSID(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceUtilityMsgDialogInitStart(p0)")
private external fun wasmLibcPspSceUtilityMsgDialogInitStart(p0: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcPspSceUtilityMsgDialogShutdownStart()")
private external fun wasmLibcPspSceUtilityMsgDialogShutdownStart()

@JsFun("() => globalThis.__km_napi_libc.libcPspSceUtilityMsgDialogGetStatus()")
private external fun wasmLibcPspSceUtilityMsgDialogGetStatus(): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceUtilityMsgDialogUpdate(p0)")
private external fun wasmLibcPspSceUtilityMsgDialogUpdate(p0: Int)

@JsFun("() => globalThis.__km_napi_libc.libcPspSceUtilityMsgDialogAbort()")
private external fun wasmLibcPspSceUtilityMsgDialogAbort(): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceUtilityNetconfInitStart(p0)")
private external fun wasmLibcPspSceUtilityNetconfInitStart(p0: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcPspSceUtilityNetconfShutdownStart()")
private external fun wasmLibcPspSceUtilityNetconfShutdownStart(): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceUtilityNetconfUpdate(p0)")
private external fun wasmLibcPspSceUtilityNetconfUpdate(p0: Int): Int

@JsFun("() => globalThis.__km_napi_libc.libcPspSceUtilityNetconfGetStatus()")
private external fun wasmLibcPspSceUtilityNetconfGetStatus(): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceUtilityCheckNetParam(p0)")
private external fun wasmLibcPspSceUtilityCheckNetParam(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceUtilitySavedataInitStart(p0)")
private external fun wasmLibcPspSceUtilitySavedataInitStart(p0: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcPspSceUtilitySavedataGetStatus()")
private external fun wasmLibcPspSceUtilitySavedataGetStatus(): Int

@JsFun("() => globalThis.__km_napi_libc.libcPspSceUtilitySavedataShutdownStart()")
private external fun wasmLibcPspSceUtilitySavedataShutdownStart(): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceUtilitySavedataUpdate(p0)")
private external fun wasmLibcPspSceUtilitySavedataUpdate(p0: Int)

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceUtilityGameSharingInitStart(p0)")
private external fun wasmLibcPspSceUtilityGameSharingInitStart(p0: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcPspSceUtilityGameSharingShutdownStart()")
private external fun wasmLibcPspSceUtilityGameSharingShutdownStart()

@JsFun("() => globalThis.__km_napi_libc.libcPspSceUtilityGameSharingGetStatus()")
private external fun wasmLibcPspSceUtilityGameSharingGetStatus(): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceUtilityGameSharingUpdate(p0)")
private external fun wasmLibcPspSceUtilityGameSharingUpdate(p0: Int)

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceUtilityHtmlViewerInitStart(p0)")
private external fun wasmLibcPspSceUtilityHtmlViewerInitStart(p0: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcPspSceUtilityHtmlViewerShutdownStart()")
private external fun wasmLibcPspSceUtilityHtmlViewerShutdownStart(): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceUtilityHtmlViewerUpdate(p0)")
private external fun wasmLibcPspSceUtilityHtmlViewerUpdate(p0: Int): Int

@JsFun("() => globalThis.__km_napi_libc.libcPspSceUtilityHtmlViewerGetStatus()")
private external fun wasmLibcPspSceUtilityHtmlViewerGetStatus(): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceUtilityOskInitStart(p0)")
private external fun wasmLibcPspSceUtilityOskInitStart(p0: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcPspSceUtilityOskShutdownStart()")
private external fun wasmLibcPspSceUtilityOskShutdownStart(): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceUtilityOskUpdate(p0)")
private external fun wasmLibcPspSceUtilityOskUpdate(p0: Int): Int

@JsFun("() => globalThis.__km_napi_libc.libcPspSceUtilityOskGetStatus()")
private external fun wasmLibcPspSceUtilityOskGetStatus(): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceUtilityCreateNetParam(p0)")
private external fun wasmLibcPspSceUtilityCreateNetParam(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcPspSceUtilityCopyNetParam(p0, p1)")
private external fun wasmLibcPspSceUtilityCopyNetParam(p0: Int, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceUtilityDeleteNetParam(p0)")
private external fun wasmLibcPspSceUtilityDeleteNetParam(p0: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcPspSceNetInit(p0, p1, p2, p3, p4)")
private external fun wasmLibcPspSceNetInit(p0: Int, p1: Int, p2: Int, p3: Int, p4: Int): Int

@JsFun("() => globalThis.__km_napi_libc.libcPspSceNetTerm()")
private external fun wasmLibcPspSceNetTerm(): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceNetFreeThreadinfo(p0)")
private external fun wasmLibcPspSceNetFreeThreadinfo(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceNetThreadAbort(p0)")
private external fun wasmLibcPspSceNetThreadAbort(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcPspSceNetEtherStrton(p0, p1)")
private external fun wasmLibcPspSceNetEtherStrton(p0: String, p1: String)

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcPspSceNetEtherNtostr(p0, p1)")
private external fun wasmLibcPspSceNetEtherNtostr(p0: String, p1: String)

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceNetGetLocalEtherAddr(p0)")
private external fun wasmLibcPspSceNetGetLocalEtherAddr(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceNetGetMallocStat(p0)")
private external fun wasmLibcPspSceNetGetMallocStat(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcPspSceNetAdhocctlInit(p0, p1, p2)")
private external fun wasmLibcPspSceNetAdhocctlInit(p0: Int, p1: Int, p2: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcPspSceNetAdhocctlTerm()")
private external fun wasmLibcPspSceNetAdhocctlTerm(): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceNetAdhocctlConnect(p0)")
private external fun wasmLibcPspSceNetAdhocctlConnect(p0: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcPspSceNetAdhocctlDisconnect()")
private external fun wasmLibcPspSceNetAdhocctlDisconnect(): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceNetAdhocctlGetState(p0)")
private external fun wasmLibcPspSceNetAdhocctlGetState(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceNetAdhocctlCreate(p0)")
private external fun wasmLibcPspSceNetAdhocctlCreate(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceNetAdhocctlJoin(p0)")
private external fun wasmLibcPspSceNetAdhocctlJoin(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceNetAdhocctlGetAdhocId(p0)")
private external fun wasmLibcPspSceNetAdhocctlGetAdhocId(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcPspSceNetAdhocctlCreateEnterGameMode(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcPspSceNetAdhocctlCreateEnterGameMode(p0: String, p1: Int, p2: Int, p3: String, p4: Int, p5: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcPspSceNetAdhocctlJoinEnterGameMode(p0, p1, p2, p3)")
private external fun wasmLibcPspSceNetAdhocctlJoinEnterGameMode(p0: String, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceNetAdhocctlGetGameModeInfo(p0)")
private external fun wasmLibcPspSceNetAdhocctlGetGameModeInfo(p0: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcPspSceNetAdhocctlExitGameMode()")
private external fun wasmLibcPspSceNetAdhocctlExitGameMode(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcPspSceNetAdhocctlGetPeerList(p0, p1)")
private external fun wasmLibcPspSceNetAdhocctlGetPeerList(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcPspSceNetAdhocctlGetPeerInfo(p0, p1, p2)")
private external fun wasmLibcPspSceNetAdhocctlGetPeerInfo(p0: String, p1: Int, p2: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcPspSceNetAdhocctlScan()")
private external fun wasmLibcPspSceNetAdhocctlScan(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcPspSceNetAdhocctlGetScanInfo(p0, p1)")
private external fun wasmLibcPspSceNetAdhocctlGetScanInfo(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcPspSceNetAdhocctlAddHandler(p0, p1)")
private external fun wasmLibcPspSceNetAdhocctlAddHandler(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceNetAdhocctlDelHandler(p0)")
private external fun wasmLibcPspSceNetAdhocctlDelHandler(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcPspSceNetAdhocctlGetNameByAddr(p0, p1)")
private external fun wasmLibcPspSceNetAdhocctlGetNameByAddr(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcPspSceNetAdhocctlGetAddrByName(p0, p1, p2)")
private external fun wasmLibcPspSceNetAdhocctlGetAddrByName(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceNetAdhocctlGetParameter(p0)")
private external fun wasmLibcPspSceNetAdhocctlGetParameter(p0: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcPspSceNetAdhocInit()")
private external fun wasmLibcPspSceNetAdhocInit(): Int

@JsFun("() => globalThis.__km_napi_libc.libcPspSceNetAdhocTerm()")
private external fun wasmLibcPspSceNetAdhocTerm(): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcPspSceNetAdhocPdpCreate(p0, p1, p2, p3)")
private external fun wasmLibcPspSceNetAdhocPdpCreate(p0: String, p1: Int, p2: Int, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcPspSceNetAdhocPdpDelete(p0, p1)")
private external fun wasmLibcPspSceNetAdhocPdpDelete(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libcPspSceNetAdhocPdpSend(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmLibcPspSceNetAdhocPdpSend(p0: Int, p1: String, p2: Int, p3: String, p4: Int, p5: Int, p6: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libcPspSceNetAdhocPdpRecv(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmLibcPspSceNetAdhocPdpRecv(p0: Int, p1: String, p2: String, p3: String, p4: String, p5: Int, p6: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcPspSceNetAdhocGetPdpStat(p0, p1)")
private external fun wasmLibcPspSceNetAdhocGetPdpStat(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcPspSceNetAdhocGameModeCreateMaster(p0, p1)")
private external fun wasmLibcPspSceNetAdhocGameModeCreateMaster(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcPspSceNetAdhocGameModeCreateReplica(p0, p1, p2)")
private external fun wasmLibcPspSceNetAdhocGameModeCreateReplica(p0: String, p1: String, p2: Int): Int

@JsFun("() => globalThis.__km_napi_libc.libcPspSceNetAdhocGameModeUpdateMaster()")
private external fun wasmLibcPspSceNetAdhocGameModeUpdateMaster(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcPspSceNetAdhocGameModeUpdateReplica(p0, p1)")
private external fun wasmLibcPspSceNetAdhocGameModeUpdateReplica(p0: Int, p1: Int): Int

@JsFun("() => globalThis.__km_napi_libc.libcPspSceNetAdhocGameModeDeleteMaster()")
private external fun wasmLibcPspSceNetAdhocGameModeDeleteMaster(): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceNetAdhocGameModeDeleteReplica(p0)")
private external fun wasmLibcPspSceNetAdhocGameModeDeleteReplica(p0: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_libc.libcPspSceNetAdhocPtpOpen(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmLibcPspSceNetAdhocPtpOpen(p0: String, p1: Int, p2: String, p3: Int, p4: Int, p5: Int, p6: Int, p7: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcPspSceNetAdhocPtpConnect(p0, p1, p2)")
private external fun wasmLibcPspSceNetAdhocPtpConnect(p0: Int, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libcPspSceNetAdhocPtpListen(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmLibcPspSceNetAdhocPtpListen(p0: String, p1: Int, p2: Int, p3: Int, p4: Int, p5: Int, p6: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcPspSceNetAdhocPtpAccept(p0, p1, p2, p3, p4)")
private external fun wasmLibcPspSceNetAdhocPtpAccept(p0: Int, p1: String, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcPspSceNetAdhocPtpSend(p0, p1, p2, p3, p4)")
private external fun wasmLibcPspSceNetAdhocPtpSend(p0: Int, p1: String, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcPspSceNetAdhocPtpRecv(p0, p1, p2, p3, p4)")
private external fun wasmLibcPspSceNetAdhocPtpRecv(p0: Int, p1: String, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcPspSceNetAdhocPtpFlush(p0, p1, p2)")
private external fun wasmLibcPspSceNetAdhocPtpFlush(p0: Int, p1: Int, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcPspSceNetAdhocPtpClose(p0, p1)")
private external fun wasmLibcPspSceNetAdhocPtpClose(p0: Int, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcPspSceNetAdhocGetPtpStat(p0, p1)")
private external fun wasmLibcPspSceNetAdhocGetPtpStat(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceNetAdhocMatchingInit(p0)")
private external fun wasmLibcPspSceNetAdhocMatchingInit(p0: Int): Int

@JsFun("() => globalThis.__km_napi_libc.libcPspSceNetAdhocMatchingTerm()")
private external fun wasmLibcPspSceNetAdhocMatchingTerm(): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceNetAdhocMatchingDelete(p0)")
private external fun wasmLibcPspSceNetAdhocMatchingDelete(p0: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libcPspSceNetAdhocMatchingStart(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmLibcPspSceNetAdhocMatchingStart(p0: Int, p1: Int, p2: Int, p3: Int, p4: Int, p5: Int, p6: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceNetAdhocMatchingStop(p0)")
private external fun wasmLibcPspSceNetAdhocMatchingStop(p0: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcPspSceNetAdhocMatchingSelectTarget(p0, p1, p2, p3)")
private external fun wasmLibcPspSceNetAdhocMatchingSelectTarget(p0: Int, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcPspSceNetAdhocMatchingCancelTarget(p0, p1)")
private external fun wasmLibcPspSceNetAdhocMatchingCancelTarget(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcPspSceNetAdhocMatchingCancelTargetWithOpt(p0, p1, p2, p3)")
private external fun wasmLibcPspSceNetAdhocMatchingCancelTargetWithOpt(p0: Int, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcPspSceNetAdhocMatchingSendData(p0, p1, p2, p3)")
private external fun wasmLibcPspSceNetAdhocMatchingSendData(p0: Int, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcPspSceNetAdhocMatchingAbortSendData(p0, p1)")
private external fun wasmLibcPspSceNetAdhocMatchingAbortSendData(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcPspSceNetAdhocMatchingSetHelloOpt(p0, p1, p2)")
private external fun wasmLibcPspSceNetAdhocMatchingSetHelloOpt(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcPspSceNetAdhocMatchingGetHelloOpt(p0, p1, p2)")
private external fun wasmLibcPspSceNetAdhocMatchingGetHelloOpt(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcPspSceNetAdhocMatchingGetMembers(p0, p1, p2)")
private external fun wasmLibcPspSceNetAdhocMatchingGetMembers(p0: Int, p1: String, p2: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcPspSceNetAdhocMatchingGetPoolMaxAlloc()")
private external fun wasmLibcPspSceNetAdhocMatchingGetPoolMaxAlloc(): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceNetAdhocMatchingGetPoolStat(p0)")
private external fun wasmLibcPspSceNetAdhocMatchingGetPoolStat(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcPspSceNetApctlInit(p0, p1)")
private external fun wasmLibcPspSceNetApctlInit(p0: Int, p1: Int): Int

@JsFun("() => globalThis.__km_napi_libc.libcPspSceNetApctlTerm()")
private external fun wasmLibcPspSceNetApctlTerm(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcPspSceNetApctlAddHandler(p0, p1)")
private external fun wasmLibcPspSceNetApctlAddHandler(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceNetApctlDelHandler(p0)")
private external fun wasmLibcPspSceNetApctlDelHandler(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceNetApctlConnect(p0)")
private external fun wasmLibcPspSceNetApctlConnect(p0: Int): Int

@JsFun("() => globalThis.__km_napi_libc.libcPspSceNetApctlDisconnect()")
private external fun wasmLibcPspSceNetApctlDisconnect(): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceNetApctlGetState(p0)")
private external fun wasmLibcPspSceNetApctlGetState(p0: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcPspSceNetInetInit()")
private external fun wasmLibcPspSceNetInetInit(): Int

@JsFun("() => globalThis.__km_napi_libc.libcPspSceNetInetTerm()")
private external fun wasmLibcPspSceNetInetTerm(): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcPspSceNetInetAccept(p0, p1, p2)")
private external fun wasmLibcPspSceNetInetAccept(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcPspSceNetInetBind(p0, p1, p2)")
private external fun wasmLibcPspSceNetInetBind(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcPspSceNetInetConnect(p0, p1, p2)")
private external fun wasmLibcPspSceNetInetConnect(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcPspSceNetInetGetsockopt(p0, p1, p2, p3, p4)")
private external fun wasmLibcPspSceNetInetGetsockopt(p0: Int, p1: Int, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcPspSceNetInetListen(p0, p1)")
private external fun wasmLibcPspSceNetInetListen(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcPspSceNetInetRecv(p0, p1, p2, p3)")
private external fun wasmLibcPspSceNetInetRecv(p0: Int, p1: String, p2: String, p3: Int): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcPspSceNetInetRecvfrom(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcPspSceNetInetRecvfrom(p0: Int, p1: String, p2: String, p3: Int, p4: String, p5: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcPspSceNetInetSend(p0, p1, p2, p3)")
private external fun wasmLibcPspSceNetInetSend(p0: Int, p1: String, p2: String, p3: Int): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcPspSceNetInetSendto(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcPspSceNetInetSendto(p0: Int, p1: String, p2: String, p3: Int, p4: String, p5: Int): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcPspSceNetInetSetsockopt(p0, p1, p2, p3, p4)")
private external fun wasmLibcPspSceNetInetSetsockopt(p0: Int, p1: Int, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcPspSceNetInetShutdown(p0, p1)")
private external fun wasmLibcPspSceNetInetShutdown(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcPspSceNetInetSocket(p0, p1, p2)")
private external fun wasmLibcPspSceNetInetSocket(p0: Int, p1: Int, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceNetInetClose(p0)")
private external fun wasmLibcPspSceNetInetClose(p0: Int): Int

@JsFun("() => globalThis.__km_napi_libc.libcPspSceNetInetGetErrno()")
private external fun wasmLibcPspSceNetInetGetErrno(): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceSslInit(p0)")
private external fun wasmLibcPspSceSslInit(p0: Int): Int

@JsFun("() => globalThis.__km_napi_libc.libcPspSceSslEnd()")
private external fun wasmLibcPspSceSslEnd(): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceSslGetUsedMemoryMax(p0)")
private external fun wasmLibcPspSceSslGetUsedMemoryMax(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceSslGetUsedMemoryCurrent(p0)")
private external fun wasmLibcPspSceSslGetUsedMemoryCurrent(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceHttpInit(p0)")
private external fun wasmLibcPspSceHttpInit(p0: Int): Int

@JsFun("() => globalThis.__km_napi_libc.libcPspSceHttpEnd()")
private external fun wasmLibcPspSceHttpEnd(): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcPspSceHttpCreateTemplate(p0, p1, p2)")
private external fun wasmLibcPspSceHttpCreateTemplate(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceHttpDeleteTemplate(p0)")
private external fun wasmLibcPspSceHttpDeleteTemplate(p0: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcPspSceHttpCreateConnection(p0, p1, p2, p3, p4)")
private external fun wasmLibcPspSceHttpCreateConnection(p0: Int, p1: String, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcPspSceHttpCreateConnectionWithURL(p0, p1, p2)")
private external fun wasmLibcPspSceHttpCreateConnectionWithURL(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceHttpDeleteConnection(p0)")
private external fun wasmLibcPspSceHttpDeleteConnection(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceHttpDeleteRequest(p0)")
private external fun wasmLibcPspSceHttpDeleteRequest(p0: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcPspSceHttpSendRequest(p0, p1, p2)")
private external fun wasmLibcPspSceHttpSendRequest(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceHttpAbortRequest(p0)")
private external fun wasmLibcPspSceHttpAbortRequest(p0: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcPspSceHttpReadData(p0, p1, p2)")
private external fun wasmLibcPspSceHttpReadData(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcPspSceHttpGetContentLength(p0, p1)")
private external fun wasmLibcPspSceHttpGetContentLength(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcPspSceHttpGetStatusCode(p0, p1)")
private external fun wasmLibcPspSceHttpGetStatusCode(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcPspSceHttpSetResolveTimeOut(p0, p1)")
private external fun wasmLibcPspSceHttpSetResolveTimeOut(p0: Int, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcPspSceHttpSetResolveRetry(p0, p1)")
private external fun wasmLibcPspSceHttpSetResolveRetry(p0: Int, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcPspSceHttpSetConnectTimeOut(p0, p1)")
private external fun wasmLibcPspSceHttpSetConnectTimeOut(p0: Int, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcPspSceHttpSetSendTimeOut(p0, p1)")
private external fun wasmLibcPspSceHttpSetSendTimeOut(p0: Int, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcPspSceHttpSetRecvTimeOut(p0, p1)")
private external fun wasmLibcPspSceHttpSetRecvTimeOut(p0: Int, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceHttpEnableKeepAlive(p0)")
private external fun wasmLibcPspSceHttpEnableKeepAlive(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceHttpDisableKeepAlive(p0)")
private external fun wasmLibcPspSceHttpDisableKeepAlive(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceHttpEnableRedirect(p0)")
private external fun wasmLibcPspSceHttpEnableRedirect(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceHttpDisableRedirect(p0)")
private external fun wasmLibcPspSceHttpDisableRedirect(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceHttpEnableCookie(p0)")
private external fun wasmLibcPspSceHttpEnableCookie(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceHttpDisableCookie(p0)")
private external fun wasmLibcPspSceHttpDisableCookie(p0: Int): Int

@JsFun("() => globalThis.__km_napi_libc.libcPspSceHttpSaveSystemCookie()")
private external fun wasmLibcPspSceHttpSaveSystemCookie(): Int

@JsFun("() => globalThis.__km_napi_libc.libcPspSceHttpLoadSystemCookie()")
private external fun wasmLibcPspSceHttpLoadSystemCookie(): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcPspSceHttpAddExtraHeader(p0, p1, p2, p3)")
private external fun wasmLibcPspSceHttpAddExtraHeader(p0: Int, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcPspSceHttpDeleteHeader(p0, p1)")
private external fun wasmLibcPspSceHttpDeleteHeader(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcPspSceHttpsInit(p0, p1, p2, p3)")
private external fun wasmLibcPspSceHttpsInit(p0: Int, p1: Int, p2: Int, p3: Int): Int

@JsFun("() => globalThis.__km_napi_libc.libcPspSceHttpsEnd()")
private external fun wasmLibcPspSceHttpsEnd(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcPspSceHttpsLoadDefaultCert(p0, p1)")
private external fun wasmLibcPspSceHttpsLoadDefaultCert(p0: Int, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceHttpDisableAuth(p0)")
private external fun wasmLibcPspSceHttpDisableAuth(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceHttpDisableCache(p0)")
private external fun wasmLibcPspSceHttpDisableCache(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceHttpEnableAuth(p0)")
private external fun wasmLibcPspSceHttpEnableAuth(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceHttpEnableCache(p0)")
private external fun wasmLibcPspSceHttpEnableCache(p0: Int): Int

@JsFun("() => globalThis.__km_napi_libc.libcPspSceHttpEndCache()")
private external fun wasmLibcPspSceHttpEndCache(): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcPspSceHttpGetAllHeader(p0, p1, p2)")
private external fun wasmLibcPspSceHttpGetAllHeader(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcPspSceHttpGetNetworkErrno(p0, p1)")
private external fun wasmLibcPspSceHttpGetNetworkErrno(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcPspSceHttpGetProxy(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcPspSceHttpGetProxy(p0: Int, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceHttpInitCache(p0)")
private external fun wasmLibcPspSceHttpInitCache(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcPspSceHttpSetAuthInfoCB(p0, p1)")
private external fun wasmLibcPspSceHttpSetAuthInfoCB(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcPspSceHttpSetProxy(p0, p1, p2, p3, p4)")
private external fun wasmLibcPspSceHttpSetProxy(p0: Int, p1: Int, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcPspSceHttpSetResHeaderMaxSize(p0, p1)")
private external fun wasmLibcPspSceHttpSetResHeaderMaxSize(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcPspSceHttpSetMallocFunction(p0, p1, p2)")
private external fun wasmLibcPspSceHttpSetMallocFunction(p0: String, p1: String, p2: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcPspSceNetResolverInit()")
private external fun wasmLibcPspSceNetResolverInit(): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcPspSceNetResolverCreate(p0, p1, p2)")
private external fun wasmLibcPspSceNetResolverCreate(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceNetResolverDelete(p0)")
private external fun wasmLibcPspSceNetResolverDelete(p0: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcPspSceNetResolverStartNtoA(p0, p1, p2, p3, p4)")
private external fun wasmLibcPspSceNetResolverStartNtoA(p0: Int, p1: String, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcPspSceNetResolverStartAtoN(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcPspSceNetResolverStartAtoN(p0: Int, p1: String, p2: String, p3: Int, p4: Int, p5: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcPspSceNetResolverStop(p0)")
private external fun wasmLibcPspSceNetResolverStop(p0: Int): Int

@JsFun("() => globalThis.__km_napi_libc.libcPspSceNetResolverTerm()")
private external fun wasmLibcPspSceNetResolverTerm(): Int

public actual fun sceAudioChReserve(channel: Int, sampleCount: Int, format: AudioFormat): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceAudioChRelease(channel: Int): Int =
    if (pspNapiAvailable) wasmLibcPspSceAudioChRelease(channel) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceAudioOutput(channel: Int, vol: Int, buf: MutPtr): Int =
    if (pspNapiAvailable) wasmLibcPspSceAudioOutput(channel, vol, buf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceAudioOutputBlocking(channel: Int, vol: Int, buf: MutPtr): Int =
    if (pspNapiAvailable) wasmLibcPspSceAudioOutputBlocking(channel, vol, buf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceAudioOutputPanned(channel: Int, leftVol: Int, rightVol: Int, buf: MutPtr): Int =
    if (pspNapiAvailable) wasmLibcPspSceAudioOutputPanned(channel, leftVol, rightVol, buf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceAudioOutputPannedBlocking(channel: Int, leftVol: Int, rightVol: Int, buf: MutPtr): Int =
    if (pspNapiAvailable) wasmLibcPspSceAudioOutputPannedBlocking(channel, leftVol, rightVol, buf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceAudioGetChannelRestLen(channel: Int): Int =
    if (pspNapiAvailable) wasmLibcPspSceAudioGetChannelRestLen(channel) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceAudioGetChannelRestLength(channel: Int): Int =
    if (pspNapiAvailable) wasmLibcPspSceAudioGetChannelRestLength(channel) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceAudioSetChannelDataLen(channel: Int, sampleCount: Int): Int =
    if (pspNapiAvailable) wasmLibcPspSceAudioSetChannelDataLen(channel, sampleCount) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceAudioChangeChannelConfig(channel: Int, format: AudioFormat): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceAudioChangeChannelVolume(channel: Int, leftVol: Int, rightVol: Int): Int =
    if (pspNapiAvailable) wasmLibcPspSceAudioChangeChannelVolume(channel, leftVol, rightVol) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceAudioOutput2Reserve(sampleCount: Int): Int =
    if (pspNapiAvailable) wasmLibcPspSceAudioOutput2Reserve(sampleCount) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceAudioOutput2Release(): Int =
    if (pspNapiAvailable) wasmLibcPspSceAudioOutput2Release() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceAudioOutput2ChangeLength(sampleCount: Int): Int =
    if (pspNapiAvailable) wasmLibcPspSceAudioOutput2ChangeLength(sampleCount) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceAudioOutput2OutputBlocking(vol: Int, buf: MutPtr): Int =
    if (pspNapiAvailable) wasmLibcPspSceAudioOutput2OutputBlocking(vol, buf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceAudioOutput2GetRestSample(): Int =
    if (pspNapiAvailable) wasmLibcPspSceAudioOutput2GetRestSample() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceAudioSRCChReserve(sampleCount: Int, freq: AudioOutputFrequency, channels: Int): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceAudioSRCChRelease(): Int =
    if (pspNapiAvailable) wasmLibcPspSceAudioSRCChRelease() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceAudioSRCOutputBlocking(vol: Int, buf: MutPtr): Int =
    if (pspNapiAvailable) wasmLibcPspSceAudioSRCOutputBlocking(vol, buf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceAudioInputInit(unknown1: Int, gain: Int, unknown2: Int): Int =
    if (pspNapiAvailable) wasmLibcPspSceAudioInputInit(unknown1, gain, unknown2) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceAudioInputInitEx(params: MutPtr): Int =
    if (pspNapiAvailable) wasmLibcPspSceAudioInputInitEx(params.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceAudioInputBlocking(sampleCount: Int, freq: AudioInputFrequency, buf: MutPtr): Unit = throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceAudioInput(sampleCount: Int, freq: AudioInputFrequency, buf: MutPtr): Unit = throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceAudioGetInputLength(): Int =
    if (pspNapiAvailable) wasmLibcPspSceAudioGetInputLength() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceAudioWaitInputEnd(): Int =
    if (pspNapiAvailable) wasmLibcPspSceAudioWaitInputEnd() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceAudioPollInputEnd(): Int =
    if (pspNapiAvailable) wasmLibcPspSceAudioPollInputEnd() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceAtracGetAtracID(uiCodecType: UInt): Int =
    if (pspNapiAvailable) wasmLibcPspSceAtracGetAtracID(uiCodecType.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceAtracSetDataAndGetID(buf: MutPtr, bufsize: ULong): Int =
    if (pspNapiAvailable) wasmLibcPspSceAtracSetDataAndGetID(buf.rawAddress.toString(), bufsize.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceAtracDecodeData(atracId: Int, outSamples: MutPtr, outN: MutPtr, outEnd: MutPtr, outRemainFrame: MutPtr): Int =
    if (pspNapiAvailable) wasmLibcPspSceAtracDecodeData(atracId, outSamples.rawAddress.toString(), outN.rawAddress.toString(), outEnd.rawAddress.toString(), outRemainFrame.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceAtracGetRemainFrame(atracId: Int, outRemainFrame: MutPtr): Int =
    if (pspNapiAvailable) wasmLibcPspSceAtracGetRemainFrame(atracId, outRemainFrame.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceAtracGetStreamDataInfo(atracId: Int, writePointer: MutPtr, availableBytes: MutPtr, readOffset: MutPtr): Int =
    if (pspNapiAvailable) wasmLibcPspSceAtracGetStreamDataInfo(atracId, writePointer.rawAddress.toString(), availableBytes.rawAddress.toString(), readOffset.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceAtracAddStreamData(atracId: Int, bytesToAdd: UInt): Int =
    if (pspNapiAvailable) wasmLibcPspSceAtracAddStreamData(atracId, bytesToAdd.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceAtracGetBitrate(atracId: Int, outBitrate: MutPtr): Int =
    if (pspNapiAvailable) wasmLibcPspSceAtracGetBitrate(atracId, outBitrate.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceAtracSetLoopNum(atracId: Int, nloops: Int): Int =
    if (pspNapiAvailable) wasmLibcPspSceAtracSetLoopNum(atracId, nloops) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceAtracReleaseAtracID(atracId: Int): Int =
    if (pspNapiAvailable) wasmLibcPspSceAtracReleaseAtracID(atracId) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceAtracGetNextSample(atracId: Int, outN: MutPtr): Int =
    if (pspNapiAvailable) wasmLibcPspSceAtracGetNextSample(atracId, outN.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceAtracGetMaxSample(atracId: Int, outMax: MutPtr): Int =
    if (pspNapiAvailable) wasmLibcPspSceAtracGetMaxSample(atracId, outMax.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceAtracGetBufferInfoForReseting(atracId: Int, uiSample: UInt, pbufferInfo: MutPtr): Int =
    if (pspNapiAvailable) wasmLibcPspSceAtracGetBufferInfoForReseting(atracId, uiSample.toInt(), pbufferInfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceAtracGetChannel(atracId: Int, puiChannel: MutPtr): Int =
    if (pspNapiAvailable) wasmLibcPspSceAtracGetChannel(atracId, puiChannel.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceAtracGetInternalErrorInfo(atracId: Int, piResult: MutPtr): Int =
    if (pspNapiAvailable) wasmLibcPspSceAtracGetInternalErrorInfo(atracId, piResult.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceAtracGetLoopStatus(atracId: Int, piLoopNum: MutPtr, puiLoopStatus: MutPtr): Int =
    if (pspNapiAvailable) wasmLibcPspSceAtracGetLoopStatus(atracId, piLoopNum.rawAddress.toString(), puiLoopStatus.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceAtracGetNextDecodePosition(atracId: Int, puiSamplePosition: MutPtr): Int =
    if (pspNapiAvailable) wasmLibcPspSceAtracGetNextDecodePosition(atracId, puiSamplePosition.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceAtracGetSecondBufferInfo(atracId: Int, puiPosition: MutPtr, puiDataByte: MutPtr): Int =
    if (pspNapiAvailable) wasmLibcPspSceAtracGetSecondBufferInfo(atracId, puiPosition.rawAddress.toString(), puiDataByte.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceAtracGetSoundSample(atracId: Int, piEndSample: MutPtr, piLoopStartSample: MutPtr, piLoopEndSample: MutPtr): Int =
    if (pspNapiAvailable) wasmLibcPspSceAtracGetSoundSample(atracId, piEndSample.rawAddress.toString(), piLoopStartSample.rawAddress.toString(), piLoopEndSample.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceAtracResetPlayPosition(atracId: Int, uiSample: UInt, uiWriteByteFirstBuf: UInt, uiWriteByteSecondBuf: UInt): Int =
    if (pspNapiAvailable) wasmLibcPspSceAtracResetPlayPosition(atracId, uiSample.toInt(), uiWriteByteFirstBuf.toInt(), uiWriteByteSecondBuf.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceAtracSetData(atracId: Int, pucBufferAddr: MutPtr, uiBufferByte: UInt): Int =
    if (pspNapiAvailable) wasmLibcPspSceAtracSetData(atracId, pucBufferAddr.rawAddress.toString(), uiBufferByte.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceAtracSetHalfwayBuffer(atracId: Int, pucBufferAddr: MutPtr, uiReadByte: UInt, uiBufferByte: UInt): Int =
    if (pspNapiAvailable) wasmLibcPspSceAtracSetHalfwayBuffer(atracId, pucBufferAddr.rawAddress.toString(), uiReadByte.toInt(), uiBufferByte.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceAtracSetHalfwayBufferAndGetID(pucBufferAddr: MutPtr, uiReadByte: UInt, uiBufferByte: UInt): Int =
    if (pspNapiAvailable) wasmLibcPspSceAtracSetHalfwayBufferAndGetID(pucBufferAddr.rawAddress.toString(), uiReadByte.toInt(), uiBufferByte.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceAtracSetSecondBuffer(atracId: Int, pucSecondBufferAddr: MutPtr, uiSecondBufferByte: UInt): Int =
    if (pspNapiAvailable) wasmLibcPspSceAtracSetSecondBuffer(atracId, pucSecondBufferAddr.rawAddress.toString(), uiSecondBufferByte.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceCtrlSetSamplingCycle(cycle: Int): Int =
    if (pspNapiAvailable) wasmLibcPspSceCtrlSetSamplingCycle(cycle) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceCtrlGetSamplingCycle(pcycle: MutPtr): Int =
    if (pspNapiAvailable) wasmLibcPspSceCtrlGetSamplingCycle(pcycle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceCtrlSetSamplingMode(mode: CtrlMode): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceCtrlGetSamplingMode(pmode: MutPtr): Int =
    if (pspNapiAvailable) wasmLibcPspSceCtrlGetSamplingMode(pmode.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceCtrlPeekBufferPositive(padData: MutPtr, count: Int): Int =
    if (pspNapiAvailable) wasmLibcPspSceCtrlPeekBufferPositive(padData.rawAddress.toString(), count) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceCtrlPeekBufferNegative(padData: MutPtr, count: Int): Int =
    if (pspNapiAvailable) wasmLibcPspSceCtrlPeekBufferNegative(padData.rawAddress.toString(), count) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceCtrlReadBufferPositive(padData: MutPtr, count: Int): Int =
    if (pspNapiAvailable) wasmLibcPspSceCtrlReadBufferPositive(padData.rawAddress.toString(), count) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceCtrlReadBufferNegative(padData: MutPtr, count: Int): Int =
    if (pspNapiAvailable) wasmLibcPspSceCtrlReadBufferNegative(padData.rawAddress.toString(), count) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceCtrlPeekLatch(latchData: MutPtr): Int =
    if (pspNapiAvailable) wasmLibcPspSceCtrlPeekLatch(latchData.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceCtrlReadLatch(latchData: MutPtr): Int =
    if (pspNapiAvailable) wasmLibcPspSceCtrlReadLatch(latchData.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceCtrlSetIdleCancelThreshold(idlereset: Int, idleback: Int): Int =
    if (pspNapiAvailable) wasmLibcPspSceCtrlSetIdleCancelThreshold(idlereset, idleback) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceCtrlGetIdleCancelThreshold(idlereset: MutPtr, idleback: MutPtr): Int =
    if (pspNapiAvailable) wasmLibcPspSceCtrlGetIdleCancelThreshold(idlereset.rawAddress.toString(), idleback.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceDisplaySetMode(mode: DisplayMode, width: ULong, height: ULong): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceDisplayGetMode(pmode: MutPtr, pwidth: MutPtr, pheight: MutPtr): Int =
    if (pspNapiAvailable) wasmLibcPspSceDisplayGetMode(pmode.rawAddress.toString(), pwidth.rawAddress.toString(), pheight.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceDisplaySetFrameBuf(topAddr: ConstPtr, bufferWidth: ULong, pixelFormat: DisplayPixelFormat, sync: DisplaySetBufSync): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceDisplayGetFrameBuf(topAddr: MutPtr, bufferWidth: MutPtr, pixelFormat: MutPtr, sync: DisplaySetBufSync): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceDisplayGetVcount(): UInt =
    if (pspNapiAvailable) wasmLibcPspSceDisplayGetVcount().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceDisplayWaitVblank(): Int =
    if (pspNapiAvailable) wasmLibcPspSceDisplayWaitVblank() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceDisplayWaitVblankCB(): Int =
    if (pspNapiAvailable) wasmLibcPspSceDisplayWaitVblankCB() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceDisplayWaitVblankStart(): Int =
    if (pspNapiAvailable) wasmLibcPspSceDisplayWaitVblankStart() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceDisplayWaitVblankStartCB(): Int =
    if (pspNapiAvailable) wasmLibcPspSceDisplayWaitVblankStartCB() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceDisplayGetAccumulatedHcount(): Int =
    if (pspNapiAvailable) wasmLibcPspSceDisplayGetAccumulatedHcount() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceDisplayGetCurrentHcount(): Int =
    if (pspNapiAvailable) wasmLibcPspSceDisplayGetCurrentHcount() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceDisplayGetFramePerSec(): Float =
    if (pspNapiAvailable) wasmLibcPspSceDisplayGetFramePerSec().toFloat() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceDisplayIsForeground(): Int =
    if (pspNapiAvailable) wasmLibcPspSceDisplayIsForeground() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceDisplayIsVblank(): Int =
    if (pspNapiAvailable) wasmLibcPspSceDisplayIsVblank() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGeEdramGetSize(): UInt =
    if (pspNapiAvailable) wasmLibcPspSceGeEdramGetSize().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGeEdramGetAddr(): MutPtr =
    if (pspNapiAvailable) MutPtr(wasmLibcPspSceGeEdramGetAddr().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGeEdramSetAddrTranslation(width: Int): Int =
    if (pspNapiAvailable) wasmLibcPspSceGeEdramSetAddrTranslation(width) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGeGetCmd(cmd: Int): UInt =
    if (pspNapiAvailable) wasmLibcPspSceGeGetCmd(cmd).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGeGetMtx(type: GeMatrixType, matrix: MutPtr): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGeGetStack(stackId: Int, stack: MutPtr): Int =
    if (pspNapiAvailable) wasmLibcPspSceGeGetStack(stackId, stack.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGeSaveContext(context: MutPtr): Int =
    if (pspNapiAvailable) wasmLibcPspSceGeSaveContext(context.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGeRestoreContext(context: ConstPtr): Int =
    if (pspNapiAvailable) wasmLibcPspSceGeRestoreContext(context.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGeListEnQueue(list: ConstPtr, stall: MutPtr, cbid: Int, arg: MutPtr): Int =
    if (pspNapiAvailable) wasmLibcPspSceGeListEnQueue(list.rawAddress.toString(), stall.rawAddress.toString(), cbid, arg.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGeListEnQueueHead(list: ConstPtr, stall: MutPtr, cbid: Int, arg: MutPtr): Int =
    if (pspNapiAvailable) wasmLibcPspSceGeListEnQueueHead(list.rawAddress.toString(), stall.rawAddress.toString(), cbid, arg.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGeListDeQueue(qid: Int): Int =
    if (pspNapiAvailable) wasmLibcPspSceGeListDeQueue(qid) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGeListUpdateStallAddr(qid: Int, stall: MutPtr): Int =
    if (pspNapiAvailable) wasmLibcPspSceGeListUpdateStallAddr(qid, stall.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGeListSync(qid: Int, syncType: Int): GeListState =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGeDrawSync(syncType: Int): GeListState =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGeBreak(mode: Int, pParam: MutPtr): Int =
    if (pspNapiAvailable) wasmLibcPspSceGeBreak(mode, pParam.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGeContinue(): Int =
    if (pspNapiAvailable) wasmLibcPspSceGeContinue() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGeSetCallback(cb: MutPtr): Int =
    if (pspNapiAvailable) wasmLibcPspSceGeSetCallback(cb.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGeUnsetCallback(cbid: Int): Int =
    if (pspNapiAvailable) wasmLibcPspSceGeUnsetCallback(cbid) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelExitGame() {
    if (pspNapiAvailable) {
        wasmLibcPspSceKernelExitGame()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceKernelRegisterExitCallback(id: SceUid): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelLoadExec(file: ConstPtr, param: MutPtr): Int =
    if (pspNapiAvailable) wasmLibcPspSceKernelLoadExec(file.rawAddress.toString(), param.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelAllocPartitionMemory(partition: SceSysMemPartitionId, name: ConstPtr, type: SceSysMemBlockTypes, size: UInt, addr: MutPtr): SceUid =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelGetBlockHeadAddr(blockid: SceUid): MutPtr =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelFreePartitionMemory(blockid: SceUid): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelTotalFreeMemSize(): ULong =
    if (pspNapiAvailable) wasmLibcPspSceKernelTotalFreeMemSize().toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelMaxFreeMemSize(): ULong =
    if (pspNapiAvailable) wasmLibcPspSceKernelMaxFreeMemSize().toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelDevkitVersion(): UInt =
    if (pspNapiAvailable) wasmLibcPspSceKernelDevkitVersion().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelSetCompiledSdkVersion(version: UInt): Int =
    if (pspNapiAvailable) wasmLibcPspSceKernelSetCompiledSdkVersion(version.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelGetCompiledSdkVersion(): UInt =
    if (pspNapiAvailable) wasmLibcPspSceKernelGetCompiledSdkVersion().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelLibcTime(t: MutPtr): Int =
    if (pspNapiAvailable) wasmLibcPspSceKernelLibcTime(t.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelLibcClock(): UInt =
    if (pspNapiAvailable) wasmLibcPspSceKernelLibcClock().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelLibcGettimeofday(tp: MutPtr, tzp: MutPtr): Int =
    if (pspNapiAvailable) wasmLibcPspSceKernelLibcGettimeofday(tp.rawAddress.toString(), tzp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelDcacheWritebackAll() {
    if (pspNapiAvailable) {
        wasmLibcPspSceKernelDcacheWritebackAll()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceKernelDcacheWritebackInvalidateAll() {
    if (pspNapiAvailable) {
        wasmLibcPspSceKernelDcacheWritebackInvalidateAll()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceKernelDcacheWritebackRange(p: ConstPtr, size: UInt) {
    if (pspNapiAvailable) {
        wasmLibcPspSceKernelDcacheWritebackRange(p.rawAddress.toString(), size.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceKernelDcacheWritebackInvalidateRange(p: ConstPtr, size: UInt) {
    if (pspNapiAvailable) {
        wasmLibcPspSceKernelDcacheWritebackInvalidateRange(p.rawAddress.toString(), size.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceKernelDcacheInvalidateRange(p: ConstPtr, size: UInt) {
    if (pspNapiAvailable) {
        wasmLibcPspSceKernelDcacheInvalidateRange(p.rawAddress.toString(), size.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceKernelIcacheInvalidateAll() {
    if (pspNapiAvailable) {
        wasmLibcPspSceKernelIcacheInvalidateAll()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceKernelIcacheInvalidateRange(p: ConstPtr, size: UInt) {
    if (pspNapiAvailable) {
        wasmLibcPspSceKernelIcacheInvalidateRange(p.rawAddress.toString(), size.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceKernelUtilsMt19937Init(ctx: MutPtr, seed: UInt): Int =
    if (pspNapiAvailable) wasmLibcPspSceKernelUtilsMt19937Init(ctx.rawAddress.toString(), seed.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelUtilsMt19937UInt(ctx: MutPtr): UInt =
    if (pspNapiAvailable) wasmLibcPspSceKernelUtilsMt19937UInt(ctx.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelUtilsMd5Digest(data: MutPtr, size: UInt, digest: MutPtr): Int =
    if (pspNapiAvailable) wasmLibcPspSceKernelUtilsMd5Digest(data.rawAddress.toString(), size.toInt(), digest.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelUtilsMd5BlockInit(ctx: MutPtr): Int =
    if (pspNapiAvailable) wasmLibcPspSceKernelUtilsMd5BlockInit(ctx.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelUtilsMd5BlockUpdate(ctx: MutPtr, data: MutPtr, size: UInt): Int =
    if (pspNapiAvailable) wasmLibcPspSceKernelUtilsMd5BlockUpdate(ctx.rawAddress.toString(), data.rawAddress.toString(), size.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelUtilsMd5BlockResult(ctx: MutPtr, digest: MutPtr): Int =
    if (pspNapiAvailable) wasmLibcPspSceKernelUtilsMd5BlockResult(ctx.rawAddress.toString(), digest.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelUtilsSha1Digest(data: MutPtr, size: UInt, digest: MutPtr): Int =
    if (pspNapiAvailable) wasmLibcPspSceKernelUtilsSha1Digest(data.rawAddress.toString(), size.toInt(), digest.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelUtilsSha1BlockInit(ctx: MutPtr): Int =
    if (pspNapiAvailable) wasmLibcPspSceKernelUtilsSha1BlockInit(ctx.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelUtilsSha1BlockUpdate(ctx: MutPtr, data: MutPtr, size: UInt): Int =
    if (pspNapiAvailable) wasmLibcPspSceKernelUtilsSha1BlockUpdate(ctx.rawAddress.toString(), data.rawAddress.toString(), size.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelUtilsSha1BlockResult(ctx: MutPtr, digest: MutPtr): Int =
    if (pspNapiAvailable) wasmLibcPspSceKernelUtilsSha1BlockResult(ctx.rawAddress.toString(), digest.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelRegisterSubIntrHandler(intNo: Int, no: Int, handler: MutPtr, arg: MutPtr): Int =
    if (pspNapiAvailable) wasmLibcPspSceKernelRegisterSubIntrHandler(intNo, no, handler.rawAddress.toString(), arg.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelReleaseSubIntrHandler(intNo: Int, no: Int): Int =
    if (pspNapiAvailable) wasmLibcPspSceKernelReleaseSubIntrHandler(intNo, no) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelEnableSubIntr(intNo: Int, no: Int): Int =
    if (pspNapiAvailable) wasmLibcPspSceKernelEnableSubIntr(intNo, no) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelDisableSubIntr(intNo: Int, no: Int): Int =
    if (pspNapiAvailable) wasmLibcPspSceKernelDisableSubIntr(intNo, no) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryIntrHandlerInfo(intrCode: SceUid, subIntrCode: SceUid, data: MutPtr): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelCpuSuspendIntr(): UInt =
    if (pspNapiAvailable) wasmLibcPspSceKernelCpuSuspendIntr().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelCpuResumeIntr(flags: UInt) {
    if (pspNapiAvailable) {
        wasmLibcPspSceKernelCpuResumeIntr(flags.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceKernelCpuResumeIntrWithSync(flags: UInt) {
    if (pspNapiAvailable) {
        wasmLibcPspSceKernelCpuResumeIntrWithSync(flags.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceKernelIsCpuIntrSuspended(flags: UInt): Int =
    if (pspNapiAvailable) wasmLibcPspSceKernelIsCpuIntrSuspended(flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelIsCpuIntrEnable(): Int =
    if (pspNapiAvailable) wasmLibcPspSceKernelIsCpuIntrEnable() else throw UnsupportedOperationException("Native FFI addon is not available")

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
    if (pspNapiAvailable) wasmLibcPspSceKernelSelfStopUnloadModule(unknown, argSize.toString(), argp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelStopUnloadSelfModule(argSize: ULong, argp: MutPtr, status: MutPtr, option: MutPtr): Int =
    if (pspNapiAvailable) wasmLibcPspSceKernelStopUnloadSelfModule(argSize.toString(), argp.rawAddress.toString(), status.rawAddress.toString(), option.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelQueryModuleInfo(modId: SceUid, info: MutPtr): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelGetModuleIdList(readBuf: MutPtr, readBufSize: Int, idCount: MutPtr): Int =
    if (pspNapiAvailable) wasmLibcPspSceKernelGetModuleIdList(readBuf.rawAddress.toString(), readBufSize, idCount.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelVolatileMemLock(unk: Int, ptr: MutPtr, size: MutPtr): Int =
    if (pspNapiAvailable) wasmLibcPspSceKernelVolatileMemLock(unk, ptr.rawAddress.toString(), size.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelVolatileMemTryLock(unk: Int, ptr: MutPtr, size: MutPtr): Int =
    if (pspNapiAvailable) wasmLibcPspSceKernelVolatileMemTryLock(unk, ptr.rawAddress.toString(), size.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelVolatileMemUnlock(unk: Int): Int =
    if (pspNapiAvailable) wasmLibcPspSceKernelVolatileMemUnlock(unk) else throw UnsupportedOperationException("Native FFI addon is not available")

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
    if (pspNapiAvailable) wasmLibcPspSceKernelExitThread(status) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelExitDeleteThread(status: Int): Int =
    if (pspNapiAvailable) wasmLibcPspSceKernelExitDeleteThread(status) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelTerminateThread(thid: SceUid): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelTerminateDeleteThread(thid: SceUid): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelSuspendDispatchThread(): Int =
    if (pspNapiAvailable) wasmLibcPspSceKernelSuspendDispatchThread() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelResumeDispatchThread(state: Int): Int =
    if (pspNapiAvailable) wasmLibcPspSceKernelResumeDispatchThread(state) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelSleepThread(): Int =
    if (pspNapiAvailable) wasmLibcPspSceKernelSleepThread() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelSleepThreadCB(): Int =
    if (pspNapiAvailable) wasmLibcPspSceKernelSleepThreadCB() else throw UnsupportedOperationException("Native FFI addon is not available")

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
    if (pspNapiAvailable) wasmLibcPspSceKernelDelayThread(delay.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelDelayThreadCB(delay: UInt): Int =
    if (pspNapiAvailable) wasmLibcPspSceKernelDelayThreadCB(delay.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelDelaySysClockThread(delay: MutPtr): Int =
    if (pspNapiAvailable) wasmLibcPspSceKernelDelaySysClockThread(delay.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelDelaySysClockThreadCB(delay: MutPtr): Int =
    if (pspNapiAvailable) wasmLibcPspSceKernelDelaySysClockThreadCB(delay.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelChangeCurrentThreadAttr(unknown: Int, attr: Int): Int =
    if (pspNapiAvailable) wasmLibcPspSceKernelChangeCurrentThreadAttr(unknown, attr) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelChangeThreadPriority(thid: SceUid, priority: Int): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelRotateThreadReadyQueue(priority: Int): Int =
    if (pspNapiAvailable) wasmLibcPspSceKernelRotateThreadReadyQueue(priority) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelReleaseWaitThread(thid: SceUid): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelGetThreadId(): Int =
    if (pspNapiAvailable) wasmLibcPspSceKernelGetThreadId() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelGetThreadCurrentPriority(): Int =
    if (pspNapiAvailable) wasmLibcPspSceKernelGetThreadCurrentPriority() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelGetThreadExitStatus(thid: SceUid): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelCheckThreadStack(): Int =
    if (pspNapiAvailable) wasmLibcPspSceKernelCheckThreadStack() else throw UnsupportedOperationException("Native FFI addon is not available")

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
    if (pspNapiAvailable) wasmLibcPspSceKernelCheckCallback() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelGetThreadmanIdList(type: SceKernelIdListType, readBuf: MutPtr, readBufSize: Int, idCount: MutPtr): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelReferSystemStatus(status: MutPtr): Int =
    if (pspNapiAvailable) wasmLibcPspSceKernelReferSystemStatus(status.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

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
    if (pspNapiAvailable) wasmLibcPspSceKernelCreateFpl(name.rawAddress.toString(), part, attr, size.toInt(), blocks.toInt(), opt.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

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
    if (pspNapiAvailable) wasmLibcPspSceKernelUSec2SysClock(usec.toInt(), clock.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelUSec2SysClockWide(usec: UInt): Long =
    if (pspNapiAvailable) wasmLibcPspSceKernelUSec2SysClockWide(usec.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelSysClock2USec(clock: MutPtr, low: MutPtr, high: MutPtr): Int =
    if (pspNapiAvailable) wasmLibcPspSceKernelSysClock2USec(clock.rawAddress.toString(), low.rawAddress.toString(), high.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelSysClock2USecWide(clock: Long, low: MutPtr, high: MutPtr): Int =
    if (pspNapiAvailable) wasmLibcPspSceKernelSysClock2USecWide(clock.toString(), low.rawAddress.toString(), high.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelGetSystemTime(time: MutPtr): Int =
    if (pspNapiAvailable) wasmLibcPspSceKernelGetSystemTime(time.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelGetSystemTimeWide(): Long =
    if (pspNapiAvailable) wasmLibcPspSceKernelGetSystemTimeWide().toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelGetSystemTimeLow(): UInt =
    if (pspNapiAvailable) wasmLibcPspSceKernelGetSystemTimeLow().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

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
    if (pspNapiAvailable) MutPtr(wasmLibcPspSceKernelReferThreadProfiler().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceKernelReferGlobalProfiler(): MutPtr =
    if (pspNapiAvailable) MutPtr(wasmLibcPspSceKernelReferGlobalProfiler().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUsbStart(driverName: ConstPtr, size: Int, args: MutPtr): Int =
    if (pspNapiAvailable) wasmLibcPspSceUsbStart(driverName.rawAddress.toString(), size, args.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUsbStop(driverName: ConstPtr, size: Int, args: MutPtr): Int =
    if (pspNapiAvailable) wasmLibcPspSceUsbStop(driverName.rawAddress.toString(), size, args.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUsbActivate(pid: UInt): Int =
    if (pspNapiAvailable) wasmLibcPspSceUsbActivate(pid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUsbDeactivate(pid: UInt): Int =
    if (pspNapiAvailable) wasmLibcPspSceUsbDeactivate(pid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUsbGetState(): Int =
    if (pspNapiAvailable) wasmLibcPspSceUsbGetState() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUsbGetDrvState(driverName: ConstPtr): Int =
    if (pspNapiAvailable) wasmLibcPspSceUsbGetDrvState(driverName.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUsbCamSetupStill(param: MutPtr): Int =
    if (pspNapiAvailable) wasmLibcPspSceUsbCamSetupStill(param.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUsbCamSetupStillEx(param: MutPtr): Int =
    if (pspNapiAvailable) wasmLibcPspSceUsbCamSetupStillEx(param.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUsbCamStillInputBlocking(buf: MutPtr, size: ULong): Int =
    if (pspNapiAvailable) wasmLibcPspSceUsbCamStillInputBlocking(buf.rawAddress.toString(), size.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUsbCamStillInput(buf: MutPtr, size: ULong): Int =
    if (pspNapiAvailable) wasmLibcPspSceUsbCamStillInput(buf.rawAddress.toString(), size.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUsbCamStillWaitInputEnd(): Int =
    if (pspNapiAvailable) wasmLibcPspSceUsbCamStillWaitInputEnd() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUsbCamStillPollInputEnd(): Int =
    if (pspNapiAvailable) wasmLibcPspSceUsbCamStillPollInputEnd() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUsbCamStillCancelInput(): Int =
    if (pspNapiAvailable) wasmLibcPspSceUsbCamStillCancelInput() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUsbCamStillGetInputLength(): Int =
    if (pspNapiAvailable) wasmLibcPspSceUsbCamStillGetInputLength() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUsbCamSetupVideo(param: MutPtr, workArea: MutPtr, workAreaSize: Int): Int =
    if (pspNapiAvailable) wasmLibcPspSceUsbCamSetupVideo(param.rawAddress.toString(), workArea.rawAddress.toString(), workAreaSize) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUsbCamSetupVideoEx(param: MutPtr, workArea: MutPtr, workAreaSize: Int): Int =
    if (pspNapiAvailable) wasmLibcPspSceUsbCamSetupVideoEx(param.rawAddress.toString(), workArea.rawAddress.toString(), workAreaSize) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUsbCamStartVideo(): Int =
    if (pspNapiAvailable) wasmLibcPspSceUsbCamStartVideo() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUsbCamStopVideo(): Int =
    if (pspNapiAvailable) wasmLibcPspSceUsbCamStopVideo() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUsbCamReadVideoFrameBlocking(buf: MutPtr, size: ULong): Int =
    if (pspNapiAvailable) wasmLibcPspSceUsbCamReadVideoFrameBlocking(buf.rawAddress.toString(), size.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUsbCamReadVideoFrame(buf: MutPtr, size: ULong): Int =
    if (pspNapiAvailable) wasmLibcPspSceUsbCamReadVideoFrame(buf.rawAddress.toString(), size.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUsbCamWaitReadVideoFrameEnd(): Int =
    if (pspNapiAvailable) wasmLibcPspSceUsbCamWaitReadVideoFrameEnd() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUsbCamPollReadVideoFrameEnd(): Int =
    if (pspNapiAvailable) wasmLibcPspSceUsbCamPollReadVideoFrameEnd() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUsbCamGetReadVideoFrameSize(): Int =
    if (pspNapiAvailable) wasmLibcPspSceUsbCamGetReadVideoFrameSize() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUsbCamSetSaturation(saturation: Int): Int =
    if (pspNapiAvailable) wasmLibcPspSceUsbCamSetSaturation(saturation) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUsbCamSetBrightness(brightness: Int): Int =
    if (pspNapiAvailable) wasmLibcPspSceUsbCamSetBrightness(brightness) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUsbCamSetContrast(contrast: Int): Int =
    if (pspNapiAvailable) wasmLibcPspSceUsbCamSetContrast(contrast) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUsbCamSetSharpness(sharpness: Int): Int =
    if (pspNapiAvailable) wasmLibcPspSceUsbCamSetSharpness(sharpness) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUsbCamSetImageEffectMode(effectMode: UsbCamEffectMode): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUsbCamSetEvLevel(exposureLevel: UsbCamEvLevel): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUsbCamSetReverseMode(reverseFlags: Int): Int =
    if (pspNapiAvailable) wasmLibcPspSceUsbCamSetReverseMode(reverseFlags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUsbCamSetZoom(zoom: Int): Int =
    if (pspNapiAvailable) wasmLibcPspSceUsbCamSetZoom(zoom) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUsbCamGetSaturation(saturation: MutPtr): Int =
    if (pspNapiAvailable) wasmLibcPspSceUsbCamGetSaturation(saturation.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUsbCamGetBrightness(brightness: MutPtr): Int =
    if (pspNapiAvailable) wasmLibcPspSceUsbCamGetBrightness(brightness.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUsbCamGetContrast(contrast: MutPtr): Int =
    if (pspNapiAvailable) wasmLibcPspSceUsbCamGetContrast(contrast.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUsbCamGetSharpness(sharpness: MutPtr): Int =
    if (pspNapiAvailable) wasmLibcPspSceUsbCamGetSharpness(sharpness.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUsbCamGetImageEffectMode(effectMode: MutPtr): Int =
    if (pspNapiAvailable) wasmLibcPspSceUsbCamGetImageEffectMode(effectMode.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUsbCamGetEvLevel(exposureLevel: MutPtr): Int =
    if (pspNapiAvailable) wasmLibcPspSceUsbCamGetEvLevel(exposureLevel.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUsbCamGetReverseMode(reverseFlags: MutPtr): Int =
    if (pspNapiAvailable) wasmLibcPspSceUsbCamGetReverseMode(reverseFlags.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUsbCamGetZoom(zoom: MutPtr): Int =
    if (pspNapiAvailable) wasmLibcPspSceUsbCamGetZoom(zoom.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUsbCamAutoImageReverseSW(on: Int): Int =
    if (pspNapiAvailable) wasmLibcPspSceUsbCamAutoImageReverseSW(on) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUsbCamGetAutoImageReverseState(): Int =
    if (pspNapiAvailable) wasmLibcPspSceUsbCamGetAutoImageReverseState() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUsbCamGetLensDirection(): Int =
    if (pspNapiAvailable) wasmLibcPspSceUsbCamGetLensDirection() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUsbstorBootRegisterNotify(eventFlag: SceUid): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUsbstorBootUnregisterNotify(eventFlag: UInt): Int =
    if (pspNapiAvailable) wasmLibcPspSceUsbstorBootUnregisterNotify(eventFlag.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUsbstorBootSetCapacity(size: UInt): Int =
    if (pspNapiAvailable) wasmLibcPspSceUsbstorBootSetCapacity(size.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scePowerRegisterCallback(slot: Int, cbid: SceUid): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scePowerUnregisterCallback(slot: Int): Int =
    if (pspNapiAvailable) wasmLibcPspScePowerUnregisterCallback(slot) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scePowerIsPowerOnline(): Int =
    if (pspNapiAvailable) wasmLibcPspScePowerIsPowerOnline() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scePowerIsBatteryExist(): Int =
    if (pspNapiAvailable) wasmLibcPspScePowerIsBatteryExist() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scePowerIsBatteryCharging(): Int =
    if (pspNapiAvailable) wasmLibcPspScePowerIsBatteryCharging() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scePowerGetBatteryChargingStatus(): Int =
    if (pspNapiAvailable) wasmLibcPspScePowerGetBatteryChargingStatus() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scePowerIsLowBattery(): Int =
    if (pspNapiAvailable) wasmLibcPspScePowerIsLowBattery() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scePowerGetBatteryLifePercent(): Int =
    if (pspNapiAvailable) wasmLibcPspScePowerGetBatteryLifePercent() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scePowerGetBatteryLifeTime(): Int =
    if (pspNapiAvailable) wasmLibcPspScePowerGetBatteryLifeTime() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scePowerGetBatteryTemp(): Int =
    if (pspNapiAvailable) wasmLibcPspScePowerGetBatteryTemp() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scePowerGetBatteryElec(): Int =
    if (pspNapiAvailable) wasmLibcPspScePowerGetBatteryElec() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scePowerGetBatteryVolt(): Int =
    if (pspNapiAvailable) wasmLibcPspScePowerGetBatteryVolt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scePowerSetCpuClockFrequency(cpufreq: Int): Int =
    if (pspNapiAvailable) wasmLibcPspScePowerSetCpuClockFrequency(cpufreq) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scePowerSetBusClockFrequency(busfreq: Int): Int =
    if (pspNapiAvailable) wasmLibcPspScePowerSetBusClockFrequency(busfreq) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scePowerGetCpuClockFrequency(): Int =
    if (pspNapiAvailable) wasmLibcPspScePowerGetCpuClockFrequency() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scePowerGetCpuClockFrequencyInt(): Int =
    if (pspNapiAvailable) wasmLibcPspScePowerGetCpuClockFrequencyInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scePowerGetCpuClockFrequencyFloat(): Float =
    if (pspNapiAvailable) wasmLibcPspScePowerGetCpuClockFrequencyFloat().toFloat() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scePowerGetBusClockFrequency(): Int =
    if (pspNapiAvailable) wasmLibcPspScePowerGetBusClockFrequency() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scePowerGetBusClockFrequencyInt(): Int =
    if (pspNapiAvailable) wasmLibcPspScePowerGetBusClockFrequencyInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scePowerGetBusClockFrequencyFloat(): Float =
    if (pspNapiAvailable) wasmLibcPspScePowerGetBusClockFrequencyFloat().toFloat() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scePowerSetClockFrequency(pllfreq: Int, cpufreq: Int, busfreq: Int): Int =
    if (pspNapiAvailable) wasmLibcPspScePowerSetClockFrequency(pllfreq, cpufreq, busfreq) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scePowerLock(unknown: Int): Int =
    if (pspNapiAvailable) wasmLibcPspScePowerLock(unknown) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scePowerUnlock(unknown: Int): Int =
    if (pspNapiAvailable) wasmLibcPspScePowerUnlock(unknown) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scePowerTick(t: PowerTick): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scePowerGetIdleTimer(): Int =
    if (pspNapiAvailable) wasmLibcPspScePowerGetIdleTimer() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scePowerIdleTimerEnable(unknown: Int): Int =
    if (pspNapiAvailable) wasmLibcPspScePowerIdleTimerEnable(unknown) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scePowerIdleTimerDisable(unknown: Int): Int =
    if (pspNapiAvailable) wasmLibcPspScePowerIdleTimerDisable(unknown) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scePowerRequestStandby(): Int =
    if (pspNapiAvailable) wasmLibcPspScePowerRequestStandby() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scePowerRequestSuspend(): Int =
    if (pspNapiAvailable) wasmLibcPspScePowerRequestSuspend() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceWlanDevIsPowerOn(): Int =
    if (pspNapiAvailable) wasmLibcPspSceWlanDevIsPowerOn() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceWlanGetSwitchState(): Int =
    if (pspNapiAvailable) wasmLibcPspSceWlanGetSwitchState() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceWlanGetEtherAddr(etherAddr: MutPtr): Int =
    if (pspNapiAvailable) wasmLibcPspSceWlanGetEtherAddr(etherAddr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceWlanDevAttach(): Int =
    if (pspNapiAvailable) wasmLibcPspSceWlanDevAttach() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceWlanDevDetach(): Int =
    if (pspNapiAvailable) wasmLibcPspSceWlanDevDetach() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceRtcGetTickResolution(): UInt =
    if (pspNapiAvailable) wasmLibcPspSceRtcGetTickResolution().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceRtcGetCurrentTick(tick: MutPtr): Int =
    if (pspNapiAvailable) wasmLibcPspSceRtcGetCurrentTick(tick.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceRtcGetCurrentClock(tm: MutPtr, tz: Int): Int =
    if (pspNapiAvailable) wasmLibcPspSceRtcGetCurrentClock(tm.rawAddress.toString(), tz) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceRtcGetCurrentClockLocalTime(tm: MutPtr): Int =
    if (pspNapiAvailable) wasmLibcPspSceRtcGetCurrentClockLocalTime(tm.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceRtcConvertUtcToLocalTime(tickUtc: ConstPtr, tickLocal: MutPtr): Int =
    if (pspNapiAvailable) wasmLibcPspSceRtcConvertUtcToLocalTime(tickUtc.rawAddress.toString(), tickLocal.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceRtcConvertLocalTimeToUTC(tickLocal: ConstPtr, tickUtc: MutPtr): Int =
    if (pspNapiAvailable) wasmLibcPspSceRtcConvertLocalTimeToUTC(tickLocal.rawAddress.toString(), tickUtc.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceRtcIsLeapYear(year: Int): Int =
    if (pspNapiAvailable) wasmLibcPspSceRtcIsLeapYear(year) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceRtcGetDaysInMonth(year: Int, month: Int): Int =
    if (pspNapiAvailable) wasmLibcPspSceRtcGetDaysInMonth(year, month) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceRtcGetDayOfWeek(year: Int, month: Int, day: Int): Int =
    if (pspNapiAvailable) wasmLibcPspSceRtcGetDayOfWeek(year, month, day) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceRtcCheckValid(date: ConstPtr): Int =
    if (pspNapiAvailable) wasmLibcPspSceRtcCheckValid(date.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceRtcSetTick(date: MutPtr, tick: ConstPtr): Int =
    if (pspNapiAvailable) wasmLibcPspSceRtcSetTick(date.rawAddress.toString(), tick.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceRtcGetTick(date: ConstPtr, tick: MutPtr): Int =
    if (pspNapiAvailable) wasmLibcPspSceRtcGetTick(date.rawAddress.toString(), tick.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceRtcCompareTick(tick1: ConstPtr, tick2: ConstPtr): Int =
    if (pspNapiAvailable) wasmLibcPspSceRtcCompareTick(tick1.rawAddress.toString(), tick2.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceRtcTickAddTicks(destTick: MutPtr, srcTick: ConstPtr, numTicks: ULong): Int =
    if (pspNapiAvailable) wasmLibcPspSceRtcTickAddTicks(destTick.rawAddress.toString(), srcTick.rawAddress.toString(), numTicks.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceRtcTickAddMicroseconds(destTick: MutPtr, srcTick: ConstPtr, numMs: ULong): Int =
    if (pspNapiAvailable) wasmLibcPspSceRtcTickAddMicroseconds(destTick.rawAddress.toString(), srcTick.rawAddress.toString(), numMs.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceRtcTickAddSeconds(destTick: MutPtr, srcTick: ConstPtr, numSeconds: ULong): Int =
    if (pspNapiAvailable) wasmLibcPspSceRtcTickAddSeconds(destTick.rawAddress.toString(), srcTick.rawAddress.toString(), numSeconds.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceRtcTickAddMinutes(destTick: MutPtr, srcTick: ConstPtr, numMinutes: ULong): Int =
    if (pspNapiAvailable) wasmLibcPspSceRtcTickAddMinutes(destTick.rawAddress.toString(), srcTick.rawAddress.toString(), numMinutes.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceRtcTickAddHours(destTick: MutPtr, srcTick: ConstPtr, numHours: ULong): Int =
    if (pspNapiAvailable) wasmLibcPspSceRtcTickAddHours(destTick.rawAddress.toString(), srcTick.rawAddress.toString(), numHours.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceRtcTickAddDays(destTick: MutPtr, srcTick: ConstPtr, numDays: ULong): Int =
    if (pspNapiAvailable) wasmLibcPspSceRtcTickAddDays(destTick.rawAddress.toString(), srcTick.rawAddress.toString(), numDays.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceRtcTickAddWeeks(destTick: MutPtr, srcTick: ConstPtr, numWeeks: ULong): Int =
    if (pspNapiAvailable) wasmLibcPspSceRtcTickAddWeeks(destTick.rawAddress.toString(), srcTick.rawAddress.toString(), numWeeks.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceRtcTickAddMonths(destTick: MutPtr, srcTick: ConstPtr, numMonths: ULong): Int =
    if (pspNapiAvailable) wasmLibcPspSceRtcTickAddMonths(destTick.rawAddress.toString(), srcTick.rawAddress.toString(), numMonths.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceRtcTickAddYears(destTick: MutPtr, srcTick: ConstPtr, numYears: ULong): Int =
    if (pspNapiAvailable) wasmLibcPspSceRtcTickAddYears(destTick.rawAddress.toString(), srcTick.rawAddress.toString(), numYears.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceRtcSetTimeT(date: MutPtr, time: UInt): Int =
    if (pspNapiAvailable) wasmLibcPspSceRtcSetTimeT(date.rawAddress.toString(), time.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceRtcGetTimeT(date: ConstPtr, time: MutPtr): Int =
    if (pspNapiAvailable) wasmLibcPspSceRtcGetTimeT(date.rawAddress.toString(), time.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceRtcSetTime64T(date: MutPtr, time: ULong): Int =
    if (pspNapiAvailable) wasmLibcPspSceRtcSetTime64T(date.rawAddress.toString(), time.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceRtcGetTime64T(date: ConstPtr, time: MutPtr): Int =
    if (pspNapiAvailable) wasmLibcPspSceRtcGetTime64T(date.rawAddress.toString(), time.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceRtcSetDosTime(date: MutPtr, dosTime: UInt): Int =
    if (pspNapiAvailable) wasmLibcPspSceRtcSetDosTime(date.rawAddress.toString(), dosTime.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceRtcGetDosTime(date: MutPtr, dosTime: UInt): Int =
    if (pspNapiAvailable) wasmLibcPspSceRtcGetDosTime(date.rawAddress.toString(), dosTime.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceRtcSetWin32FileTime(date: MutPtr, time: MutPtr): Int =
    if (pspNapiAvailable) wasmLibcPspSceRtcSetWin32FileTime(date.rawAddress.toString(), time.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceRtcGetWin32FileTime(date: MutPtr, time: MutPtr): Int =
    if (pspNapiAvailable) wasmLibcPspSceRtcGetWin32FileTime(date.rawAddress.toString(), time.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceRtcParseDateTime(destTick: MutPtr, dateString: ConstPtr): Int =
    if (pspNapiAvailable) wasmLibcPspSceRtcParseDateTime(destTick.rawAddress.toString(), dateString.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceRtcFormatRFC3339(pszDateTime: MutPtr, pUtc: ConstPtr, timeZoneMinutes: Int): Int =
    if (pspNapiAvailable) wasmLibcPspSceRtcFormatRFC3339(pszDateTime.rawAddress.toString(), pUtc.rawAddress.toString(), timeZoneMinutes) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceRtcFormatRFC3339LocalTime(pszDateTime: MutPtr, pUtc: ConstPtr): Int =
    if (pspNapiAvailable) wasmLibcPspSceRtcFormatRFC3339LocalTime(pszDateTime.rawAddress.toString(), pUtc.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceRtcParseRFC3339(pUtc: MutPtr, pszDateTime: ConstPtr): Int =
    if (pspNapiAvailable) wasmLibcPspSceRtcParseRFC3339(pUtc.rawAddress.toString(), pszDateTime.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceRtcFormatRFC2822(pszDateTime: MutPtr, pUtc: ConstPtr, timeZoneMinutes: Int): Int =
    if (pspNapiAvailable) wasmLibcPspSceRtcFormatRFC2822(pszDateTime.rawAddress.toString(), pUtc.rawAddress.toString(), timeZoneMinutes) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceRtcFormatRFC2822LocalTime(pszDateTime: MutPtr, pUtc: ConstPtr): Int =
    if (pspNapiAvailable) wasmLibcPspSceRtcFormatRFC2822LocalTime(pszDateTime.rawAddress.toString(), pUtc.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

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
    if (pspNapiAvailable) wasmLibcPspSceIoRemove(file.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceIoMkdir(dir: ConstPtr, mode: IoPermissions): Int =
    if (pspNapiAvailable) wasmLibcPspSceIoMkdir(dir.rawAddress.toString(), mode) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceIoRmdir(path: ConstPtr): Int =
    if (pspNapiAvailable) wasmLibcPspSceIoRmdir(path.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceIoChdir(path: ConstPtr): Int =
    if (pspNapiAvailable) wasmLibcPspSceIoChdir(path.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceIoRename(oldname: ConstPtr, newname: ConstPtr): Int =
    if (pspNapiAvailable) wasmLibcPspSceIoRename(oldname.rawAddress.toString(), newname.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceIoDopen(dirname: ConstPtr): SceUid =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceIoDread(fd: SceUid, dir: MutPtr): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceIoDclose(fd: SceUid): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceIoDevctl(dev: ConstPtr, cmd: UInt, indata: MutPtr, inlen: Int, outdata: MutPtr, outlen: Int): Int =
    if (pspNapiAvailable) wasmLibcPspSceIoDevctl(dev.rawAddress.toString(), cmd.toInt(), indata.rawAddress.toString(), inlen, outdata.rawAddress.toString(), outlen) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceIoAssign(dev1: ConstPtr, dev2: ConstPtr, dev3: ConstPtr, mode: IoAssignPerms, unk1: MutPtr, unk2: Int): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceIoUnassign(dev: ConstPtr): Int =
    if (pspNapiAvailable) wasmLibcPspSceIoUnassign(dev.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceIoGetstat(file: ConstPtr, stat: MutPtr): Int =
    if (pspNapiAvailable) wasmLibcPspSceIoGetstat(file.rawAddress.toString(), stat.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceIoChstat(file: ConstPtr, stat: MutPtr, bits: Int): Int =
    if (pspNapiAvailable) wasmLibcPspSceIoChstat(file.rawAddress.toString(), stat.rawAddress.toString(), bits) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceIoIoctl(fd: SceUid, cmd: UInt, indata: MutPtr, inlen: Int, outdata: MutPtr, outlen: Int): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceIoIoctlAsync(fd: SceUid, cmd: UInt, indata: MutPtr, inlen: Int, outdata: MutPtr, outlen: Int): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceIoSync(device: ConstPtr, unk: UInt): Int =
    if (pspNapiAvailable) wasmLibcPspSceIoSync(device.rawAddress.toString(), unk.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

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
    if (pspNapiAvailable) wasmLibcPspSceJpegInitMJpeg() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceJpegFinishMJpeg(): Int =
    if (pspNapiAvailable) wasmLibcPspSceJpegFinishMJpeg() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceJpegCreateMJpeg(width: Int, height: Int): Int =
    if (pspNapiAvailable) wasmLibcPspSceJpegCreateMJpeg(width, height) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceJpegDeleteMJpeg(): Int =
    if (pspNapiAvailable) wasmLibcPspSceJpegDeleteMJpeg() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceJpegDecodeMJpeg(jpegBuf: MutPtr, size: ULong, rgba: MutPtr, unk: UInt): Int =
    if (pspNapiAvailable) wasmLibcPspSceJpegDecodeMJpeg(jpegBuf.rawAddress.toString(), size.toString(), rgba.rawAddress.toString(), unk.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUmdCheckMedium(): Int =
    if (pspNapiAvailable) wasmLibcPspSceUmdCheckMedium() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUmdGetDiscInfo(info: MutPtr): Int =
    if (pspNapiAvailable) wasmLibcPspSceUmdGetDiscInfo(info.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUmdActivate(unit: Int, drive: ConstPtr): Int =
    if (pspNapiAvailable) wasmLibcPspSceUmdActivate(unit, drive.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUmdDeactivate(unit: Int, drive: ConstPtr): Int =
    if (pspNapiAvailable) wasmLibcPspSceUmdDeactivate(unit, drive.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUmdWaitDriveStat(state: Int): Int =
    if (pspNapiAvailable) wasmLibcPspSceUmdWaitDriveStat(state) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUmdWaitDriveStatWithTimer(state: Int, timeout: UInt): Int =
    if (pspNapiAvailable) wasmLibcPspSceUmdWaitDriveStatWithTimer(state, timeout.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUmdWaitDriveStatCB(state: Int, timeout: UInt): Int =
    if (pspNapiAvailable) wasmLibcPspSceUmdWaitDriveStatCB(state, timeout.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUmdCancelWaitDriveStat(): Int =
    if (pspNapiAvailable) wasmLibcPspSceUmdCancelWaitDriveStat() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUmdGetDriveStat(): Int =
    if (pspNapiAvailable) wasmLibcPspSceUmdGetDriveStat() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUmdGetErrorStat(): Int =
    if (pspNapiAvailable) wasmLibcPspSceUmdGetErrorStat() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUmdRegisterUMDCallBack(cbid: Int): Int =
    if (pspNapiAvailable) wasmLibcPspSceUmdRegisterUMDCallBack(cbid) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUmdUnRegisterUMDCallBack(cbid: Int): Int =
    if (pspNapiAvailable) wasmLibcPspSceUmdUnRegisterUMDCallBack(cbid) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUmdReplacePermit(): Int =
    if (pspNapiAvailable) wasmLibcPspSceUmdReplacePermit() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUmdReplaceProhibit(): Int =
    if (pspNapiAvailable) wasmLibcPspSceUmdReplaceProhibit() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceMpegInit(): Int =
    if (pspNapiAvailable) wasmLibcPspSceMpegInit() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceMpegFinish() {
    if (pspNapiAvailable) {
        wasmLibcPspSceMpegFinish()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceMpegRingbufferQueryMemSize(packets: Int): Int =
    if (pspNapiAvailable) wasmLibcPspSceMpegRingbufferQueryMemSize(packets) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceMpegRingbufferConstruct(ringbuffer: MutPtr, packets: Int, data: MutPtr, size: Int, callback: SceMpegRingbufferCb, cbParam: MutPtr): Int =
    if (pspNapiAvailable) wasmLibcPspSceMpegRingbufferConstruct(ringbuffer.rawAddress.toString(), packets, data.rawAddress.toString(), size, 0L.toString(), cbParam.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceMpegRingbufferDestruct(ringbuffer: MutPtr) {
    if (pspNapiAvailable) {
        wasmLibcPspSceMpegRingbufferDestruct(ringbuffer.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceMpegRingbufferAvailableSize(ringbuffer: MutPtr): Int =
    if (pspNapiAvailable) wasmLibcPspSceMpegRingbufferAvailableSize(ringbuffer.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceMpegRingbufferPut(ringbuffer: MutPtr, numPackets: Int, available: Int): Int =
    if (pspNapiAvailable) wasmLibcPspSceMpegRingbufferPut(ringbuffer.rawAddress.toString(), numPackets, available) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceMpegQueryMemSize(unk: Int): Int =
    if (pspNapiAvailable) wasmLibcPspSceMpegQueryMemSize(unk) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceMpegCreate(handle: SceMpeg, data: MutPtr, size: Int, ringbuffer: MutPtr, frameWidth: Int, unk1: Int, unk2: Int): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceMpegDelete(handle: SceMpeg): Unit = throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceMpegQueryStreamOffset(handle: SceMpeg, buffer: MutPtr, offset: MutPtr): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceMpegQueryStreamSize(buffer: MutPtr, size: MutPtr): Int =
    if (pspNapiAvailable) wasmLibcPspSceMpegQueryStreamSize(buffer.rawAddress.toString(), size.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

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
    if (pspNapiAvailable) wasmLibcPspSceMpegBaseYCrCbCopyVme(yuvBuffer.rawAddress.toString(), buffer.rawAddress.toString(), type) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceMpegBaseCscInit(width: Int): Int =
    if (pspNapiAvailable) wasmLibcPspSceMpegBaseCscInit(width) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceMpegBaseCscVme(rgbBuffer: MutPtr, rgbBuffer2: MutPtr, width: Int, yCrCbBuffer: MutPtr): Int =
    if (pspNapiAvailable) wasmLibcPspSceMpegBaseCscVme(rgbBuffer.rawAddress.toString(), rgbBuffer2.rawAddress.toString(), width, yCrCbBuffer.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceMpegbaseBea18f91(lli: MutPtr): Int =
    if (pspNapiAvailable) wasmLibcPspSceMpegbaseBea18f91(lli.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceHprmPeekCurrentKey(key: MutPtr): Int =
    if (pspNapiAvailable) wasmLibcPspSceHprmPeekCurrentKey(key.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceHprmPeekLatch(latch: MutPtr): Int =
    if (pspNapiAvailable) wasmLibcPspSceHprmPeekLatch(latch.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceHprmReadLatch(latch: MutPtr): Int =
    if (pspNapiAvailable) wasmLibcPspSceHprmReadLatch(latch.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceHprmIsHeadphoneExist(): Int =
    if (pspNapiAvailable) wasmLibcPspSceHprmIsHeadphoneExist() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceHprmIsRemoteExist(): Int =
    if (pspNapiAvailable) wasmLibcPspSceHprmIsRemoteExist() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceHprmIsMicrophoneExist(): Int =
    if (pspNapiAvailable) wasmLibcPspSceHprmIsMicrophoneExist() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGuDepthBuffer(zbp: MutPtr, zbw: Int) {
    if (pspNapiAvailable) {
        wasmLibcPspSceGuDepthBuffer(zbp.rawAddress.toString(), zbw)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGuDispBuffer(width: Int, height: Int, dispbp: MutPtr, dispbw: Int) {
    if (pspNapiAvailable) {
        wasmLibcPspSceGuDispBuffer(width, height, dispbp.rawAddress.toString(), dispbw)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGuDrawBuffer(psm: DisplayPixelFormat, fbp: MutPtr, fbw: Int): Unit = throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGuDrawBufferList(psm: DisplayPixelFormat, fbp: MutPtr, fbw: Int): Unit = throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGuDisplay(state: Boolean): Boolean =
    if (pspNapiAvailable) wasmLibcPspSceGuDisplay(state) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGuDepthFunc(function: DepthFunc): Unit = throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGuDepthMask(mask: Int) {
    if (pspNapiAvailable) {
        wasmLibcPspSceGuDepthMask(mask)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGuDepthOffset(offset: Int) {
    if (pspNapiAvailable) {
        wasmLibcPspSceGuDepthOffset(offset)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGuDepthRange(near: Int, far: Int) {
    if (pspNapiAvailable) {
        wasmLibcPspSceGuDepthRange(near, far)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGuFog(near: Float, far: Float, color: UInt) {
    if (pspNapiAvailable) {
        wasmLibcPspSceGuFog(near.toDouble(), far.toDouble(), color.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGuInit() {
    if (pspNapiAvailable) {
        wasmLibcPspSceGuInit()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGuTerm() {
    if (pspNapiAvailable) {
        wasmLibcPspSceGuTerm()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGuBreak(mode: Int) {
    if (pspNapiAvailable) {
        wasmLibcPspSceGuBreak(mode)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGuContinue() {
    if (pspNapiAvailable) {
        wasmLibcPspSceGuContinue()
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
    if (pspNapiAvailable) MutPtr(wasmLibcPspSceGuGetMemory(size).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGuStart(contextType: GuContextType, list: MutPtr): Unit = throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGuFinish(): Int =
    if (pspNapiAvailable) wasmLibcPspSceGuFinish() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGuFinishId(id: UInt): Int =
    if (pspNapiAvailable) wasmLibcPspSceGuFinishId(id.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGuCallList(list: ConstPtr) {
    if (pspNapiAvailable) {
        wasmLibcPspSceGuCallList(list.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGuCallMode(mode: Int) {
    if (pspNapiAvailable) {
        wasmLibcPspSceGuCallMode(mode)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGuCheckList(): Int =
    if (pspNapiAvailable) wasmLibcPspSceGuCheckList() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGuSendList(mode: GuQueueMode, list: ConstPtr, context: MutPtr): Unit = throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGuSwapBuffers(): MutPtr =
    if (pspNapiAvailable) MutPtr(wasmLibcPspSceGuSwapBuffers().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGuSync(mode: GuSyncMode, behavior: GuSyncBehavior): GeListState =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGuDrawArray(prim: GuPrimitive, vtype: Int, count: Int, indices: ConstPtr, vertices: ConstPtr): Unit = throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGuBeginObject(vtype: Int, count: Int, indices: ConstPtr, vertices: ConstPtr) {
    if (pspNapiAvailable) {
        wasmLibcPspSceGuBeginObject(vtype, count, indices.rawAddress.toString(), vertices.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGuEndObject() {
    if (pspNapiAvailable) {
        wasmLibcPspSceGuEndObject()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGuSetStatus(state: GuState, status: Int): Unit = throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGuGetStatus(state: GuState): Boolean =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGuSetAllStatus(status: Int) {
    if (pspNapiAvailable) {
        wasmLibcPspSceGuSetAllStatus(status)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGuGetAllStatus(): Int =
    if (pspNapiAvailable) wasmLibcPspSceGuGetAllStatus() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGuEnable(state: GuState): Unit = throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGuDisable(state: GuState): Unit = throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGuLight(light: Int, type: LightType, components: Int, position: ScePspFVector3): Unit = throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGuLightAtt(light: Int, atten0: Float, atten1: Float, atten2: Float) {
    if (pspNapiAvailable) {
        wasmLibcPspSceGuLightAtt(light, atten0.toDouble(), atten1.toDouble(), atten2.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGuLightColor(light: Int, component: Int, color: UInt) {
    if (pspNapiAvailable) {
        wasmLibcPspSceGuLightColor(light, component, color.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGuLightMode(mode: LightMode): Unit = throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGuLightSpot(light: Int, direction: ScePspFVector3, exponent: Float, cutoff: Float): Unit = throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGuClear(flags: Int) {
    if (pspNapiAvailable) {
        wasmLibcPspSceGuClear(flags)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGuClearColor(color: UInt) {
    if (pspNapiAvailable) {
        wasmLibcPspSceGuClearColor(color.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGuClearDepth(depth: UInt) {
    if (pspNapiAvailable) {
        wasmLibcPspSceGuClearDepth(depth.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGuClearStencil(stencil: UInt) {
    if (pspNapiAvailable) {
        wasmLibcPspSceGuClearStencil(stencil.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGuPixelMask(mask: UInt) {
    if (pspNapiAvailable) {
        wasmLibcPspSceGuPixelMask(mask.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGuColor(color: UInt) {
    if (pspNapiAvailable) {
        wasmLibcPspSceGuColor(color.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGuColorFunc(func: ColorFunc, color: UInt, mask: UInt): Unit = throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGuColorMaterial(components: Int) {
    if (pspNapiAvailable) {
        wasmLibcPspSceGuColorMaterial(components)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGuAlphaFunc(func: AlphaFunc, value: Int, mask: Int): Unit = throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGuAmbient(color: UInt) {
    if (pspNapiAvailable) {
        wasmLibcPspSceGuAmbient(color.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGuAmbientColor(color: UInt) {
    if (pspNapiAvailable) {
        wasmLibcPspSceGuAmbientColor(color.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGuBlendFunc(op: BlendOp, src: BlendSrc, dest: BlendDst, srcFix: UInt, destFix: UInt): Unit = throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGuMaterial(components: Int, color: UInt) {
    if (pspNapiAvailable) {
        wasmLibcPspSceGuMaterial(components, color.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGuModelColor(emissive: UInt, ambient: UInt, diffuse: UInt, specular: UInt) {
    if (pspNapiAvailable) {
        wasmLibcPspSceGuModelColor(emissive.toInt(), ambient.toInt(), diffuse.toInt(), specular.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGuStencilFunc(func: StencilFunc, ref: Int, mask: Int): Unit = throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGuStencilOp(fail: StencilOperation, zfail: StencilOperation, zpass: StencilOperation): Unit = throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGuSpecular(power: Float) {
    if (pspNapiAvailable) {
        wasmLibcPspSceGuSpecular(power.toDouble())
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
    if (pspNapiAvailable) {
        wasmLibcPspSceGuTexEnvColor(color.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGuTexFilter(min: TextureFilter, mag: TextureFilter): Unit = throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGuTexFlush() {
    if (pspNapiAvailable) {
        wasmLibcPspSceGuTexFlush()
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
    if (pspNapiAvailable) {
        wasmLibcPspSceGuTexOffset(u.toDouble(), v.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGuTexProjMapMode(mode: TextureProjectionMapMode): Unit = throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGuTexScale(u: Float, v: Float) {
    if (pspNapiAvailable) {
        wasmLibcPspSceGuTexScale(u.toDouble(), v.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGuTexSlope(slope: Float) {
    if (pspNapiAvailable) {
        wasmLibcPspSceGuTexSlope(slope.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGuTexSync() {
    if (pspNapiAvailable) {
        wasmLibcPspSceGuTexSync()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGuTexWrap(u: GuTexWrapMode, v: GuTexWrapMode): Unit = throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGuClutLoad(numBlocks: Int, cbp: ConstPtr) {
    if (pspNapiAvailable) {
        wasmLibcPspSceGuClutLoad(numBlocks, cbp.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGuClutMode(cpsm: ClutPixelFormat, shift: UInt, mask: UInt, a3: UInt): Unit = throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGuOffset(x: UInt, y: UInt) {
    if (pspNapiAvailable) {
        wasmLibcPspSceGuOffset(x.toInt(), y.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGuScissor(x: Int, y: Int, w: Int, h: Int) {
    if (pspNapiAvailable) {
        wasmLibcPspSceGuScissor(x, y, w, h)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGuViewport(cx: Int, cy: Int, width: Int, height: Int) {
    if (pspNapiAvailable) {
        wasmLibcPspSceGuViewport(cx, cy, width, height)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGuDrawBezier(vType: Int, uCount: Int, vCount: Int, indices: ConstPtr, vertices: ConstPtr) {
    if (pspNapiAvailable) {
        wasmLibcPspSceGuDrawBezier(vType, uCount, vCount, indices.rawAddress.toString(), vertices.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGuPatchDivide(ulevel: UInt, vlevel: UInt) {
    if (pspNapiAvailable) {
        wasmLibcPspSceGuPatchDivide(ulevel.toInt(), vlevel.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGuPatchFrontFace(a0: UInt) {
    if (pspNapiAvailable) {
        wasmLibcPspSceGuPatchFrontFace(a0.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGuPatchPrim(prim: PatchPrimitive): Unit = throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGuDrawSpline(vType: Int, uCount: Int, vCount: Int, uEdge: Int, vEdge: Int, indices: ConstPtr, vertices: ConstPtr) {
    if (pspNapiAvailable) {
        wasmLibcPspSceGuDrawSpline(vType, uCount, vCount, uEdge, vEdge, indices.rawAddress.toString(), vertices.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGuSetMatrix(type: MatrixMode, matrix: ScePspFMatrix4): Unit = throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGuBoneMatrix(index: UInt, matrix: ScePspFMatrix4): Unit = throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGuMorphWeight(index: Int, weight: Float) {
    if (pspNapiAvailable) {
        wasmLibcPspSceGuMorphWeight(index, weight.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGuDrawArrayN(primitiveType: GuPrimitive, vType: Int, count: Int, a3: Int, indices: ConstPtr, vertices: ConstPtr): Unit = throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGumDrawArray(prim: GuPrimitive, vType: Int, count: Int, indices: ConstPtr, vertices: ConstPtr): Unit = throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGumDrawArrayN(prim: GuPrimitive, vType: Int, count: Int, a3: Int, indices: ConstPtr, vertices: ConstPtr): Unit = throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGumDrawBezier(vType: Int, uCount: Int, vCount: Int, indices: ConstPtr, vertices: ConstPtr) {
    if (pspNapiAvailable) {
        wasmLibcPspSceGumDrawBezier(vType, uCount, vCount, indices.rawAddress.toString(), vertices.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGumDrawSpline(vType: Int, uCount: Int, vCount: Int, uEdge: Int, vEdge: Int, indices: ConstPtr, vertices: ConstPtr) {
    if (pspNapiAvailable) {
        wasmLibcPspSceGumDrawSpline(vType, uCount, vCount, uEdge, vEdge, indices.rawAddress.toString(), vertices.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGumFastInverse() {
    if (pspNapiAvailable) {
        wasmLibcPspSceGumFastInverse()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGumFullInverse() {
    if (pspNapiAvailable) {
        wasmLibcPspSceGumFullInverse()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGumLoadIdentity() {
    if (pspNapiAvailable) {
        wasmLibcPspSceGumLoadIdentity()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGumLoadMatrix(m: ScePspFMatrix4): Unit = throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGumLookAt(eye: ScePspFVector3, center: ScePspFVector3, up: ScePspFVector3): Unit = throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGumMatrixMode(mode: MatrixMode): Unit = throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGumMultMatrix(m: ScePspFMatrix4): Unit = throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceGumOrtho(left: Float, right: Float, bottom: Float, top: Float, near: Float, far: Float) {
    if (pspNapiAvailable) {
        wasmLibcPspSceGumOrtho(left.toDouble(), right.toDouble(), bottom.toDouble(), top.toDouble(), near.toDouble(), far.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGumPerspective(fovy: Float, aspect: Float, near: Float, far: Float) {
    if (pspNapiAvailable) {
        wasmLibcPspSceGumPerspective(fovy.toDouble(), aspect.toDouble(), near.toDouble(), far.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGumPopMatrix() {
    if (pspNapiAvailable) {
        wasmLibcPspSceGumPopMatrix()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGumPushMatrix() {
    if (pspNapiAvailable) {
        wasmLibcPspSceGumPushMatrix()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGumRotateX(angle: Float) {
    if (pspNapiAvailable) {
        wasmLibcPspSceGumRotateX(angle.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGumRotateY(angle: Float) {
    if (pspNapiAvailable) {
        wasmLibcPspSceGumRotateY(angle.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceGumRotateZ(angle: Float) {
    if (pspNapiAvailable) {
        wasmLibcPspSceGumRotateZ(angle.toDouble())
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
    if (pspNapiAvailable) {
        wasmLibcPspSceGumUpdateMatrix()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceMp3ReserveMp3Handle(args: MutPtr): Int =
    if (pspNapiAvailable) wasmLibcPspSceMp3ReserveMp3Handle(args.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceMp3ReleaseMp3Handle(handle: Mp3Handle): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceMp3InitResource(): Int =
    if (pspNapiAvailable) wasmLibcPspSceMp3InitResource() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceMp3TermResource(): Int =
    if (pspNapiAvailable) wasmLibcPspSceMp3TermResource() else throw UnsupportedOperationException("Native FFI addon is not available")

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
    if (pspNapiAvailable) wasmLibcPspSceRegOpenRegistry(reg.rawAddress.toString(), mode, handle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

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
    if (pspNapiAvailable) wasmLibcPspSceRegRemoveRegistry(key.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceOpenPSIDGetOpenPSID(openpsid: MutPtr): Int =
    if (pspNapiAvailable) wasmLibcPspSceOpenPSIDGetOpenPSID(openpsid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUtilityMsgDialogInitStart(params: MutPtr): Int =
    if (pspNapiAvailable) wasmLibcPspSceUtilityMsgDialogInitStart(params.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUtilityMsgDialogShutdownStart() {
    if (pspNapiAvailable) {
        wasmLibcPspSceUtilityMsgDialogShutdownStart()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceUtilityMsgDialogGetStatus(): Int =
    if (pspNapiAvailable) wasmLibcPspSceUtilityMsgDialogGetStatus() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUtilityMsgDialogUpdate(n: Int) {
    if (pspNapiAvailable) {
        wasmLibcPspSceUtilityMsgDialogUpdate(n)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceUtilityMsgDialogAbort(): Int =
    if (pspNapiAvailable) wasmLibcPspSceUtilityMsgDialogAbort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUtilityNetconfInitStart(data: MutPtr): Int =
    if (pspNapiAvailable) wasmLibcPspSceUtilityNetconfInitStart(data.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUtilityNetconfShutdownStart(): Int =
    if (pspNapiAvailable) wasmLibcPspSceUtilityNetconfShutdownStart() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUtilityNetconfUpdate(unknown: Int): Int =
    if (pspNapiAvailable) wasmLibcPspSceUtilityNetconfUpdate(unknown) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUtilityNetconfGetStatus(): Int =
    if (pspNapiAvailable) wasmLibcPspSceUtilityNetconfGetStatus() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUtilityCheckNetParam(id: Int): Int =
    if (pspNapiAvailable) wasmLibcPspSceUtilityCheckNetParam(id) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUtilityGetNetParam(conf: Int, param: NetParam, data: MutPtr): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUtilitySavedataInitStart(params: MutPtr): Int =
    if (pspNapiAvailable) wasmLibcPspSceUtilitySavedataInitStart(params.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUtilitySavedataGetStatus(): Int =
    if (pspNapiAvailable) wasmLibcPspSceUtilitySavedataGetStatus() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUtilitySavedataShutdownStart(): Int =
    if (pspNapiAvailable) wasmLibcPspSceUtilitySavedataShutdownStart() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUtilitySavedataUpdate(unknown: Int) {
    if (pspNapiAvailable) {
        wasmLibcPspSceUtilitySavedataUpdate(unknown)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceUtilityGameSharingInitStart(params: MutPtr): Int =
    if (pspNapiAvailable) wasmLibcPspSceUtilityGameSharingInitStart(params.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUtilityGameSharingShutdownStart() {
    if (pspNapiAvailable) {
        wasmLibcPspSceUtilityGameSharingShutdownStart()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceUtilityGameSharingGetStatus(): Int =
    if (pspNapiAvailable) wasmLibcPspSceUtilityGameSharingGetStatus() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUtilityGameSharingUpdate(n: Int) {
    if (pspNapiAvailable) {
        wasmLibcPspSceUtilityGameSharingUpdate(n)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceUtilityHtmlViewerInitStart(params: MutPtr): Int =
    if (pspNapiAvailable) wasmLibcPspSceUtilityHtmlViewerInitStart(params.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUtilityHtmlViewerShutdownStart(): Int =
    if (pspNapiAvailable) wasmLibcPspSceUtilityHtmlViewerShutdownStart() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUtilityHtmlViewerUpdate(n: Int): Int =
    if (pspNapiAvailable) wasmLibcPspSceUtilityHtmlViewerUpdate(n) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUtilityHtmlViewerGetStatus(): Int =
    if (pspNapiAvailable) wasmLibcPspSceUtilityHtmlViewerGetStatus() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUtilitySetSystemParamInt(id: SystemParamId, value: Int): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUtilitySetSystemParamString(id: SystemParamId, str: ConstPtr): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUtilityGetSystemParamInt(id: SystemParamId, value: MutPtr): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUtilityGetSystemParamString(id: SystemParamId, str: MutPtr, len: Int): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUtilityOskInitStart(params: MutPtr): Int =
    if (pspNapiAvailable) wasmLibcPspSceUtilityOskInitStart(params.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUtilityOskShutdownStart(): Int =
    if (pspNapiAvailable) wasmLibcPspSceUtilityOskShutdownStart() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUtilityOskUpdate(n: Int): Int =
    if (pspNapiAvailable) wasmLibcPspSceUtilityOskUpdate(n) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUtilityOskGetStatus(): Int =
    if (pspNapiAvailable) wasmLibcPspSceUtilityOskGetStatus() else throw UnsupportedOperationException("Native FFI addon is not available")

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
    if (pspNapiAvailable) wasmLibcPspSceUtilityCreateNetParam(conf) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUtilitySetNetParam(param: NetParam, value: ConstPtr): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUtilityCopyNetParam(src: Int, dest: Int): Int =
    if (pspNapiAvailable) wasmLibcPspSceUtilityCopyNetParam(src, dest) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceUtilityDeleteNetParam(conf: Int): Int =
    if (pspNapiAvailable) wasmLibcPspSceUtilityDeleteNetParam(conf) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetInit(poolsize: Int, calloutprio: Int, calloutstack: Int, netintrprio: Int, netintrstack: Int): Int =
    if (pspNapiAvailable) wasmLibcPspSceNetInit(poolsize, calloutprio, calloutstack, netintrprio, netintrstack) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetTerm(): Int =
    if (pspNapiAvailable) wasmLibcPspSceNetTerm() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetFreeThreadinfo(thid: Int): Int =
    if (pspNapiAvailable) wasmLibcPspSceNetFreeThreadinfo(thid) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetThreadAbort(thid: Int): Int =
    if (pspNapiAvailable) wasmLibcPspSceNetThreadAbort(thid) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetEtherStrton(name: MutPtr, mac: MutPtr) {
    if (pspNapiAvailable) {
        wasmLibcPspSceNetEtherStrton(name.rawAddress.toString(), mac.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceNetEtherNtostr(mac: MutPtr, name: MutPtr) {
    if (pspNapiAvailable) {
        wasmLibcPspSceNetEtherNtostr(mac.rawAddress.toString(), name.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sceNetGetLocalEtherAddr(mac: MutPtr): Int =
    if (pspNapiAvailable) wasmLibcPspSceNetGetLocalEtherAddr(mac.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetGetMallocStat(stat: MutPtr): Int =
    if (pspNapiAvailable) wasmLibcPspSceNetGetMallocStat(stat.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocctlInit(stacksize: Int, priority: Int, adhocId: MutPtr): Int =
    if (pspNapiAvailable) wasmLibcPspSceNetAdhocctlInit(stacksize, priority, adhocId.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocctlTerm(): Int =
    if (pspNapiAvailable) wasmLibcPspSceNetAdhocctlTerm() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocctlConnect(name: ConstPtr): Int =
    if (pspNapiAvailable) wasmLibcPspSceNetAdhocctlConnect(name.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocctlDisconnect(): Int =
    if (pspNapiAvailable) wasmLibcPspSceNetAdhocctlDisconnect() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocctlGetState(event: MutPtr): Int =
    if (pspNapiAvailable) wasmLibcPspSceNetAdhocctlGetState(event.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocctlCreate(name: ConstPtr): Int =
    if (pspNapiAvailable) wasmLibcPspSceNetAdhocctlCreate(name.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocctlJoin(scaninfo: MutPtr): Int =
    if (pspNapiAvailable) wasmLibcPspSceNetAdhocctlJoin(scaninfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocctlGetAdhocId(id: MutPtr): Int =
    if (pspNapiAvailable) wasmLibcPspSceNetAdhocctlGetAdhocId(id.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocctlCreateEnterGameMode(name: ConstPtr, unknown: Int, num: Int, macs: MutPtr, timeout: UInt, unknown2: Int): Int =
    if (pspNapiAvailable) wasmLibcPspSceNetAdhocctlCreateEnterGameMode(name.rawAddress.toString(), unknown, num, macs.rawAddress.toString(), timeout.toInt(), unknown2) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocctlJoinEnterGameMode(name: ConstPtr, hostmac: MutPtr, timeout: UInt, unknown: Int): Int =
    if (pspNapiAvailable) wasmLibcPspSceNetAdhocctlJoinEnterGameMode(name.rawAddress.toString(), hostmac.rawAddress.toString(), timeout.toInt(), unknown) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocctlGetGameModeInfo(gamemodeinfo: MutPtr): Int =
    if (pspNapiAvailable) wasmLibcPspSceNetAdhocctlGetGameModeInfo(gamemodeinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocctlExitGameMode(): Int =
    if (pspNapiAvailable) wasmLibcPspSceNetAdhocctlExitGameMode() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocctlGetPeerList(length: MutPtr, buf: MutPtr): Int =
    if (pspNapiAvailable) wasmLibcPspSceNetAdhocctlGetPeerList(length.rawAddress.toString(), buf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocctlGetPeerInfo(mac: MutPtr, size: Int, peerinfo: MutPtr): Int =
    if (pspNapiAvailable) wasmLibcPspSceNetAdhocctlGetPeerInfo(mac.rawAddress.toString(), size, peerinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocctlScan(): Int =
    if (pspNapiAvailable) wasmLibcPspSceNetAdhocctlScan() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocctlGetScanInfo(length: MutPtr, buf: MutPtr): Int =
    if (pspNapiAvailable) wasmLibcPspSceNetAdhocctlGetScanInfo(length.rawAddress.toString(), buf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocctlAddHandler(handler: SceNetAdhocctlHandler, unknown: MutPtr): Int =
    if (pspNapiAvailable) wasmLibcPspSceNetAdhocctlAddHandler(0L.toString(), unknown.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocctlDelHandler(id: Int): Int =
    if (pspNapiAvailable) wasmLibcPspSceNetAdhocctlDelHandler(id) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocctlGetNameByAddr(mac: MutPtr, nickname: MutPtr): Int =
    if (pspNapiAvailable) wasmLibcPspSceNetAdhocctlGetNameByAddr(mac.rawAddress.toString(), nickname.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocctlGetAddrByName(nickname: MutPtr, length: MutPtr, buf: MutPtr): Int =
    if (pspNapiAvailable) wasmLibcPspSceNetAdhocctlGetAddrByName(nickname.rawAddress.toString(), length.rawAddress.toString(), buf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocctlGetParameter(params: MutPtr): Int =
    if (pspNapiAvailable) wasmLibcPspSceNetAdhocctlGetParameter(params.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocInit(): Int =
    if (pspNapiAvailable) wasmLibcPspSceNetAdhocInit() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocTerm(): Int =
    if (pspNapiAvailable) wasmLibcPspSceNetAdhocTerm() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocPdpCreate(mac: MutPtr, port: UShort, bufSize: UInt, unk1: Int): Int =
    if (pspNapiAvailable) wasmLibcPspSceNetAdhocPdpCreate(mac.rawAddress.toString(), port.toInt(), bufSize.toInt(), unk1) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocPdpDelete(id: Int, unk1: Int): Int =
    if (pspNapiAvailable) wasmLibcPspSceNetAdhocPdpDelete(id, unk1) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocPdpSend(id: Int, destMacAddr: MutPtr, port: UShort, data: MutPtr, len: UInt, timeout: UInt, nonblock: Int): Int =
    if (pspNapiAvailable) wasmLibcPspSceNetAdhocPdpSend(id, destMacAddr.rawAddress.toString(), port.toInt(), data.rawAddress.toString(), len.toInt(), timeout.toInt(), nonblock) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocPdpRecv(id: Int, srcMacAddr: MutPtr, port: MutPtr, data: MutPtr, dataLength: MutPtr, timeout: UInt, nonblock: Int): Int =
    if (pspNapiAvailable) wasmLibcPspSceNetAdhocPdpRecv(id, srcMacAddr.rawAddress.toString(), port.rawAddress.toString(), data.rawAddress.toString(), dataLength.rawAddress.toString(), timeout.toInt(), nonblock) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocGetPdpStat(size: MutPtr, stat: MutPtr): Int =
    if (pspNapiAvailable) wasmLibcPspSceNetAdhocGetPdpStat(size.rawAddress.toString(), stat.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocGameModeCreateMaster(data: MutPtr, size: Int): Int =
    if (pspNapiAvailable) wasmLibcPspSceNetAdhocGameModeCreateMaster(data.rawAddress.toString(), size) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocGameModeCreateReplica(mac: MutPtr, data: MutPtr, size: Int): Int =
    if (pspNapiAvailable) wasmLibcPspSceNetAdhocGameModeCreateReplica(mac.rawAddress.toString(), data.rawAddress.toString(), size) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocGameModeUpdateMaster(): Int =
    if (pspNapiAvailable) wasmLibcPspSceNetAdhocGameModeUpdateMaster() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocGameModeUpdateReplica(id: Int, unk1: Int): Int =
    if (pspNapiAvailable) wasmLibcPspSceNetAdhocGameModeUpdateReplica(id, unk1) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocGameModeDeleteMaster(): Int =
    if (pspNapiAvailable) wasmLibcPspSceNetAdhocGameModeDeleteMaster() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocGameModeDeleteReplica(id: Int): Int =
    if (pspNapiAvailable) wasmLibcPspSceNetAdhocGameModeDeleteReplica(id) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocPtpOpen(srcmac: MutPtr, srcport: UShort, destmac: MutPtr, destport: UShort, bufSize: UInt, delay: UInt, count: Int, unk1: Int): Int =
    if (pspNapiAvailable) wasmLibcPspSceNetAdhocPtpOpen(srcmac.rawAddress.toString(), srcport.toInt(), destmac.rawAddress.toString(), destport.toInt(), bufSize.toInt(), delay.toInt(), count, unk1) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocPtpConnect(id: Int, timeout: UInt, nonblock: Int): Int =
    if (pspNapiAvailable) wasmLibcPspSceNetAdhocPtpConnect(id, timeout.toInt(), nonblock) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocPtpListen(srcmac: MutPtr, srcport: UShort, bufSize: UInt, delay: UInt, count: Int, queue: Int, unk1: Int): Int =
    if (pspNapiAvailable) wasmLibcPspSceNetAdhocPtpListen(srcmac.rawAddress.toString(), srcport.toInt(), bufSize.toInt(), delay.toInt(), count, queue, unk1) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocPtpAccept(id: Int, mac: MutPtr, port: MutPtr, timeout: UInt, nonblock: Int): Int =
    if (pspNapiAvailable) wasmLibcPspSceNetAdhocPtpAccept(id, mac.rawAddress.toString(), port.rawAddress.toString(), timeout.toInt(), nonblock) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocPtpSend(id: Int, data: MutPtr, dataSize: MutPtr, timeout: UInt, nonblock: Int): Int =
    if (pspNapiAvailable) wasmLibcPspSceNetAdhocPtpSend(id, data.rawAddress.toString(), dataSize.rawAddress.toString(), timeout.toInt(), nonblock) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocPtpRecv(id: Int, data: MutPtr, dataSize: MutPtr, timeout: UInt, nonblock: Int): Int =
    if (pspNapiAvailable) wasmLibcPspSceNetAdhocPtpRecv(id, data.rawAddress.toString(), dataSize.rawAddress.toString(), timeout.toInt(), nonblock) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocPtpFlush(id: Int, timeout: UInt, nonblock: Int): Int =
    if (pspNapiAvailable) wasmLibcPspSceNetAdhocPtpFlush(id, timeout.toInt(), nonblock) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocPtpClose(id: Int, unk1: Int): Int =
    if (pspNapiAvailable) wasmLibcPspSceNetAdhocPtpClose(id, unk1) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocGetPtpStat(size: MutPtr, stat: MutPtr): Int =
    if (pspNapiAvailable) wasmLibcPspSceNetAdhocGetPtpStat(size.rawAddress.toString(), stat.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocMatchingInit(memsize: Int): Int =
    if (pspNapiAvailable) wasmLibcPspSceNetAdhocMatchingInit(memsize) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocMatchingTerm(): Int =
    if (pspNapiAvailable) wasmLibcPspSceNetAdhocMatchingTerm() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocMatchingCreate(mode: AdhocMatchingMode, maxPeers: Int, port: UShort, bufSize: Int, helloDelay: UInt, pingDelay: UInt, initCount: Int, msgDelay: UInt, callback: AdhocMatchingCallback): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocMatchingDelete(matchingId: Int): Int =
    if (pspNapiAvailable) wasmLibcPspSceNetAdhocMatchingDelete(matchingId) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocMatchingStart(matchingId: Int, evthPri: Int, evthStack: Int, inthPri: Int, inthStack: Int, optLen: Int, optData: MutPtr): Int =
    if (pspNapiAvailable) wasmLibcPspSceNetAdhocMatchingStart(matchingId, evthPri, evthStack, inthPri, inthStack, optLen, optData.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocMatchingStop(matchingId: Int): Int =
    if (pspNapiAvailable) wasmLibcPspSceNetAdhocMatchingStop(matchingId) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocMatchingSelectTarget(matchingId: Int, mac: MutPtr, optLen: Int, optData: MutPtr): Int =
    if (pspNapiAvailable) wasmLibcPspSceNetAdhocMatchingSelectTarget(matchingId, mac.rawAddress.toString(), optLen, optData.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocMatchingCancelTarget(matchingId: Int, mac: MutPtr): Int =
    if (pspNapiAvailable) wasmLibcPspSceNetAdhocMatchingCancelTarget(matchingId, mac.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocMatchingCancelTargetWithOpt(matchingId: Int, mac: MutPtr, optLen: Int, optData: MutPtr): Int =
    if (pspNapiAvailable) wasmLibcPspSceNetAdhocMatchingCancelTargetWithOpt(matchingId, mac.rawAddress.toString(), optLen, optData.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocMatchingSendData(matchingId: Int, mac: MutPtr, dataLen: Int, data: MutPtr): Int =
    if (pspNapiAvailable) wasmLibcPspSceNetAdhocMatchingSendData(matchingId, mac.rawAddress.toString(), dataLen, data.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocMatchingAbortSendData(matchingId: Int, mac: MutPtr): Int =
    if (pspNapiAvailable) wasmLibcPspSceNetAdhocMatchingAbortSendData(matchingId, mac.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocMatchingSetHelloOpt(matchingId: Int, optLen: Int, optData: MutPtr): Int =
    if (pspNapiAvailable) wasmLibcPspSceNetAdhocMatchingSetHelloOpt(matchingId, optLen, optData.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocMatchingGetHelloOpt(matchingId: Int, optLen: MutPtr, optData: MutPtr): Int =
    if (pspNapiAvailable) wasmLibcPspSceNetAdhocMatchingGetHelloOpt(matchingId, optLen.rawAddress.toString(), optData.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocMatchingGetMembers(matchingId: Int, length: MutPtr, buf: MutPtr): Int =
    if (pspNapiAvailable) wasmLibcPspSceNetAdhocMatchingGetMembers(matchingId, length.rawAddress.toString(), buf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocMatchingGetPoolMaxAlloc(): Int =
    if (pspNapiAvailable) wasmLibcPspSceNetAdhocMatchingGetPoolMaxAlloc() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetAdhocMatchingGetPoolStat(poolstat: MutPtr): Int =
    if (pspNapiAvailable) wasmLibcPspSceNetAdhocMatchingGetPoolStat(poolstat.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetApctlInit(stackSize: Int, initPriority: Int): Int =
    if (pspNapiAvailable) wasmLibcPspSceNetApctlInit(stackSize, initPriority) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetApctlTerm(): Int =
    if (pspNapiAvailable) wasmLibcPspSceNetApctlTerm() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetApctlGetInfo(code: ApctlInfo, pinfo: MutPtr): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetApctlAddHandler(handler: SceNetApctlHandler, parg: MutPtr): Int =
    if (pspNapiAvailable) wasmLibcPspSceNetApctlAddHandler(0L.toString(), parg.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetApctlDelHandler(handlerId: Int): Int =
    if (pspNapiAvailable) wasmLibcPspSceNetApctlDelHandler(handlerId) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetApctlConnect(connIndex: Int): Int =
    if (pspNapiAvailable) wasmLibcPspSceNetApctlConnect(connIndex) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetApctlDisconnect(): Int =
    if (pspNapiAvailable) wasmLibcPspSceNetApctlDisconnect() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetApctlGetState(pstate: MutPtr): Int =
    if (pspNapiAvailable) wasmLibcPspSceNetApctlGetState(pstate.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetInetInit(): Int =
    if (pspNapiAvailable) wasmLibcPspSceNetInetInit() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetInetTerm(): Int =
    if (pspNapiAvailable) wasmLibcPspSceNetInetTerm() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetInetAccept(s: Int, addr: MutPtr, addrLen: MutPtr): Int =
    if (pspNapiAvailable) wasmLibcPspSceNetInetAccept(s, addr.rawAddress.toString(), addrLen.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetInetBind(s: Int, myAddr: ConstPtr, addrLen: SocklenT): Int =
    if (pspNapiAvailable) wasmLibcPspSceNetInetBind(s, myAddr.rawAddress.toString(), addrLen.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetInetConnect(s: Int, servAddr: ConstPtr, addrLen: SocklenT): Int =
    if (pspNapiAvailable) wasmLibcPspSceNetInetConnect(s, servAddr.rawAddress.toString(), addrLen.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetInetGetsockopt(s: Int, level: Int, optName: Int, optVal: MutPtr, optlEn: MutPtr): Int =
    if (pspNapiAvailable) wasmLibcPspSceNetInetGetsockopt(s, level, optName, optVal.rawAddress.toString(), optlEn.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetInetListen(s: Int, backlog: Int): Int =
    if (pspNapiAvailable) wasmLibcPspSceNetInetListen(s, backlog) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetInetRecv(s: Int, buf: MutPtr, len: ULong, flags: Int): ULong =
    if (pspNapiAvailable) wasmLibcPspSceNetInetRecv(s, buf.rawAddress.toString(), len.toString(), flags).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetInetRecvfrom(s: Int, buf: MutPtr, flags: ULong, arg1: Int, from: MutPtr, fromLen: MutPtr): ULong =
    if (pspNapiAvailable) wasmLibcPspSceNetInetRecvfrom(s, buf.rawAddress.toString(), flags.toString(), arg1, from.rawAddress.toString(), fromLen.rawAddress.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetInetSend(s: Int, buf: ConstPtr, len: ULong, flags: Int): ULong =
    if (pspNapiAvailable) wasmLibcPspSceNetInetSend(s, buf.rawAddress.toString(), len.toString(), flags).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetInetSendto(s: Int, buf: ConstPtr, len: ULong, flags: Int, to: ConstPtr, toLen: SocklenT): ULong =
    if (pspNapiAvailable) wasmLibcPspSceNetInetSendto(s, buf.rawAddress.toString(), len.toString(), flags, to.rawAddress.toString(), toLen.toInt()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetInetSetsockopt(s: Int, level: Int, optName: Int, optVal: ConstPtr, optLen: SocklenT): Int =
    if (pspNapiAvailable) wasmLibcPspSceNetInetSetsockopt(s, level, optName, optVal.rawAddress.toString(), optLen.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetInetShutdown(s: Int, how: Int): Int =
    if (pspNapiAvailable) wasmLibcPspSceNetInetShutdown(s, how) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetInetSocket(domain: Int, type: Int, protocol: Int): Int =
    if (pspNapiAvailable) wasmLibcPspSceNetInetSocket(domain, type, protocol) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetInetClose(s: Int): Int =
    if (pspNapiAvailable) wasmLibcPspSceNetInetClose(s) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetInetGetErrno(): Int =
    if (pspNapiAvailable) wasmLibcPspSceNetInetGetErrno() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceSslInit(unknown1: Int): Int =
    if (pspNapiAvailable) wasmLibcPspSceSslInit(unknown1) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceSslEnd(): Int =
    if (pspNapiAvailable) wasmLibcPspSceSslEnd() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceSslGetUsedMemoryMax(memory: MutPtr): Int =
    if (pspNapiAvailable) wasmLibcPspSceSslGetUsedMemoryMax(memory.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceSslGetUsedMemoryCurrent(memory: MutPtr): Int =
    if (pspNapiAvailable) wasmLibcPspSceSslGetUsedMemoryCurrent(memory.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceHttpInit(unknown1: UInt): Int =
    if (pspNapiAvailable) wasmLibcPspSceHttpInit(unknown1.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceHttpEnd(): Int =
    if (pspNapiAvailable) wasmLibcPspSceHttpEnd() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceHttpCreateTemplate(agent: MutPtr, unknown1: Int, unknown2: Int): Int =
    if (pspNapiAvailable) wasmLibcPspSceHttpCreateTemplate(agent.rawAddress.toString(), unknown1, unknown2) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceHttpDeleteTemplate(templateid: Int): Int =
    if (pspNapiAvailable) wasmLibcPspSceHttpDeleteTemplate(templateid) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceHttpCreateConnection(templateid: Int, host: MutPtr, unknown1: MutPtr, port: UShort, unknown2: Int): Int =
    if (pspNapiAvailable) wasmLibcPspSceHttpCreateConnection(templateid, host.rawAddress.toString(), unknown1.rawAddress.toString(), port.toInt(), unknown2) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceHttpCreateConnectionWithURL(templateid: Int, url: ConstPtr, unknown1: Int): Int =
    if (pspNapiAvailable) wasmLibcPspSceHttpCreateConnectionWithURL(templateid, url.rawAddress.toString(), unknown1) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceHttpDeleteConnection(connectionId: Int): Int =
    if (pspNapiAvailable) wasmLibcPspSceHttpDeleteConnection(connectionId) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceHttpCreateRequest(connectionId: Int, method: HttpMethod, path: MutPtr, contentLength: ULong): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceHttpCreateRequestWithURL(connectionId: Int, method: HttpMethod, url: MutPtr, contentLength: ULong): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceHttpDeleteRequest(requestId: Int): Int =
    if (pspNapiAvailable) wasmLibcPspSceHttpDeleteRequest(requestId) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceHttpSendRequest(requestId: Int, data: MutPtr, dataSize: UInt): Int =
    if (pspNapiAvailable) wasmLibcPspSceHttpSendRequest(requestId, data.rawAddress.toString(), dataSize.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceHttpAbortRequest(requestId: Int): Int =
    if (pspNapiAvailable) wasmLibcPspSceHttpAbortRequest(requestId) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceHttpReadData(requestId: Int, data: MutPtr, dataSize: UInt): Int =
    if (pspNapiAvailable) wasmLibcPspSceHttpReadData(requestId, data.rawAddress.toString(), dataSize.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceHttpGetContentLength(requestId: Int, contentLength: MutPtr): Int =
    if (pspNapiAvailable) wasmLibcPspSceHttpGetContentLength(requestId, contentLength.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceHttpGetStatusCode(requestId: Int, statusCode: MutPtr): Int =
    if (pspNapiAvailable) wasmLibcPspSceHttpGetStatusCode(requestId, statusCode.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceHttpSetResolveTimeOut(id: Int, timeout: UInt): Int =
    if (pspNapiAvailable) wasmLibcPspSceHttpSetResolveTimeOut(id, timeout.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceHttpSetResolveRetry(id: Int, count: Int): Int =
    if (pspNapiAvailable) wasmLibcPspSceHttpSetResolveRetry(id, count) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceHttpSetConnectTimeOut(id: Int, timeout: UInt): Int =
    if (pspNapiAvailable) wasmLibcPspSceHttpSetConnectTimeOut(id, timeout.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceHttpSetSendTimeOut(id: Int, timeout: UInt): Int =
    if (pspNapiAvailable) wasmLibcPspSceHttpSetSendTimeOut(id, timeout.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceHttpSetRecvTimeOut(id: Int, timeout: UInt): Int =
    if (pspNapiAvailable) wasmLibcPspSceHttpSetRecvTimeOut(id, timeout.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceHttpEnableKeepAlive(id: Int): Int =
    if (pspNapiAvailable) wasmLibcPspSceHttpEnableKeepAlive(id) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceHttpDisableKeepAlive(id: Int): Int =
    if (pspNapiAvailable) wasmLibcPspSceHttpDisableKeepAlive(id) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceHttpEnableRedirect(id: Int): Int =
    if (pspNapiAvailable) wasmLibcPspSceHttpEnableRedirect(id) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceHttpDisableRedirect(id: Int): Int =
    if (pspNapiAvailable) wasmLibcPspSceHttpDisableRedirect(id) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceHttpEnableCookie(id: Int): Int =
    if (pspNapiAvailable) wasmLibcPspSceHttpEnableCookie(id) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceHttpDisableCookie(id: Int): Int =
    if (pspNapiAvailable) wasmLibcPspSceHttpDisableCookie(id) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceHttpSaveSystemCookie(): Int =
    if (pspNapiAvailable) wasmLibcPspSceHttpSaveSystemCookie() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceHttpLoadSystemCookie(): Int =
    if (pspNapiAvailable) wasmLibcPspSceHttpLoadSystemCookie() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceHttpAddExtraHeader(id: Int, name: MutPtr, value: MutPtr, unknown1: Int): Int =
    if (pspNapiAvailable) wasmLibcPspSceHttpAddExtraHeader(id, name.rawAddress.toString(), value.rawAddress.toString(), unknown1) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceHttpDeleteHeader(id: Int, name: ConstPtr): Int =
    if (pspNapiAvailable) wasmLibcPspSceHttpDeleteHeader(id, name.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceHttpsInit(unknown1: Int, unknown2: Int, unknown3: Int, unknown4: Int): Int =
    if (pspNapiAvailable) wasmLibcPspSceHttpsInit(unknown1, unknown2, unknown3, unknown4) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceHttpsEnd(): Int =
    if (pspNapiAvailable) wasmLibcPspSceHttpsEnd() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceHttpsLoadDefaultCert(unknown1: Int, unknown2: Int): Int =
    if (pspNapiAvailable) wasmLibcPspSceHttpsLoadDefaultCert(unknown1, unknown2) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceHttpDisableAuth(id: Int): Int =
    if (pspNapiAvailable) wasmLibcPspSceHttpDisableAuth(id) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceHttpDisableCache(id: Int): Int =
    if (pspNapiAvailable) wasmLibcPspSceHttpDisableCache(id) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceHttpEnableAuth(id: Int): Int =
    if (pspNapiAvailable) wasmLibcPspSceHttpEnableAuth(id) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceHttpEnableCache(id: Int): Int =
    if (pspNapiAvailable) wasmLibcPspSceHttpEnableCache(id) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceHttpEndCache(): Int =
    if (pspNapiAvailable) wasmLibcPspSceHttpEndCache() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceHttpGetAllHeader(request: Int, header: MutPtr, headerSize: MutPtr): Int =
    if (pspNapiAvailable) wasmLibcPspSceHttpGetAllHeader(request, header.rawAddress.toString(), headerSize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceHttpGetNetworkErrno(request: Int, errNum: MutPtr): Int =
    if (pspNapiAvailable) wasmLibcPspSceHttpGetNetworkErrno(request, errNum.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceHttpGetProxy(id: Int, activateFlag: MutPtr, mode: MutPtr, proxyHost: MutPtr, len: ULong, proxyPort: MutPtr): Int =
    if (pspNapiAvailable) wasmLibcPspSceHttpGetProxy(id, activateFlag.rawAddress.toString(), mode.rawAddress.toString(), proxyHost.rawAddress.toString(), len.toString(), proxyPort.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceHttpInitCache(maxSize: ULong): Int =
    if (pspNapiAvailable) wasmLibcPspSceHttpInitCache(maxSize.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceHttpSetAuthInfoCB(id: Int, cbfunc: HttpPasswordCB): Int =
    if (pspNapiAvailable) wasmLibcPspSceHttpSetAuthInfoCB(id, 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceHttpSetProxy(id: Int, activateFlag: Int, mode: Int, newProxyHost: ConstPtr, newProxyPort: UShort): Int =
    if (pspNapiAvailable) wasmLibcPspSceHttpSetProxy(id, activateFlag, mode, newProxyHost.rawAddress.toString(), newProxyPort.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceHttpSetResHeaderMaxSize(id: Int, headerSize: UInt): Int =
    if (pspNapiAvailable) wasmLibcPspSceHttpSetResHeaderMaxSize(id, headerSize.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceHttpSetMallocFunction(mallocFunc: HttpMallocFunction, freeFunc: HttpFreeFunction, reallocFunc: HttpReallocFunction): Int =
    if (pspNapiAvailable) wasmLibcPspSceHttpSetMallocFunction(0L.toString(), 0L.toString(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetResolverInit(): Int =
    if (pspNapiAvailable) wasmLibcPspSceNetResolverInit() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetResolverCreate(rid: MutPtr, buf: MutPtr, bufLength: UInt): Int =
    if (pspNapiAvailable) wasmLibcPspSceNetResolverCreate(rid.rawAddress.toString(), buf.rawAddress.toString(), bufLength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetResolverDelete(rid: Int): Int =
    if (pspNapiAvailable) wasmLibcPspSceNetResolverDelete(rid) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetResolverStartNtoA(rid: Int, hostname: ConstPtr, addr: MutPtr, timeout: UInt, retry: Int): Int =
    if (pspNapiAvailable) wasmLibcPspSceNetResolverStartNtoA(rid, hostname.rawAddress.toString(), addr.rawAddress.toString(), timeout.toInt(), retry) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetResolverStartAtoN(rid: Int, addr: ConstPtr, hostname: MutPtr, hostnameLen: UInt, timeout: UInt, retry: Int): Int =
    if (pspNapiAvailable) wasmLibcPspSceNetResolverStartAtoN(rid, addr.rawAddress.toString(), hostname.rawAddress.toString(), hostnameLen.toInt(), timeout.toInt(), retry) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetResolverStop(rid: Int): Int =
    if (pspNapiAvailable) wasmLibcPspSceNetResolverStop(rid) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sceNetResolverTerm(): Int =
    if (pspNapiAvailable) wasmLibcPspSceNetResolverTerm() else throw UnsupportedOperationException("Native FFI addon is not available")
