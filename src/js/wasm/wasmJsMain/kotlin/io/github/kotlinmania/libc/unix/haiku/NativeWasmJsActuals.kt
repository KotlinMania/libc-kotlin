@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.libc.unix.haiku

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CDouble
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.unix.DIR
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

@JsFun("() => { if (typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_libc = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_libc = null; return false; } try { globalThis.__km_napi_libc = req('@kotlinmania/libc-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_libc = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_libc = null; return false; }")
private external fun initUnixHaikuNativeNapiAddon(): Boolean

private val unixHaikuNativeNapiAvailable: Boolean = initUnixHaikuNativeNapiAddon()

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcUnixHaikuNativeCreateArea(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcUnixHaikuNativeCreateArea(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixHaikuNativeCloneArea(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixHaikuNativeCloneArea(p0: String, p1: String, p2: Int, p3: Int, p4: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHaikuNativeFindArea(p0)")
private external fun wasmLibcUnixHaikuNativeFindArea(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHaikuNativeAreaFor(p0)")
private external fun wasmLibcUnixHaikuNativeAreaFor(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHaikuNativeDeleteArea(p0)")
private external fun wasmLibcUnixHaikuNativeDeleteArea(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHaikuNativeResizeArea(p0, p1)")
private external fun wasmLibcUnixHaikuNativeResizeArea(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHaikuNativeSetAreaProtection(p0, p1)")
private external fun wasmLibcUnixHaikuNativeSetAreaProtection(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixHaikuNativeGetAreaInfo(p0, p1, p2)")
private external fun wasmLibcUnixHaikuNativeGetAreaInfo(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixHaikuNativeGetNextAreaInfo(p0, p1, p2, p3)")
private external fun wasmLibcUnixHaikuNativeGetNextAreaInfo(p0: Int, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHaikuNativeCreatePort(p0, p1)")
private external fun wasmLibcUnixHaikuNativeCreatePort(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHaikuNativeFindPort(p0)")
private external fun wasmLibcUnixHaikuNativeFindPort(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixHaikuNativeReadPort(p0, p1, p2, p3)")
private external fun wasmLibcUnixHaikuNativeReadPort(p0: Int, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcUnixHaikuNativeReadPortEtc(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcUnixHaikuNativeReadPortEtc(p0: Int, p1: String, p2: String, p3: String, p4: Int, p5: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixHaikuNativeWritePort(p0, p1, p2, p3)")
private external fun wasmLibcUnixHaikuNativeWritePort(p0: Int, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcUnixHaikuNativeWritePortEtc(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcUnixHaikuNativeWritePortEtc(p0: Int, p1: Int, p2: String, p3: String, p4: Int, p5: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHaikuNativeClosePort(p0)")
private external fun wasmLibcUnixHaikuNativeClosePort(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHaikuNativeDeletePort(p0)")
private external fun wasmLibcUnixHaikuNativeDeletePort(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHaikuNativePortBufferSize(p0)")
private external fun wasmLibcUnixHaikuNativePortBufferSize(p0: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixHaikuNativePortBufferSizeEtc(p0, p1, p2)")
private external fun wasmLibcUnixHaikuNativePortBufferSizeEtc(p0: Int, p1: Int, p2: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHaikuNativePortCount(p0)")
private external fun wasmLibcUnixHaikuNativePortCount(p0: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHaikuNativeSetPortOwner(p0, p1)")
private external fun wasmLibcUnixHaikuNativeSetPortOwner(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixHaikuNativeGetPortInfo(p0, p1, p2)")
private external fun wasmLibcUnixHaikuNativeGetPortInfo(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixHaikuNativeGetNextPortInfo(p0, p1, p2, p3)")
private external fun wasmLibcUnixHaikuNativeGetNextPortInfo(p0: Int, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixHaikuNativeGetPortMessageInfoEtc(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixHaikuNativeGetPortMessageInfoEtc(p0: Int, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHaikuNativeCreateSem(p0, p1)")
private external fun wasmLibcUnixHaikuNativeCreateSem(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHaikuNativeDeleteSem(p0)")
private external fun wasmLibcUnixHaikuNativeDeleteSem(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHaikuNativeAcquireSem(p0)")
private external fun wasmLibcUnixHaikuNativeAcquireSem(p0: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixHaikuNativeAcquireSemEtc(p0, p1, p2, p3)")
private external fun wasmLibcUnixHaikuNativeAcquireSemEtc(p0: Int, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHaikuNativeReleaseSem(p0)")
private external fun wasmLibcUnixHaikuNativeReleaseSem(p0: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixHaikuNativeReleaseSemEtc(p0, p1, p2)")
private external fun wasmLibcUnixHaikuNativeReleaseSemEtc(p0: Int, p1: Int, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHaikuNativeSwitchSem(p0, p1)")
private external fun wasmLibcUnixHaikuNativeSwitchSem(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixHaikuNativeSwitchSemEtc(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixHaikuNativeSwitchSemEtc(p0: Int, p1: Int, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHaikuNativeGetSemCount(p0, p1)")
private external fun wasmLibcUnixHaikuNativeGetSemCount(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHaikuNativeSetSemOwner(p0, p1)")
private external fun wasmLibcUnixHaikuNativeSetSemOwner(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixHaikuNativeGetSemInfo(p0, p1, p2)")
private external fun wasmLibcUnixHaikuNativeGetSemInfo(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixHaikuNativeGetNextSemInfo(p0, p1, p2, p3)")
private external fun wasmLibcUnixHaikuNativeGetNextSemInfo(p0: Int, p1: String, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHaikuNativeKillTeam(p0)")
private external fun wasmLibcUnixHaikuNativeKillTeam(p0: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixHaikuNativeGetTeamInfo(p0, p1, p2)")
private external fun wasmLibcUnixHaikuNativeGetTeamInfo(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixHaikuNativeGetNextTeamInfo(p0, p1, p2)")
private external fun wasmLibcUnixHaikuNativeGetNextTeamInfo(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixHaikuNativeSpawnThread(p0, p1, p2, p3)")
private external fun wasmLibcUnixHaikuNativeSpawnThread(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHaikuNativeKillThread(p0)")
private external fun wasmLibcUnixHaikuNativeKillThread(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHaikuNativeResumeThread(p0)")
private external fun wasmLibcUnixHaikuNativeResumeThread(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHaikuNativeSuspendThread(p0)")
private external fun wasmLibcUnixHaikuNativeSuspendThread(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHaikuNativeRenameThread(p0, p1)")
private external fun wasmLibcUnixHaikuNativeRenameThread(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHaikuNativeSetThreadPriority(p0, p1)")
private external fun wasmLibcUnixHaikuNativeSetThreadPriority(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixHaikuNativeSuggestThreadPriority(p0, p1, p2, p3)")
private external fun wasmLibcUnixHaikuNativeSuggestThreadPriority(p0: Int, p1: Int, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHaikuNativeEstimateMaxSchedulingLatency(p0)")
private external fun wasmLibcUnixHaikuNativeEstimateMaxSchedulingLatency(p0: Int): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHaikuNativeExitThread(p0)")
private external fun wasmLibcUnixHaikuNativeExitThread(p0: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHaikuNativeWaitForThread(p0, p1)")
private external fun wasmLibcUnixHaikuNativeWaitForThread(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHaikuNativeOnExitThread(p0, p1)")
private external fun wasmLibcUnixHaikuNativeOnExitThread(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHaikuNativeFindThread(p0)")
private external fun wasmLibcUnixHaikuNativeFindThread(p0: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixHaikuNativeGetSchedulerMode()")
private external fun wasmLibcUnixHaikuNativeGetSchedulerMode(): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHaikuNativeSetSchedulerMode(p0)")
private external fun wasmLibcUnixHaikuNativeSetSchedulerMode(p0: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixHaikuNativeSendData(p0, p1, p2, p3)")
private external fun wasmLibcUnixHaikuNativeSendData(p0: Int, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixHaikuNativeReceiveData(p0, p1, p2)")
private external fun wasmLibcUnixHaikuNativeReceiveData(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHaikuNativeHasData(p0)")
private external fun wasmLibcUnixHaikuNativeHasData(p0: Int): Boolean

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHaikuNativeSnooze(p0)")
private external fun wasmLibcUnixHaikuNativeSnooze(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixHaikuNativeSnoozeEtc(p0, p1, p2)")
private external fun wasmLibcUnixHaikuNativeSnoozeEtc(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHaikuNativeSnoozeUntil(p0, p1)")
private external fun wasmLibcUnixHaikuNativeSnoozeUntil(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixHaikuNativeGetThreadInfo(p0, p1, p2)")
private external fun wasmLibcUnixHaikuNativeGetThreadInfo(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixHaikuNativeGetNextThreadInfo(p0, p1, p2, p3)")
private external fun wasmLibcUnixHaikuNativeGetNextThreadInfo(p0: Int, p1: String, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHaikuNativeGetPthreadThreadId(p0)")
private external fun wasmLibcUnixHaikuNativeGetPthreadThreadId(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixHaikuNativeGetTeamUsageInfo(p0, p1, p2, p3)")
private external fun wasmLibcUnixHaikuNativeGetTeamUsageInfo(p0: Int, p1: Int, p2: String, p3: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixHaikuNativeRealTimeClock()")
private external fun wasmLibcUnixHaikuNativeRealTimeClock(): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHaikuNativeSetRealTimeClock(p0)")
private external fun wasmLibcUnixHaikuNativeSetRealTimeClock(p0: String)

@JsFun("() => globalThis.__km_napi_libc.libcUnixHaikuNativeRealTimeClockUsecs()")
private external fun wasmLibcUnixHaikuNativeRealTimeClockUsecs(): String

@JsFun("() => globalThis.__km_napi_libc.libcUnixHaikuNativeSystemTime()")
private external fun wasmLibcUnixHaikuNativeSystemTime(): String

@JsFun("() => globalThis.__km_napi_libc.libcUnixHaikuNativeSystemTimeNsecs()")
private external fun wasmLibcUnixHaikuNativeSystemTimeNsecs(): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHaikuNativeSetAlarm(p0, p1)")
private external fun wasmLibcUnixHaikuNativeSetAlarm(p0: String, p1: Int): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHaikuNativeDebugger(p0)")
private external fun wasmLibcUnixHaikuNativeDebugger(p0: String)

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHaikuNativeDisableDebugger(p0)")
private external fun wasmLibcUnixHaikuNativeDisableDebugger(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHaikuNativeGetSystemInfo(p0)")
private external fun wasmLibcUnixHaikuNativeGetSystemInfo(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixHaikuNativeGetCpuInfoEtc(p0, p1, p2, p3)")
private external fun wasmLibcUnixHaikuNativeGetCpuInfoEtc(p0: Int, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHaikuNativeGetCpuTopologyInfo(p0, p1)")
private external fun wasmLibcUnixHaikuNativeGetCpuTopologyInfo(p0: String, p1: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixHaikuNativeIsComputerOn()")
private external fun wasmLibcUnixHaikuNativeIsComputerOn(): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixHaikuNativeIsComputerOnFire()")
private external fun wasmLibcUnixHaikuNativeIsComputerOnFire(): Double

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHaikuNativeSendSignal(p0, p1)")
private external fun wasmLibcUnixHaikuNativeSendSignal(p0: Int, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHaikuNativeSetSignalStack(p0, p1)")
private external fun wasmLibcUnixHaikuNativeSetSignalStack(p0: String, p1: String)

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHaikuNativeWaitForObjects(p0, p1)")
private external fun wasmLibcUnixHaikuNativeWaitForObjects(p0: String, p1: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixHaikuNativeWaitForObjectsEtc(p0, p1, p2, p3)")
private external fun wasmLibcUnixHaikuNativeWaitForObjectsEtc(p0: String, p1: Int, p2: Int, p3: String): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcUnixHaikuNativeFsReadAttr(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcUnixHaikuNativeFsReadAttr(p0: Int, p1: String, p2: Int, p3: String, p4: String, p5: String): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcUnixHaikuNativeFsWriteAttr(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcUnixHaikuNativeFsWriteAttr(p0: Int, p1: String, p2: Int, p3: String, p4: String, p5: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHaikuNativeFsRemoveAttr(p0, p1)")
private external fun wasmLibcUnixHaikuNativeFsRemoveAttr(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixHaikuNativeFsStatAttr(p0, p1, p2)")
private external fun wasmLibcUnixHaikuNativeFsStatAttr(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixHaikuNativeFsOpenAttr(p0, p1, p2, p3)")
private external fun wasmLibcUnixHaikuNativeFsOpenAttr(p0: String, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixHaikuNativeFsFopenAttr(p0, p1, p2, p3)")
private external fun wasmLibcUnixHaikuNativeFsFopenAttr(p0: Int, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHaikuNativeFsCloseAttr(p0)")
private external fun wasmLibcUnixHaikuNativeFsCloseAttr(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHaikuNativeFsOpenAttrDir(p0)")
private external fun wasmLibcUnixHaikuNativeFsOpenAttrDir(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHaikuNativeFsLopenAttrDir(p0)")
private external fun wasmLibcUnixHaikuNativeFsLopenAttrDir(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHaikuNativeFsFopenAttrDir(p0)")
private external fun wasmLibcUnixHaikuNativeFsFopenAttrDir(p0: Int): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHaikuNativeFsCloseAttrDir(p0)")
private external fun wasmLibcUnixHaikuNativeFsCloseAttrDir(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHaikuNativeFsReadAttrDir(p0)")
private external fun wasmLibcUnixHaikuNativeFsReadAttrDir(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHaikuNativeFsRewindAttrDir(p0)")
private external fun wasmLibcUnixHaikuNativeFsRewindAttrDir(p0: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixHaikuNativeFsCreateIndex(p0, p1, p2, p3)")
private external fun wasmLibcUnixHaikuNativeFsCreateIndex(p0: Int, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHaikuNativeFsRemoveIndex(p0, p1)")
private external fun wasmLibcUnixHaikuNativeFsRemoveIndex(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixHaikuNativeFsStatIndex(p0, p1, p2)")
private external fun wasmLibcUnixHaikuNativeFsStatIndex(p0: Int, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHaikuNativeFsOpenIndexDir(p0)")
private external fun wasmLibcUnixHaikuNativeFsOpenIndexDir(p0: Int): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHaikuNativeFsCloseIndexDir(p0)")
private external fun wasmLibcUnixHaikuNativeFsCloseIndexDir(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHaikuNativeFsReadIndexDir(p0)")
private external fun wasmLibcUnixHaikuNativeFsReadIndexDir(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHaikuNativeFsRewindIndexDir(p0)")
private external fun wasmLibcUnixHaikuNativeFsRewindIndexDir(p0: String)

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHaikuNativeDevForPath(p0)")
private external fun wasmLibcUnixHaikuNativeDevForPath(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHaikuNativeNextDev(p0)")
private external fun wasmLibcUnixHaikuNativeNextDev(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHaikuNativeFsStatDev(p0, p1)")
private external fun wasmLibcUnixHaikuNativeFsStatDev(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixHaikuNativeFsOpenQuery(p0, p1, p2)")
private external fun wasmLibcUnixHaikuNativeFsOpenQuery(p0: Int, p1: String, p2: Int): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixHaikuNativeFsOpenLiveQuery(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixHaikuNativeFsOpenLiveQuery(p0: Int, p1: String, p2: Int, p3: Int, p4: Int): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHaikuNativeFsCloseQuery(p0)")
private external fun wasmLibcUnixHaikuNativeFsCloseQuery(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHaikuNativeFsReadQuery(p0)")
private external fun wasmLibcUnixHaikuNativeFsReadQuery(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixHaikuNativeGetPathForDirent(p0, p1, p2)")
private external fun wasmLibcUnixHaikuNativeGetPathForDirent(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixHaikuNativeFsMountVolume(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixHaikuNativeFsMountVolume(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHaikuNativeFsUnmountVolume(p0, p1)")
private external fun wasmLibcUnixHaikuNativeFsUnmountVolume(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixHaikuNativeLoadImage(p0, p1, p2)")
private external fun wasmLibcUnixHaikuNativeLoadImage(p0: Int, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHaikuNativeLoadAddOn(p0)")
private external fun wasmLibcUnixHaikuNativeLoadAddOn(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHaikuNativeUnloadAddOn(p0)")
private external fun wasmLibcUnixHaikuNativeUnloadAddOn(p0: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixHaikuNativeGetImageSymbol(p0, p1, p2, p3)")
private external fun wasmLibcUnixHaikuNativeGetImageSymbol(p0: Int, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcUnixHaikuNativeGetNthImageSymbol(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcUnixHaikuNativeGetNthImageSymbol(p0: Int, p1: Int, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixHaikuNativeClearCaches(p0, p1, p2)")
private external fun wasmLibcUnixHaikuNativeClearCaches(p0: String, p1: String, p2: Int)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixHaikuNativeGetImageInfo(p0, p1, p2)")
private external fun wasmLibcUnixHaikuNativeGetImageInfo(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixHaikuNativeGetNextImageInfo(p0, p1, p2, p3)")
private external fun wasmLibcUnixHaikuNativeGetNextImageInfo(p0: Int, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixHaikuNativeFindPath(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixHaikuNativeFindPath(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_libc.libcUnixHaikuNativeFindPathEtc(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmLibcUnixHaikuNativeFindPathEtc(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: Int, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixHaikuNativeFindPathForPath(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixHaikuNativeFindPathForPath(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_libc.libcUnixHaikuNativeFindPathForPathEtc(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmLibcUnixHaikuNativeFindPathForPathEtc(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: Int, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixHaikuNativeFindPaths(p0, p1, p2, p3)")
private external fun wasmLibcUnixHaikuNativeFindPaths(p0: Int, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcUnixHaikuNativeFindPathsEtc(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcUnixHaikuNativeFindPathsEtc(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixHaikuNativeFindDirectory(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixHaikuNativeFindDirectory(p0: Int, p1: Int, p2: Boolean, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixHaikuNativeGetCpuid(p0, p1, p2)")
private external fun wasmLibcUnixHaikuNativeGetCpuid(p0: String, p1: Int, p2: Int): Int

public actual fun createArea(name: ConstPtr<CChar>, startAddress: MutPtr<MutPtr<CVoid>>, addressSpec: UInt, size: ULong, lock: UInt, protection: UInt): AreaId =
    if (unixHaikuNativeNapiAvailable) wasmLibcUnixHaikuNativeCreateArea(name.rawAddress.toString(), startAddress.rawAddress.toString(), addressSpec.toInt(), size.toString(), lock.toInt(), protection.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cloneArea(name: ConstPtr<CChar>, destAddress: MutPtr<MutPtr<CVoid>>, addressSpec: UInt, protection: UInt, source: AreaId): AreaId =
    if (unixHaikuNativeNapiAvailable) wasmLibcUnixHaikuNativeCloneArea(name.rawAddress.toString(), destAddress.rawAddress.toString(), addressSpec.toInt(), protection.toInt(), source) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findArea(name: ConstPtr<CChar>): AreaId =
    if (unixHaikuNativeNapiAvailable) wasmLibcUnixHaikuNativeFindArea(name.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun areaFor(address: MutPtr<CVoid>): AreaId =
    if (unixHaikuNativeNapiAvailable) wasmLibcUnixHaikuNativeAreaFor(address.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteArea(id: AreaId): StatusT =
    if (unixHaikuNativeNapiAvailable) wasmLibcUnixHaikuNativeDeleteArea(id) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resizeArea(id: AreaId, newSize: ULong): StatusT =
    if (unixHaikuNativeNapiAvailable) wasmLibcUnixHaikuNativeResizeArea(id, newSize.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setAreaProtection(id: AreaId, newProtection: UInt): StatusT =
    if (unixHaikuNativeNapiAvailable) wasmLibcUnixHaikuNativeSetAreaProtection(id, newProtection.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getAreaInfo(id: AreaId, areaInfo: MutPtr<AreaInfo>, size: ULong): StatusT =
    if (unixHaikuNativeNapiAvailable) wasmLibcUnixHaikuNativeGetAreaInfo(id, areaInfo.rawAddress.toString(), size.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNextAreaInfo(team: TeamId, cookie: MutPtr<Long>, areaInfo: MutPtr<AreaInfo>, size: ULong): StatusT =
    if (unixHaikuNativeNapiAvailable) wasmLibcUnixHaikuNativeGetNextAreaInfo(team, cookie.rawAddress.toString(), areaInfo.rawAddress.toString(), size.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createPort(capacity: Int, name: ConstPtr<CChar>): PortId =
    if (unixHaikuNativeNapiAvailable) wasmLibcUnixHaikuNativeCreatePort(capacity, name.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findPort(name: ConstPtr<CChar>): PortId =
    if (unixHaikuNativeNapiAvailable) wasmLibcUnixHaikuNativeFindPort(name.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readPort(port: PortId, code: MutPtr<Int>, buffer: MutPtr<CVoid>, bufferSize: SizeT): SsizeT =
    if (unixHaikuNativeNapiAvailable) wasmLibcUnixHaikuNativeReadPort(port, code.rawAddress.toString(), buffer.rawAddress.toString(), bufferSize.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readPortEtc(port: PortId, code: MutPtr<Int>, buffer: MutPtr<CVoid>, bufferSize: SizeT, flags: UInt, timeout: BigtimeT): SsizeT =
    if (unixHaikuNativeNapiAvailable) wasmLibcUnixHaikuNativeReadPortEtc(port, code.rawAddress.toString(), buffer.rawAddress.toString(), bufferSize.toString(), flags.toInt(), timeout.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writePort(port: PortId, code: Int, buffer: ConstPtr<CVoid>, bufferSize: SizeT): StatusT =
    if (unixHaikuNativeNapiAvailable) wasmLibcUnixHaikuNativeWritePort(port, code, buffer.rawAddress.toString(), bufferSize.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writePortEtc(port: PortId, code: Int, buffer: ConstPtr<CVoid>, bufferSize: SizeT, flags: UInt, timeout: BigtimeT): StatusT =
    if (unixHaikuNativeNapiAvailable) wasmLibcUnixHaikuNativeWritePortEtc(port, code, buffer.rawAddress.toString(), bufferSize.toString(), flags.toInt(), timeout.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun closePort(port: PortId): StatusT =
    if (unixHaikuNativeNapiAvailable) wasmLibcUnixHaikuNativeClosePort(port) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deletePort(port: PortId): StatusT =
    if (unixHaikuNativeNapiAvailable) wasmLibcUnixHaikuNativeDeletePort(port) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun portBufferSize(port: PortId): SsizeT =
    if (unixHaikuNativeNapiAvailable) wasmLibcUnixHaikuNativePortBufferSize(port).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun portBufferSizeEtc(port: PortId, flags: UInt, timeout: BigtimeT): SsizeT =
    if (unixHaikuNativeNapiAvailable) wasmLibcUnixHaikuNativePortBufferSizeEtc(port, flags.toInt(), timeout.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun portCount(port: PortId): SsizeT =
    if (unixHaikuNativeNapiAvailable) wasmLibcUnixHaikuNativePortCount(port).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setPortOwner(port: PortId, team: TeamId): StatusT =
    if (unixHaikuNativeNapiAvailable) wasmLibcUnixHaikuNativeSetPortOwner(port, team) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPortInfo(port: PortId, buf: MutPtr<PortInfo>, portInfoSize: SizeT): StatusT =
    if (unixHaikuNativeNapiAvailable) wasmLibcUnixHaikuNativeGetPortInfo(port, buf.rawAddress.toString(), portInfoSize.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNextPortInfo(port: PortId, cookie: MutPtr<Int>, portInfo: MutPtr<PortInfo>, portInfoSize: SizeT): StatusT =
    if (unixHaikuNativeNapiAvailable) wasmLibcUnixHaikuNativeGetNextPortInfo(port, cookie.rawAddress.toString(), portInfo.rawAddress.toString(), portInfoSize.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPortMessageInfoEtc(port: PortId, info: MutPtr<PortMessageInfo>, infoSize: SizeT, flags: UInt, timeout: BigtimeT): StatusT =
    if (unixHaikuNativeNapiAvailable) wasmLibcUnixHaikuNativeGetPortMessageInfoEtc(port, info.rawAddress.toString(), infoSize.toString(), flags.toInt(), timeout.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createSem(count: Int, name: ConstPtr<CChar>): SemId =
    if (unixHaikuNativeNapiAvailable) wasmLibcUnixHaikuNativeCreateSem(count, name.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteSem(id: SemId): StatusT =
    if (unixHaikuNativeNapiAvailable) wasmLibcUnixHaikuNativeDeleteSem(id) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acquireSem(id: SemId): StatusT =
    if (unixHaikuNativeNapiAvailable) wasmLibcUnixHaikuNativeAcquireSem(id) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acquireSemEtc(id: SemId, count: Int, flags: UInt, timeout: BigtimeT): StatusT =
    if (unixHaikuNativeNapiAvailable) wasmLibcUnixHaikuNativeAcquireSemEtc(id, count, flags.toInt(), timeout.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun releaseSem(id: SemId): StatusT =
    if (unixHaikuNativeNapiAvailable) wasmLibcUnixHaikuNativeReleaseSem(id) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun releaseSemEtc(id: SemId, count: Int, flags: UInt): StatusT =
    if (unixHaikuNativeNapiAvailable) wasmLibcUnixHaikuNativeReleaseSemEtc(id, count, flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun switchSem(semToBeReleased: SemId, id: SemId): StatusT =
    if (unixHaikuNativeNapiAvailable) wasmLibcUnixHaikuNativeSwitchSem(semToBeReleased, id) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun switchSemEtc(semToBeReleased: SemId, id: SemId, count: Int, flags: UInt, timeout: BigtimeT): StatusT =
    if (unixHaikuNativeNapiAvailable) wasmLibcUnixHaikuNativeSwitchSemEtc(semToBeReleased, id, count, flags.toInt(), timeout.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSemCount(id: SemId, threadCount: MutPtr<Int>): StatusT =
    if (unixHaikuNativeNapiAvailable) wasmLibcUnixHaikuNativeGetSemCount(id, threadCount.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setSemOwner(id: SemId, team: TeamId): StatusT =
    if (unixHaikuNativeNapiAvailable) wasmLibcUnixHaikuNativeSetSemOwner(id, team) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSemInfo(id: SemId, info: MutPtr<SemInfo>, infoSize: SizeT): StatusT =
    if (unixHaikuNativeNapiAvailable) wasmLibcUnixHaikuNativeGetSemInfo(id, info.rawAddress.toString(), infoSize.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNextSemInfo(team: TeamId, cookie: MutPtr<Int>, info: MutPtr<SemInfo>, infoSize: SizeT): StatusT =
    if (unixHaikuNativeNapiAvailable) wasmLibcUnixHaikuNativeGetNextSemInfo(team, cookie.rawAddress.toString(), info.rawAddress.toString(), infoSize.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun killTeam(team: TeamId): StatusT =
    if (unixHaikuNativeNapiAvailable) wasmLibcUnixHaikuNativeKillTeam(team) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTeamInfo(team: TeamId, info: MutPtr<TeamInfo>, size: SizeT): StatusT =
    if (unixHaikuNativeNapiAvailable) wasmLibcUnixHaikuNativeGetTeamInfo(team, info.rawAddress.toString(), size.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNextTeamInfo(cookie: MutPtr<Int>, info: MutPtr<TeamInfo>, size: SizeT): StatusT =
    if (unixHaikuNativeNapiAvailable) wasmLibcUnixHaikuNativeGetNextTeamInfo(cookie.rawAddress.toString(), info.rawAddress.toString(), size.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun spawnThread(func: ThreadFunc, name: ConstPtr<CChar>, priority: Int, data: MutPtr<CVoid>): ThreadId =
    if (unixHaikuNativeNapiAvailable) wasmLibcUnixHaikuNativeSpawnThread(0L.toString(), name.rawAddress.toString(), priority, data.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun killThread(thread: ThreadId): StatusT =
    if (unixHaikuNativeNapiAvailable) wasmLibcUnixHaikuNativeKillThread(thread) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resumeThread(thread: ThreadId): StatusT =
    if (unixHaikuNativeNapiAvailable) wasmLibcUnixHaikuNativeResumeThread(thread) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun suspendThread(thread: ThreadId): StatusT =
    if (unixHaikuNativeNapiAvailable) wasmLibcUnixHaikuNativeSuspendThread(thread) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun renameThread(thread: ThreadId, newName: ConstPtr<CChar>): StatusT =
    if (unixHaikuNativeNapiAvailable) wasmLibcUnixHaikuNativeRenameThread(thread, newName.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setThreadPriority(thread: ThreadId, newPriority: Int): StatusT =
    if (unixHaikuNativeNapiAvailable) wasmLibcUnixHaikuNativeSetThreadPriority(thread, newPriority) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun suggestThreadPriority(what: UInt, period: Int, jitter: BigtimeT, length: BigtimeT): Int =
    if (unixHaikuNativeNapiAvailable) wasmLibcUnixHaikuNativeSuggestThreadPriority(what.toInt(), period, jitter.toString(), length.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun estimateMaxSchedulingLatency(th: ThreadId): BigtimeT =
    if (unixHaikuNativeNapiAvailable) wasmLibcUnixHaikuNativeEstimateMaxSchedulingLatency(th).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exitThread(status: StatusT) {
    if (unixHaikuNativeNapiAvailable) {
        wasmLibcUnixHaikuNativeExitThread(status)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun waitForThread(thread: ThreadId, returnValue: MutPtr<StatusT>): StatusT =
    if (unixHaikuNativeNapiAvailable) wasmLibcUnixHaikuNativeWaitForThread(thread, returnValue.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun onExitThread(callback: OnExitThreadCallbackCallback, data: MutPtr<CVoid>): StatusT =
    if (unixHaikuNativeNapiAvailable) wasmLibcUnixHaikuNativeOnExitThread(0L.toString(), data.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findThread(name: ConstPtr<CChar>): ThreadId =
    if (unixHaikuNativeNapiAvailable) wasmLibcUnixHaikuNativeFindThread(name.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSchedulerMode(): Int =
    if (unixHaikuNativeNapiAvailable) wasmLibcUnixHaikuNativeGetSchedulerMode() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setSchedulerMode(mode: Int): StatusT =
    if (unixHaikuNativeNapiAvailable) wasmLibcUnixHaikuNativeSetSchedulerMode(mode) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendData(thread: ThreadId, code: Int, buffer: ConstPtr<CVoid>, bufferSize: SizeT): StatusT =
    if (unixHaikuNativeNapiAvailable) wasmLibcUnixHaikuNativeSendData(thread, code, buffer.rawAddress.toString(), bufferSize.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun receiveData(sender: MutPtr<ThreadId>, buffer: MutPtr<CVoid>, bufferSize: SizeT): Int =
    if (unixHaikuNativeNapiAvailable) wasmLibcUnixHaikuNativeReceiveData(sender.rawAddress.toString(), buffer.rawAddress.toString(), bufferSize.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hasData(thread: ThreadId): Boolean =
    if (unixHaikuNativeNapiAvailable) wasmLibcUnixHaikuNativeHasData(thread) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snooze(amount: BigtimeT): StatusT =
    if (unixHaikuNativeNapiAvailable) wasmLibcUnixHaikuNativeSnooze(amount.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snoozeEtc(amount: BigtimeT, timeBase: CInt, flags: UInt): StatusT =
    if (unixHaikuNativeNapiAvailable) wasmLibcUnixHaikuNativeSnoozeEtc(amount.toString(), timeBase, flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snoozeUntil(time: BigtimeT, timeBase: CInt): StatusT =
    if (unixHaikuNativeNapiAvailable) wasmLibcUnixHaikuNativeSnoozeUntil(time.toString(), timeBase) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThreadInfo(id: ThreadId, info: MutPtr<ThreadInfo>, size: SizeT): StatusT =
    if (unixHaikuNativeNapiAvailable) wasmLibcUnixHaikuNativeGetThreadInfo(id, info.rawAddress.toString(), size.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNextThreadInfo(team: TeamId, cookie: MutPtr<Int>, info: MutPtr<ThreadInfo>, size: SizeT): StatusT =
    if (unixHaikuNativeNapiAvailable) wasmLibcUnixHaikuNativeGetNextThreadInfo(team, cookie.rawAddress.toString(), info.rawAddress.toString(), size.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPthreadThreadId(thread: PthreadT): ThreadId =
    if (unixHaikuNativeNapiAvailable) wasmLibcUnixHaikuNativeGetPthreadThreadId(thread.toLong().toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTeamUsageInfo(team: TeamId, who: Int, info: MutPtr<TeamUsageInfo>, size: SizeT): StatusT =
    if (unixHaikuNativeNapiAvailable) wasmLibcUnixHaikuNativeGetTeamUsageInfo(team, who, info.rawAddress.toString(), size.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun realTimeClock(): CUlong =
    if (unixHaikuNativeNapiAvailable) wasmLibcUnixHaikuNativeRealTimeClock().toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setRealTimeClock(secsSinceJan1st1970: CUlong) {
    if (unixHaikuNativeNapiAvailable) {
        wasmLibcUnixHaikuNativeSetRealTimeClock(secsSinceJan1st1970.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun realTimeClockUsecs(): BigtimeT =
    if (unixHaikuNativeNapiAvailable) wasmLibcUnixHaikuNativeRealTimeClockUsecs().toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun systemTime(): BigtimeT =
    if (unixHaikuNativeNapiAvailable) wasmLibcUnixHaikuNativeSystemTime().toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun systemTimeNsecs(): NanotimeT =
    if (unixHaikuNativeNapiAvailable) wasmLibcUnixHaikuNativeSystemTimeNsecs().toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setAlarm(whenBranch: BigtimeT, flags: UInt): BigtimeT =
    if (unixHaikuNativeNapiAvailable) wasmLibcUnixHaikuNativeSetAlarm(whenBranch.toString(), flags.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun debugger(message: ConstPtr<CChar>) {
    if (unixHaikuNativeNapiAvailable) {
        wasmLibcUnixHaikuNativeDebugger(message.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun disableDebugger(state: CInt): CInt =
    if (unixHaikuNativeNapiAvailable) wasmLibcUnixHaikuNativeDisableDebugger(state) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSystemInfo(info: MutPtr<SystemInfo>): StatusT =
    if (unixHaikuNativeNapiAvailable) wasmLibcUnixHaikuNativeGetSystemInfo(info.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCpuInfoEtc(firstCPU: UInt, cpuCount: UInt, info: MutPtr<CpuInfo>, size: SizeT): StatusT =
    if (unixHaikuNativeNapiAvailable) wasmLibcUnixHaikuNativeGetCpuInfoEtc(firstCPU.toInt(), cpuCount.toInt(), info.rawAddress.toString(), size.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCpuTopologyInfo(topologyInfos: MutPtr<CpuTopologyNodeInfo>, topologyInfoCount: MutPtr<UInt>): StatusT =
    if (unixHaikuNativeNapiAvailable) wasmLibcUnixHaikuNativeGetCpuTopologyInfo(topologyInfos.rawAddress.toString(), topologyInfoCount.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isComputerOn(): Int =
    if (unixHaikuNativeNapiAvailable) wasmLibcUnixHaikuNativeIsComputerOn() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isComputerOnFire(): CDouble =
    if (unixHaikuNativeNapiAvailable) wasmLibcUnixHaikuNativeIsComputerOnFire() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendSignal(threadID: ThreadId, signal: CUint): CInt =
    if (unixHaikuNativeNapiAvailable) wasmLibcUnixHaikuNativeSendSignal(threadID, signal.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setSignalStack(base: MutPtr<CVoid>, size: SizeT) {
    if (unixHaikuNativeNapiAvailable) {
        wasmLibcUnixHaikuNativeSetSignalStack(base.rawAddress.toString(), size.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun waitForObjects(infos: MutPtr<ObjectWaitInfo>, numInfos: CInt): SsizeT =
    if (unixHaikuNativeNapiAvailable) wasmLibcUnixHaikuNativeWaitForObjects(infos.rawAddress.toString(), numInfos).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waitForObjectsEtc(infos: MutPtr<ObjectWaitInfo>, numInfos: CInt, flags: UInt, timeout: BigtimeT): SsizeT =
    if (unixHaikuNativeNapiAvailable) wasmLibcUnixHaikuNativeWaitForObjectsEtc(infos.rawAddress.toString(), numInfos, flags.toInt(), timeout.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsReadAttr(fd: CInt, attribute: ConstPtr<CChar>, type: UInt, pos: OffT, buffer: MutPtr<CVoid>, readBytes: SizeT): SsizeT =
    if (unixHaikuNativeNapiAvailable) wasmLibcUnixHaikuNativeFsReadAttr(fd, attribute.rawAddress.toString(), type.toInt(), pos.toString(), buffer.rawAddress.toString(), readBytes.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsWriteAttr(fd: CInt, attribute: ConstPtr<CChar>, type: UInt, pos: OffT, buffer: ConstPtr<CVoid>, writeBytes: SizeT): SsizeT =
    if (unixHaikuNativeNapiAvailable) wasmLibcUnixHaikuNativeFsWriteAttr(fd, attribute.rawAddress.toString(), type.toInt(), pos.toString(), buffer.rawAddress.toString(), writeBytes.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRemoveAttr(fd: CInt, attribute: ConstPtr<CChar>): CInt =
    if (unixHaikuNativeNapiAvailable) wasmLibcUnixHaikuNativeFsRemoveAttr(fd, attribute.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsStatAttr(fd: CInt, attribute: ConstPtr<CChar>, attrInfo: MutPtr<AttrInfo>): CInt =
    if (unixHaikuNativeNapiAvailable) wasmLibcUnixHaikuNativeFsStatAttr(fd, attribute.rawAddress.toString(), attrInfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsOpenAttr(path: ConstPtr<CChar>, attribute: ConstPtr<CChar>, type: UInt, openMode: CInt): CInt =
    if (unixHaikuNativeNapiAvailable) wasmLibcUnixHaikuNativeFsOpenAttr(path.rawAddress.toString(), attribute.rawAddress.toString(), type.toInt(), openMode) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsFopenAttr(fd: CInt, attribute: ConstPtr<CChar>, type: UInt, openMode: CInt): CInt =
    if (unixHaikuNativeNapiAvailable) wasmLibcUnixHaikuNativeFsFopenAttr(fd, attribute.rawAddress.toString(), type.toInt(), openMode) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsCloseAttr(fd: CInt): CInt =
    if (unixHaikuNativeNapiAvailable) wasmLibcUnixHaikuNativeFsCloseAttr(fd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsOpenAttrDir(path: ConstPtr<CChar>): MutPtr<DIR> =
    if (unixHaikuNativeNapiAvailable) MutPtr(wasmLibcUnixHaikuNativeFsOpenAttrDir(path.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsLopenAttrDir(path: ConstPtr<CChar>): MutPtr<DIR> =
    if (unixHaikuNativeNapiAvailable) MutPtr(wasmLibcUnixHaikuNativeFsLopenAttrDir(path.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsFopenAttrDir(fd: CInt): MutPtr<DIR> =
    if (unixHaikuNativeNapiAvailable) MutPtr(wasmLibcUnixHaikuNativeFsFopenAttrDir(fd).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsCloseAttrDir(dir: MutPtr<DIR>): CInt =
    if (unixHaikuNativeNapiAvailable) wasmLibcUnixHaikuNativeFsCloseAttrDir(dir.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsReadAttrDir(dir: MutPtr<DIR>): MutPtr<Dirent> =
    if (unixHaikuNativeNapiAvailable) MutPtr(wasmLibcUnixHaikuNativeFsReadAttrDir(dir.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRewindAttrDir(dir: MutPtr<DIR>) {
    if (unixHaikuNativeNapiAvailable) {
        wasmLibcUnixHaikuNativeFsRewindAttrDir(dir.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsCreateIndex(device: DevT, name: ConstPtr<CChar>, type: UInt, flags: UInt): CInt =
    if (unixHaikuNativeNapiAvailable) wasmLibcUnixHaikuNativeFsCreateIndex(device, name.rawAddress.toString(), type.toInt(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRemoveIndex(device: DevT, name: ConstPtr<CChar>): CInt =
    if (unixHaikuNativeNapiAvailable) wasmLibcUnixHaikuNativeFsRemoveIndex(device, name.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsStatIndex(device: DevT, name: ConstPtr<CChar>, indexInfo: MutPtr<IndexInfo>): CInt =
    if (unixHaikuNativeNapiAvailable) wasmLibcUnixHaikuNativeFsStatIndex(device, name.rawAddress.toString(), indexInfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsOpenIndexDir(device: DevT): MutPtr<DIR> =
    if (unixHaikuNativeNapiAvailable) MutPtr(wasmLibcUnixHaikuNativeFsOpenIndexDir(device).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsCloseIndexDir(indexDirectory: MutPtr<DIR>): CInt =
    if (unixHaikuNativeNapiAvailable) wasmLibcUnixHaikuNativeFsCloseIndexDir(indexDirectory.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsReadIndexDir(indexDirectory: MutPtr<DIR>): MutPtr<Dirent> =
    if (unixHaikuNativeNapiAvailable) MutPtr(wasmLibcUnixHaikuNativeFsReadIndexDir(indexDirectory.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRewindIndexDir(indexDirectory: MutPtr<DIR>) {
    if (unixHaikuNativeNapiAvailable) {
        wasmLibcUnixHaikuNativeFsRewindIndexDir(indexDirectory.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun devForPath(path: ConstPtr<CChar>): DevT =
    if (unixHaikuNativeNapiAvailable) wasmLibcUnixHaikuNativeDevForPath(path.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nextDev(pos: MutPtr<Int>): DevT =
    if (unixHaikuNativeNapiAvailable) wasmLibcUnixHaikuNativeNextDev(pos.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsStatDev(dev: DevT, info: MutPtr<FsInfo>): CInt =
    if (unixHaikuNativeNapiAvailable) wasmLibcUnixHaikuNativeFsStatDev(dev, info.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsOpenQuery(device: DevT, query: ConstPtr<CChar>, flags: UInt): MutPtr<DIR> =
    if (unixHaikuNativeNapiAvailable) MutPtr(wasmLibcUnixHaikuNativeFsOpenQuery(device, query.rawAddress.toString(), flags.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsOpenLiveQuery(device: DevT, query: ConstPtr<CChar>, flags: UInt, port: PortId, token: Int): MutPtr<DIR> =
    if (unixHaikuNativeNapiAvailable) MutPtr(wasmLibcUnixHaikuNativeFsOpenLiveQuery(device, query.rawAddress.toString(), flags.toInt(), port, token).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsCloseQuery(d: MutPtr<DIR>): CInt =
    if (unixHaikuNativeNapiAvailable) wasmLibcUnixHaikuNativeFsCloseQuery(d.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsReadQuery(d: MutPtr<DIR>): MutPtr<Dirent> =
    if (unixHaikuNativeNapiAvailable) MutPtr(wasmLibcUnixHaikuNativeFsReadQuery(d.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPathForDirent(dent: MutPtr<Dirent>, buf: MutPtr<CChar>, len: SizeT): StatusT =
    if (unixHaikuNativeNapiAvailable) wasmLibcUnixHaikuNativeGetPathForDirent(dent.rawAddress.toString(), buf.rawAddress.toString(), len.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsMountVolume(where: ConstPtr<CChar>, device: ConstPtr<CChar>, filesystem: ConstPtr<CChar>, flags: UInt, parameters: ConstPtr<CChar>): DevT =
    if (unixHaikuNativeNapiAvailable) wasmLibcUnixHaikuNativeFsMountVolume(where.rawAddress.toString(), device.rawAddress.toString(), filesystem.rawAddress.toString(), flags.toInt(), parameters.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsUnmountVolume(path: ConstPtr<CChar>, flags: UInt): StatusT =
    if (unixHaikuNativeNapiAvailable) wasmLibcUnixHaikuNativeFsUnmountVolume(path.rawAddress.toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadImage(argc: Int, argv: MutPtr<ConstPtr<CChar>>, environ: MutPtr<ConstPtr<CChar>>): ThreadId =
    if (unixHaikuNativeNapiAvailable) wasmLibcUnixHaikuNativeLoadImage(argc, argv.rawAddress.toString(), environ.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadAddOn(path: ConstPtr<CChar>): ImageId =
    if (unixHaikuNativeNapiAvailable) wasmLibcUnixHaikuNativeLoadAddOn(path.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unloadAddOn(image: ImageId): StatusT =
    if (unixHaikuNativeNapiAvailable) wasmLibcUnixHaikuNativeUnloadAddOn(image) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getImageSymbol(image: ImageId, name: ConstPtr<CChar>, symbolType: Int, symbolLocation: MutPtr<MutPtr<CVoid>>): StatusT =
    if (unixHaikuNativeNapiAvailable) wasmLibcUnixHaikuNativeGetImageSymbol(image, name.rawAddress.toString(), symbolType, symbolLocation.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNthImageSymbol(image: ImageId, n: Int, nameBuffer: MutPtr<CChar>, nameLength: MutPtr<Int>, symbolType: MutPtr<Int>, symbolLocation: MutPtr<MutPtr<CVoid>>): StatusT =
    if (unixHaikuNativeNapiAvailable) wasmLibcUnixHaikuNativeGetNthImageSymbol(image, n, nameBuffer.rawAddress.toString(), nameLength.rawAddress.toString(), symbolType.rawAddress.toString(), symbolLocation.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clearCaches(address: MutPtr<CVoid>, length: SizeT, flags: UInt) {
    if (unixHaikuNativeNapiAvailable) {
        wasmLibcUnixHaikuNativeClearCaches(address.rawAddress.toString(), length.toString(), flags.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getImageInfo(image: ImageId, info: MutPtr<ImageInfo>, size: SizeT): StatusT =
    if (unixHaikuNativeNapiAvailable) wasmLibcUnixHaikuNativeGetImageInfo(image, info.rawAddress.toString(), size.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNextImageInfo(team: TeamId, cookie: MutPtr<Int>, info: MutPtr<ImageInfo>, size: SizeT): StatusT =
    if (unixHaikuNativeNapiAvailable) wasmLibcUnixHaikuNativeGetNextImageInfo(team, cookie.rawAddress.toString(), info.rawAddress.toString(), size.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findPath(codePointer: ConstPtr<CVoid>, baseDirectory: PathBaseDirectory, subPath: ConstPtr<CChar>, pathBuffer: MutPtr<CChar>, bufferSize: ULong): StatusT =
    if (unixHaikuNativeNapiAvailable) wasmLibcUnixHaikuNativeFindPath(codePointer.rawAddress.toString(), baseDirectory, subPath.rawAddress.toString(), pathBuffer.rawAddress.toString(), bufferSize.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findPathEtc(codePointer: ConstPtr<CVoid>, dependency: ConstPtr<CChar>, architecture: ConstPtr<CChar>, baseDirectory: PathBaseDirectory, subPath: ConstPtr<CChar>, flags: UInt, pathBuffer: MutPtr<CChar>, bufferSize: SizeT): StatusT =
    if (unixHaikuNativeNapiAvailable) wasmLibcUnixHaikuNativeFindPathEtc(codePointer.rawAddress.toString(), dependency.rawAddress.toString(), architecture.rawAddress.toString(), baseDirectory, subPath.rawAddress.toString(), flags.toInt(), pathBuffer.rawAddress.toString(), bufferSize.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findPathForPath(path: ConstPtr<CChar>, baseDirectory: PathBaseDirectory, subPath: ConstPtr<CChar>, pathBuffer: MutPtr<CChar>, bufferSize: SizeT): StatusT =
    if (unixHaikuNativeNapiAvailable) wasmLibcUnixHaikuNativeFindPathForPath(path.rawAddress.toString(), baseDirectory, subPath.rawAddress.toString(), pathBuffer.rawAddress.toString(), bufferSize.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findPathForPathEtc(path: ConstPtr<CChar>, dependency: ConstPtr<CChar>, architecture: ConstPtr<CChar>, baseDirectory: PathBaseDirectory, subPath: ConstPtr<CChar>, flags: UInt, pathBuffer: MutPtr<CChar>, bufferSize: SizeT): StatusT =
    if (unixHaikuNativeNapiAvailable) wasmLibcUnixHaikuNativeFindPathForPathEtc(path.rawAddress.toString(), dependency.rawAddress.toString(), architecture.rawAddress.toString(), baseDirectory, subPath.rawAddress.toString(), flags.toInt(), pathBuffer.rawAddress.toString(), bufferSize.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findPaths(baseDirectory: PathBaseDirectory, subPath: ConstPtr<CChar>, paths: MutPtr<MutPtr<MutPtr<CChar>>>, pathCount: MutPtr<SizeT>): StatusT =
    if (unixHaikuNativeNapiAvailable) wasmLibcUnixHaikuNativeFindPaths(baseDirectory, subPath.rawAddress.toString(), paths.rawAddress.toString(), pathCount.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findPathsEtc(architecture: ConstPtr<CChar>, baseDirectory: PathBaseDirectory, subPath: ConstPtr<CChar>, flags: UInt, paths: MutPtr<MutPtr<MutPtr<CChar>>>, pathCount: MutPtr<SizeT>): StatusT =
    if (unixHaikuNativeNapiAvailable) wasmLibcUnixHaikuNativeFindPathsEtc(architecture.rawAddress.toString(), baseDirectory, subPath.rawAddress.toString(), flags.toInt(), paths.rawAddress.toString(), pathCount.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findDirectory(which: DirectoryWhich, volume: DevT, createIt: Boolean, pathString: MutPtr<CChar>, length: Int): StatusT =
    if (unixHaikuNativeNapiAvailable) wasmLibcUnixHaikuNativeFindDirectory(which, volume, createIt, pathString.rawAddress.toString(), length) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCpuid(info: MutPtr<CpuidInfo>, eaxRegister: UInt, cpuNum: UInt): StatusT =
    if (unixHaikuNativeNapiAvailable) wasmLibcUnixHaikuNativeGetCpuid(info.rawAddress.toString(), eaxRegister.toInt(), cpuNum.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")
