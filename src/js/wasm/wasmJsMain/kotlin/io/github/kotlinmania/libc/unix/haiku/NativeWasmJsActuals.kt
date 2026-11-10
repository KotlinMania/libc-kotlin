@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.libc.unix.haiku

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CDouble
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.unix.DIR
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT

@JsFun("() => { if (typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_libc = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_libc = null; return false; } try { globalThis.__km_napi_libc = req('@kotlinmania/libc-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_libc = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_libc = null; return false; }")
private external fun _initUnixHaikuNativeNapiAddon(): Boolean

private val _unixHaikuNativeNapiAvailable: Boolean = _initUnixHaikuNativeNapiAddon()

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libc_unix_haiku_native_createArea(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_libc_unix_haiku_native_createArea(p0: String?, p1: String, p2: Int, p3: String, p4: Int, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_haiku_native_cloneArea(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_haiku_native_cloneArea(p0: String?, p1: String, p2: Int, p3: Int, p4: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_haiku_native_findArea(p0)")
private external fun _wasm_libc_unix_haiku_native_findArea(p0: String?): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_haiku_native_areaFor(p0)")
private external fun _wasm_libc_unix_haiku_native_areaFor(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_haiku_native_deleteArea(p0)")
private external fun _wasm_libc_unix_haiku_native_deleteArea(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_haiku_native_resizeArea(p0, p1)")
private external fun _wasm_libc_unix_haiku_native_resizeArea(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_haiku_native_setAreaProtection(p0, p1)")
private external fun _wasm_libc_unix_haiku_native_setAreaProtection(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_haiku_native_getAreaInfo(p0, p1, p2)")
private external fun _wasm_libc_unix_haiku_native_getAreaInfo(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_haiku_native_getNextAreaInfo(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_haiku_native_getNextAreaInfo(p0: Int, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_haiku_native_createPort(p0, p1)")
private external fun _wasm_libc_unix_haiku_native_createPort(p0: Int, p1: String?): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_haiku_native_findPort(p0)")
private external fun _wasm_libc_unix_haiku_native_findPort(p0: String?): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_haiku_native_readPort(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_haiku_native_readPort(p0: Int, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libc_unix_haiku_native_readPortEtc(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_libc_unix_haiku_native_readPortEtc(p0: Int, p1: String, p2: String, p3: String, p4: Int, p5: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_haiku_native_writePort(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_haiku_native_writePort(p0: Int, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libc_unix_haiku_native_writePortEtc(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_libc_unix_haiku_native_writePortEtc(p0: Int, p1: Int, p2: String, p3: String, p4: Int, p5: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_haiku_native_closePort(p0)")
private external fun _wasm_libc_unix_haiku_native_closePort(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_haiku_native_deletePort(p0)")
private external fun _wasm_libc_unix_haiku_native_deletePort(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_haiku_native_portBufferSize(p0)")
private external fun _wasm_libc_unix_haiku_native_portBufferSize(p0: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_haiku_native_portBufferSizeEtc(p0, p1, p2)")
private external fun _wasm_libc_unix_haiku_native_portBufferSizeEtc(p0: Int, p1: Int, p2: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_haiku_native_portCount(p0)")
private external fun _wasm_libc_unix_haiku_native_portCount(p0: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_haiku_native_setPortOwner(p0, p1)")
private external fun _wasm_libc_unix_haiku_native_setPortOwner(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_haiku_native_getPortInfo(p0, p1, p2)")
private external fun _wasm_libc_unix_haiku_native_getPortInfo(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_haiku_native_getNextPortInfo(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_haiku_native_getNextPortInfo(p0: Int, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_haiku_native_getPortMessageInfoEtc(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_haiku_native_getPortMessageInfoEtc(p0: Int, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_haiku_native_createSem(p0, p1)")
private external fun _wasm_libc_unix_haiku_native_createSem(p0: Int, p1: String?): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_haiku_native_deleteSem(p0)")
private external fun _wasm_libc_unix_haiku_native_deleteSem(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_haiku_native_acquireSem(p0)")
private external fun _wasm_libc_unix_haiku_native_acquireSem(p0: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_haiku_native_acquireSemEtc(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_haiku_native_acquireSemEtc(p0: Int, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_haiku_native_releaseSem(p0)")
private external fun _wasm_libc_unix_haiku_native_releaseSem(p0: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_haiku_native_releaseSemEtc(p0, p1, p2)")
private external fun _wasm_libc_unix_haiku_native_releaseSemEtc(p0: Int, p1: Int, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_haiku_native_switchSem(p0, p1)")
private external fun _wasm_libc_unix_haiku_native_switchSem(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_haiku_native_switchSemEtc(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_haiku_native_switchSemEtc(p0: Int, p1: Int, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_haiku_native_getSemCount(p0, p1)")
private external fun _wasm_libc_unix_haiku_native_getSemCount(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_haiku_native_setSemOwner(p0, p1)")
private external fun _wasm_libc_unix_haiku_native_setSemOwner(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_haiku_native_getSemInfo(p0, p1, p2)")
private external fun _wasm_libc_unix_haiku_native_getSemInfo(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_haiku_native_getNextSemInfo(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_haiku_native_getNextSemInfo(p0: Int, p1: String, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_haiku_native_killTeam(p0)")
private external fun _wasm_libc_unix_haiku_native_killTeam(p0: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_haiku_native_getTeamInfo(p0, p1, p2)")
private external fun _wasm_libc_unix_haiku_native_getTeamInfo(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_haiku_native_getNextTeamInfo(p0, p1, p2)")
private external fun _wasm_libc_unix_haiku_native_getNextTeamInfo(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_haiku_native_spawnThread(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_haiku_native_spawnThread(p0: String, p1: String?, p2: Int, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_haiku_native_killThread(p0)")
private external fun _wasm_libc_unix_haiku_native_killThread(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_haiku_native_resumeThread(p0)")
private external fun _wasm_libc_unix_haiku_native_resumeThread(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_haiku_native_suspendThread(p0)")
private external fun _wasm_libc_unix_haiku_native_suspendThread(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_haiku_native_renameThread(p0, p1)")
private external fun _wasm_libc_unix_haiku_native_renameThread(p0: Int, p1: String?): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_haiku_native_setThreadPriority(p0, p1)")
private external fun _wasm_libc_unix_haiku_native_setThreadPriority(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_haiku_native_suggestThreadPriority(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_haiku_native_suggestThreadPriority(p0: Int, p1: Int, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_haiku_native_estimateMaxSchedulingLatency(p0)")
private external fun _wasm_libc_unix_haiku_native_estimateMaxSchedulingLatency(p0: Int): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_haiku_native_exitThread(p0)")
private external fun _wasm_libc_unix_haiku_native_exitThread(p0: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_haiku_native_waitForThread(p0, p1)")
private external fun _wasm_libc_unix_haiku_native_waitForThread(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_haiku_native_onExitThread(p0, p1)")
private external fun _wasm_libc_unix_haiku_native_onExitThread(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_haiku_native_findThread(p0)")
private external fun _wasm_libc_unix_haiku_native_findThread(p0: String?): Int

@JsFun("() => globalThis.__km_napi_libc.libc_unix_haiku_native_getSchedulerMode()")
private external fun _wasm_libc_unix_haiku_native_getSchedulerMode(): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_haiku_native_setSchedulerMode(p0)")
private external fun _wasm_libc_unix_haiku_native_setSchedulerMode(p0: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_haiku_native_sendData(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_haiku_native_sendData(p0: Int, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_haiku_native_receiveData(p0, p1, p2)")
private external fun _wasm_libc_unix_haiku_native_receiveData(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_haiku_native_hasData(p0)")
private external fun _wasm_libc_unix_haiku_native_hasData(p0: Int): Boolean

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_haiku_native_snooze(p0)")
private external fun _wasm_libc_unix_haiku_native_snooze(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_haiku_native_snoozeEtc(p0, p1, p2)")
private external fun _wasm_libc_unix_haiku_native_snoozeEtc(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_haiku_native_snoozeUntil(p0, p1)")
private external fun _wasm_libc_unix_haiku_native_snoozeUntil(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_haiku_native_getThreadInfo(p0, p1, p2)")
private external fun _wasm_libc_unix_haiku_native_getThreadInfo(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_haiku_native_getNextThreadInfo(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_haiku_native_getNextThreadInfo(p0: Int, p1: String, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_haiku_native_getPthreadThreadId(p0)")
private external fun _wasm_libc_unix_haiku_native_getPthreadThreadId(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_haiku_native_getTeamUsageInfo(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_haiku_native_getTeamUsageInfo(p0: Int, p1: Int, p2: String, p3: String): Int

@JsFun("() => globalThis.__km_napi_libc.libc_unix_haiku_native_realTimeClock()")
private external fun _wasm_libc_unix_haiku_native_realTimeClock(): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_haiku_native_setRealTimeClock(p0)")
private external fun _wasm_libc_unix_haiku_native_setRealTimeClock(p0: String)

@JsFun("() => globalThis.__km_napi_libc.libc_unix_haiku_native_realTimeClockUsecs()")
private external fun _wasm_libc_unix_haiku_native_realTimeClockUsecs(): String

@JsFun("() => globalThis.__km_napi_libc.libc_unix_haiku_native_systemTime()")
private external fun _wasm_libc_unix_haiku_native_systemTime(): String

@JsFun("() => globalThis.__km_napi_libc.libc_unix_haiku_native_systemTimeNsecs()")
private external fun _wasm_libc_unix_haiku_native_systemTimeNsecs(): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_haiku_native_setAlarm(p0, p1)")
private external fun _wasm_libc_unix_haiku_native_setAlarm(p0: String, p1: Int): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_haiku_native_debugger(p0)")
private external fun _wasm_libc_unix_haiku_native_debugger(p0: String?)

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_haiku_native_disableDebugger(p0)")
private external fun _wasm_libc_unix_haiku_native_disableDebugger(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_haiku_native_getSystemInfo(p0)")
private external fun _wasm_libc_unix_haiku_native_getSystemInfo(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_haiku_native_getCpuInfoEtc(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_haiku_native_getCpuInfoEtc(p0: Int, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_haiku_native_getCpuTopologyInfo(p0, p1)")
private external fun _wasm_libc_unix_haiku_native_getCpuTopologyInfo(p0: String, p1: String): Int

@JsFun("() => globalThis.__km_napi_libc.libc_unix_haiku_native_isComputerOn()")
private external fun _wasm_libc_unix_haiku_native_isComputerOn(): Int

@JsFun("() => globalThis.__km_napi_libc.libc_unix_haiku_native_isComputerOnFire()")
private external fun _wasm_libc_unix_haiku_native_isComputerOnFire(): Double

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_haiku_native_sendSignal(p0, p1)")
private external fun _wasm_libc_unix_haiku_native_sendSignal(p0: Int, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_haiku_native_setSignalStack(p0, p1)")
private external fun _wasm_libc_unix_haiku_native_setSignalStack(p0: String, p1: String)

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_haiku_native_waitForObjects(p0, p1)")
private external fun _wasm_libc_unix_haiku_native_waitForObjects(p0: String, p1: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_haiku_native_waitForObjectsEtc(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_haiku_native_waitForObjectsEtc(p0: String, p1: Int, p2: Int, p3: String): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libc_unix_haiku_native_fsReadAttr(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_libc_unix_haiku_native_fsReadAttr(p0: Int, p1: String?, p2: Int, p3: String, p4: String, p5: String): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libc_unix_haiku_native_fsWriteAttr(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_libc_unix_haiku_native_fsWriteAttr(p0: Int, p1: String?, p2: Int, p3: String, p4: String, p5: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_haiku_native_fsRemoveAttr(p0, p1)")
private external fun _wasm_libc_unix_haiku_native_fsRemoveAttr(p0: Int, p1: String?): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_haiku_native_fsStatAttr(p0, p1, p2)")
private external fun _wasm_libc_unix_haiku_native_fsStatAttr(p0: Int, p1: String?, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_haiku_native_fsOpenAttr(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_haiku_native_fsOpenAttr(p0: String?, p1: String?, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_haiku_native_fsFopenAttr(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_haiku_native_fsFopenAttr(p0: Int, p1: String?, p2: Int, p3: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_haiku_native_fsCloseAttr(p0)")
private external fun _wasm_libc_unix_haiku_native_fsCloseAttr(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_haiku_native_fsOpenAttrDir(p0)")
private external fun _wasm_libc_unix_haiku_native_fsOpenAttrDir(p0: String?): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_haiku_native_fsLopenAttrDir(p0)")
private external fun _wasm_libc_unix_haiku_native_fsLopenAttrDir(p0: String?): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_haiku_native_fsFopenAttrDir(p0)")
private external fun _wasm_libc_unix_haiku_native_fsFopenAttrDir(p0: Int): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_haiku_native_fsCloseAttrDir(p0)")
private external fun _wasm_libc_unix_haiku_native_fsCloseAttrDir(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_haiku_native_fsReadAttrDir(p0)")
private external fun _wasm_libc_unix_haiku_native_fsReadAttrDir(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_haiku_native_fsRewindAttrDir(p0)")
private external fun _wasm_libc_unix_haiku_native_fsRewindAttrDir(p0: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_haiku_native_fsCreateIndex(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_haiku_native_fsCreateIndex(p0: Int, p1: String?, p2: Int, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_haiku_native_fsRemoveIndex(p0, p1)")
private external fun _wasm_libc_unix_haiku_native_fsRemoveIndex(p0: Int, p1: String?): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_haiku_native_fsStatIndex(p0, p1, p2)")
private external fun _wasm_libc_unix_haiku_native_fsStatIndex(p0: Int, p1: String?, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_haiku_native_fsOpenIndexDir(p0)")
private external fun _wasm_libc_unix_haiku_native_fsOpenIndexDir(p0: Int): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_haiku_native_fsCloseIndexDir(p0)")
private external fun _wasm_libc_unix_haiku_native_fsCloseIndexDir(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_haiku_native_fsReadIndexDir(p0)")
private external fun _wasm_libc_unix_haiku_native_fsReadIndexDir(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_haiku_native_fsRewindIndexDir(p0)")
private external fun _wasm_libc_unix_haiku_native_fsRewindIndexDir(p0: String)

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_haiku_native_devForPath(p0)")
private external fun _wasm_libc_unix_haiku_native_devForPath(p0: String?): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_haiku_native_nextDev(p0)")
private external fun _wasm_libc_unix_haiku_native_nextDev(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_haiku_native_fsStatDev(p0, p1)")
private external fun _wasm_libc_unix_haiku_native_fsStatDev(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_haiku_native_fsOpenQuery(p0, p1, p2)")
private external fun _wasm_libc_unix_haiku_native_fsOpenQuery(p0: Int, p1: String?, p2: Int): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_haiku_native_fsOpenLiveQuery(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_haiku_native_fsOpenLiveQuery(p0: Int, p1: String?, p2: Int, p3: Int, p4: Int): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_haiku_native_fsCloseQuery(p0)")
private external fun _wasm_libc_unix_haiku_native_fsCloseQuery(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_haiku_native_fsReadQuery(p0)")
private external fun _wasm_libc_unix_haiku_native_fsReadQuery(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_haiku_native_getPathForDirent(p0, p1, p2)")
private external fun _wasm_libc_unix_haiku_native_getPathForDirent(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_haiku_native_fsMountVolume(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_haiku_native_fsMountVolume(p0: String?, p1: String?, p2: String?, p3: Int, p4: String?): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_haiku_native_fsUnmountVolume(p0, p1)")
private external fun _wasm_libc_unix_haiku_native_fsUnmountVolume(p0: String?, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_haiku_native_loadImage(p0, p1, p2)")
private external fun _wasm_libc_unix_haiku_native_loadImage(p0: Int, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_haiku_native_loadAddOn(p0)")
private external fun _wasm_libc_unix_haiku_native_loadAddOn(p0: String?): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_haiku_native_unloadAddOn(p0)")
private external fun _wasm_libc_unix_haiku_native_unloadAddOn(p0: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_haiku_native_getImageSymbol(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_haiku_native_getImageSymbol(p0: Int, p1: String?, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libc_unix_haiku_native_getNthImageSymbol(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_libc_unix_haiku_native_getNthImageSymbol(p0: Int, p1: Int, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_haiku_native_clearCaches(p0, p1, p2)")
private external fun _wasm_libc_unix_haiku_native_clearCaches(p0: String, p1: String, p2: Int)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_haiku_native_getImageInfo(p0, p1, p2)")
private external fun _wasm_libc_unix_haiku_native_getImageInfo(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_haiku_native_getNextImageInfo(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_haiku_native_getNextImageInfo(p0: Int, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_haiku_native_findPath(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_haiku_native_findPath(p0: String, p1: Int, p2: String?, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_libc.libc_unix_haiku_native_findPathEtc(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_libc_unix_haiku_native_findPathEtc(p0: String, p1: String?, p2: String?, p3: Int, p4: String?, p5: Int, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_haiku_native_findPathForPath(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_haiku_native_findPathForPath(p0: String?, p1: Int, p2: String?, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_libc.libc_unix_haiku_native_findPathForPathEtc(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_libc_unix_haiku_native_findPathForPathEtc(p0: String?, p1: String?, p2: String?, p3: Int, p4: String?, p5: Int, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_haiku_native_findPaths(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_haiku_native_findPaths(p0: Int, p1: String?, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libc_unix_haiku_native_findPathsEtc(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_libc_unix_haiku_native_findPathsEtc(p0: String?, p1: Int, p2: String?, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_haiku_native_findDirectory(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_haiku_native_findDirectory(p0: Int, p1: Int, p2: Boolean, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_haiku_native_getCpuid(p0, p1, p2)")
private external fun _wasm_libc_unix_haiku_native_getCpuid(p0: String, p1: Int, p2: Int): Int

public actual fun createArea(name: String?, startAddress: COpaquePointer?, addressSpec: UInt, size: ULong, lock: UInt, protection: UInt): AreaId =
    if (_unixHaikuNativeNapiAvailable) _wasm_libc_unix_haiku_native_createArea(name, (startAddress?.value ?: 0L).toString(), addressSpec.toInt(), size.toString(), lock.toInt(), protection.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cloneArea(name: String?, destAddress: COpaquePointer?, addressSpec: UInt, protection: UInt, source: AreaId): AreaId =
    if (_unixHaikuNativeNapiAvailable) _wasm_libc_unix_haiku_native_cloneArea(name, (destAddress?.value ?: 0L).toString(), addressSpec.toInt(), protection.toInt(), source) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findArea(name: String?): AreaId =
    if (_unixHaikuNativeNapiAvailable) _wasm_libc_unix_haiku_native_findArea(name) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun areaFor(address: COpaquePointer?): AreaId =
    if (_unixHaikuNativeNapiAvailable) _wasm_libc_unix_haiku_native_areaFor((address?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteArea(id: AreaId): StatusT =
    if (_unixHaikuNativeNapiAvailable) _wasm_libc_unix_haiku_native_deleteArea(id) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resizeArea(id: AreaId, newSize: ULong): StatusT =
    if (_unixHaikuNativeNapiAvailable) _wasm_libc_unix_haiku_native_resizeArea(id, newSize.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setAreaProtection(id: AreaId, newProtection: UInt): StatusT =
    if (_unixHaikuNativeNapiAvailable) _wasm_libc_unix_haiku_native_setAreaProtection(id, newProtection.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getAreaInfo(id: AreaId, areaInfo: COpaquePointer?, size: ULong): StatusT =
    if (_unixHaikuNativeNapiAvailable) _wasm_libc_unix_haiku_native_getAreaInfo(id, (areaInfo?.value ?: 0L).toString(), size.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNextAreaInfo(team: TeamId, cookie: COpaquePointer?, areaInfo: COpaquePointer?, size: ULong): StatusT =
    if (_unixHaikuNativeNapiAvailable) _wasm_libc_unix_haiku_native_getNextAreaInfo(team, (cookie?.value ?: 0L).toString(), (areaInfo?.value ?: 0L).toString(), size.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createPort(capacity: Int, name: String?): PortId =
    if (_unixHaikuNativeNapiAvailable) _wasm_libc_unix_haiku_native_createPort(capacity, name) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findPort(name: String?): PortId =
    if (_unixHaikuNativeNapiAvailable) _wasm_libc_unix_haiku_native_findPort(name) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readPort(port: PortId, code: COpaquePointer?, buffer: COpaquePointer?, bufferSize: SizeT): SsizeT =
    if (_unixHaikuNativeNapiAvailable) _wasm_libc_unix_haiku_native_readPort(port, (code?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), bufferSize.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readPortEtc(port: PortId, code: COpaquePointer?, buffer: COpaquePointer?, bufferSize: SizeT, flags: UInt, timeout: BigtimeT): SsizeT =
    if (_unixHaikuNativeNapiAvailable) _wasm_libc_unix_haiku_native_readPortEtc(port, (code?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), bufferSize.toString(), flags.toInt(), timeout.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writePort(port: PortId, code: Int, buffer: COpaquePointer?, bufferSize: SizeT): StatusT =
    if (_unixHaikuNativeNapiAvailable) _wasm_libc_unix_haiku_native_writePort(port, code, (buffer?.value ?: 0L).toString(), bufferSize.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writePortEtc(port: PortId, code: Int, buffer: COpaquePointer?, bufferSize: SizeT, flags: UInt, timeout: BigtimeT): StatusT =
    if (_unixHaikuNativeNapiAvailable) _wasm_libc_unix_haiku_native_writePortEtc(port, code, (buffer?.value ?: 0L).toString(), bufferSize.toString(), flags.toInt(), timeout.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun closePort(port: PortId): StatusT =
    if (_unixHaikuNativeNapiAvailable) _wasm_libc_unix_haiku_native_closePort(port) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deletePort(port: PortId): StatusT =
    if (_unixHaikuNativeNapiAvailable) _wasm_libc_unix_haiku_native_deletePort(port) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun portBufferSize(port: PortId): SsizeT =
    if (_unixHaikuNativeNapiAvailable) _wasm_libc_unix_haiku_native_portBufferSize(port).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun portBufferSizeEtc(port: PortId, flags: UInt, timeout: BigtimeT): SsizeT =
    if (_unixHaikuNativeNapiAvailable) _wasm_libc_unix_haiku_native_portBufferSizeEtc(port, flags.toInt(), timeout.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun portCount(port: PortId): SsizeT =
    if (_unixHaikuNativeNapiAvailable) _wasm_libc_unix_haiku_native_portCount(port).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setPortOwner(port: PortId, team: TeamId): StatusT =
    if (_unixHaikuNativeNapiAvailable) _wasm_libc_unix_haiku_native_setPortOwner(port, team) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPortInfo(port: PortId, buf: COpaquePointer?, portInfoSize: SizeT): StatusT =
    if (_unixHaikuNativeNapiAvailable) _wasm_libc_unix_haiku_native_getPortInfo(port, (buf?.value ?: 0L).toString(), portInfoSize.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNextPortInfo(port: PortId, cookie: COpaquePointer?, portInfo: COpaquePointer?, portInfoSize: SizeT): StatusT =
    if (_unixHaikuNativeNapiAvailable) _wasm_libc_unix_haiku_native_getNextPortInfo(port, (cookie?.value ?: 0L).toString(), (portInfo?.value ?: 0L).toString(), portInfoSize.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPortMessageInfoEtc(port: PortId, info: COpaquePointer?, infoSize: SizeT, flags: UInt, timeout: BigtimeT): StatusT =
    if (_unixHaikuNativeNapiAvailable) _wasm_libc_unix_haiku_native_getPortMessageInfoEtc(port, (info?.value ?: 0L).toString(), infoSize.toString(), flags.toInt(), timeout.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createSem(count: Int, name: String?): SemId =
    if (_unixHaikuNativeNapiAvailable) _wasm_libc_unix_haiku_native_createSem(count, name) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteSem(id: SemId): StatusT =
    if (_unixHaikuNativeNapiAvailable) _wasm_libc_unix_haiku_native_deleteSem(id) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acquireSem(id: SemId): StatusT =
    if (_unixHaikuNativeNapiAvailable) _wasm_libc_unix_haiku_native_acquireSem(id) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acquireSemEtc(id: SemId, count: Int, flags: UInt, timeout: BigtimeT): StatusT =
    if (_unixHaikuNativeNapiAvailable) _wasm_libc_unix_haiku_native_acquireSemEtc(id, count, flags.toInt(), timeout.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun releaseSem(id: SemId): StatusT =
    if (_unixHaikuNativeNapiAvailable) _wasm_libc_unix_haiku_native_releaseSem(id) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun releaseSemEtc(id: SemId, count: Int, flags: UInt): StatusT =
    if (_unixHaikuNativeNapiAvailable) _wasm_libc_unix_haiku_native_releaseSemEtc(id, count, flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun switchSem(semToBeReleased: SemId, id: SemId): StatusT =
    if (_unixHaikuNativeNapiAvailable) _wasm_libc_unix_haiku_native_switchSem(semToBeReleased, id) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun switchSemEtc(semToBeReleased: SemId, id: SemId, count: Int, flags: UInt, timeout: BigtimeT): StatusT =
    if (_unixHaikuNativeNapiAvailable) _wasm_libc_unix_haiku_native_switchSemEtc(semToBeReleased, id, count, flags.toInt(), timeout.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSemCount(id: SemId, threadCount: COpaquePointer?): StatusT =
    if (_unixHaikuNativeNapiAvailable) _wasm_libc_unix_haiku_native_getSemCount(id, (threadCount?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setSemOwner(id: SemId, team: TeamId): StatusT =
    if (_unixHaikuNativeNapiAvailable) _wasm_libc_unix_haiku_native_setSemOwner(id, team) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSemInfo(id: SemId, info: COpaquePointer?, infoSize: SizeT): StatusT =
    if (_unixHaikuNativeNapiAvailable) _wasm_libc_unix_haiku_native_getSemInfo(id, (info?.value ?: 0L).toString(), infoSize.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNextSemInfo(team: TeamId, cookie: COpaquePointer?, info: COpaquePointer?, infoSize: SizeT): StatusT =
    if (_unixHaikuNativeNapiAvailable) _wasm_libc_unix_haiku_native_getNextSemInfo(team, (cookie?.value ?: 0L).toString(), (info?.value ?: 0L).toString(), infoSize.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun killTeam(team: TeamId): StatusT =
    if (_unixHaikuNativeNapiAvailable) _wasm_libc_unix_haiku_native_killTeam(team) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTeamInfo(team: TeamId, info: COpaquePointer?, size: SizeT): StatusT =
    if (_unixHaikuNativeNapiAvailable) _wasm_libc_unix_haiku_native_getTeamInfo(team, (info?.value ?: 0L).toString(), size.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNextTeamInfo(cookie: COpaquePointer?, info: COpaquePointer?, size: SizeT): StatusT =
    if (_unixHaikuNativeNapiAvailable) _wasm_libc_unix_haiku_native_getNextTeamInfo((cookie?.value ?: 0L).toString(), (info?.value ?: 0L).toString(), size.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun spawnThread(func: ThreadFunc, name: String?, priority: Int, data: COpaquePointer?): ThreadId =
    if (_unixHaikuNativeNapiAvailable) _wasm_libc_unix_haiku_native_spawnThread(0L.toString(), name, priority, (data?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun killThread(thread: ThreadId): StatusT =
    if (_unixHaikuNativeNapiAvailable) _wasm_libc_unix_haiku_native_killThread(thread) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resumeThread(thread: ThreadId): StatusT =
    if (_unixHaikuNativeNapiAvailable) _wasm_libc_unix_haiku_native_resumeThread(thread) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun suspendThread(thread: ThreadId): StatusT =
    if (_unixHaikuNativeNapiAvailable) _wasm_libc_unix_haiku_native_suspendThread(thread) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun renameThread(thread: ThreadId, newName: String?): StatusT =
    if (_unixHaikuNativeNapiAvailable) _wasm_libc_unix_haiku_native_renameThread(thread, newName) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setThreadPriority(thread: ThreadId, newPriority: Int): StatusT =
    if (_unixHaikuNativeNapiAvailable) _wasm_libc_unix_haiku_native_setThreadPriority(thread, newPriority) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun suggestThreadPriority(what: UInt, period: Int, jitter: BigtimeT, length: BigtimeT): Int =
    if (_unixHaikuNativeNapiAvailable) _wasm_libc_unix_haiku_native_suggestThreadPriority(what.toInt(), period, jitter.toString(), length.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun estimateMaxSchedulingLatency(th: ThreadId): BigtimeT =
    if (_unixHaikuNativeNapiAvailable) _wasm_libc_unix_haiku_native_estimateMaxSchedulingLatency(th).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exitThread(status: StatusT) {
    if (_unixHaikuNativeNapiAvailable) {
        _wasm_libc_unix_haiku_native_exitThread(status)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun waitForThread(thread: ThreadId, returnValue: COpaquePointer?): StatusT =
    if (_unixHaikuNativeNapiAvailable) _wasm_libc_unix_haiku_native_waitForThread(thread, (returnValue?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun onExitThread(callback: OnExitThreadCallbackCallback, data: COpaquePointer?): StatusT =
    if (_unixHaikuNativeNapiAvailable) _wasm_libc_unix_haiku_native_onExitThread(0L.toString(), (data?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findThread(name: String?): ThreadId =
    if (_unixHaikuNativeNapiAvailable) _wasm_libc_unix_haiku_native_findThread(name) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSchedulerMode(): Int =
    if (_unixHaikuNativeNapiAvailable) _wasm_libc_unix_haiku_native_getSchedulerMode() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setSchedulerMode(mode: Int): StatusT =
    if (_unixHaikuNativeNapiAvailable) _wasm_libc_unix_haiku_native_setSchedulerMode(mode) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendData(thread: ThreadId, code: Int, buffer: COpaquePointer?, bufferSize: SizeT): StatusT =
    if (_unixHaikuNativeNapiAvailable) _wasm_libc_unix_haiku_native_sendData(thread, code, (buffer?.value ?: 0L).toString(), bufferSize.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun receiveData(sender: COpaquePointer?, buffer: COpaquePointer?, bufferSize: SizeT): Int =
    if (_unixHaikuNativeNapiAvailable) _wasm_libc_unix_haiku_native_receiveData((sender?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), bufferSize.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hasData(thread: ThreadId): Boolean =
    if (_unixHaikuNativeNapiAvailable) _wasm_libc_unix_haiku_native_hasData(thread) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snooze(amount: BigtimeT): StatusT =
    if (_unixHaikuNativeNapiAvailable) _wasm_libc_unix_haiku_native_snooze(amount.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snoozeEtc(amount: BigtimeT, timeBase: CInt, flags: UInt): StatusT =
    if (_unixHaikuNativeNapiAvailable) _wasm_libc_unix_haiku_native_snoozeEtc(amount.toString(), timeBase, flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snoozeUntil(time: BigtimeT, timeBase: CInt): StatusT =
    if (_unixHaikuNativeNapiAvailable) _wasm_libc_unix_haiku_native_snoozeUntil(time.toString(), timeBase) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThreadInfo(id: ThreadId, info: COpaquePointer?, size: SizeT): StatusT =
    if (_unixHaikuNativeNapiAvailable) _wasm_libc_unix_haiku_native_getThreadInfo(id, (info?.value ?: 0L).toString(), size.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNextThreadInfo(team: TeamId, cookie: COpaquePointer?, info: COpaquePointer?, size: SizeT): StatusT =
    if (_unixHaikuNativeNapiAvailable) _wasm_libc_unix_haiku_native_getNextThreadInfo(team, (cookie?.value ?: 0L).toString(), (info?.value ?: 0L).toString(), size.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPthreadThreadId(thread: PthreadT): ThreadId =
    if (_unixHaikuNativeNapiAvailable) _wasm_libc_unix_haiku_native_getPthreadThreadId(thread.toLong().toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTeamUsageInfo(team: TeamId, who: Int, info: COpaquePointer?, size: SizeT): StatusT =
    if (_unixHaikuNativeNapiAvailable) _wasm_libc_unix_haiku_native_getTeamUsageInfo(team, who, (info?.value ?: 0L).toString(), size.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun realTimeClock(): CUlong =
    if (_unixHaikuNativeNapiAvailable) _wasm_libc_unix_haiku_native_realTimeClock().toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setRealTimeClock(secsSinceJan1st1970: CUlong) {
    if (_unixHaikuNativeNapiAvailable) {
        _wasm_libc_unix_haiku_native_setRealTimeClock(secsSinceJan1st1970.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun realTimeClockUsecs(): BigtimeT =
    if (_unixHaikuNativeNapiAvailable) _wasm_libc_unix_haiku_native_realTimeClockUsecs().toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun systemTime(): BigtimeT =
    if (_unixHaikuNativeNapiAvailable) _wasm_libc_unix_haiku_native_systemTime().toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun systemTimeNsecs(): NanotimeT =
    if (_unixHaikuNativeNapiAvailable) _wasm_libc_unix_haiku_native_systemTimeNsecs().toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setAlarm(whenBranch: BigtimeT, flags: UInt): BigtimeT =
    if (_unixHaikuNativeNapiAvailable) _wasm_libc_unix_haiku_native_setAlarm(whenBranch.toString(), flags.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun debugger(message: String?) {
    if (_unixHaikuNativeNapiAvailable) {
        _wasm_libc_unix_haiku_native_debugger(message)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun disableDebugger(state: CInt): CInt =
    if (_unixHaikuNativeNapiAvailable) _wasm_libc_unix_haiku_native_disableDebugger(state) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSystemInfo(info: COpaquePointer?): StatusT =
    if (_unixHaikuNativeNapiAvailable) _wasm_libc_unix_haiku_native_getSystemInfo((info?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCpuInfoEtc(firstCPU: UInt, cpuCount: UInt, info: COpaquePointer?, size: SizeT): StatusT =
    if (_unixHaikuNativeNapiAvailable) _wasm_libc_unix_haiku_native_getCpuInfoEtc(firstCPU.toInt(), cpuCount.toInt(), (info?.value ?: 0L).toString(), size.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCpuTopologyInfo(topologyInfos: COpaquePointer?, topologyInfoCount: COpaquePointer?): StatusT =
    if (_unixHaikuNativeNapiAvailable) _wasm_libc_unix_haiku_native_getCpuTopologyInfo((topologyInfos?.value ?: 0L).toString(), (topologyInfoCount?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isComputerOn(): Int =
    if (_unixHaikuNativeNapiAvailable) _wasm_libc_unix_haiku_native_isComputerOn() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isComputerOnFire(): CDouble =
    if (_unixHaikuNativeNapiAvailable) _wasm_libc_unix_haiku_native_isComputerOnFire() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendSignal(threadID: ThreadId, signal: CUint): CInt =
    if (_unixHaikuNativeNapiAvailable) _wasm_libc_unix_haiku_native_sendSignal(threadID, signal.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setSignalStack(base: COpaquePointer?, size: SizeT) {
    if (_unixHaikuNativeNapiAvailable) {
        _wasm_libc_unix_haiku_native_setSignalStack((base?.value ?: 0L).toString(), size.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun waitForObjects(infos: COpaquePointer?, numInfos: CInt): SsizeT =
    if (_unixHaikuNativeNapiAvailable) _wasm_libc_unix_haiku_native_waitForObjects((infos?.value ?: 0L).toString(), numInfos).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waitForObjectsEtc(infos: COpaquePointer?, numInfos: CInt, flags: UInt, timeout: BigtimeT): SsizeT =
    if (_unixHaikuNativeNapiAvailable) _wasm_libc_unix_haiku_native_waitForObjectsEtc((infos?.value ?: 0L).toString(), numInfos, flags.toInt(), timeout.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsReadAttr(fd: CInt, attribute: String?, type: UInt, pos: OffT, buffer: COpaquePointer?, readBytes: SizeT): SsizeT =
    if (_unixHaikuNativeNapiAvailable) _wasm_libc_unix_haiku_native_fsReadAttr(fd, attribute, type.toInt(), pos.toString(), (buffer?.value ?: 0L).toString(), readBytes.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsWriteAttr(fd: CInt, attribute: String?, type: UInt, pos: OffT, buffer: COpaquePointer?, writeBytes: SizeT): SsizeT =
    if (_unixHaikuNativeNapiAvailable) _wasm_libc_unix_haiku_native_fsWriteAttr(fd, attribute, type.toInt(), pos.toString(), (buffer?.value ?: 0L).toString(), writeBytes.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRemoveAttr(fd: CInt, attribute: String?): CInt =
    if (_unixHaikuNativeNapiAvailable) _wasm_libc_unix_haiku_native_fsRemoveAttr(fd, attribute) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsStatAttr(fd: CInt, attribute: String?, attrInfo: COpaquePointer?): CInt =
    if (_unixHaikuNativeNapiAvailable) _wasm_libc_unix_haiku_native_fsStatAttr(fd, attribute, (attrInfo?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsOpenAttr(path: String?, attribute: String?, type: UInt, openMode: CInt): CInt =
    if (_unixHaikuNativeNapiAvailable) _wasm_libc_unix_haiku_native_fsOpenAttr(path, attribute, type.toInt(), openMode) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsFopenAttr(fd: CInt, attribute: String?, type: UInt, openMode: CInt): CInt =
    if (_unixHaikuNativeNapiAvailable) _wasm_libc_unix_haiku_native_fsFopenAttr(fd, attribute, type.toInt(), openMode) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsCloseAttr(fd: CInt): CInt =
    if (_unixHaikuNativeNapiAvailable) _wasm_libc_unix_haiku_native_fsCloseAttr(fd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsOpenAttrDir(path: String?): DIR? =
    if (_unixHaikuNativeNapiAvailable) _wasm_libc_unix_haiku_native_fsOpenAttrDir(path).toLong().let { if (it == 0L) null else DIR(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsLopenAttrDir(path: String?): DIR? =
    if (_unixHaikuNativeNapiAvailable) _wasm_libc_unix_haiku_native_fsLopenAttrDir(path).toLong().let { if (it == 0L) null else DIR(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsFopenAttrDir(fd: CInt): DIR? =
    if (_unixHaikuNativeNapiAvailable) _wasm_libc_unix_haiku_native_fsFopenAttrDir(fd).toLong().let { if (it == 0L) null else DIR(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsCloseAttrDir(dir: DIR?): CInt =
    if (_unixHaikuNativeNapiAvailable) _wasm_libc_unix_haiku_native_fsCloseAttrDir((dir?.handle ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsReadAttrDir(dir: DIR?): COpaquePointer? =
    if (_unixHaikuNativeNapiAvailable) _wasm_libc_unix_haiku_native_fsReadAttrDir((dir?.handle ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRewindAttrDir(dir: DIR?) {
    if (_unixHaikuNativeNapiAvailable) {
        _wasm_libc_unix_haiku_native_fsRewindAttrDir((dir?.handle ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsCreateIndex(device: DevT, name: String?, type: UInt, flags: UInt): CInt =
    if (_unixHaikuNativeNapiAvailable) _wasm_libc_unix_haiku_native_fsCreateIndex(device, name, type.toInt(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRemoveIndex(device: DevT, name: String?): CInt =
    if (_unixHaikuNativeNapiAvailable) _wasm_libc_unix_haiku_native_fsRemoveIndex(device, name) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsStatIndex(device: DevT, name: String?, indexInfo: COpaquePointer?): CInt =
    if (_unixHaikuNativeNapiAvailable) _wasm_libc_unix_haiku_native_fsStatIndex(device, name, (indexInfo?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsOpenIndexDir(device: DevT): DIR? =
    if (_unixHaikuNativeNapiAvailable) _wasm_libc_unix_haiku_native_fsOpenIndexDir(device).toLong().let { if (it == 0L) null else DIR(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsCloseIndexDir(indexDirectory: DIR?): CInt =
    if (_unixHaikuNativeNapiAvailable) _wasm_libc_unix_haiku_native_fsCloseIndexDir((indexDirectory?.handle ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsReadIndexDir(indexDirectory: DIR?): COpaquePointer? =
    if (_unixHaikuNativeNapiAvailable) _wasm_libc_unix_haiku_native_fsReadIndexDir((indexDirectory?.handle ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRewindIndexDir(indexDirectory: DIR?) {
    if (_unixHaikuNativeNapiAvailable) {
        _wasm_libc_unix_haiku_native_fsRewindIndexDir((indexDirectory?.handle ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun devForPath(path: String?): DevT =
    if (_unixHaikuNativeNapiAvailable) _wasm_libc_unix_haiku_native_devForPath(path) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nextDev(pos: COpaquePointer?): DevT =
    if (_unixHaikuNativeNapiAvailable) _wasm_libc_unix_haiku_native_nextDev((pos?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsStatDev(dev: DevT, info: COpaquePointer?): CInt =
    if (_unixHaikuNativeNapiAvailable) _wasm_libc_unix_haiku_native_fsStatDev(dev, (info?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsOpenQuery(device: DevT, query: String?, flags: UInt): DIR? =
    if (_unixHaikuNativeNapiAvailable) _wasm_libc_unix_haiku_native_fsOpenQuery(device, query, flags.toInt()).toLong().let { if (it == 0L) null else DIR(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsOpenLiveQuery(device: DevT, query: String?, flags: UInt, port: PortId, token: Int): DIR? =
    if (_unixHaikuNativeNapiAvailable) _wasm_libc_unix_haiku_native_fsOpenLiveQuery(device, query, flags.toInt(), port, token).toLong().let { if (it == 0L) null else DIR(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsCloseQuery(d: DIR?): CInt =
    if (_unixHaikuNativeNapiAvailable) _wasm_libc_unix_haiku_native_fsCloseQuery((d?.handle ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsReadQuery(d: DIR?): COpaquePointer? =
    if (_unixHaikuNativeNapiAvailable) _wasm_libc_unix_haiku_native_fsReadQuery((d?.handle ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPathForDirent(dent: COpaquePointer?, buf: COpaquePointer?, len: SizeT): StatusT =
    if (_unixHaikuNativeNapiAvailable) _wasm_libc_unix_haiku_native_getPathForDirent((dent?.value ?: 0L).toString(), (buf?.value ?: 0L).toString(), len.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsMountVolume(where: String?, device: String?, filesystem: String?, flags: UInt, parameters: String?): DevT =
    if (_unixHaikuNativeNapiAvailable) _wasm_libc_unix_haiku_native_fsMountVolume(where, device, filesystem, flags.toInt(), parameters) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsUnmountVolume(path: String?, flags: UInt): StatusT =
    if (_unixHaikuNativeNapiAvailable) _wasm_libc_unix_haiku_native_fsUnmountVolume(path, flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadImage(argc: Int, argv: COpaquePointer?, environ: COpaquePointer?): ThreadId =
    if (_unixHaikuNativeNapiAvailable) _wasm_libc_unix_haiku_native_loadImage(argc, (argv?.value ?: 0L).toString(), (environ?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadAddOn(path: String?): ImageId =
    if (_unixHaikuNativeNapiAvailable) _wasm_libc_unix_haiku_native_loadAddOn(path) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unloadAddOn(image: ImageId): StatusT =
    if (_unixHaikuNativeNapiAvailable) _wasm_libc_unix_haiku_native_unloadAddOn(image) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getImageSymbol(image: ImageId, name: String?, symbolType: Int, symbolLocation: COpaquePointer?): StatusT =
    if (_unixHaikuNativeNapiAvailable) _wasm_libc_unix_haiku_native_getImageSymbol(image, name, symbolType, (symbolLocation?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNthImageSymbol(image: ImageId, n: Int, nameBuffer: COpaquePointer?, nameLength: COpaquePointer?, symbolType: COpaquePointer?, symbolLocation: COpaquePointer?): StatusT =
    if (_unixHaikuNativeNapiAvailable) _wasm_libc_unix_haiku_native_getNthImageSymbol(image, n, (nameBuffer?.value ?: 0L).toString(), (nameLength?.value ?: 0L).toString(), (symbolType?.value ?: 0L).toString(), (symbolLocation?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clearCaches(address: COpaquePointer?, length: SizeT, flags: UInt) {
    if (_unixHaikuNativeNapiAvailable) {
        _wasm_libc_unix_haiku_native_clearCaches((address?.value ?: 0L).toString(), length.toString(), flags.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getImageInfo(image: ImageId, info: COpaquePointer?, size: SizeT): StatusT =
    if (_unixHaikuNativeNapiAvailable) _wasm_libc_unix_haiku_native_getImageInfo(image, (info?.value ?: 0L).toString(), size.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNextImageInfo(team: TeamId, cookie: COpaquePointer?, info: COpaquePointer?, size: SizeT): StatusT =
    if (_unixHaikuNativeNapiAvailable) _wasm_libc_unix_haiku_native_getNextImageInfo(team, (cookie?.value ?: 0L).toString(), (info?.value ?: 0L).toString(), size.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findPath(codePointer: COpaquePointer?, baseDirectory: PathBaseDirectory, subPath: String?, pathBuffer: COpaquePointer?, bufferSize: ULong): StatusT =
    if (_unixHaikuNativeNapiAvailable) _wasm_libc_unix_haiku_native_findPath((codePointer?.value ?: 0L).toString(), baseDirectory, subPath, (pathBuffer?.value ?: 0L).toString(), bufferSize.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findPathEtc(codePointer: COpaquePointer?, dependency: String?, architecture: String?, baseDirectory: PathBaseDirectory, subPath: String?, flags: UInt, pathBuffer: COpaquePointer?, bufferSize: SizeT): StatusT =
    if (_unixHaikuNativeNapiAvailable) _wasm_libc_unix_haiku_native_findPathEtc((codePointer?.value ?: 0L).toString(), dependency, architecture, baseDirectory, subPath, flags.toInt(), (pathBuffer?.value ?: 0L).toString(), bufferSize.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findPathForPath(path: String?, baseDirectory: PathBaseDirectory, subPath: String?, pathBuffer: COpaquePointer?, bufferSize: SizeT): StatusT =
    if (_unixHaikuNativeNapiAvailable) _wasm_libc_unix_haiku_native_findPathForPath(path, baseDirectory, subPath, (pathBuffer?.value ?: 0L).toString(), bufferSize.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findPathForPathEtc(path: String?, dependency: String?, architecture: String?, baseDirectory: PathBaseDirectory, subPath: String?, flags: UInt, pathBuffer: COpaquePointer?, bufferSize: SizeT): StatusT =
    if (_unixHaikuNativeNapiAvailable) _wasm_libc_unix_haiku_native_findPathForPathEtc(path, dependency, architecture, baseDirectory, subPath, flags.toInt(), (pathBuffer?.value ?: 0L).toString(), bufferSize.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findPaths(baseDirectory: PathBaseDirectory, subPath: String?, paths: COpaquePointer?, pathCount: COpaquePointer?): StatusT =
    if (_unixHaikuNativeNapiAvailable) _wasm_libc_unix_haiku_native_findPaths(baseDirectory, subPath, (paths?.value ?: 0L).toString(), (pathCount?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findPathsEtc(architecture: String?, baseDirectory: PathBaseDirectory, subPath: String?, flags: UInt, paths: COpaquePointer?, pathCount: COpaquePointer?): StatusT =
    if (_unixHaikuNativeNapiAvailable) _wasm_libc_unix_haiku_native_findPathsEtc(architecture, baseDirectory, subPath, flags.toInt(), (paths?.value ?: 0L).toString(), (pathCount?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findDirectory(which: DirectoryWhich, volume: DevT, createIt: Boolean, pathString: COpaquePointer?, length: Int): StatusT =
    if (_unixHaikuNativeNapiAvailable) _wasm_libc_unix_haiku_native_findDirectory(which, volume, createIt, (pathString?.value ?: 0L).toString(), length) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCpuid(info: COpaquePointer?, eaxRegister: UInt, cpuNum: UInt): StatusT =
    if (_unixHaikuNativeNapiAvailable) _wasm_libc_unix_haiku_native_getCpuid((info?.value ?: 0L).toString(), eaxRegister.toInt(), cpuNum.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")
